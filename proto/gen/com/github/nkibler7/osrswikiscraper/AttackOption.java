// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weapons.proto

package com.github.nkibler7.osrswikiscraper;

/**
 * <pre>
 * A specific combination of an AttackStyle and AttackType that is selectable by the user for a
 * given weapon.
 * </pre>
 *
 * Protobuf type {@code github.nkibler7.osrswikiscraper.AttackOption}
 */
public final class AttackOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:github.nkibler7.osrswikiscraper.AttackOption)
    AttackOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttackOption.newBuilder() to construct.
  private AttackOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttackOption() {
    attackStyle_ = 0;
    meleeAttackType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttackOption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttackOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            attackStyle_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            meleeAttackType_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_AttackOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_AttackOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.nkibler7.osrswikiscraper.AttackOption.class, com.github.nkibler7.osrswikiscraper.AttackOption.Builder.class);
  }

  public static final int ATTACK_STYLE_FIELD_NUMBER = 1;
  private int attackStyle_;
  /**
   * <pre>
   * The style of attack this option represents.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
   * @return The enum numeric value on the wire for attackStyle.
   */
  @java.lang.Override public int getAttackStyleValue() {
    return attackStyle_;
  }
  /**
   * <pre>
   * The style of attack this option represents.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
   * @return The attackStyle.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.AttackStyle getAttackStyle() {
    @SuppressWarnings("deprecation")
    com.github.nkibler7.osrswikiscraper.AttackStyle result = com.github.nkibler7.osrswikiscraper.AttackStyle.valueOf(attackStyle_);
    return result == null ? com.github.nkibler7.osrswikiscraper.AttackStyle.UNRECOGNIZED : result;
  }

  public static final int MELEE_ATTACK_TYPE_FIELD_NUMBER = 2;
  private int meleeAttackType_;
  /**
   * <pre>
   * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
   * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
   * @return The enum numeric value on the wire for meleeAttackType.
   */
  @java.lang.Override public int getMeleeAttackTypeValue() {
    return meleeAttackType_;
  }
  /**
   * <pre>
   * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
   * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
   * </pre>
   *
   * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
   * @return The meleeAttackType.
   */
  @java.lang.Override public com.github.nkibler7.osrswikiscraper.MeleeAttackType getMeleeAttackType() {
    @SuppressWarnings("deprecation")
    com.github.nkibler7.osrswikiscraper.MeleeAttackType result = com.github.nkibler7.osrswikiscraper.MeleeAttackType.valueOf(meleeAttackType_);
    return result == null ? com.github.nkibler7.osrswikiscraper.MeleeAttackType.UNRECOGNIZED : result;
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
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.AttackStyle.ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, attackStyle_);
    }
    if (meleeAttackType_ != com.github.nkibler7.osrswikiscraper.MeleeAttackType.MELEE_ATTACK_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, meleeAttackType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attackStyle_ != com.github.nkibler7.osrswikiscraper.AttackStyle.ATTACK_STYLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, attackStyle_);
    }
    if (meleeAttackType_ != com.github.nkibler7.osrswikiscraper.MeleeAttackType.MELEE_ATTACK_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, meleeAttackType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.nkibler7.osrswikiscraper.AttackOption)) {
      return super.equals(obj);
    }
    com.github.nkibler7.osrswikiscraper.AttackOption other = (com.github.nkibler7.osrswikiscraper.AttackOption) obj;

    if (attackStyle_ != other.attackStyle_) return false;
    if (meleeAttackType_ != other.meleeAttackType_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (37 * hash) + MELEE_ATTACK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + meleeAttackType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.nkibler7.osrswikiscraper.AttackOption parseFrom(
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
  public static Builder newBuilder(com.github.nkibler7.osrswikiscraper.AttackOption prototype) {
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
   * A specific combination of an AttackStyle and AttackType that is selectable by the user for a
   * given weapon.
   * </pre>
   *
   * Protobuf type {@code github.nkibler7.osrswikiscraper.AttackOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:github.nkibler7.osrswikiscraper.AttackOption)
      com.github.nkibler7.osrswikiscraper.AttackOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_AttackOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_AttackOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.nkibler7.osrswikiscraper.AttackOption.class, com.github.nkibler7.osrswikiscraper.AttackOption.Builder.class);
    }

    // Construct using com.github.nkibler7.osrswikiscraper.AttackOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      attackStyle_ = 0;

      meleeAttackType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.nkibler7.osrswikiscraper.WeaponsOuterClass.internal_static_github_nkibler7_osrswikiscraper_AttackOption_descriptor;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.AttackOption getDefaultInstanceForType() {
      return com.github.nkibler7.osrswikiscraper.AttackOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.AttackOption build() {
      com.github.nkibler7.osrswikiscraper.AttackOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.AttackOption buildPartial() {
      com.github.nkibler7.osrswikiscraper.AttackOption result = new com.github.nkibler7.osrswikiscraper.AttackOption(this);
      result.attackStyle_ = attackStyle_;
      result.meleeAttackType_ = meleeAttackType_;
      onBuilt();
      return result;
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
      if (other instanceof com.github.nkibler7.osrswikiscraper.AttackOption) {
        return mergeFrom((com.github.nkibler7.osrswikiscraper.AttackOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.nkibler7.osrswikiscraper.AttackOption other) {
      if (other == com.github.nkibler7.osrswikiscraper.AttackOption.getDefaultInstance()) return this;
      if (other.attackStyle_ != 0) {
        setAttackStyleValue(other.getAttackStyleValue());
      }
      if (other.meleeAttackType_ != 0) {
        setMeleeAttackTypeValue(other.getMeleeAttackTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.github.nkibler7.osrswikiscraper.AttackOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.nkibler7.osrswikiscraper.AttackOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int attackStyle_ = 0;
    /**
     * <pre>
     * The style of attack this option represents.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
     * @return The enum numeric value on the wire for attackStyle.
     */
    @java.lang.Override public int getAttackStyleValue() {
      return attackStyle_;
    }
    /**
     * <pre>
     * The style of attack this option represents.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
     * @param value The enum numeric value on the wire for attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyleValue(int value) {
      
      attackStyle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The style of attack this option represents.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
     * @return The attackStyle.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.AttackStyle getAttackStyle() {
      @SuppressWarnings("deprecation")
      com.github.nkibler7.osrswikiscraper.AttackStyle result = com.github.nkibler7.osrswikiscraper.AttackStyle.valueOf(attackStyle_);
      return result == null ? com.github.nkibler7.osrswikiscraper.AttackStyle.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The style of attack this option represents.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
     * @param value The attackStyle to set.
     * @return This builder for chaining.
     */
    public Builder setAttackStyle(com.github.nkibler7.osrswikiscraper.AttackStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      attackStyle_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The style of attack this option represents.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.AttackStyle attack_style = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackStyle() {
      
      attackStyle_ = 0;
      onChanged();
      return this;
    }

    private int meleeAttackType_ = 0;
    /**
     * <pre>
     * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
     * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
     * @return The enum numeric value on the wire for meleeAttackType.
     */
    @java.lang.Override public int getMeleeAttackTypeValue() {
      return meleeAttackType_;
    }
    /**
     * <pre>
     * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
     * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
     * @param value The enum numeric value on the wire for meleeAttackType to set.
     * @return This builder for chaining.
     */
    public Builder setMeleeAttackTypeValue(int value) {
      
      meleeAttackType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
     * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
     * @return The meleeAttackType.
     */
    @java.lang.Override
    public com.github.nkibler7.osrswikiscraper.MeleeAttackType getMeleeAttackType() {
      @SuppressWarnings("deprecation")
      com.github.nkibler7.osrswikiscraper.MeleeAttackType result = com.github.nkibler7.osrswikiscraper.MeleeAttackType.valueOf(meleeAttackType_);
      return result == null ? com.github.nkibler7.osrswikiscraper.MeleeAttackType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
     * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
     * @param value The meleeAttackType to set.
     * @return This builder for chaining.
     */
    public Builder setMeleeAttackType(com.github.nkibler7.osrswikiscraper.MeleeAttackType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      meleeAttackType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of melee attack this option represents. If `attack_style` is a ranged or magic style,
     * this will be MELEE_ATTACK_TYPE_UNSPECIFIED.
     * </pre>
     *
     * <code>.github.nkibler7.osrswikiscraper.MeleeAttackType melee_attack_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeleeAttackType() {
      
      meleeAttackType_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:github.nkibler7.osrswikiscraper.AttackOption)
  }

  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.AttackOption)
  private static final com.github.nkibler7.osrswikiscraper.AttackOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.nkibler7.osrswikiscraper.AttackOption();
  }

  public static com.github.nkibler7.osrswikiscraper.AttackOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttackOption>
      PARSER = new com.google.protobuf.AbstractParser<AttackOption>() {
    @java.lang.Override
    public AttackOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttackOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttackOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttackOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.nkibler7.osrswikiscraper.AttackOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
