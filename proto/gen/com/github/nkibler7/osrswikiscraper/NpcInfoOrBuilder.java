// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: npc_infos.proto

package com.github.nkibler7.osrswikiscraper;

public interface NpcInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:github.nkibler7.osrswikiscraper.NpcInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of IDs associated with this NPC.
   * </pre>
   *
   * <code>repeated int32 ids = 1;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.Integer> getIdsList();
  /**
   * <pre>
   * The list of IDs associated with this NPC.
   * </pre>
   *
   * <code>repeated int32 ids = 1;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * The list of IDs associated with this NPC.
   * </pre>
   *
   * <code>repeated int32 ids = 1;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  int getIds(int index);

  /**
   * <pre>
   * The name of this NPC.
   * </pre>
   *
   * <code>string name = 19;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this NPC.
   * </pre>
   *
   * <code>string name = 19;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The name of the version of this NPC, if one exists. This is set for NPCs that have multiple versions, yet are
   * represented by the same wiki page. Example values for this field are "Phase 1", "Phase 2", etc. for phased NPCs,
   * like the Abyssal Sire.
   * </pre>
   *
   * <code>string version = 20;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The name of the version of this NPC, if one exists. This is set for NPCs that have multiple versions, yet are
   * represented by the same wiki page. Example values for this field are "Phase 1", "Phase 2", etc. for phased NPCs,
   * like the Abyssal Sire.
   * </pre>
   *
   * <code>string version = 20;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The max health of this NPC.
   * </pre>
   *
   * <code>int32 hitpoints = 2;</code>
   * @return The hitpoints.
   */
  int getHitpoints();

  /**
   * <pre>
   * The attack stat of this NPC, a measure of its melee accuracy.
   * </pre>
   *
   * <code>int32 att = 3;</code>
   * @return The att.
   */
  int getAtt();

  /**
   * <pre>
   * The strength stat of this NPC, a measure of its melee power.
   * </pre>
   *
   * <code>int32 str = 4;</code>
   * @return The str.
   */
  int getStr();

  /**
   * <pre>
   * The defence stat of this NPC, a measure of its damage protection in combat.
   * </pre>
   *
   * <code>int32 def = 5;</code>
   * @return The def.
   */
  int getDef();

  /**
   * <pre>
   * The magic stat of this NPC.
   * </pre>
   *
   * <code>int32 mage = 6;</code>
   * @return The mage.
   */
  int getMage();

  /**
   * <pre>
   * The ranged stat of this NPC.
   * </pre>
   *
   * <code>int32 range = 7;</code>
   * @return The range.
   */
  int getRange();

  /**
   * <pre>
   * The bonus attack stat of this NPC.
   * </pre>
   *
   * <code>int32 attbns = 8;</code>
   * @return The attbns.
   */
  int getAttbns();

  /**
   * <pre>
   * The bonus strength stat of this NPC.
   * </pre>
   *
   * <code>int32 strbns = 9;</code>
   * @return The strbns.
   */
  int getStrbns();

  /**
   * <pre>
   * The bonus magic stat of this NPC.
   * </pre>
   *
   * <code>int32 amagic = 10;</code>
   * @return The amagic.
   */
  int getAmagic();

  /**
   * <pre>
   * The bonus magic damage stat of this NPC.
   * </pre>
   *
   * <code>int32 mbns = 11;</code>
   * @return The mbns.
   */
  int getMbns();

  /**
   * <pre>
   * The bonus ranged stat of this NPC.
   * </pre>
   *
   * <code>int32 arange = 12;</code>
   * @return The arange.
   */
  int getArange();

  /**
   * <pre>
   * The bonus ranged damage stat of this NPC.
   * </pre>
   *
   * <code>int32 rngbns = 13;</code>
   * @return The rngbns.
   */
  int getRngbns();

  /**
   * <pre>
   * This NPC's resistance to stab attacks.
   * </pre>
   *
   * <code>int32 dstab = 14;</code>
   * @return The dstab.
   */
  int getDstab();

  /**
   * <pre>
   * This NPC's resistance to slash attacks.
   * </pre>
   *
   * <code>int32 dslash = 15;</code>
   * @return The dslash.
   */
  int getDslash();

  /**
   * <pre>
   * This NPC's resistance to crush attacks.
   * </pre>
   *
   * <code>int32 dcrush = 16;</code>
   * @return The dcrush.
   */
  int getDcrush();

  /**
   * <pre>
   * This NPC's resistance to magic attacks.
   * </pre>
   *
   * <code>int32 dmagic = 17;</code>
   * @return The dmagic.
   */
  int getDmagic();

  /**
   * <pre>
   * This NPC's resistance to ranged attacks.
   * </pre>
   *
   * <code>int32 drange = 18;</code>
   * @return The drange.
   */
  int getDrange();
}
