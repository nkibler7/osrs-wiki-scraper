// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: equipment.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

/**
 * Protobuf type {@code github.nkibler7.osrswikiscraper.MagicCombatOption}
 */
public final class MagicCombatOption extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:github.nkibler7.osrswikiscraper.MagicCombatOption)
    MagicCombatOptionOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      MagicCombatOption.class.getName());
  }
  // Use MagicCombatOption.newBuilder() to construct.
  private MagicCombatOption(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MagicCombatOption() {
    attackStyle_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_MagicCombatOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_MagicCombatOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.nkibler7.osrswikiscraper.MagicCombatOption.class, com.github.nkibler7.osrswikiscraper.MagicCombatOption.Builder.class);
  }

  /**
   * <pre>
   * The style of a magic attack option. This primarily influences Modifiers and experience gained
   * from resulting damage.
   * </pre>
   *
   * Protobuf enum {@code github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle}
   */
  public enum MagicAttackStyle
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default (unspecified) value.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    MAGIC_ATTACK_STYLE_UNSPECIFIED(0),
    /**
     * <pre>
     * If a player chooses the standard style for autocasting, they perform a normal magical attack
     * and for each point of damage the spell deals, they gain 2 experience in Magic and 1.33
     * experience in Hitpoints, in addition to the Magic experience from casting the spell.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_AUTOCAST = 1;</code>
     */
    MAGIC_ATTACK_STYLE_AUTOCAST(1),
    /**
     * <pre>
     * If a player chooses the defensive style for autocasting, they perform a normal magical attack
     * and for each point of damage the spell deals, they gain 1.33 experience in Magic, 1
     * experience in Defence, and 1.33 experience in Hitpoints. The experience from casting the
     * spell is still given entirely to Magic.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_DEFENSIVE_AUTOCAST = 2;</code>
     */
    MAGIC_ATTACK_STYLE_DEFENSIVE_AUTOCAST(2),
    /**
     * <pre>
     * The accurate style allows a player to receive a +3 invisible bonus to their Magic level.
     *
     * This applies to powered staves only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_ACCURATE = 3;</code>
     */
    MAGIC_ATTACK_STYLE_ACCURATE(3),
    /**
     * <pre>
     * The longrange style allows a player to receive a +1 invisible bonus to their Magic level and
     * a +3 invisible bonus to their Defence level. Attack range is increased with this attack
     * style.
     *
     * This applies to powered staves only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_LONGRANGE = 4;</code>
     */
    MAGIC_ATTACK_STYLE_LONGRANGE(4),
    /**
     * <pre>
     * The defensive style allows a player to receive a +3 invisible bonus to their Defence level.
     *
     * This applies to salamanders only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_DEFENSIVE = 5;</code>
     */
    MAGIC_ATTACK_STYLE_DEFENSIVE(5),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        MagicAttackStyle.class.getName());
    }
    /**
     * <pre>
     * The default (unspecified) value.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * If a player chooses the standard style for autocasting, they perform a normal magical attack
     * and for each point of damage the spell deals, they gain 2 experience in Magic and 1.33
     * experience in Hitpoints, in addition to the Magic experience from casting the spell.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_AUTOCAST = 1;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_AUTOCAST_VALUE = 1;
    /**
     * <pre>
     * If a player chooses the defensive style for autocasting, they perform a normal magical attack
     * and for each point of damage the spell deals, they gain 1.33 experience in Magic, 1
     * experience in Defence, and 1.33 experience in Hitpoints. The experience from casting the
     * spell is still given entirely to Magic.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_DEFENSIVE_AUTOCAST = 2;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_DEFENSIVE_AUTOCAST_VALUE = 2;
    /**
     * <pre>
     * The accurate style allows a player to receive a +3 invisible bonus to their Magic level.
     *
     * This applies to powered staves only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_ACCURATE = 3;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_ACCURATE_VALUE = 3;
    /**
     * <pre>
     * The longrange style allows a player to receive a +1 invisible bonus to their Magic level and
     * a +3 invisible bonus to their Defence level. Attack range is increased with this attack
     * style.
     *
     * This applies to powered staves only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_LONGRANGE = 4;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_LONGRANGE_VALUE = 4;
    /**
     * <pre>
     * The defensive style allows a player to receive a +3 invisible bonus to their Defence level.
     *
     * This applies to salamanders only.
     * </pre>
     *
     * <code>MAGIC_ATTACK_STYLE_DEFENSIVE = 5;</code>
     */
    public static final int MAGIC_ATTACK_STYLE_DEFENSIVE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MagicAttackStyle valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MagicAttackStyle forNumber(int value) {
      switch (value) {
        case 0: return MAGIC_ATTACK_STYLE_UNSPECIFIED;
        case 1: return MAGIC_ATTACK_STYLE_AUTOCAST;
        case 2: return MAGIC_ATTACK_STYLE_DEFENSIVE_AUTOCAST;
        case 3: return MAGIC_ATTACK_STYLE_ACCURATE;
        case 4: return MAGIC_ATTACK_STYLE_LONGRANGE;
        case 5: return MAGIC_ATTACK_STYLE_DEFENSIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MagicAttackStyle>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MagicAttackStyle> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MagicAttackStyle>() {
            public MagicAttackStyle findValueByNumber(int number) {
              return MagicAttackStyle.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.MagicCombatOption.getDescriptor().getEnumTypes().get(0);
    }

    private static final MagicAttackStyle[] VALUES = values();

    public static MagicAttackStyle valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MagicAttackStyle(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle)
  }

  public static final int ATTACK_STYLE_FIELD_NUMBER = 1;
  private int attackStyle_ = 0;
  /**
   * <pre>
   * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
   * @return The enum numeric value on the wire for attackStyle.
   */
  @java.lang.Override public int getAttackStyleValue() {
    return attackStyle_;
  }
  /**
   * <pre>
   * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
   * @return The attackStyle.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle getAttackStyle() {
    com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle result = com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.forNumber(attackStyle_);
    return result == null ? com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.UNRECOGNIZED : result;
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
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.MAGIC_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, attackStyle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.MAGIC_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, attackStyle_);
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
    if (!(obj instanceof com.github.nkibler7.osrswikiscraper.MagicCombatOption)) {
      return super.equals(obj);
    }
    com.github.nkibler7.osrswikiscraper.MagicCombatOption other = (com.github.nkibler7.osrswikiscraper.MagicCombatOption) obj;

    if (attackStyle_ != other.attackStyle_) return false;
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
    hash = (37 * hash) + ATTACK_STYLE_FIELD_NUMBER;
    hash = (53 * hash) + attackStyle_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.nkibler7.osrswikiscraper.MagicCombatOption prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code github.nkibler7.osrswikiscraper.MagicCombatOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:github.nkibler7.osrswikiscraper.MagicCombatOption)
      com.github.nkibler7.osrswikiscraper.MagicCombatOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_MagicCombatOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_MagicCombatOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.nkibler7.osrswikiscraper.MagicCombatOption.class, com.github.nkibler7.osrswikiscraper.MagicCombatOption.Builder.class);
    }

    // Construct using com.github.nkibler7.osrswikiscraper.MagicCombatOption.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attackStyle_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_MagicCombatOption_descriptor;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MagicCombatOption getDefaultInstanceForType() {
      return com.github.nkibler7.osrswikiscraper.MagicCombatOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MagicCombatOption build() {
      com.github.nkibler7.osrswikiscraper.MagicCombatOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MagicCombatOption buildPartial() {
      com.github.nkibler7.osrswikiscraper.MagicCombatOption result = new com.github.nkibler7.osrswikiscraper.MagicCombatOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.nkibler7.osrswikiscraper.MagicCombatOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attackStyle_ = attackStyle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.nkibler7.osrswikiscraper.MagicCombatOption) {
        return mergeFrom((com.github.nkibler7.osrswikiscraper.MagicCombatOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.nkibler7.osrswikiscraper.MagicCombatOption other) {
      if (other == com.github.nkibler7.osrswikiscraper.MagicCombatOption.getDefaultInstance()) return this;
      if (other.attackStyle_ != 0) {
        setAttackStyleValue(other.getAttackStyleValue());
      }
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
            case 8: {
              attackStyle_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int attackStyle_ = 0;
    /**
     * <pre>
     * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
     * @return The enum numeric value on the wire for attackStyle.
     */
    @java.lang.Override public int getAttackStyleValue() {
      return attackStyle_;
    }
    /**
     * <pre>
     * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
     * @param value The enum numeric value on the wire for attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyleValue(int value) {
      attackStyle_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
     * @return The attackStyle.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle getAttackStyle() {
      com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle result = com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.forNumber(attackStyle_);
      return result == null ? com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
     * @param value The attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyle(com.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      attackStyle_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The style of this magic attack option (e.g. autocast, defensive autocast, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MagicCombatOption.MagicAttackStyle attack_style = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackStyle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attackStyle_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:github.nkibler7.osrswikiscraper.MagicCombatOption)
  }

  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.MagicCombatOption)
  private static final com.github.nkibler7.osrswikiscraper.MagicCombatOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.nkibler7.osrswikiscraper.MagicCombatOption();
  }

  public static com.github.nkibler7.osrswikiscraper.MagicCombatOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MagicCombatOption>
      PARSER = new com.google.protobuf.AbstractParser<MagicCombatOption>() {
    @java.lang.Override
    public MagicCombatOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<MagicCombatOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MagicCombatOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.MagicCombatOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

