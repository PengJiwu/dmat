// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/marco/Documenti/Scuola/Unipr1112/SistemiDistribuiti/Progetto/dmat/proto/RectangleWire.proto

package it.unipr.aotlab.dmat.core.generated;

public final class RectangleWire {
  private RectangleWire() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RectangleBodyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 startRow = 1;
    boolean hasStartRow();
    int getStartRow();
    
    // required int32 endRow = 2;
    boolean hasEndRow();
    int getEndRow();
    
    // required int32 startCol = 3;
    boolean hasStartCol();
    int getStartCol();
    
    // required int32 endCol = 4;
    boolean hasEndCol();
    int getEndCol();
  }
  public static final class RectangleBody extends
      com.google.protobuf.GeneratedMessage
      implements RectangleBodyOrBuilder {
    // Use RectangleBody.newBuilder() to construct.
    private RectangleBody(Builder builder) {
      super(builder);
    }
    private RectangleBody(boolean noInit) {}
    
    private static final RectangleBody defaultInstance;
    public static RectangleBody getDefaultInstance() {
      return defaultInstance;
    }
    
    public RectangleBody getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.unipr.aotlab.dmat.core.generated.RectangleWire.internal_static_RectangleBody_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.unipr.aotlab.dmat.core.generated.RectangleWire.internal_static_RectangleBody_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 startRow = 1;
    public static final int STARTROW_FIELD_NUMBER = 1;
    private int startRow_;
    public boolean hasStartRow() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStartRow() {
      return startRow_;
    }
    
    // required int32 endRow = 2;
    public static final int ENDROW_FIELD_NUMBER = 2;
    private int endRow_;
    public boolean hasEndRow() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getEndRow() {
      return endRow_;
    }
    
    // required int32 startCol = 3;
    public static final int STARTCOL_FIELD_NUMBER = 3;
    private int startCol_;
    public boolean hasStartCol() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getStartCol() {
      return startCol_;
    }
    
    // required int32 endCol = 4;
    public static final int ENDCOL_FIELD_NUMBER = 4;
    private int endCol_;
    public boolean hasEndCol() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getEndCol() {
      return endCol_;
    }
    
    private void initFields() {
      startRow_ = 0;
      endRow_ = 0;
      startCol_ = 0;
      endCol_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStartRow()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndRow()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStartCol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndCol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, startRow_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, endRow_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, startCol_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, endCol_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, startRow_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, endRow_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, startCol_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, endCol_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBodyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return it.unipr.aotlab.dmat.core.generated.RectangleWire.internal_static_RectangleBody_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return it.unipr.aotlab.dmat.core.generated.RectangleWire.internal_static_RectangleBody_fieldAccessorTable;
      }
      
      // Construct using it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        startRow_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        endRow_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        startCol_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        endCol_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.getDescriptor();
      }
      
      public it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody getDefaultInstanceForType() {
        return it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.getDefaultInstance();
      }
      
      public it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody build() {
        it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody buildPartial() {
        it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody result = new it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.startRow_ = startRow_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.endRow_ = endRow_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.startCol_ = startCol_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.endCol_ = endCol_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody) {
          return mergeFrom((it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody other) {
        if (other == it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.getDefaultInstance()) return this;
        if (other.hasStartRow()) {
          setStartRow(other.getStartRow());
        }
        if (other.hasEndRow()) {
          setEndRow(other.getEndRow());
        }
        if (other.hasStartCol()) {
          setStartCol(other.getStartCol());
        }
        if (other.hasEndCol()) {
          setEndCol(other.getEndCol());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStartRow()) {
          
          return false;
        }
        if (!hasEndRow()) {
          
          return false;
        }
        if (!hasStartCol()) {
          
          return false;
        }
        if (!hasEndCol()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              startRow_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              endRow_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              startCol_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              endCol_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 startRow = 1;
      private int startRow_ ;
      public boolean hasStartRow() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStartRow() {
        return startRow_;
      }
      public Builder setStartRow(int value) {
        bitField0_ |= 0x00000001;
        startRow_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartRow() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startRow_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 endRow = 2;
      private int endRow_ ;
      public boolean hasEndRow() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getEndRow() {
        return endRow_;
      }
      public Builder setEndRow(int value) {
        bitField0_ |= 0x00000002;
        endRow_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndRow() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endRow_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 startCol = 3;
      private int startCol_ ;
      public boolean hasStartCol() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getStartCol() {
        return startCol_;
      }
      public Builder setStartCol(int value) {
        bitField0_ |= 0x00000004;
        startCol_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartCol() {
        bitField0_ = (bitField0_ & ~0x00000004);
        startCol_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 endCol = 4;
      private int endCol_ ;
      public boolean hasEndCol() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getEndCol() {
        return endCol_;
      }
      public Builder setEndCol(int value) {
        bitField0_ |= 0x00000008;
        endCol_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndCol() {
        bitField0_ = (bitField0_ & ~0x00000008);
        endCol_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:RectangleBody)
    }
    
    static {
      defaultInstance = new RectangleBody(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:RectangleBody)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_RectangleBody_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RectangleBody_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n`home/marco/Documenti/Scuola/Unipr1112/" +
      "SistemiDistribuiti/Progetto/dmat/proto/R" +
      "ectangleWire.proto\"S\n\rRectangleBody\022\020\n\010s" +
      "tartRow\030\001 \002(\005\022\016\n\006endRow\030\002 \002(\005\022\020\n\010startCo" +
      "l\030\003 \002(\005\022\016\n\006endCol\030\004 \002(\005B%\n#it.unipr.aotl" +
      "ab.dmat.core.generated"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_RectangleBody_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_RectangleBody_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_RectangleBody_descriptor,
              new java.lang.String[] { "StartRow", "EndRow", "StartCol", "EndCol", },
              it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.class,
              it.unipr.aotlab.dmat.core.generated.RectangleWire.RectangleBody.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
