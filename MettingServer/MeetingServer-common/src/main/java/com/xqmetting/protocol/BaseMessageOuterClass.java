// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseMessage.proto

package com.xqmetting.protocol;

public final class BaseMessageOuterClass {
  private BaseMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MessageType}
   */
  public enum MessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LoginRequestMessageType = 0;</code>
     */
    LoginRequestMessageType(0),
    /**
     * <code>LoginResponseMessageType = 1;</code>
     */
    LoginResponseMessageType(1),
    /**
     * <code>ChatRequestMessageType = 2;</code>
     */
    ChatRequestMessageType(2),
    /**
     * <code>ChatResponseMessageType = 3;</code>
     */
    ChatResponseMessageType(3),
    /**
     * <code>GroupChatRequestMessageType = 4;</code>
     */
    GroupChatRequestMessageType(4),
    /**
     * <code>GroupChatResponseMessageType = 5;</code>
     */
    GroupChatResponseMessageType(5),
    /**
     * <code>PingMessageType = 6;</code>
     */
    PingMessageType(6),
    /**
     * <code>PongMessageType = 7;</code>
     */
    PongMessageType(7),
    /**
     * <code>ServerPeerConnectedMessageType = 8;</code>
     */
    ServerPeerConnectedMessageType(8),
    /**
     * <code>GroupRemoteChatRequestMessageType = 9;</code>
     */
    GroupRemoteChatRequestMessageType(9),
    /**
     * <pre>
     **
     * 请求类型 byte值
     * </pre>
     *
     * <code>RPC_MESSAGE_TYPE_REQUEST_Type = 101;</code>
     */
    RPC_MESSAGE_TYPE_REQUEST_Type(101),
    /**
     * <pre>
     **
     * 响应类型byte值
     * </pre>
     *
     * <code>RPC_MESSAGE_TYPE_RESPONSE_Type = 102;</code>
     */
    RPC_MESSAGE_TYPE_RESPONSE_Type(102),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LoginRequestMessageType = 0;</code>
     */
    public static final int LoginRequestMessageType_VALUE = 0;
    /**
     * <code>LoginResponseMessageType = 1;</code>
     */
    public static final int LoginResponseMessageType_VALUE = 1;
    /**
     * <code>ChatRequestMessageType = 2;</code>
     */
    public static final int ChatRequestMessageType_VALUE = 2;
    /**
     * <code>ChatResponseMessageType = 3;</code>
     */
    public static final int ChatResponseMessageType_VALUE = 3;
    /**
     * <code>GroupChatRequestMessageType = 4;</code>
     */
    public static final int GroupChatRequestMessageType_VALUE = 4;
    /**
     * <code>GroupChatResponseMessageType = 5;</code>
     */
    public static final int GroupChatResponseMessageType_VALUE = 5;
    /**
     * <code>PingMessageType = 6;</code>
     */
    public static final int PingMessageType_VALUE = 6;
    /**
     * <code>PongMessageType = 7;</code>
     */
    public static final int PongMessageType_VALUE = 7;
    /**
     * <code>ServerPeerConnectedMessageType = 8;</code>
     */
    public static final int ServerPeerConnectedMessageType_VALUE = 8;
    /**
     * <code>GroupRemoteChatRequestMessageType = 9;</code>
     */
    public static final int GroupRemoteChatRequestMessageType_VALUE = 9;
    /**
     * <pre>
     **
     * 请求类型 byte值
     * </pre>
     *
     * <code>RPC_MESSAGE_TYPE_REQUEST_Type = 101;</code>
     */
    public static final int RPC_MESSAGE_TYPE_REQUEST_Type_VALUE = 101;
    /**
     * <pre>
     **
     * 响应类型byte值
     * </pre>
     *
     * <code>RPC_MESSAGE_TYPE_RESPONSE_Type = 102;</code>
     */
    public static final int RPC_MESSAGE_TYPE_RESPONSE_Type_VALUE = 102;


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
    public static MessageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MessageType forNumber(int value) {
      switch (value) {
        case 0: return LoginRequestMessageType;
        case 1: return LoginResponseMessageType;
        case 2: return ChatRequestMessageType;
        case 3: return ChatResponseMessageType;
        case 4: return GroupChatRequestMessageType;
        case 5: return GroupChatResponseMessageType;
        case 6: return PingMessageType;
        case 7: return PongMessageType;
        case 8: return ServerPeerConnectedMessageType;
        case 9: return GroupRemoteChatRequestMessageType;
        case 101: return RPC_MESSAGE_TYPE_REQUEST_Type;
        case 102: return RPC_MESSAGE_TYPE_RESPONSE_Type;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MessageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
            public MessageType findValueByNumber(int number) {
              return MessageType.forNumber(number);
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
      return com.xqmetting.protocol.BaseMessageOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MessageType[] VALUES = values();

    public static MessageType valueOf(
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

    private MessageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MessageType)
  }

  public interface BaseMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BaseMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 sequenceId = 1;</code>
     * @return The sequenceId.
     */
    int getSequenceId();

    /**
     * <code>.MessageType messageType = 3;</code>
     * @return The enum numeric value on the wire for messageType.
     */
    int getMessageTypeValue();
    /**
     * <code>.MessageType messageType = 3;</code>
     * @return The messageType.
     */
    com.xqmetting.protocol.BaseMessageOuterClass.MessageType getMessageType();

    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     * @return Whether the pingRequest field is set.
     */
    boolean hasPingRequest();
    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     * @return The pingRequest.
     */
    com.xqmetting.protocol.PingRequestOuterClass.PingRequest getPingRequest();
    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     */
    com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder getPingRequestOrBuilder();
  }
  /**
   * Protobuf type {@code BaseMessage}
   */
  public static final class BaseMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BaseMessage)
      BaseMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BaseMessage.newBuilder() to construct.
    private BaseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BaseMessage() {
      messageType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BaseMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BaseMessage(
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
            case 8: {

              sequenceId_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              messageType_ = rawValue;
              break;
            }
            case 34: {
              com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = pingRequest_.toBuilder();
              }
              pingRequest_ = input.readMessage(com.xqmetting.protocol.PingRequestOuterClass.PingRequest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pingRequest_);
                pingRequest_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return com.xqmetting.protocol.BaseMessageOuterClass.internal_static_BaseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqmetting.protocol.BaseMessageOuterClass.internal_static_BaseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.class, com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.Builder.class);
    }

    private int bitField0_;
    public static final int SEQUENCEID_FIELD_NUMBER = 1;
    private int sequenceId_;
    /**
     * <code>int32 sequenceId = 1;</code>
     * @return The sequenceId.
     */
    @java.lang.Override
    public int getSequenceId() {
      return sequenceId_;
    }

    public static final int MESSAGETYPE_FIELD_NUMBER = 3;
    private int messageType_;
    /**
     * <code>.MessageType messageType = 3;</code>
     * @return The enum numeric value on the wire for messageType.
     */
    @java.lang.Override public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <code>.MessageType messageType = 3;</code>
     * @return The messageType.
     */
    @java.lang.Override public com.xqmetting.protocol.BaseMessageOuterClass.MessageType getMessageType() {
      @SuppressWarnings("deprecation")
      com.xqmetting.protocol.BaseMessageOuterClass.MessageType result = com.xqmetting.protocol.BaseMessageOuterClass.MessageType.valueOf(messageType_);
      return result == null ? com.xqmetting.protocol.BaseMessageOuterClass.MessageType.UNRECOGNIZED : result;
    }

    public static final int PINGREQUEST_FIELD_NUMBER = 4;
    private com.xqmetting.protocol.PingRequestOuterClass.PingRequest pingRequest_;
    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     * @return Whether the pingRequest field is set.
     */
    @java.lang.Override
    public boolean hasPingRequest() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     * @return The pingRequest.
     */
    @java.lang.Override
    public com.xqmetting.protocol.PingRequestOuterClass.PingRequest getPingRequest() {
      return pingRequest_ == null ? com.xqmetting.protocol.PingRequestOuterClass.PingRequest.getDefaultInstance() : pingRequest_;
    }
    /**
     * <code>optional .PingRequest pingRequest = 4;</code>
     */
    @java.lang.Override
    public com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder getPingRequestOrBuilder() {
      return pingRequest_ == null ? com.xqmetting.protocol.PingRequestOuterClass.PingRequest.getDefaultInstance() : pingRequest_;
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
      if (sequenceId_ != 0) {
        output.writeInt32(1, sequenceId_);
      }
      if (messageType_ != com.xqmetting.protocol.BaseMessageOuterClass.MessageType.LoginRequestMessageType.getNumber()) {
        output.writeEnum(3, messageType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(4, getPingRequest());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sequenceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, sequenceId_);
      }
      if (messageType_ != com.xqmetting.protocol.BaseMessageOuterClass.MessageType.LoginRequestMessageType.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, messageType_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPingRequest());
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
      if (!(obj instanceof com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage)) {
        return super.equals(obj);
      }
      com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage other = (com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage) obj;

      if (getSequenceId()
          != other.getSequenceId()) return false;
      if (messageType_ != other.messageType_) return false;
      if (hasPingRequest() != other.hasPingRequest()) return false;
      if (hasPingRequest()) {
        if (!getPingRequest()
            .equals(other.getPingRequest())) return false;
      }
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
      hash = (37 * hash) + SEQUENCEID_FIELD_NUMBER;
      hash = (53 * hash) + getSequenceId();
      hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
      hash = (53 * hash) + messageType_;
      if (hasPingRequest()) {
        hash = (37 * hash) + PINGREQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getPingRequest().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parseFrom(
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
    public static Builder newBuilder(com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage prototype) {
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
     * Protobuf type {@code BaseMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BaseMessage)
        com.xqmetting.protocol.BaseMessageOuterClass.BaseMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xqmetting.protocol.BaseMessageOuterClass.internal_static_BaseMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xqmetting.protocol.BaseMessageOuterClass.internal_static_BaseMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.class, com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.Builder.class);
      }

      // Construct using com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.newBuilder()
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
          getPingRequestFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sequenceId_ = 0;

        messageType_ = 0;

        if (pingRequestBuilder_ == null) {
          pingRequest_ = null;
        } else {
          pingRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xqmetting.protocol.BaseMessageOuterClass.internal_static_BaseMessage_descriptor;
      }

      @java.lang.Override
      public com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage getDefaultInstanceForType() {
        return com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage build() {
        com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage buildPartial() {
        com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage result = new com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.sequenceId_ = sequenceId_;
        result.messageType_ = messageType_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (pingRequestBuilder_ == null) {
            result.pingRequest_ = pingRequest_;
          } else {
            result.pingRequest_ = pingRequestBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage) {
          return mergeFrom((com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage other) {
        if (other == com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage.getDefaultInstance()) return this;
        if (other.getSequenceId() != 0) {
          setSequenceId(other.getSequenceId());
        }
        if (other.messageType_ != 0) {
          setMessageTypeValue(other.getMessageTypeValue());
        }
        if (other.hasPingRequest()) {
          mergePingRequest(other.getPingRequest());
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
        com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sequenceId_ ;
      /**
       * <code>int32 sequenceId = 1;</code>
       * @return The sequenceId.
       */
      @java.lang.Override
      public int getSequenceId() {
        return sequenceId_;
      }
      /**
       * <code>int32 sequenceId = 1;</code>
       * @param value The sequenceId to set.
       * @return This builder for chaining.
       */
      public Builder setSequenceId(int value) {
        
        sequenceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sequenceId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSequenceId() {
        
        sequenceId_ = 0;
        onChanged();
        return this;
      }

      private int messageType_ = 0;
      /**
       * <code>.MessageType messageType = 3;</code>
       * @return The enum numeric value on the wire for messageType.
       */
      @java.lang.Override public int getMessageTypeValue() {
        return messageType_;
      }
      /**
       * <code>.MessageType messageType = 3;</code>
       * @param value The enum numeric value on the wire for messageType to set.
       * @return This builder for chaining.
       */
      public Builder setMessageTypeValue(int value) {
        
        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MessageType messageType = 3;</code>
       * @return The messageType.
       */
      @java.lang.Override
      public com.xqmetting.protocol.BaseMessageOuterClass.MessageType getMessageType() {
        @SuppressWarnings("deprecation")
        com.xqmetting.protocol.BaseMessageOuterClass.MessageType result = com.xqmetting.protocol.BaseMessageOuterClass.MessageType.valueOf(messageType_);
        return result == null ? com.xqmetting.protocol.BaseMessageOuterClass.MessageType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MessageType messageType = 3;</code>
       * @param value The messageType to set.
       * @return This builder for chaining.
       */
      public Builder setMessageType(com.xqmetting.protocol.BaseMessageOuterClass.MessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        messageType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MessageType messageType = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageType() {
        
        messageType_ = 0;
        onChanged();
        return this;
      }

      private com.xqmetting.protocol.PingRequestOuterClass.PingRequest pingRequest_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.xqmetting.protocol.PingRequestOuterClass.PingRequest, com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder, com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder> pingRequestBuilder_;
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       * @return Whether the pingRequest field is set.
       */
      public boolean hasPingRequest() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       * @return The pingRequest.
       */
      public com.xqmetting.protocol.PingRequestOuterClass.PingRequest getPingRequest() {
        if (pingRequestBuilder_ == null) {
          return pingRequest_ == null ? com.xqmetting.protocol.PingRequestOuterClass.PingRequest.getDefaultInstance() : pingRequest_;
        } else {
          return pingRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public Builder setPingRequest(com.xqmetting.protocol.PingRequestOuterClass.PingRequest value) {
        if (pingRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pingRequest_ = value;
          onChanged();
        } else {
          pingRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public Builder setPingRequest(
          com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder builderForValue) {
        if (pingRequestBuilder_ == null) {
          pingRequest_ = builderForValue.build();
          onChanged();
        } else {
          pingRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public Builder mergePingRequest(com.xqmetting.protocol.PingRequestOuterClass.PingRequest value) {
        if (pingRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              pingRequest_ != null &&
              pingRequest_ != com.xqmetting.protocol.PingRequestOuterClass.PingRequest.getDefaultInstance()) {
            pingRequest_ =
              com.xqmetting.protocol.PingRequestOuterClass.PingRequest.newBuilder(pingRequest_).mergeFrom(value).buildPartial();
          } else {
            pingRequest_ = value;
          }
          onChanged();
        } else {
          pingRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public Builder clearPingRequest() {
        if (pingRequestBuilder_ == null) {
          pingRequest_ = null;
          onChanged();
        } else {
          pingRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder getPingRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPingRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      public com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder getPingRequestOrBuilder() {
        if (pingRequestBuilder_ != null) {
          return pingRequestBuilder_.getMessageOrBuilder();
        } else {
          return pingRequest_ == null ?
              com.xqmetting.protocol.PingRequestOuterClass.PingRequest.getDefaultInstance() : pingRequest_;
        }
      }
      /**
       * <code>optional .PingRequest pingRequest = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.xqmetting.protocol.PingRequestOuterClass.PingRequest, com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder, com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder> 
          getPingRequestFieldBuilder() {
        if (pingRequestBuilder_ == null) {
          pingRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.xqmetting.protocol.PingRequestOuterClass.PingRequest, com.xqmetting.protocol.PingRequestOuterClass.PingRequest.Builder, com.xqmetting.protocol.PingRequestOuterClass.PingRequestOrBuilder>(
                  getPingRequest(),
                  getParentForChildren(),
                  isClean());
          pingRequest_ = null;
        }
        return pingRequestBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BaseMessage)
    }

    // @@protoc_insertion_point(class_scope:BaseMessage)
    private static final com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage();
    }

    public static com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BaseMessage>
        PARSER = new com.google.protobuf.AbstractParser<BaseMessage>() {
      @java.lang.Override
      public BaseMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BaseMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BaseMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BaseMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.xqmetting.protocol.BaseMessageOuterClass.BaseMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BaseMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BaseMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BaseMessage.proto\032\031google/protobuf/any" +
      ".proto\032\031request/PingRequest.proto\"|\n\013Bas" +
      "eMessage\022\022\n\nsequenceId\030\001 \001(\005\022!\n\013messageT" +
      "ype\030\003 \001(\0162\014.MessageType\022&\n\013pingRequest\030\004" +
      " \001(\0132\014.PingRequestH\000\210\001\001B\016\n\014_pingRequest*" +
      "\200\003\n\013MessageType\022\033\n\027LoginRequestMessageTy" +
      "pe\020\000\022\034\n\030LoginResponseMessageType\020\001\022\032\n\026Ch" +
      "atRequestMessageType\020\002\022\033\n\027ChatResponseMe" +
      "ssageType\020\003\022\037\n\033GroupChatRequestMessageTy" +
      "pe\020\004\022 \n\034GroupChatResponseMessageType\020\005\022\023" +
      "\n\017PingMessageType\020\006\022\023\n\017PongMessageType\020\007" +
      "\022\"\n\036ServerPeerConnectedMessageType\020\010\022%\n!" +
      "GroupRemoteChatRequestMessageType\020\t\022!\n\035R" +
      "PC_MESSAGE_TYPE_REQUEST_Type\020e\022\"\n\036RPC_ME" +
      "SSAGE_TYPE_RESPONSE_Type\020fB\030\n\026com.xqmett" +
      "ing.protocolb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.xqmetting.protocol.PingRequestOuterClass.getDescriptor(),
        });
    internal_static_BaseMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BaseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BaseMessage_descriptor,
        new java.lang.String[] { "SequenceId", "MessageType", "PingRequest", "PingRequest", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.xqmetting.protocol.PingRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}