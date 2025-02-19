// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshRogueDiaryCardReq.proto

package emu.grasscutter.net.proto;

public final class RefreshRogueDiaryCardReqOuterClass {
  private RefreshRogueDiaryCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshRogueDiaryCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshRogueDiaryCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @return A list containing the refreshCardList.
     */
    java.util.List<java.lang.Integer> getRefreshCardListList();
    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @return The count of refreshCardList.
     */
    int getRefreshCardListCount();
    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @param index The index of the element to return.
     * @return The refreshCardList at the given index.
     */
    int getRefreshCardList(int index);
  }
  /**
   * <pre>
   * CmdId: 8349
   * Obf: MALPBDIDFOB
   * </pre>
   *
   * Protobuf type {@code RefreshRogueDiaryCardReq}
   */
  public static final class RefreshRogueDiaryCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshRogueDiaryCardReq)
      RefreshRogueDiaryCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshRogueDiaryCardReq.newBuilder() to construct.
    private RefreshRogueDiaryCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshRogueDiaryCardReq() {
      refreshCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshRogueDiaryCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshRogueDiaryCardReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                refreshCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              refreshCardList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                refreshCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                refreshCardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          refreshCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.internal_static_RefreshRogueDiaryCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.internal_static_RefreshRogueDiaryCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.class, emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.Builder.class);
    }

    public static final int REFRESH_CARD_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList refreshCardList_;
    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @return A list containing the refreshCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRefreshCardListList() {
      return refreshCardList_;
    }
    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @return The count of refreshCardList.
     */
    public int getRefreshCardListCount() {
      return refreshCardList_.size();
    }
    /**
     * <code>repeated uint32 refresh_card_list = 2;</code>
     * @param index The index of the element to return.
     * @return The refreshCardList at the given index.
     */
    public int getRefreshCardList(int index) {
      return refreshCardList_.getInt(index);
    }
    private int refreshCardListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getRefreshCardListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(refreshCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < refreshCardList_.size(); i++) {
        output.writeUInt32NoTag(refreshCardList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < refreshCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(refreshCardList_.getInt(i));
        }
        size += dataSize;
        if (!getRefreshCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        refreshCardListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq other = (emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq) obj;

      if (!getRefreshCardListList()
          .equals(other.getRefreshCardListList())) return false;
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
      if (getRefreshCardListCount() > 0) {
        hash = (37 * hash) + REFRESH_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRefreshCardListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq prototype) {
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
     * CmdId: 8349
     * Obf: MALPBDIDFOB
     * </pre>
     *
     * Protobuf type {@code RefreshRogueDiaryCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshRogueDiaryCardReq)
        emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.internal_static_RefreshRogueDiaryCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.internal_static_RefreshRogueDiaryCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.class, emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.newBuilder()
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
        refreshCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.internal_static_RefreshRogueDiaryCardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq build() {
        emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq buildPartial() {
        emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq result = new emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          refreshCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.refreshCardList_ = refreshCardList_;
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
        if (other instanceof emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq) {
          return mergeFrom((emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq other) {
        if (other == emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq.getDefaultInstance()) return this;
        if (!other.refreshCardList_.isEmpty()) {
          if (refreshCardList_.isEmpty()) {
            refreshCardList_ = other.refreshCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRefreshCardListIsMutable();
            refreshCardList_.addAll(other.refreshCardList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList refreshCardList_ = emptyIntList();
      private void ensureRefreshCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          refreshCardList_ = mutableCopy(refreshCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @return A list containing the refreshCardList.
       */
      public java.util.List<java.lang.Integer>
          getRefreshCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(refreshCardList_) : refreshCardList_;
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @return The count of refreshCardList.
       */
      public int getRefreshCardListCount() {
        return refreshCardList_.size();
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @param index The index of the element to return.
       * @return The refreshCardList at the given index.
       */
      public int getRefreshCardList(int index) {
        return refreshCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The refreshCardList to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshCardList(
          int index, int value) {
        ensureRefreshCardListIsMutable();
        refreshCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @param value The refreshCardList to add.
       * @return This builder for chaining.
       */
      public Builder addRefreshCardList(int value) {
        ensureRefreshCardListIsMutable();
        refreshCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @param values The refreshCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRefreshCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRefreshCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, refreshCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 refresh_card_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshCardList() {
        refreshCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:RefreshRogueDiaryCardReq)
    }

    // @@protoc_insertion_point(class_scope:RefreshRogueDiaryCardReq)
    private static final emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq();
    }

    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshRogueDiaryCardReq>
        PARSER = new com.google.protobuf.AbstractParser<RefreshRogueDiaryCardReq>() {
      @java.lang.Override
      public RefreshRogueDiaryCardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshRogueDiaryCardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RefreshRogueDiaryCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshRogueDiaryCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RefreshRogueDiaryCardReqOuterClass.RefreshRogueDiaryCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshRogueDiaryCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshRogueDiaryCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RefreshRogueDiaryCardReq.proto\"5\n\030Refr" +
      "eshRogueDiaryCardReq\022\031\n\021refresh_card_lis" +
      "t\030\002 \003(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshRogueDiaryCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshRogueDiaryCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshRogueDiaryCardReq_descriptor,
        new java.lang.String[] { "RefreshCardList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
