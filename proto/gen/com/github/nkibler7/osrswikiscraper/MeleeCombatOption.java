// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: weapons.proto
// Protobuf Java Version: 4.27.3

package com.github.nkibler7.osrswikiscraper;

/**
 * <pre>
 * A combat option that represents a melee attack.
 * </pre>
 *
 * Protobuf type {@code github.nkibler7.osrswikiscraper.MeleeCombatOption}
 */
public final class MeleeCombatOption extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:github.nkibler7.osrswikiscraper.MeleeCombatOption)
    MeleeCombatOptionOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      MeleeCombatOption.class.getName());
  }
  // Use MeleeCombatOption.newBuilder() to construct.
  private MeleeCombatOption(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MeleeCombatOption() {
    attackStyle_ = 0;
    attackType_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_MeleeCombatOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_MeleeCombatOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.nkibler7.osrswikiscraper.MeleeCombatOption.class, com.github.nkibler7.osrswikiscraper.MeleeCombatOption.Builder.class);
  }

  /**
   * <pre>
   * The style of a melee attack option. This primarily influences Modifiers and experience gained
   * from resulting damage.
   * </pre>
   *
   * Protobuf enum {@code github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle}
   */
  public enum MeleeAttackStyle
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default (unspecified) value.
     *
     * This may be used in a valid case to represent a combat option where there is no attack style
     * (e.g. Dinh's Bulwark's "block" option).
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    MELEE_ATTACK_STYLE_UNSPECIFIED(0),
    /**
     * <pre>
     * When using the accurate melee style, for every point of damage a player deals, they gain 4
     * experience in Attack and 1.33 experience in Hitpoints. Using the accurate style provides an
     * invisible +3 boost to your Attack level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_ACCURATE = 1;</code>
     */
    MELEE_ATTACK_STYLE_ACCURATE(1),
    /**
     * <pre>
     * When using the aggressive melee style, for every point of damage a player deals, they gain 4
     * experience in Strength and 1.33 experience in Hitpoints. Using the aggressive style provides
     * an invisible +3 boost to your Strength level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_AGGRESSIVE = 2;</code>
     */
    MELEE_ATTACK_STYLE_AGGRESSIVE(2),
    /**
     * <pre>
     * When using the defensive melee style, for every point of damage a player deals, they gain 4
     * experience in Defence and 1.33 experience in Hitpoints. Using the defensive style provides an
     * invisible +3 boost to your Defence level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_DEFENSIVE = 3;</code>
     */
    MELEE_ATTACK_STYLE_DEFENSIVE(3),
    /**
     * <pre>
     * When using the controlled melee style, for every point of damage a player deals, they gain
     * 1.33 experience each in Attack, Strength, Hitpoints, and Defence. Using the controlled style
     * provides an invisible +1 boost to your Attack, Strength, and Defence levels.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_CONTROLLED = 4;</code>
     */
    MELEE_ATTACK_STYLE_CONTROLLED(4),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        MeleeAttackStyle.class.getName());
    }
    /**
     * <pre>
     * The default (unspecified) value.
     *
     * This may be used in a valid case to represent a combat option where there is no attack style
     * (e.g. Dinh's Bulwark's "block" option).
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_UNSPECIFIED = 0;</code>
     */
    public static final int MELEE_ATTACK_STYLE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * When using the accurate melee style, for every point of damage a player deals, they gain 4
     * experience in Attack and 1.33 experience in Hitpoints. Using the accurate style provides an
     * invisible +3 boost to your Attack level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_ACCURATE = 1;</code>
     */
    public static final int MELEE_ATTACK_STYLE_ACCURATE_VALUE = 1;
    /**
     * <pre>
     * When using the aggressive melee style, for every point of damage a player deals, they gain 4
     * experience in Strength and 1.33 experience in Hitpoints. Using the aggressive style provides
     * an invisible +3 boost to your Strength level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_AGGRESSIVE = 2;</code>
     */
    public static final int MELEE_ATTACK_STYLE_AGGRESSIVE_VALUE = 2;
    /**
     * <pre>
     * When using the defensive melee style, for every point of damage a player deals, they gain 4
     * experience in Defence and 1.33 experience in Hitpoints. Using the defensive style provides an
     * invisible +3 boost to your Defence level.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_DEFENSIVE = 3;</code>
     */
    public static final int MELEE_ATTACK_STYLE_DEFENSIVE_VALUE = 3;
    /**
     * <pre>
     * When using the controlled melee style, for every point of damage a player deals, they gain
     * 1.33 experience each in Attack, Strength, Hitpoints, and Defence. Using the controlled style
     * provides an invisible +1 boost to your Attack, Strength, and Defence levels.
     * </pre>
     *
     * <code>MELEE_ATTACK_STYLE_CONTROLLED = 4;</code>
     */
    public static final int MELEE_ATTACK_STYLE_CONTROLLED_VALUE = 4;


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
    public static MeleeAttackStyle valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MeleeAttackStyle forNumber(int value) {
      switch (value) {
        case 0: return MELEE_ATTACK_STYLE_UNSPECIFIED;
        case 1: return MELEE_ATTACK_STYLE_ACCURATE;
        case 2: return MELEE_ATTACK_STYLE_AGGRESSIVE;
        case 3: return MELEE_ATTACK_STYLE_DEFENSIVE;
        case 4: return MELEE_ATTACK_STYLE_CONTROLLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeleeAttackStyle>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeleeAttackStyle> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeleeAttackStyle>() {
            public MeleeAttackStyle findValueByNumber(int number) {
              return MeleeAttackStyle.forNumber(number);
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
      return com.github.nkibler7.osrswikiscraper.MeleeCombatOption.getDescriptor().getEnumTypes().get(0);
    }

    private static final MeleeAttackStyle[] VALUES = values();

    public static MeleeAttackStyle valueOf(
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

    private MeleeAttackStyle(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle)
  }

  /**
   * <pre>
   * The type of a melee attack option. This primarily influences attack &amp; defence roll calculations
   * when associated with StatBonuses.
   * </pre>
   *
   * Protobuf enum {@code github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType}
   */
  public enum MeleeAttackType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default (unspecified) value.
     *
     * This may be used in a valid case to represent a combat option where there is no attack type
     * (e.g. Dinh's Bulwark's "block" option).
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_UNSPECIFIED = 0;</code>
     */
    MELEE_ATTACK_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The type that represents stab-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.stab_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_STAB = 1;</code>
     */
    MELEE_ATTACK_TYPE_STAB(1),
    /**
     * <pre>
     * The type that represents slash-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.slash_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_SLASH = 2;</code>
     */
    MELEE_ATTACK_TYPE_SLASH(2),
    /**
     * <pre>
     * The type that represents crush-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.crush_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_CRUSH = 3;</code>
     */
    MELEE_ATTACK_TYPE_CRUSH(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        MeleeAttackType.class.getName());
    }
    /**
     * <pre>
     * The default (unspecified) value.
     *
     * This may be used in a valid case to represent a combat option where there is no attack type
     * (e.g. Dinh's Bulwark's "block" option).
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MELEE_ATTACK_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The type that represents stab-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.stab_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_STAB = 1;</code>
     */
    public static final int MELEE_ATTACK_TYPE_STAB_VALUE = 1;
    /**
     * <pre>
     * The type that represents slash-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.slash_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_SLASH = 2;</code>
     */
    public static final int MELEE_ATTACK_TYPE_SLASH_VALUE = 2;
    /**
     * <pre>
     * The type that represents crush-based damage. If chosen, a combat option with this type will
     * use `StatBonuses.crush_attack` in calculating the player's attack roll.
     * </pre>
     *
     * <code>MELEE_ATTACK_TYPE_CRUSH = 3;</code>
     */
    public static final int MELEE_ATTACK_TYPE_CRUSH_VALUE = 3;


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
    public static MeleeAttackType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MeleeAttackType forNumber(int value) {
      switch (value) {
        case 0: return MELEE_ATTACK_TYPE_UNSPECIFIED;
        case 1: return MELEE_ATTACK_TYPE_STAB;
        case 2: return MELEE_ATTACK_TYPE_SLASH;
        case 3: return MELEE_ATTACK_TYPE_CRUSH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeleeAttackType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeleeAttackType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeleeAttackType>() {
            public MeleeAttackType findValueByNumber(int number) {
              return MeleeAttackType.forNumber(number);
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
      return com.github.nkibler7.osrswikiscraper.MeleeCombatOption.getDescriptor().getEnumTypes().get(1);
    }

    private static final MeleeAttackType[] VALUES = values();

    public static MeleeAttackType valueOf(
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

    private MeleeAttackType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType)
  }

  public static final int ATTACK_STYLE_FIELD_NUMBER = 1;
  private int attackStyle_ = 0;
  /**
   * <pre>
   * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
   * @return The enum numeric value on the wire for attackStyle.
   */
  @java.lang.Override public int getAttackStyleValue() {
    return attackStyle_;
  }
  /**
   * <pre>
   * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
   * @return The attackStyle.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle getAttackStyle() {
    com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle result = com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.forNumber(attackStyle_);
    return result == null ? com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.UNRECOGNIZED : result;
  }

  public static final int ATTACK_TYPE_FIELD_NUMBER = 2;
  private int attackType_ = 0;
  /**
   * <pre>
   * The type of this melee attack option (e.g. stab, slash, or crush).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
   * @return The enum numeric value on the wire for attackType.
   */
  @java.lang.Override public int getAttackTypeValue() {
    return attackType_;
  }
  /**
   * <pre>
   * The type of this melee attack option (e.g. stab, slash, or crush).
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
   * @return The attackType.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType getAttackType() {
    com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType result = com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.forNumber(attackType_);
    return result == null ? com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.UNRECOGNIZED : result;
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
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.MELEE_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, attackStyle_);
    }
    if (attackType_ != com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.MELEE_ATTACK_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, attackType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.MELEE_ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, attackStyle_);
    }
    if (attackType_ != com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.MELEE_ATTACK_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, attackType_);
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
    if (!(obj instanceof com.github.nkibler7.osrswikiscraper.MeleeCombatOption)) {
      return super.equals(obj);
    }
    com.github.nkibler7.osrswikiscraper.MeleeCombatOption other = (com.github.nkibler7.osrswikiscraper.MeleeCombatOption) obj;

    if (attackStyle_ != other.attackStyle_) return false;
    if (attackType_ != other.attackType_) return false;
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
    hash = (37 * hash) + ATTACK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + attackType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption parseFrom(
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
  public static Builder newBuilder(com.github.nkibler7.osrswikiscraper.MeleeCombatOption prototype) {
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
   * A combat option that represents a melee attack.
   * </pre>
   *
   * Protobuf type {@code github.nkibler7.osrswikiscraper.MeleeCombatOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:github.nkibler7.osrswikiscraper.MeleeCombatOption)
      com.github.nkibler7.osrswikiscraper.MeleeCombatOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_MeleeCombatOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_MeleeCombatOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.nkibler7.osrswikiscraper.MeleeCombatOption.class, com.github.nkibler7.osrswikiscraper.MeleeCombatOption.Builder.class);
    }

    // Construct using com.github.nkibler7.osrswikiscraper.MeleeCombatOption.newBuilder()
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
      attackType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_MeleeCombatOption_descriptor;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeCombatOption getDefaultInstanceForType() {
      return com.github.nkibler7.osrswikiscraper.MeleeCombatOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeCombatOption build() {
      com.github.nkibler7.osrswikiscraper.MeleeCombatOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeCombatOption buildPartial() {
      com.github.nkibler7.osrswikiscraper.MeleeCombatOption result = new com.github.nkibler7.osrswikiscraper.MeleeCombatOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.nkibler7.osrswikiscraper.MeleeCombatOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attackStyle_ = attackStyle_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attackType_ = attackType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.nkibler7.osrswikiscraper.MeleeCombatOption) {
        return mergeFrom((com.github.nkibler7.osrswikiscraper.MeleeCombatOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.nkibler7.osrswikiscraper.MeleeCombatOption other) {
      if (other == com.github.nkibler7.osrswikiscraper.MeleeCombatOption.getDefaultInstance()) return this;
      if (other.attackStyle_ != 0) {
        setAttackStyleValue(other.getAttackStyleValue());
      }
      if (other.attackType_ != 0) {
        setAttackTypeValue(other.getAttackTypeValue());
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
            case 16: {
              attackType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
     * @return The enum numeric value on the wire for attackStyle.
     */
    @java.lang.Override public int getAttackStyleValue() {
      return attackStyle_;
    }
    /**
     * <pre>
     * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
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
     * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
     * @return The attackStyle.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle getAttackStyle() {
      com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle result = com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.forNumber(attackStyle_);
      return result == null ? com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
     * @param value The attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyle(com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle value) {
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
     * The style of this melee attack option (e.g. accurate, aggressive, defensive, etc.).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackStyle attack_style = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackStyle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attackStyle_ = 0;
      onChanged();
      return this;
    }

    private int attackType_ = 0;
    /**
     * <pre>
     * The type of this melee attack option (e.g. stab, slash, or crush).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
     * @return The enum numeric value on the wire for attackType.
     */
    @java.lang.Override public int getAttackTypeValue() {
      return attackType_;
    }
    /**
     * <pre>
     * The type of this melee attack option (e.g. stab, slash, or crush).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
     * @param value The enum numeric value on the wire for attackType to set.
     * @return This builder for chaining.
     */
    public Builder setAttackTypeValue(int value) {
      attackType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of this melee attack option (e.g. stab, slash, or crush).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
     * @return The attackType.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType getAttackType() {
      com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType result = com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.forNumber(attackType_);
      return result == null ? com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of this melee attack option (e.g. stab, slash, or crush).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
     * @param value The attackType to set.
     * @return This builder for chaining.
     */
    public Builder setAttackType(com.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      attackType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of this melee attack option (e.g. stab, slash, or crush).
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeCombatOption.MeleeAttackType attack_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      attackType_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:github.nkibler7.osrswikiscraper.MeleeCombatOption)
  }

  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.MeleeCombatOption)
  private static final com.github.nkibler7.osrswikiscraper.MeleeCombatOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.nkibler7.osrswikiscraper.MeleeCombatOption();
  }

  public static com.github.nkibler7.osrswikiscraper.MeleeCombatOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeleeCombatOption>
      PARSER = new com.google.protobuf.AbstractParser<MeleeCombatOption>() {
    @java.lang.Override
    public MeleeCombatOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<MeleeCombatOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MeleeCombatOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.MeleeCombatOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

