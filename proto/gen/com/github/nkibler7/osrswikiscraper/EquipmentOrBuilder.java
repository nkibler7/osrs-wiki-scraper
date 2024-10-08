// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: equipment.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

public interface EquipmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:github.nkibler7.osrswikiscraper.Equipment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A map of all equippable items scraped from the OSRS wiki, keyed by their item IDs.
   *
   * Items with multiple versions have separate entries for each version in this map, assuming that each item version
   * has its own unique ID.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.EquippableItem&gt; items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * A map of all equippable items scraped from the OSRS wiki, keyed by their item IDs.
   *
   * Items with multiple versions have separate entries for each version in this map, assuming that each item version
   * has its own unique ID.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.EquippableItem&gt; items = 1;</code>
   */
  boolean containsItems(
      int key);
  /**
   * Use {@link #getItemsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.EquippableItem>
  getItems();
  /**
   * <pre>
   * A map of all equippable items scraped from the OSRS wiki, keyed by their item IDs.
   *
   * Items with multiple versions have separate entries for each version in this map, assuming that each item version
   * has its own unique ID.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.EquippableItem&gt; items = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.EquippableItem>
  getItemsMap();
  /**
   * <pre>
   * A map of all equippable items scraped from the OSRS wiki, keyed by their item IDs.
   *
   * Items with multiple versions have separate entries for each version in this map, assuming that each item version
   * has its own unique ID.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.EquippableItem&gt; items = 1;</code>
   */
  /* nullable */
com.github.nkibler7.osrswikiscraper.EquippableItem getItemsOrDefault(
      int key,
      /* nullable */
com.github.nkibler7.osrswikiscraper.EquippableItem defaultValue);
  /**
   * <pre>
   * A map of all equippable items scraped from the OSRS wiki, keyed by their item IDs.
   *
   * Items with multiple versions have separate entries for each version in this map, assuming that each item version
   * has its own unique ID.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.EquippableItem&gt; items = 1;</code>
   */
  com.github.nkibler7.osrswikiscraper.EquippableItem getItemsOrThrow(
      int key);
}
