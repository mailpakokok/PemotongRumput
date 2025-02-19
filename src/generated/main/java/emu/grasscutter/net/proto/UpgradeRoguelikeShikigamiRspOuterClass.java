// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpgradeRoguelikeShikigamiRsp.proto

package emu.grasscutter.net.proto;

public final class UpgradeRoguelikeShikigamiRspOuterClass {
  private UpgradeRoguelikeShikigamiRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpgradeRoguelikeShikigamiRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpgradeRoguelikeShikigamiRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_level = 7;</code>
     * @return The curLevel.
     */
    int getCurLevel();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 OOHLIPJCHNE = 3;</code>
     * @return The oOHLIPJCHNE.
     */
    int getOOHLIPJCHNE();
  }
  /**
   * <pre>
   * CmdId: 8486
   * Obf: AMFGMCCHNCB
   * </pre>
   *
   * Protobuf type {@code UpgradeRoguelikeShikigamiRsp}
   */
  public static final class UpgradeRoguelikeShikigamiRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpgradeRoguelikeShikigamiRsp)
      UpgradeRoguelikeShikigamiRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpgradeRoguelikeShikigamiRsp.newBuilder() to construct.
    private UpgradeRoguelikeShikigamiRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpgradeRoguelikeShikigamiRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpgradeRoguelikeShikigamiRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpgradeRoguelikeShikigamiRsp(
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
            case 24: {

              oOHLIPJCHNE_ = input.readUInt32();
              break;
            }
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 56: {

              curLevel_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.internal_static_UpgradeRoguelikeShikigamiRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.internal_static_UpgradeRoguelikeShikigamiRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.class, emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.Builder.class);
    }

    public static final int CUR_LEVEL_FIELD_NUMBER = 7;
    private int curLevel_;
    /**
     * <code>uint32 cur_level = 7;</code>
     * @return The curLevel.
     */
    @java.lang.Override
    public int getCurLevel() {
      return curLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OOHLIPJCHNE_FIELD_NUMBER = 3;
    private int oOHLIPJCHNE_;
    /**
     * <code>uint32 OOHLIPJCHNE = 3;</code>
     * @return The oOHLIPJCHNE.
     */
    @java.lang.Override
    public int getOOHLIPJCHNE() {
      return oOHLIPJCHNE_;
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
      if (oOHLIPJCHNE_ != 0) {
        output.writeUInt32(3, oOHLIPJCHNE_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (curLevel_ != 0) {
        output.writeUInt32(7, curLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oOHLIPJCHNE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, oOHLIPJCHNE_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (curLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, curLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp other = (emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp) obj;

      if (getCurLevel()
          != other.getCurLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getOOHLIPJCHNE()
          != other.getOOHLIPJCHNE()) return false;
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
      hash = (37 * hash) + CUR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + OOHLIPJCHNE_FIELD_NUMBER;
      hash = (53 * hash) + getOOHLIPJCHNE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp prototype) {
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
     * CmdId: 8486
     * Obf: AMFGMCCHNCB
     * </pre>
     *
     * Protobuf type {@code UpgradeRoguelikeShikigamiRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpgradeRoguelikeShikigamiRsp)
        emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.internal_static_UpgradeRoguelikeShikigamiRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.internal_static_UpgradeRoguelikeShikigamiRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.class, emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.newBuilder()
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
        curLevel_ = 0;

        retcode_ = 0;

        oOHLIPJCHNE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.internal_static_UpgradeRoguelikeShikigamiRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp build() {
        emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp buildPartial() {
        emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp result = new emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp(this);
        result.curLevel_ = curLevel_;
        result.retcode_ = retcode_;
        result.oOHLIPJCHNE_ = oOHLIPJCHNE_;
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
        if (other instanceof emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp other) {
        if (other == emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp.getDefaultInstance()) return this;
        if (other.getCurLevel() != 0) {
          setCurLevel(other.getCurLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getOOHLIPJCHNE() != 0) {
          setOOHLIPJCHNE(other.getOOHLIPJCHNE());
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
        emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curLevel_ ;
      /**
       * <code>uint32 cur_level = 7;</code>
       * @return The curLevel.
       */
      @java.lang.Override
      public int getCurLevel() {
        return curLevel_;
      }
      /**
       * <code>uint32 cur_level = 7;</code>
       * @param value The curLevel to set.
       * @return This builder for chaining.
       */
      public Builder setCurLevel(int value) {
        
        curLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurLevel() {
        
        curLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int oOHLIPJCHNE_ ;
      /**
       * <code>uint32 OOHLIPJCHNE = 3;</code>
       * @return The oOHLIPJCHNE.
       */
      @java.lang.Override
      public int getOOHLIPJCHNE() {
        return oOHLIPJCHNE_;
      }
      /**
       * <code>uint32 OOHLIPJCHNE = 3;</code>
       * @param value The oOHLIPJCHNE to set.
       * @return This builder for chaining.
       */
      public Builder setOOHLIPJCHNE(int value) {
        
        oOHLIPJCHNE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OOHLIPJCHNE = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOOHLIPJCHNE() {
        
        oOHLIPJCHNE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UpgradeRoguelikeShikigamiRsp)
    }

    // @@protoc_insertion_point(class_scope:UpgradeRoguelikeShikigamiRsp)
    private static final emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp();
    }

    public static emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpgradeRoguelikeShikigamiRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpgradeRoguelikeShikigamiRsp>() {
      @java.lang.Override
      public UpgradeRoguelikeShikigamiRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpgradeRoguelikeShikigamiRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpgradeRoguelikeShikigamiRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpgradeRoguelikeShikigamiRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UpgradeRoguelikeShikigamiRspOuterClass.UpgradeRoguelikeShikigamiRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpgradeRoguelikeShikigamiRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpgradeRoguelikeShikigamiRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"UpgradeRoguelikeShikigamiRsp.proto\"W\n\034" +
      "UpgradeRoguelikeShikigamiRsp\022\021\n\tcur_leve" +
      "l\030\007 \001(\r\022\017\n\007retcode\030\004 \001(\005\022\023\n\013OOHLIPJCHNE\030" +
      "\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpgradeRoguelikeShikigamiRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpgradeRoguelikeShikigamiRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpgradeRoguelikeShikigamiRsp_descriptor,
        new java.lang.String[] { "CurLevel", "Retcode", "OOHLIPJCHNE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
