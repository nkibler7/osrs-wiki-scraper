// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: npc_infos.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

public final class NpcInfosOuterClass {
  private NpcInfosOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      NpcInfosOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_github_nkibler7_osrswikiscraper_NpcInfos_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_github_nkibler7_osrswikiscraper_NpcInfos_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_github_nkibler7_osrswikiscraper_NpcInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_github_nkibler7_osrswikiscraper_NpcInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017npc_infos.proto\022\037github.nkibler7.osrsw" +
      "ikiscraper\"B\n\010NpcInfos\0226\n\004npcs\030\001 \003(\0132(.g" +
      "ithub.nkibler7.osrswikiscraper.NpcInfo\"\315" +
      "\002\n\007NpcInfo\022\013\n\003ids\030\001 \003(\005\022\014\n\004name\030\002 \001(\t\022\017\n" +
      "\007version\030\003 \001(\t\022\022\n\nattributes\030\025 \001(\t\022\021\n\thi" +
      "tpoints\030\004 \001(\005\022\013\n\003att\030\005 \001(\005\022\013\n\003str\030\006 \001(\005\022" +
      "\013\n\003def\030\007 \001(\005\022\014\n\004mage\030\010 \001(\005\022\r\n\005range\030\t \001(" +
      "\005\022\016\n\006attbns\030\n \001(\005\022\016\n\006strbns\030\013 \001(\005\022\016\n\006ama" +
      "gic\030\014 \001(\005\022\014\n\004mbns\030\r \001(\005\022\016\n\006arange\030\016 \001(\005\022" +
      "\016\n\006rngbns\030\017 \001(\005\022\r\n\005dstab\030\020 \001(\005\022\016\n\006dslash" +
      "\030\021 \001(\005\022\016\n\006dcrush\030\022 \001(\005\022\016\n\006dmagic\030\023 \001(\005\022\016" +
      "\n\006drange\030\024 \001(\005B\'\n#com.github.nkibler7.os" +
      "rswikiscraperP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_github_nkibler7_osrswikiscraper_NpcInfos_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_github_nkibler7_osrswikiscraper_NpcInfos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_github_nkibler7_osrswikiscraper_NpcInfos_descriptor,
        new java.lang.String[] { "Npcs", });
    internal_static_github_nkibler7_osrswikiscraper_NpcInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_github_nkibler7_osrswikiscraper_NpcInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_github_nkibler7_osrswikiscraper_NpcInfo_descriptor,
        new java.lang.String[] { "Ids", "Name", "Version", "Attributes", "Hitpoints", "Att", "Str", "Def", "Mage", "Range", "Attbns", "Strbns", "Amagic", "Mbns", "Arange", "Rngbns", "Dstab", "Dslash", "Dcrush", "Dmagic", "Drange", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
