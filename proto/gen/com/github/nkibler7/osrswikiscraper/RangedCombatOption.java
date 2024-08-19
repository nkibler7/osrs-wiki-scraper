// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: equipment.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

/**
 * <pre>
 * A combat option that represents a ranged attack.
 * </pre>
 *
 * Protobuf type {@code github.nkibler7.osrswikiscraper.RangedCombatOption}
 */
public final class RangedCombatOption extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:github.nkibler7.osrswikiscraper.RangedCombatOption)
    RangedCombatOptionOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      RangedCombatOption.class.getName());
  }
  // Use RangedCombatOption.newBuilder() to construct.
  private RangedCombatOption(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RangedCombatOption() {
    attackStyle_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_RangedCombatOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_RangedCombatOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.nkibler7.osrswikiscraper.RangedCombatOption.class, com.github.nkibler7.osrswikiscraper.RangedCombatOption.Builder.class);
  }

  /**
   * <pre>
   * The style of a ranged attack option. This primarily influences Modifiers, like accuracy and
   * attack speed.
   * </pre>
   *
   * Protobuf enum {@code github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle}
   */
  public enum RangedAttackStyle
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default (unspecified) value.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    RANGED_ATTACK_STYLE_UNSPECIFIED(0),
    /**
     * <pre>
     * When using the accurate style, for every point of damage a player deals, they gain 4
     * experience in Ranged and 1.33 experience in Hitpoints. The accurate style allows a player to
     * shoot less often than in the rapid style, however they receive a +3 invisible bonus to their
     * Ranged level, thereby increasing accuracy and damage.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_ACCURATE = 1;</code>
     */
    RANGED_ATTACK_STYLE_ACCURATE(1),
    /**
     * <pre>
     * When using the rapid style, for every point of damage a player deals, they gain 4 experience
     * in Ranged and 1.33 experience in Hitpoints. The rapid style allows a player to shoot more
     * often than in the accurate style, but a player is more likely to miss (i.e. dealing 0
     * damage).
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_RAPID = 2;</code>
     */
    RANGED_ATTACK_STYLE_RAPID(2),
    /**
     * <pre>
     * When using the longrange style, for every point of damage a player deals, they gain 2
     * experience in Ranged, 2 experience in Defence, and 1.33 in Hitpoints. Attack range is
     * increased with this attack style.
     *
     * Using the longrange style provides an invisible +3 boost to your Defence level.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_LONGRANGE = 3;</code>
     */
    RANGED_ATTACK_STYLE_LONGRANGE(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        RangedAttackStyle.class.getName());
    }
    /**
     * <pre>
     * The default (unspecified) value.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    public static final int RANGED_ATTACK_STYLE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * When using the accurate style, for every point of damage a player deals, they gain 4
     * experience in Ranged and 1.33 experience in Hitpoints. The accurate style allows a player to
     * shoot less often than in the rapid style, however they receive a +3 invisible bonus to their
     * Ranged level, thereby increasing accuracy and damage.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_ACCURATE = 1;</code>
     */
    public static final int RANGED_ATTACK_STYLE_ACCURATE_VALUE = 1;
    /**
     * <pre>
     * When using the rapid style, for every point of damage a player deals, they gain 4 experience
     * in Ranged and 1.33 experience in Hitpoints. The rapid style allows a player to shoot more
     * often than in the accurate style, but a player is more likely to miss (i.e. dealing 0
     * damage).
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_RAPID = 2;</code>
     */
    public static final int RANGED_ATTACK_STYLE_RAPID_VALUE = 2;
    /**
     * <pre>
     * When using the longrange style, for every point of damage a player deals, they gain 2
     * experience in Ranged, 2 experience in Defence, and 1.33 in Hitpoints. Attack range is
     * increased with this attack style.
     *
     * Using the longrange style provides an invisible +3 boost to your Defence level.
     * </pre>
     *
     * <code>RANGED_ATTACK_STYLE_LONGRANGE = 3;</code>
     */
    public static final int RANGED_ATTACK_STYLE_LONGRANGE_VALUE = 3;


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
    public static RangedAttackStyle valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RangedAttackStyle forNumber(int value) {
      switch (value) {
        case 0: return RANGED_ATTACK_STYLE_UNSPECIFIED;
        case 1: return RANGED_ATTACK_STYLE_ACCURATE;
        case 2: return RANGED_ATTACK_STYLE_RAPID;
        case 3: return RANGED_ATTACK_STYLE_LONGRANGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RangedAttackStyle>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RangedAttackStyle> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RangedAttackStyle>() {
            public RangedAttackStyle findValueByNumber(int number) {
              return RangedAttackStyle.forNumber(number);
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
      return com.github.nkibler7.osrswikiscraper.RangedCombatOption.getDescriptor().getEnumTypes().get(0);
    }

    private static final RangedAttackStyle[] VALUES = values();

    public static RangedAttackStyle valueOf(
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

    private RangedAttackStyle(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle)
  }

  public static final int ATTACK_STYLE_FIELD_NUMBER = 1;
  private int attackStyle_ = 0;
  /**
   * <pre>
   * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
   * @return The enum numeric value on the wire for attackStyle.
   */
  @java.lang.Override public int getAttackStyleValue() {
    return attackStyle_;
  }
  /**
   * <pre>
   * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
   * @return The attackStyle.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle getAttackStyle() {
    com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle result = com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.forNumber(attackStyle_);
    return result == null ? com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.UNRECOGNIZED : result;
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
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.RANGED_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, attackStyle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.RANGED_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
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
    if (!(obj instanceof com.github.nkibler7.osrswikiscraper.RangedCombatOption)) {
      return super.equals(obj);
    }
    com.github.nkibler7.osrswikiscraper.RangedCombatOption other = (com.github.nkibler7.osrswikiscraper.RangedCombatOption) obj;

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

  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption parseFrom(
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
  public static Builder newBuilder(com.github.nkibler7.osrswikiscraper.RangedCombatOption prototype) {
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
   * <pre>
   * A combat option that represents a ranged attack.
   * </pre>
   *
   * Protobuf type {@code github.nkibler7.osrswikiscraper.RangedCombatOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:github.nkibler7.osrswikiscraper.RangedCombatOption)
      com.github.nkibler7.osrswikiscraper.RangedCombatOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_RangedCombatOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_RangedCombatOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.nkibler7.osrswikiscraper.RangedCombatOption.class, com.github.nkibler7.osrswikiscraper.RangedCombatOption.Builder.class);
    }

    // Construct using com.github.nkibler7.osrswikiscraper.RangedCombatOption.newBuilder()
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
      return com.github.nkibler7.osrswikiscraper.EquipmentOuterClass.internal_static_github_nkibler7_osrswikiscraper_RangedCombatOption_descriptor;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.RangedCombatOption getDefaultInstanceForType() {
      return com.github.nkibler7.osrswikiscraper.RangedCombatOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.RangedCombatOption build() {
      com.github.nkibler7.osrswikiscraper.RangedCombatOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.RangedCombatOption buildPartial() {
      com.github.nkibler7.osrswikiscraper.RangedCombatOption result = new com.github.nkibler7.osrswikiscraper.RangedCombatOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.nkibler7.osrswikiscraper.RangedCombatOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attackStyle_ = attackStyle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.nkibler7.osrswikiscraper.RangedCombatOption) {
        return mergeFrom((com.github.nkibler7.osrswikiscraper.RangedCombatOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.nkibler7.osrswikiscraper.RangedCombatOption other) {
      if (other == com.github.nkibler7.osrswikiscraper.RangedCombatOption.getDefaultInstance()) return this;
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
     * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
     * @return The enum numeric value on the wire for attackStyle.
     */
    @java.lang.Override public int getAttackStyleValue() {
      return attackStyle_;
    }
    /**
     * <pre>
     * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
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
     * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
     * @return The attackStyle.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle getAttackStyle() {
      com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle result = com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.forNumber(attackStyle_);
      return result == null ? com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
     * @param value The attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyle(com.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle value) {
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
     * The style of this ranged attack option (e.g. accurate, rapid, or longrange).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.RangedCombatOption.RangedAttackStyle attack_style = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackStyle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attackStyle_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:github.nkibler7.osrswikiscraper.RangedCombatOption)
  }

  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.RangedCombatOption)
  private static final com.github.nkibler7.osrswikiscraper.RangedCombatOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.nkibler7.osrswikiscraper.RangedCombatOption();
  }

  public static com.github.nkibler7.osrswikiscraper.RangedCombatOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangedCombatOption>
      PARSER = new com.google.protobuf.AbstractParser<RangedCombatOption>() {
    @java.lang.Override
    public RangedCombatOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<RangedCombatOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangedCombatOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.RangedCombatOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

