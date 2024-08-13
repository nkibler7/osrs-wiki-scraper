// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: weapons.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

public interface WeaponsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:github.nkibler7.osrswikiscraper.Weapons)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  int getWeaponsCount();
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  boolean containsWeapons(
      int key);
  /**
   * Use {@link #getWeaponsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
  getWeapons();
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
  getWeaponsMap();
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrDefault(
      int key,
      /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon defaultValue);
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrThrow(
      int key);
}
