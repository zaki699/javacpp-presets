// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorInfo extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorInfo position(long position) {
        return (TensorInfo)super.position(position);
    }
    @Override public TensorInfo getPointer(long i) {
        return new TensorInfo(this).position(position + i);
    }

  public TensorInfo() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorInfo(@Const @ByRef TensorInfo from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorInfo from);

  public native @ByRef @Name("operator =") TensorInfo put(@Const @ByRef TensorInfo from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TensorInfo default_instance();

  /** enum tensorflow::TensorInfo::EncodingCase */
  public static final int
    kName = 1,
    kCooSparse = 4,
    kCompositeTensor = 5,
    ENCODING_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorInfo internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TensorInfo other);
  public native void Swap(TensorInfo other);
  

  // implements Message ----------------------------------------------

  public native TensorInfo New();

  public native TensorInfo New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorInfo from);
  public native void MergeFrom(@Const @ByRef TensorInfo from);
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

  // .tensorflow.TensorShapeProto tensor_shape = 3;
  public native @Cast("bool") boolean has_tensor_shape();
  public native void clear_tensor_shape();
  @MemberGetter public static native int kTensorShapeFieldNumber();
  public static final int kTensorShapeFieldNumber = kTensorShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto tensor_shape();
  public native TensorShapeProto release_tensor_shape();
  public native TensorShapeProto mutable_tensor_shape();
  public native void set_allocated_tensor_shape(TensorShapeProto tensor_shape);
  public native void unsafe_arena_set_allocated_tensor_shape(
        TensorShapeProto tensor_shape);
  public native TensorShapeProto unsafe_arena_release_tensor_shape();

  // .tensorflow.DataType dtype = 2;
  public native void clear_dtype();
  @MemberGetter public static native int kDtypeFieldNumber();
  public static final int kDtypeFieldNumber = kDtypeFieldNumber();
  public native @Cast("tensorflow::DataType") int dtype();
  public native void set_dtype(@Cast("tensorflow::DataType") int value);
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
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // .tensorflow.TensorInfo.CooSparse coo_sparse = 4;
  public native @Cast("bool") boolean has_coo_sparse();
  public native void clear_coo_sparse();
  @MemberGetter public static native int kCooSparseFieldNumber();
  public static final int kCooSparseFieldNumber = kCooSparseFieldNumber();
  public native @Const @ByRef TensorInfo_CooSparse coo_sparse();
  public native TensorInfo_CooSparse release_coo_sparse();
  public native TensorInfo_CooSparse mutable_coo_sparse();
  public native void set_allocated_coo_sparse(TensorInfo_CooSparse coo_sparse);
  public native void unsafe_arena_set_allocated_coo_sparse(
        TensorInfo_CooSparse coo_sparse);
  public native TensorInfo_CooSparse unsafe_arena_release_coo_sparse();

  // .tensorflow.TensorInfo.CompositeTensor composite_tensor = 5;
  public native @Cast("bool") boolean has_composite_tensor();
  public native void clear_composite_tensor();
  @MemberGetter public static native int kCompositeTensorFieldNumber();
  public static final int kCompositeTensorFieldNumber = kCompositeTensorFieldNumber();
  public native @Const @ByRef TensorInfo_CompositeTensor composite_tensor();
  public native TensorInfo_CompositeTensor release_composite_tensor();
  public native TensorInfo_CompositeTensor mutable_composite_tensor();
  public native void set_allocated_composite_tensor(TensorInfo_CompositeTensor composite_tensor);
  public native void unsafe_arena_set_allocated_composite_tensor(
        TensorInfo_CompositeTensor composite_tensor);
  public native TensorInfo_CompositeTensor unsafe_arena_release_composite_tensor();

  public native void clear_encoding();
  public native @Cast("tensorflow::TensorInfo::EncodingCase") int encoding_case();
}
