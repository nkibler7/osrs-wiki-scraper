import mwparserfromhell
import os
import proto.gen.equipment_pb2 as equipment_pb2
import proto.gen.npc_infos_pb2 as npc_infos_pb2
import pywikibot
import sys
import util

from google.protobuf.json_format import ParseDict, ParseError
from pywikibot import family, pagegenerators
from warnings import warn


class OSRSFamily(family.Family):
    """A pywikibot Family class for the OSRS Wiki."""
    name = 'osrs'
    langs = {
        'en': 'oldschool.runescape.wiki',
    }

    def protocol(self, code):
        return 'HTTPS'

    def scriptpath(self, code):
        return ''


def parse_and_write_npcinfos(output_dir: str):
    npc_infos = npc_infos_pb2.NpcInfos()

    site = pywikibot.Site(fam=OSRSFamily(), code='en')
    category = pywikibot.Category(site, 'Category:Monsters')
    gen = pagegenerators.PreloadingGenerator(category.articles())
    for page in gen:
        code = mwparserfromhell.parse(page.get(), skip_style_tags=True)

        for infobox in util.get_infobox_versions(code, 'Infobox Monster'):
            # Skips this infobox if the "removal" key is set.
            if 'removal' in infobox and not str(infobox['removal']).strip().lower() in ['', 'no']:
                continue

            # Skips this infobox if there is no ID attribute.
            if 'id' not in infobox:
                continue

            # Parses string ID fields into an array of ints.
            ids = [int(npc_id) for npc_id in str(infobox['id']).split(',') if npc_id != '' and npc_id.isdigit()]

            # Deletes all unknown fields and fields with invalid values.
            known_fields = list(map(lambda f: f.name, npc_infos_pb2.NpcInfo.DESCRIPTOR.fields))
            filtered_infobox = {k: infobox[k] for k in known_fields if k in infobox and util.is_valid(infobox[k])}

            try:
                npc_info = ParseDict(filtered_infobox, npc_infos_pb2.NpcInfo())
                npc_info.ids[:] = ids
                npc_infos.npcs.append(npc_info)
            except ParseError as err:
                warn('Failed to parse JSON into NpcInfo proto: {}\nError: {}'.format(filtered_infobox, err))

    output_filename = os.path.join(output_dir, 'npc_infos')
    util.write_proto(npc_infos, output_filename)
    print('{0} NpcInfos written to: {1}.bin and {1}.textproto'.format(len(npc_infos.npcs), output_filename))


def parse_and_write_equipment(output_dir: str):
    equipment = equipment_pb2.Equipment()

    site = pywikibot.Site(fam=OSRSFamily(), code='en')
    category = pywikibot.Category(site, 'Category:Equipable items')
    gen = pagegenerators.PreloadingGenerator(category.articles())
    for page in gen:
        code = mwparserfromhell.parse(page.get(), skip_style_tags=True)
        items = util.get_infobox_versions(code, 'Infobox Item')
        bonuses = util.get_infobox_versions(code, 'Infobox Bonuses')
        combat_options = util.get_combat_options(code)

        for i, item in enumerate(items):
            if 'id' not in item:
                continue

            ids_str = item.get('id')

            # Skips beta world-only and historical items.
            if not ids_str or ids_str.startswith('beta') or ids_str.startswith('hist'):
                continue

            # Skips un-equippable items (and versions of items).
            if item.get('equipable') != 'Yes':
                continue

            equippable_item = equipment_pb2.EquippableItem()
            equippable_item.name = item.get('name')
            equippable_item.MergeFrom(util.parse_item(item, bonuses))

            if combat_options:
                try:
                    equippable_item.weapon_details.combat_options.extend(
                        [ParseDict(o, equipment_pb2.CombatOption()) for o in combat_options])
                except ParseError as err:
                    warn('Failed to parse JSON into CombatOption proto. Error: {}'.format(err))

            # Some versions of an item may have multiple IDs. To maintain a single map from ID to EquippableItem in the
            # Equipment proto, this duplicates the built EquippableItem proto for each ID in this list.
            for id_str in ids_str.split(','):
                equippable_item.id = int(id_str)
                equipment.items[equippable_item.id].CopyFrom(equippable_item)

    output_filename = os.path.join(output_dir, 'equipment')
    util.write_proto(equipment, output_filename)
    print('{0} Equipment written to: {1}.bin and {1}.textproto'.format(len(equipment.items), output_filename))


def main():
    output_dir = 'out' if len(sys.argv) == 1 else sys.argv[1]
    parse_and_write_npcinfos(output_dir)
    parse_and_write_equipment(output_dir)


if __name__ == "__main__":
    main()
