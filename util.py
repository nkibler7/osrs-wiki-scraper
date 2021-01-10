import errno
import os
import re
from google.protobuf.message import Message
from google.protobuf.text_format import PrintMessage
from typing import *

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


def get_infobox_versions(code) -> Iterator[Dict[str, Any]]:
    infoboxes = code.filter_templates(matches=lambda t: t.name.matches('Infobox Monster'))
    if len(infoboxes) < 1:
        return
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
            yield base
        else:
            for version_id, version_dict in versions.items():
                yield {**base, **version_dict}


def is_valid(value: Any) -> bool:
    return not isinstance(value, str) or (value != '' and value != 'N/A')
