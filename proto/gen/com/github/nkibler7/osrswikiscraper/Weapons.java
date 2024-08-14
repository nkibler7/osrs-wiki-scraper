// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weapons.proto

// Protobuf Java Version: 3.25.1
package com.github.nkibler7.osrswikiscraper;

/**
 * <pre>
 * A collection of Weapon protos scraped from the OSRS wiki.
 * </pre>
 *
 * Protobuf type {@code github.nkibler7.osrswikiscraper.Weapons}
 */
public final class Weapons extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:github.nkibler7.osrswikiscraper.Weapons)
    WeaponsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Weapons.newBuilder() to construct.
  private Weapons(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Weapons() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Weapons();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetWeapons();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.nkibler7.osrswikiscraper.Weapons.class, com.github.nkibler7.osrswikiscraper.Weapons.Builder.class);
  }

  public static final int WEAPONS_FIELD_NUMBER = 1;
  private static final class WeaponsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>newDefaultInstance(
                com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_WeaponsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.github.nkibler7.osrswikiscraper.Weapon.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> weapons_;
  private com.google.protobuf.MapField<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
  internalGetWeapons() {
    if (weapons_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          WeaponsDefaultEntryHolder.defaultEntry);
    }
    return weapons_;
  }
  public int getWeaponsCount() {
    return internalGetWeapons().getMap().size();
  }
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  @java.lang.Override
  public boolean containsWeapons(
      int key) {

    return internalGetWeapons().getMap().containsKey(key);
  }
  /**
   * Use {@link #getWeaponsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> getWeapons() {
    return getWeaponsMap();
  }
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> getWeaponsMap() {
    return internalGetWeapons().getMap();
  }
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrDefault(
      int key,
      /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon defaultValue) {

    java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> map =
        internalGetWeapons().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
   * </pre>
   *
   * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
   */
  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> map =
        internalGetWeapons().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetWeapons(),
        WeaponsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> entry
         : internalGetWeapons().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
      weapons__ = WeaponsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, weapons__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.nkibler7.osrswikiscraper.Weapons)) {
      return super.equals(obj);
    }
    com.github.nkibler7.osrswikiscraper.Weapons other = (com.github.nkibler7.osrswikiscraper.Weapons) obj;

    if (!internalGetWeapons().equals(
        other.internalGetWeapons())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetWeapons().getMap().isEmpty()) {
      hash = (37 * hash) + WEAPONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetWeapons().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.nkibler7.osrswikiscraper.Weapons parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.nkibler7.osrswikiscraper.Weapons parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.Weapons parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.nkibler7.osrswikiscraper.Weapons prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A collection of Weapon protos scraped from the OSRS wiki.
   * </pre>
   *
   * Protobuf type {@code github.nkibler7.osrswikiscraper.Weapons}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:github.nkibler7.osrswikiscraper.Weapons)
      com.github.nkibler7.osrswikiscraper.WeaponsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetWeapons();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableWeapons();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.nkibler7.osrswikiscraper.Weapons.class, com.github.nkibler7.osrswikiscraper.Weapons.Builder.class);
    }

    // Construct using com.github.nkibler7.osrswikiscraper.Weapons.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableWeapons().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_Weapons_descriptor;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.Weapons getDefaultInstanceForType() {
      return com.github.nkibler7.osrswikiscraper.Weapons.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.Weapons build() {
      com.github.nkibler7.osrswikiscraper.Weapons result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.Weapons buildPartial() {
      com.github.nkibler7.osrswikiscraper.Weapons result = new com.github.nkibler7.osrswikiscraper.Weapons(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.nkibler7.osrswikiscraper.Weapons result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.weapons_ = internalGetWeapons().build(WeaponsDefaultEntryHolder.defaultEntry);
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.nkibler7.osrswikiscraper.Weapons) {
        return mergeFrom((com.github.nkibler7.osrswikiscraper.Weapons)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.nkibler7.osrswikiscraper.Weapons other) {
      if (other == com.github.nkibler7.osrswikiscraper.Weapons.getDefaultInstance()) return this;
      internalGetMutableWeapons().mergeFrom(
          other.internalGetWeapons());
      bitField0_ |= 0x00000001;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
              weapons__ = input.readMessage(
                  WeaponsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableWeapons().ensureBuilderMap().put(
                  weapons__.getKey(), weapons__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private static final class WeaponsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder, com.github.nkibler7.osrswikiscraper.Weapon> {
      @java.lang.Override
      public com.github.nkibler7.osrswikiscraper.Weapon build(com.github.nkibler7.osrswikiscraper.WeaponOrBuilder val) {
        if (val instanceof com.github.nkibler7.osrswikiscraper.Weapon) { return (com.github.nkibler7.osrswikiscraper.Weapon) val; }
        return ((com.github.nkibler7.osrswikiscraper.Weapon.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> defaultEntry() {
        return WeaponsDefaultEntryHolder.defaultEntry;
      }
    };
    private static final WeaponsConverter weaponsConverter = new WeaponsConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder, com.github.nkibler7.osrswikiscraper.Weapon, com.github.nkibler7.osrswikiscraper.Weapon.Builder> weapons_;
    private com.google.protobuf.MapFieldBuilder<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder, com.github.nkibler7.osrswikiscraper.Weapon, com.github.nkibler7.osrswikiscraper.Weapon.Builder>
        internalGetWeapons() {
      if (weapons_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(weaponsConverter);
      }
      return weapons_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder, com.github.nkibler7.osrswikiscraper.Weapon, com.github.nkibler7.osrswikiscraper.Weapon.Builder>
        internalGetMutableWeapons() {
      if (weapons_ == null) {
        weapons_ = new com.google.protobuf.MapFieldBuilder<>(weaponsConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return weapons_;
    }
    public int getWeaponsCount() {
      return internalGetWeapons().ensureBuilderMap().size();
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    @java.lang.Override
    public boolean containsWeapons(
        int key) {

      return internalGetWeapons().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getWeaponsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> getWeapons() {
      return getWeaponsMap();
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> getWeaponsMap() {
      return internalGetWeapons().getImmutableMap();
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrDefault(
        int key,
        /* nullable */
com.github.nkibler7.osrswikiscraper.Weapon defaultValue) {

      java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder> map = internalGetMutableWeapons().ensureBuilderMap();
      return map.containsKey(key) ? weaponsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.Weapon getWeaponsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder> map = internalGetMutableWeapons().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return weaponsConverter.build(map.get(key));
    }
    public Builder clearWeapons() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableWeapons().clear();
      return this;
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    public Builder removeWeapons(
        int key) {

      internalGetMutableWeapons().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon>
        getMutableWeapons() {
      bitField0_ |= 0x00000001;
      return internalGetMutableWeapons().ensureMessageMap();
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    public Builder putWeapons(
        int key,
        com.github.nkibler7.osrswikiscraper.Weapon value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableWeapons().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    public Builder putAllWeapons(
        java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> values) {
      for (java.util.Map.Entry<java.lang.Integer, com.github.nkibler7.osrswikiscraper.Weapon> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableWeapons().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * A map of all weapons scraped from the OSRS wiki, keyed by their item IDs.
     * </pre>
     *
     * <code>map&lt;int32, .github.nkibler7.osrswikiscraper.Weapon&gt; weapons = 1;</code>
     */
    public com.github.nkibler7.osrswikiscraper.Weapon.Builder putWeaponsBuilderIfAbsent(
        int key) {
      java.util.Map<java.lang.Integer, com.github.nkibler7.osrswikiscraper.WeaponOrBuilder> builderMap = internalGetMutableWeapons().ensureBuilderMap();
      com.github.nkibler7.osrswikiscraper.WeaponOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.github.nkibler7.osrswikiscraper.Weapon.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.github.nkibler7.osrswikiscraper.Weapon) {
        entry = ((com.github.nkibler7.osrswikiscraper.Weapon) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.github.nkibler7.osrswikiscraper.Weapon.Builder) entry;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:github.nkibler7.osrswikiscraper.Weapons)
  }

  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.Weapons)
  private static final com.github.nkibler7.osrswikiscraper.Weapons DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.nkibler7.osrswikiscraper.Weapons();
  }

  public static com.github.nkibler7.osrswikiscraper.Weapons getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Weapons>
      PARSER = new com.google.protobuf.AbstractParser<Weapons>() {
    @java.lang.Override
    public Weapons parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Weapons> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Weapons> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.Weapons getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

