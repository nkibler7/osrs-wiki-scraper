import errno
import os
import proto.gen.weapons_pb2 as weapons_pb2
import re

from google.protobuf.message import Message
from google.protobuf.text_format import PrintMessage
from pywikibot import Page
from typing import Any, Dict, List

comment_stripper = re.compile(r'<!--(.*?)-->')
version_extractor = re.compile(r'(.*?)([0-9]+)?$')


def write_proto(message: Message, filename: str):
    if not os.path.exists(os.path.dirname(filename)):
        try:
            os.makedirs(os.path.dirname(filename))
        except OSError as exc:  # Guard against race condition
            if exc.errno != errno.EEXIST:
                raise

    binary_filename = filename + '.binarypb'
    with open(binary_filename, "wb") as f:
        f.write(message.SerializeToString())

    text_filename = filename + '.textproto'
    with open(text_filename, "w") as f:
        # These comments point to the proto to use as a schema for IDEs.
        f.write("# proto-file: proto/npc_infos.proto\n")
        f.write("# proto-message: NpcInfos\n\n")
        PrintMessage(message, f)


def get_infobox_versions(code, template_name: str) -> List[Dict[str, Any]]:
    infoboxes = code.filter_templates(matches=lambda t: t.name.matches(template_name))
    if len(infoboxes) < 1:
        return []

    results = []
    for infobox in infoboxes:
        base: Dict[str, str] = {}
        versions: Dict[int, Dict[str, str]] = {}
        for param in infobox.params:
            matcher = version_extractor.match(str(param.name).strip())
            if matcher is None:
                raise AssertionError()
            primary = matcher.group(1)
            dic = base
            if matcher.group(2) is not None:
                version = int(matcher.group(2))
                if version not in versions:
                    versions[version] = {}
                dic = versions[version]
            dic[primary] = comment_stripper.sub('', param.value.strip())
        if len(versions) == 0:
            results.append(base)
        else:
            for version_id, version_dict in versions.items():
                results.append({**base, **version_dict})
    return results


def parse_bonuses(item: Dict[str, Any], bonuses: List[Dict[str, Any]]) -> weapons_pb2.Weapon:
    weapon = weapons_pb2.Weapon()
    bonus_params = None
    if len(bonuses) == 1:
        bonus_params = bonuses[0]
    elif 'version' in item:
        bonus_params = next((b for b in bonuses if b.get('version') == item.get('version')), None)

    if bonus_params is None:
        return weapon

    weapon.stat_bonuses.stab_attack = int(bonus_params.get('astab'))
    weapon.stat_bonuses.slash_attack = int(bonus_params.get('aslash'))
    weapon.stat_bonuses.crush_attack = int(bonus_params.get('acrush'))
    weapon.stat_bonuses.ranged_attack = int(bonus_params.get('arange'))
    weapon.stat_bonuses.magic_attack = int(bonus_params.get('amagic'))
    weapon.stat_bonuses.stab_defence = int(bonus_params.get('dstab'))
    weapon.stat_bonuses.slash_defence = int(bonus_params.get('dslash'))
    weapon.stat_bonuses.crush_defence = int(bonus_params.get('dcrush'))
    weapon.stat_bonuses.ranged_defence = int(bonus_params.get('drange'))
    weapon.stat_bonuses.magic_defence = int(bonus_params.get('dmagic'))
    weapon.stat_bonuses.melee_strength = int(bonus_params.get('str'))
    weapon.stat_bonuses.ranged_strength = int(bonus_params.get('rstr'))
    weapon.stat_bonuses.magic_damage = float(bonus_params.get('mdmg')) / 10
    weapon.stat_bonuses.prayer = int(bonus_params.get('prayer'))

    if bonus_params.get('speed') != 'N/A':
        weapon.base_attack_speed = int(bonus_params.get('speed'))

    if bonus_params.get('attackrange') == 'staff':
        weapon.base_attack_range = 1
    else:
        weapon.base_attack_range = int(bonus_params.get('attackrange'))

    return weapon


def is_discontinued(page: Page) -> bool:
    for cat in page.categories():
        if cat.title() == 'Category:Discontinued content':
            return True
    else:
        return False


def is_valid(value: Any) -> bool:
    return not isinstance(value, str) or (value != '' and value != 'N/A')
