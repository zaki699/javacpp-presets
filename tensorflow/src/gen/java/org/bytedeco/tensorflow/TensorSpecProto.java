// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSpecProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSpecProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorSpecProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorSpecProto position(long position) {
        return (TensorSpecProto)super.position(position);
    }
    @Override public TensorSpecProto getPointer(long i) {
        return new TensorSpecProto((Pointer)this).offsetAddress(i);
    }

  public TensorSpecProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorSpecProto(@Const @ByRef TensorSpecProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorSpecProto from);

  public native @ByRef @Name("operator =") TensorSpecProto put(@Const @ByRef TensorSpecProto from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TensorSpecProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorSpecProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TensorSpecProto other);
  

  // implements Message ----------------------------------------------

  public native TensorSpecProto New();

  public native TensorSpecProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorSpecProto from);
  public native void MergeFrom(@Const @ByRef TensorSpecProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // .tensorflow.TensorShapeProto shape = 2;
  public native @Cast("bool") boolean has_shape();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto shape();
  public native TensorShapeProto release_shape();
  public native TensorShapeProto mutable_shape();
  public native void set_allocated_shape(TensorShapeProto shape);

  // .tensorflow.DataType dtype = 3;
  public native void clear_dtype();
  @MemberGetter public static native int kDtypeFieldNumber();
  public static final int kDtypeFieldNumber = kDtypeFieldNumber();
  public native @Cast("tensorflow::DataType") int dtype();
  public native void set_dtype(@Cast("tensorflow::DataType") int value);
}
