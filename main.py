import mwparserfromhell
import os
import proto.gen.npc_infos_pb2 as npc_infos_pb2
import proto.gen.weapons_pb2 as weapons_pb2
import pywikibot
import string
import sys
import util

from google.protobuf.json_format import ParseDict, ParseError
from pywikibot import family, pagegenerators
from warnings import warn
from constants import WEAPON_TYPES


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


def parse_and_write_weapon_combat_styles(output_dir: str):
    weapons = weapons_pb2.Weapons()

    site = pywikibot.Site(fam=OSRSFamily(), code='en')
    category = pywikibot.Category(site, 'Category:Weapon slot items')
    gen = pagegenerators.PreloadingGenerator(category.articles())
    for page in gen:
        code = mwparserfromhell.parse(page.get(), skip_style_tags=True)
        combat_styles_box = code.filter_templates(matches=lambda t: t.name.matches('CombatStyles'))
        if len(combat_styles_box) != 1:
            warn('Skipping weapon page (title: "{}") since it did not have exactly 1 CombatStyles box'.format(
                page.title()))
            continue

        style_category = combat_styles_box[0]
        # Capitalize words to roughly match the behavior in the Lua script backing the CombatStyles module. Note that we
        # don't use title() because it ignores non-alphabetic characters (e.g. "2h" becomes "2H").
        weapon_type_key = string.capwords(str(style_category.params[0].value))
        combat_options = WEAPON_TYPES.get(weapon_type_key)
        if combat_options is None:
            warn('Skipping weapon page (title: "{}") since we\'re missing its weapon type: {}'.format(
                page.title(), weapon_type_key))
            continue

        items = util.get_infobox_versions(code, 'Infobox Item')
        bonuses = util.get_infobox_versions(code, 'Infobox Bonuses')

        for i, item in enumerate(items):
            if 'id' not in item:
                continue

            ids_str = item.get('id')

            # Skips beta world-only and historical items.
            if not ids_str or ids_str.startswith('beta') or ids_str.startswith('hist'):
                continue

            weapon = weapons_pb2.Weapon()
            weapon.name = item.get('name')
            weapon.MergeFrom(util.parse_bonuses(item, bonuses))

            try:
                weapon.combat_options.extend([ParseDict(o, weapons_pb2.CombatOption()) for o in combat_options])
            except ParseError as err:
                warn('Failed to parse JSON into CombatOption proto. Error: {}'.format(err))

            # Some versions of a weapon may have multiple IDs, like the Pharaoh's sceptre. To maintain a single map from
            # ID to Weapon in the Weapons proto, this duplicates the built Weapon proto for each ID in this list.
            for id_str in ids_str.split(','):
                weapon.id = int(id_str)
                weapons.weapons[weapon.id].CopyFrom(weapon)

    output_filename = os.path.join(output_dir, 'weapons')
    util.write_proto(weapons, output_filename)
    print('{0} Weapons written to: {1}.bin and {1}.textproto'.format(len(weapons.weapons), output_filename))


def main():
    output_dir = 'out' if len(sys.argv) == 1 else sys.argv[1]
    parse_and_write_npcinfos(output_dir)
    parse_and_write_weapon_combat_styles(output_dir)


if __name__ == "__main__":
    main()
