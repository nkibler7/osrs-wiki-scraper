import errno
import os
import proto.gen.equipment_pb2 as equipment_pb2
import re
import string

from constants import WEAPON_TYPES
from google.protobuf.message import Message
from google.protobuf.text_format import PrintMessage
from typing import Any, Dict, List
from warnings import warn

comment_stripper = re.compile(r'<!--(.*?)-->')
version_extractor = re.compile(r'(.*?)([0-9]+)?$')


def write_proto(message: Message, filename: str):
    if not os.path.exists(os.path.dirname(filename)):
        try:
            os.makedirs(os.path.dirname(filename))
        except OSError as exc:  # Guard against race condition
            if exc.errno != errno.EEXIST:
                raise

    binary_filename = filename + '.bin'
    with open(binary_filename, "wb") as f:
        f.write(message.SerializeToString())

    text_filename = filename + '.textproto'
    with open(text_filename, "w") as f:
        # These comments point to the proto to use as a schema for IDEs.
        f.write("# proto-file: proto/" + message.DESCRIPTOR.file.name + "\n")
        f.write("# proto-message: " + message.DESCRIPTOR.name + "\n\n")
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


def get_combat_options(code) -> List[Dict]:
    combat_styles_box = code.filter_templates(matches=lambda t: t.name.matches('CombatStyles'))
    if len(combat_styles_box) != 1:
        return []

    style_category = combat_styles_box[0]
    # Capitalize words to roughly match the behavior in the Lua script backing the CombatStyles module. Note that we
    # don't use title() because it ignores non-alphabetic characters (e.g. "2h" becomes "2H").
    weapon_type_key = string.capwords(str(style_category.params[0].value))
    combat_options = WEAPON_TYPES.get(weapon_type_key)
    if combat_options is None:
        warn('Could not find mapping for weapon type key: {}'.format(weapon_type_key))

    return combat_options


def parse_int_param(params: Dict[str, Any], name: str) -> int:
    param = params.get(name)
    return int(param) if param else 0


def parse_float_param(params: Dict[str, Any], name: str) -> float:
    param = params.get(name)
    return float(param) if param else 0.0


def parse_item(item_dict: Dict[str, Any], bonuses: List[Dict[str, Any]]) -> equipment_pb2.EquippableItem:
    item = equipment_pb2.EquippableItem()
    bonus_params = None
    if len(bonuses) == 1:
        bonus_params = bonuses[0]
    elif 'version' in item_dict:
        bonus_params = next((b for b in bonuses if b.get('version') == item_dict.get('version')), None)

    if bonus_params is None:
        return item

    item.stat_bonuses.stab_attack = parse_int_param(bonus_params, 'astab')
    item.stat_bonuses.slash_attack = parse_int_param(bonus_params, 'aslash')
    item.stat_bonuses.crush_attack = parse_int_param(bonus_params, 'acrush')
    item.stat_bonuses.ranged_attack = parse_int_param(bonus_params, 'arange')
    item.stat_bonuses.magic_attack = parse_int_param(bonus_params, 'amagic')
    item.stat_bonuses.stab_defence = parse_int_param(bonus_params, 'dstab')
    item.stat_bonuses.slash_defence = parse_int_param(bonus_params, 'dslash')
    item.stat_bonuses.crush_defence = parse_int_param(bonus_params, 'dcrush')
    item.stat_bonuses.ranged_defence = parse_int_param(bonus_params, 'drange')
    item.stat_bonuses.magic_defence = parse_int_param(bonus_params, 'dmagic')
    item.stat_bonuses.melee_strength = parse_int_param(bonus_params, 'str')
    item.stat_bonuses.ranged_strength = parse_int_param(bonus_params, 'rstr')
    item.stat_bonuses.magic_damage = parse_float_param(bonus_params, 'mdmg') / 10
    item.stat_bonuses.prayer = parse_int_param(bonus_params, 'prayer')

    attack_speed = bonus_params.get('speed')
    if attack_speed and attack_speed != 'N/A':
        item.weapon_details.base_attack_speed = int(bonus_params.get('speed'))

    attack_range = bonus_params.get('attackrange')
    if attack_range == 'staff':
        item.weapon_details.base_attack_range = 1
    elif attack_range:
        item.weapon_details.base_attack_range = int(attack_range)

    return item


def is_valid(value: Any) -> bool:
    return not isinstance(value, str) or (value != '' and value != 'N/A')
