// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: weapons.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

public interface WeaponOrBuilder extends
    // @@protoc_insertion_point(interface_extends:github.nkibler7.osrswikiscraper.Weapon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this weapon.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this weapon.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The item ID of this weapon.
   * </pre>
   *
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * The base attack speed for this weapon (in ticks). This may be further modified by the selected
   * CombatOption's modifiers.
   * </pre>
   *
   * <code>int32 base_attack_speed = 3;</code>
   * @return The baseAttackSpeed.
   */
  int getBaseAttackSpeed();

  /**
   * <pre>
   * The base attack range for this weapon (in tiles). This may be further modified by the selected
   * CombatOption's modifiers.
   * </pre>
   *
   * <code>int32 base_attack_range = 4;</code>
   * @return The baseAttackRange.
   */
  int getBaseAttackRange();

  /**
   * <pre>
   * The set of unique stat bonuses applied by this weapon.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.StatBonuses stat_bonuses = 5;</code>
   * @return Whether the statBonuses field is set.
   */
  boolean hasStatBonuses();
  /**
   * <pre>
   * The set of unique stat bonuses applied by this weapon.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.StatBonuses stat_bonuses = 5;</code>
   * @return The statBonuses.
   */
  com.github.nkibler7.osrswikiscraper.StatBonuses getStatBonuses();
  /**
   * <pre>
   * The set of unique stat bonuses applied by this weapon.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.StatBonuses stat_bonuses = 5;</code>
   */
  com.github.nkibler7.osrswikiscraper.StatBonusesOrBuilder getStatBonusesOrBuilder();

  /**
   * <pre>
   * The list of CombatOptions available for this weapon.
   * </pre>
   *
   * <code>repeated .github.nkibler7.osrswikiscraper.CombatOption combat_options = 6;</code>
   */
  java.util.List<com.github.nkibler7.osrswikiscraper.CombatOption> 
      getCombatOptionsList();
  /**
   * <pre>
   * The list of CombatOptions available for this weapon.
   * </pre>
   *
   * <code>repeated .github.nkibler7.osrswikiscraper.CombatOption combat_options = 6;</code>
   */
  com.github.nkibler7.osrswikiscraper.CombatOption getCombatOptions(int index);
  /**
   * <pre>
   * The list of CombatOptions available for this weapon.
   * </pre>
   *
   * <code>repeated .github.nkibler7.osrswikiscraper.CombatOption combat_options = 6;</code>
   */
  int getCombatOptionsCount();
  /**
   * <pre>
   * The list of CombatOptions available for this weapon.
   * </pre>
   *
   * <code>repeated .github.nkibler7.osrswikiscraper.CombatOption combat_options = 6;</code>
   */
  java.util.List<? extends com.github.nkibler7.osrswikiscraper.CombatOptionOrBuilder> 
      getCombatOptionsOrBuilderList();
  /**
   * <pre>
   * The list of CombatOptions available for this weapon.
   * </pre>
   *
   * <code>repeated .github.nkibler7.osrswikiscraper.CombatOption combat_options = 6;</code>
   */
  com.github.nkibler7.osrswikiscraper.CombatOptionOrBuilder getCombatOptionsOrBuilder(
      int index);
}