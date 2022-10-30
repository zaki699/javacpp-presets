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
public class TensorInfo_CompositeTensor extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorInfo_CompositeTensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorInfo_CompositeTensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorInfo_CompositeTensor position(long position) {
        return (TensorInfo_CompositeTensor)super.position(position);
    }
    @Override public TensorInfo_CompositeTensor getPointer(long i) {
        return new TensorInfo_CompositeTensor((Pointer)this).offsetAddress(i);
    }

  public TensorInfo_CompositeTensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorInfo_CompositeTensor(@Const @ByRef TensorInfo_CompositeTensor from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorInfo_CompositeTensor from);

  public native @ByRef @Name("operator =") TensorInfo_CompositeTensor put(@Const @ByRef TensorInfo_CompositeTensor from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TensorInfo_CompositeTensor default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorInfo_CompositeTensor internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TensorInfo_CompositeTensor other);
  public native void Swap(TensorInfo_CompositeTensor other);
  

  // implements Message ----------------------------------------------

  public native TensorInfo_CompositeTensor New();

  public native TensorInfo_CompositeTensor New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorInfo_CompositeTensor from);
  public native void MergeFrom(@Const @ByRef TensorInfo_CompositeTensor from);
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

  // repeated .tensorflow.TensorInfo components = 2;
  public native int components_size();
  public native void clear_components();
  @MemberGetter public static native int kComponentsFieldNumber();
  public static final int kComponentsFieldNumber = kComponentsFieldNumber();
  public native TensorInfo mutable_components(int index);
  public native @Const @ByRef TensorInfo components(int index);
  public native TensorInfo add_components();

  // .tensorflow.TypeSpecProto type_spec = 1;
  public native @Cast("bool") boolean has_type_spec();
  public native void clear_type_spec();
  @MemberGetter public static native int kTypeSpecFieldNumber();
  public static final int kTypeSpecFieldNumber = kTypeSpecFieldNumber();
  public native @Const @ByRef TypeSpecProto type_spec();
  public native TypeSpecProto release_type_spec();
  public native TypeSpecProto mutable_type_spec();
  public native void set_allocated_type_spec(TypeSpecProto type_spec);
  public native void unsafe_arena_set_allocated_type_spec(
        TypeSpecProto type_spec);
  public native TypeSpecProto unsafe_arena_release_type_spec();
}
