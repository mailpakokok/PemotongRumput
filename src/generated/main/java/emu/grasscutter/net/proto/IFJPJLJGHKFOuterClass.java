// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IFJPJLJGHKF.proto

package emu.grasscutter.net.proto;

public final class IFJPJLJGHKFOuterClass {
  private IFJPJLJGHKFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IFJPJLJGHKFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IFJPJLJGHKF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 FMGMCGAPOPK = 3;</code>
     * @return The fMGMCGAPOPK.
     */
    int getFMGMCGAPOPK();
  }
  /**
   * <pre>
   * CmdId: 9168
   * </pre>
   *
   * Protobuf type {@code IFJPJLJGHKF}
   */
  public static final class IFJPJLJGHKF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IFJPJLJGHKF)
      IFJPJLJGHKFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IFJPJLJGHKF.newBuilder() to construct.
    private IFJPJLJGHKF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IFJPJLJGHKF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IFJPJLJGHKF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IFJPJLJGHKF(
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

              fMGMCGAPOPK_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.internal_static_IFJPJLJGHKF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.internal_static_IFJPJLJGHKF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.class, emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.Builder.class);
    }

    public static final int FMGMCGAPOPK_FIELD_NUMBER = 3;
    private int fMGMCGAPOPK_;
    /**
     * <code>uint32 FMGMCGAPOPK = 3;</code>
     * @return The fMGMCGAPOPK.
     */
    @java.lang.Override
    public int getFMGMCGAPOPK() {
      return fMGMCGAPOPK_;
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
      if (fMGMCGAPOPK_ != 0) {
        output.writeUInt32(3, fMGMCGAPOPK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fMGMCGAPOPK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, fMGMCGAPOPK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF other = (emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF) obj;

      if (getFMGMCGAPOPK()
          != other.getFMGMCGAPOPK()) return false;
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
      hash = (37 * hash) + FMGMCGAPOPK_FIELD_NUMBER;
      hash = (53 * hash) + getFMGMCGAPOPK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF prototype) {
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
     * CmdId: 9168
     * </pre>
     *
     * Protobuf type {@code IFJPJLJGHKF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IFJPJLJGHKF)
        emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.internal_static_IFJPJLJGHKF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.internal_static_IFJPJLJGHKF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.class, emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.newBuilder()
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
        fMGMCGAPOPK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.internal_static_IFJPJLJGHKF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF build() {
        emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF buildPartial() {
        emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF result = new emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF(this);
        result.fMGMCGAPOPK_ = fMGMCGAPOPK_;
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
        if (other instanceof emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF) {
          return mergeFrom((emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF other) {
        if (other == emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF.getDefaultInstance()) return this;
        if (other.getFMGMCGAPOPK() != 0) {
          setFMGMCGAPOPK(other.getFMGMCGAPOPK());
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
        emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fMGMCGAPOPK_ ;
      /**
       * <code>uint32 FMGMCGAPOPK = 3;</code>
       * @return The fMGMCGAPOPK.
       */
      @java.lang.Override
      public int getFMGMCGAPOPK() {
        return fMGMCGAPOPK_;
      }
      /**
       * <code>uint32 FMGMCGAPOPK = 3;</code>
       * @param value The fMGMCGAPOPK to set.
       * @return This builder for chaining.
       */
      public Builder setFMGMCGAPOPK(int value) {
        
        fMGMCGAPOPK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FMGMCGAPOPK = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFMGMCGAPOPK() {
        
        fMGMCGAPOPK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IFJPJLJGHKF)
    }

    // @@protoc_insertion_point(class_scope:IFJPJLJGHKF)
    private static final emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF();
    }

    public static emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IFJPJLJGHKF>
        PARSER = new com.google.protobuf.AbstractParser<IFJPJLJGHKF>() {
      @java.lang.Override
      public IFJPJLJGHKF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IFJPJLJGHKF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IFJPJLJGHKF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IFJPJLJGHKF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IFJPJLJGHKFOuterClass.IFJPJLJGHKF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IFJPJLJGHKF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IFJPJLJGHKF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IFJPJLJGHKF.proto\"\"\n\013IFJPJLJGHKF\022\023\n\013FM" +
      "GMCGAPOPK\030\003 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IFJPJLJGHKF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IFJPJLJGHKF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IFJPJLJGHKF_descriptor,
        new java.lang.String[] { "FMGMCGAPOPK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
