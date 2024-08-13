// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: stat_bonuses.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

public interface StatBonusesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:github.nkibler7.osrswikiscraper.StatBonuses)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The accuracy bonus applied to melee attack calculations if a stab-based attack option is
   * chosen.
   * </pre>
   *
   * <code>int32 stab_attack = 1;</code>
   * @return The stabAttack.
   */
  int getStabAttack();

  /**
   * <pre>
   * The accuracy bonus applied to melee attack calculations if a slash-based attack option is
   * chosen.
   * </pre>
   *
   * <code>int32 slash_attack = 2;</code>
   * @return The slashAttack.
   */
  int getSlashAttack();

  /**
   * <pre>
   * The accuracy bonus applied to melee attack calculations if a crush-based attack option is
   * chosen.
   * </pre>
   *
   * <code>int32 crush_attack = 3;</code>
   * @return The crushAttack.
   */
  int getCrushAttack();

  /**
   * <pre>
   * The accuracy bonus applied to ranged attack calculations.
   * </pre>
   *
   * <code>int32 ranged_attack = 4;</code>
   * @return The rangedAttack.
   */
  int getRangedAttack();

  /**
   * <pre>
   * The accuracy bonus applied to magic attack calculations.
   * </pre>
   *
   * <code>int32 magic_attack = 5;</code>
   * @return The magicAttack.
   */
  int getMagicAttack();

  /**
   * <pre>
   * The defensive bonus applied to melee defence calculations if a stab-based attack option is
   * used by the attacker.
   * </pre>
   *
   * <code>int32 stab_defence = 6;</code>
   * @return The stabDefence.
   */
  int getStabDefence();

  /**
   * <pre>
   * The defensive bonus applied to melee defence calculations if a slash-based attack option is
   * used by the attacker.
   * </pre>
   *
   * <code>int32 slash_defence = 7;</code>
   * @return The slashDefence.
   */
  int getSlashDefence();

  /**
   * <pre>
   * The defensive bonus applied to melee defence calculations if a crush-based attack option is
   * used by the attacker.
   * </pre>
   *
   * <code>int32 crush_defence = 8;</code>
   * @return The crushDefence.
   */
  int getCrushDefence();

  /**
   * <pre>
   * The defensive bonus applied to magic defence calculations if a ranged attack is used by the
   * attacker.
   * </pre>
   *
   * <code>int32 ranged_defence = 9;</code>
   * @return The rangedDefence.
   */
  int getRangedDefence();

  /**
   * <pre>
   * The defensive bonus applied to magic defence calculations if a magic attack is used by the
   * attacker.
   * </pre>
   *
   * <code>int32 magic_defence = 10;</code>
   * @return The magicDefence.
   */
  int getMagicDefence();

  /**
   * <pre>
   * The strength bonus used to determine the player's maximum melee damage.
   * </pre>
   *
   * <code>int32 melee_strength = 11;</code>
   * @return The meleeStrength.
   */
  int getMeleeStrength();

  /**
   * <pre>
   * The strength bonus used to determine the player's maximum ranged damage.
   * </pre>
   *
   * <code>int32 ranged_strength = 12;</code>
   * @return The rangedStrength.
   */
  int getRangedStrength();

  /**
   * <pre>
   * The strength bonus used to determine the player's maximum magic damage.
   *
   * Unlike the other additive strength bonuses, this is a damage multiplier. A value of 0.20
   * corresponds to an additional 20% magic damage (applied according to standard calculations).
   * </pre>
   *
   * <code>double magic_damage = 13;</code>
   * @return The magicDamage.
   */
  double getMagicDamage();

  /**
   * <pre>
   * The prayer bonus lowers the drain rate of prayers. The drain rate of a prayer is the amount of
   * time a prayer takes to drain 1 prayer point. A prayer bonus of +15 will make all prayers last
   * 50% longer. Comparatively a bonus of +30 will double the length any prayer can be used. Each
   * additional +1 prayer bonus provides a corresponding +3.333% increase in the duration of
   * activated prayers.
   * </pre>
   *
   * <code>int32 prayer = 14;</code>
   * @return The prayer.
   */
  int getPrayer();
}