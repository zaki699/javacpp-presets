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
public class MemoryStats extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryStats(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemoryStats(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MemoryStats position(long position) {
        return (MemoryStats)super.position(position);
    }
    @Override public MemoryStats getPointer(long i) {
        return new MemoryStats((Pointer)this).offsetAddress(i);
    }

  public MemoryStats() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MemoryStats(@Const @ByRef MemoryStats from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MemoryStats from);

  public native @ByRef @Name("operator =") MemoryStats put(@Const @ByRef MemoryStats from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef MemoryStats default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MemoryStats internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(MemoryStats other);
  public native void Swap(MemoryStats other);
  

  // implements Message ----------------------------------------------

  public native MemoryStats New();

  public native MemoryStats New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef MemoryStats from);
  public native void MergeFrom(@Const @ByRef MemoryStats from);
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

  // repeated int64 persistent_tensor_alloc_ids = 5;
  public native int persistent_tensor_alloc_ids_size();
  public native void clear_persistent_tensor_alloc_ids();
  @MemberGetter public static native int kPersistentTensorAllocIdsFieldNumber();
  public static final int kPersistentTensorAllocIdsFieldNumber = kPersistentTensorAllocIdsFieldNumber();
  public native @Cast("google::protobuf::int64") long persistent_tensor_alloc_ids(int index);
  public native void set_persistent_tensor_alloc_ids(int index, @Cast("google::protobuf::int64") long value);
  public native void add_persistent_tensor_alloc_ids(@Cast("google::protobuf::int64") long value);

  // repeated int64 device_persistent_tensor_alloc_ids = 6 [deprecated = true];
  public native @Deprecated int device_persistent_tensor_alloc_ids_size();
  public native @Deprecated void clear_device_persistent_tensor_alloc_ids();
  @MemberGetter public static native @Deprecated int kDevicePersistentTensorAllocIdsFieldNumber();
  public static final int kDevicePersistentTensorAllocIdsFieldNumber = kDevicePersistentTensorAllocIdsFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long device_persistent_tensor_alloc_ids(int index);
  public native @Deprecated void set_device_persistent_tensor_alloc_ids(int index, @Cast("google::protobuf::int64") long value);
  public native @Deprecated void add_device_persistent_tensor_alloc_ids(@Cast("google::protobuf::int64") long value);

  // int64 temp_memory_size = 1;
  public native void clear_temp_memory_size();
  @MemberGetter public static native int kTempMemorySizeFieldNumber();
  public static final int kTempMemorySizeFieldNumber = kTempMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") long temp_memory_size();
  public native void set_temp_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 device_temp_memory_size = 2 [deprecated = true];
  public native @Deprecated void clear_device_temp_memory_size();
  @MemberGetter public static native @Deprecated int kDeviceTempMemorySizeFieldNumber();
  public static final int kDeviceTempMemorySizeFieldNumber = kDeviceTempMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long device_temp_memory_size();
  public native @Deprecated void set_device_temp_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 persistent_memory_size = 3;
  public native void clear_persistent_memory_size();
  @MemberGetter public static native int kPersistentMemorySizeFieldNumber();
  public static final int kPersistentMemorySizeFieldNumber = kPersistentMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") long persistent_memory_size();
  public native void set_persistent_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 device_persistent_memory_size = 4 [deprecated = true];
  public native @Deprecated void clear_device_persistent_memory_size();
  @MemberGetter public static native @Deprecated int kDevicePersistentMemorySizeFieldNumber();
  public static final int kDevicePersistentMemorySizeFieldNumber = kDevicePersistentMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long device_persistent_memory_size();
  public native @Deprecated void set_device_persistent_memory_size(@Cast("google::protobuf::int64") long value);
}
