// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/GroupChatRequestMessage.proto

package com.xqmetting.protocol.message;

public final class GroupChatRequestMessageOuterClass {
  private GroupChatRequestMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupChatRequestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupChatRequestMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string content = 1;</code>
     * @return The content.
     */
    java.lang.String getContent();
    /**
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>string from = 2;</code>
     * @return The from.
     */
    java.lang.String getFrom();
    /**
     * <code>string from = 2;</code>
     * @return The bytes for from.
     */
    com.google.protobuf.ByteString
        getFromBytes();
  }
  /**
   * Protobuf type {@code GroupChatRequestMessage}
   */
  public static final class GroupChatRequestMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupChatRequestMessage)
      GroupChatRequestMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupChatRequestMessage.newBuilder() to construct.
    private GroupChatRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupChatRequestMessage() {
      content_ = "";
      from_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupChatRequestMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupChatRequestMessage(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              from_ = s;
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
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
      return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.internal_static_GroupChatRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.internal_static_GroupChatRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.class, com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.Builder.class);
    }

    public static final int CONTENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 1;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FROM_FIELD_NUMBER = 2;
    private volatile java.lang.Object from_;
    /**
     * <code>string from = 2;</code>
     * @return The from.
     */
    @java.lang.Override
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 2;</code>
     * @return The bytes for from.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, from_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, from_);
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
      if (!(obj instanceof com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage)) {
        return super.equals(obj);
      }
      com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage other = (com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage) obj;

      if (!getContent()
          .equals(other.getContent())) return false;
      if (!getFrom()
          .equals(other.getFrom())) return false;
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
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parseFrom(
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
    public static Builder newBuilder(com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage prototype) {
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
     * Protobuf type {@code GroupChatRequestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupChatRequestMessage)
        com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.internal_static_GroupChatRequestMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.internal_static_GroupChatRequestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.class, com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.Builder.class);
      }

      // Construct using com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.newBuilder()
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
        content_ = "";

        from_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.internal_static_GroupChatRequestMessage_descriptor;
      }

      @java.lang.Override
      public com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage getDefaultInstanceForType() {
        return com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage build() {
        com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage buildPartial() {
        com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage result = new com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage(this);
        result.content_ = content_;
        result.from_ = from_;
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
        if (other instanceof com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage) {
          return mergeFrom((com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage other) {
        if (other == com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage.getDefaultInstance()) return this;
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
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
        com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 1;</code>
       * @return The content.
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 1;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 1;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 1;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object from_ = "";
      /**
       * <code>string from = 2;</code>
       * @return The from.
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string from = 2;</code>
       * @return The bytes for from.
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 2;</code>
       * @param value The from to set.
       * @return This builder for chaining.
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFrom() {
        
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>string from = 2;</code>
       * @param value The bytes for from to set.
       * @return This builder for chaining.
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        from_ = value;
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


      // @@protoc_insertion_point(builder_scope:GroupChatRequestMessage)
    }

    // @@protoc_insertion_point(class_scope:GroupChatRequestMessage)
    private static final com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage();
    }

    public static com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupChatRequestMessage>
        PARSER = new com.google.protobuf.AbstractParser<GroupChatRequestMessage>() {
      @java.lang.Override
      public GroupChatRequestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GroupChatRequestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GroupChatRequestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupChatRequestMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.xqmetting.protocol.message.GroupChatRequestMessageOuterClass.GroupChatRequestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupChatRequestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupChatRequestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%message/GroupChatRequestMessage.proto\"" +
      "8\n\027GroupChatRequestMessage\022\017\n\007content\030\001 " +
      "\001(\t\022\014\n\004from\030\002 \001(\tB \n\036com.xqmetting.proto" +
      "col.messageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GroupChatRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupChatRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupChatRequestMessage_descriptor,
        new java.lang.String[] { "Content", "From", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}