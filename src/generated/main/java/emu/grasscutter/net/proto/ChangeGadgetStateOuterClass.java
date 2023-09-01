// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGadgetState.proto

package emu.grasscutter.net.proto;

public final class ChangeGadgetStateOuterClass {
  private ChangeGadgetStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGadgetStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGadgetState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_state = 1;</code>
     * @return The gadgetState.
     */
    int getGadgetState();

    /**
     * <code>uint32 ABGKFCBNDIE = 10;</code>
     * @return The aBGKFCBNDIE.
     */
    int getABGKFCBNDIE();
  }
  /**
   * <pre>
   * Obf: CJHNGBMFMFH
   * </pre>
   *
   * Protobuf type {@code ChangeGadgetState}
   */
  public static final class ChangeGadgetState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGadgetState)
      ChangeGadgetStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGadgetState.newBuilder() to construct.
    private ChangeGadgetState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGadgetState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGadgetState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeGadgetState(
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

              gadgetState_ = input.readUInt32();
              break;
            }
            case 80: {

              aBGKFCBNDIE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.internal_static_ChangeGadgetState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.internal_static_ChangeGadgetState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.class, emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.Builder.class);
    }

    public static final int GADGET_STATE_FIELD_NUMBER = 1;
    private int gadgetState_;
    /**
     * <code>uint32 gadget_state = 1;</code>
     * @return The gadgetState.
     */
    @java.lang.Override
    public int getGadgetState() {
      return gadgetState_;
    }

    public static final int ABGKFCBNDIE_FIELD_NUMBER = 10;
    private int aBGKFCBNDIE_;
    /**
     * <code>uint32 ABGKFCBNDIE = 10;</code>
     * @return The aBGKFCBNDIE.
     */
    @java.lang.Override
    public int getABGKFCBNDIE() {
      return aBGKFCBNDIE_;
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
      if (gadgetState_ != 0) {
        output.writeUInt32(1, gadgetState_);
      }
      if (aBGKFCBNDIE_ != 0) {
        output.writeUInt32(10, aBGKFCBNDIE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gadgetState_);
      }
      if (aBGKFCBNDIE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, aBGKFCBNDIE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState other = (emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState) obj;

      if (getGadgetState()
          != other.getGadgetState()) return false;
      if (getABGKFCBNDIE()
          != other.getABGKFCBNDIE()) return false;
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
      hash = (37 * hash) + GADGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetState();
      hash = (37 * hash) + ABGKFCBNDIE_FIELD_NUMBER;
      hash = (53 * hash) + getABGKFCBNDIE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState prototype) {
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
     * Obf: CJHNGBMFMFH
     * </pre>
     *
     * Protobuf type {@code ChangeGadgetState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGadgetState)
        emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.internal_static_ChangeGadgetState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.internal_static_ChangeGadgetState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.class, emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.newBuilder()
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
        gadgetState_ = 0;

        aBGKFCBNDIE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.internal_static_ChangeGadgetState_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState build() {
        emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState buildPartial() {
        emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState result = new emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState(this);
        result.gadgetState_ = gadgetState_;
        result.aBGKFCBNDIE_ = aBGKFCBNDIE_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState other) {
        if (other == emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState.getDefaultInstance()) return this;
        if (other.getGadgetState() != 0) {
          setGadgetState(other.getGadgetState());
        }
        if (other.getABGKFCBNDIE() != 0) {
          setABGKFCBNDIE(other.getABGKFCBNDIE());
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
        emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetState_ ;
      /**
       * <code>uint32 gadget_state = 1;</code>
       * @return The gadgetState.
       */
      @java.lang.Override
      public int getGadgetState() {
        return gadgetState_;
      }
      /**
       * <code>uint32 gadget_state = 1;</code>
       * @param value The gadgetState to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetState(int value) {
        
        gadgetState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetState() {
        
        gadgetState_ = 0;
        onChanged();
        return this;
      }

      private int aBGKFCBNDIE_ ;
      /**
       * <code>uint32 ABGKFCBNDIE = 10;</code>
       * @return The aBGKFCBNDIE.
       */
      @java.lang.Override
      public int getABGKFCBNDIE() {
        return aBGKFCBNDIE_;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 10;</code>
       * @param value The aBGKFCBNDIE to set.
       * @return This builder for chaining.
       */
      public Builder setABGKFCBNDIE(int value) {
        
        aBGKFCBNDIE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearABGKFCBNDIE() {
        
        aBGKFCBNDIE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeGadgetState)
    }

    // @@protoc_insertion_point(class_scope:ChangeGadgetState)
    private static final emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState();
    }

    public static emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGadgetState>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGadgetState>() {
      @java.lang.Override
      public ChangeGadgetState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeGadgetState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeGadgetState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGadgetState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeGadgetStateOuterClass.ChangeGadgetState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGadgetState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGadgetState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGadgetState.proto\">\n\021ChangeGadge" +
      "tState\022\024\n\014gadget_state\030\001 \001(\r\022\023\n\013ABGKFCBN" +
      "DIE\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGadgetState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGadgetState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGadgetState_descriptor,
        new java.lang.String[] { "GadgetState", "ABGKFCBNDIE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}