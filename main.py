import mwparserfromhell
import os
import pywikibot
import sys
import util
from google.protobuf.json_format import ParseDict, ParseError
from proto.gen.npc_infos_pb2 import NpcInfos, NpcInfo
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
    npc_infos = NpcInfos()

    site = pywikibot.Site(fam=OSRSFamily(), code='en')
    category = pywikibot.Category(site, 'Category:Monsters')
    gen = pagegenerators.PreloadingGenerator(category.articles())
    for page in gen:
        code = mwparserfromhell.parse(page.get(), skip_style_tags=True)

        for infobox in util.get_infobox_versions(code):
            # Skips this infobox if the "removal" key is set.
            if 'removal' in infobox and not str(infobox['removal']).strip().lower() in ['', 'no']:
                continue

            # Skips this infobox if there is no ID attribute.
            if 'id' not in infobox:
                continue
                
            # Parses string ID fields into an array of ints.
            ids = [int(npc_id) for npc_id in str(infobox['id']).split(',') if npc_id != '' and npc_id.isdigit()]

            # Deletes all unknown fields and fields with invalid values.
            known_fields = list(map(lambda f: f.name, NpcInfo.DESCRIPTOR.fields))
            filtered_infobox = {k: infobox[k] for k in known_fields if k in infobox and util.is_valid(infobox[k])}

            try:
                npc_info = ParseDict(filtered_infobox, NpcInfo())
                npc_info.ids[:] = ids
                npc_infos.npcs.append(npc_info)
            except ParseError as err:
                warn('Failed to parse JSON into NpcInfo proto: {}\nError: {}'.format(filtered_infobox, err))

    output_filename = os.path.join(output_dir, 'npc_infos')
    util.write_proto(npc_infos, output_filename)
    print('{0} NpcInfos written to: {1}.binarypb and {1}.textproto'.format(len(npc_infos.npcs), output_filename))


def main():
    output_dir = 'out' if len(sys.argv) == 1 else sys.argv[1]
    parse_and_write_npcinfos(output_dir)


if __name__ == "__main__":
    main()
