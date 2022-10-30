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
public class CleanupAllRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CleanupAllRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CleanupAllRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CleanupAllRequest position(long position) {
        return (CleanupAllRequest)super.position(position);
    }
    @Override public CleanupAllRequest getPointer(long i) {
        return new CleanupAllRequest((Pointer)this).offsetAddress(i);
    }

  public CleanupAllRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CleanupAllRequest(@Const @ByRef CleanupAllRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CleanupAllRequest from);

  public native @ByRef @Name("operator =") CleanupAllRequest put(@Const @ByRef CleanupAllRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CleanupAllRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CleanupAllRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CleanupAllRequest other);
  public native void Swap(CleanupAllRequest other);
  

  // implements Message ----------------------------------------------

  public native CleanupAllRequest New();

  public native CleanupAllRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CleanupAllRequest from);
  public native void MergeFrom(@Const @ByRef CleanupAllRequest from);
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

  // repeated string container = 1;
  public native int container_size();
  public native void clear_container();
  @MemberGetter public static native int kContainerFieldNumber();
  public static final int kContainerFieldNumber = kContainerFieldNumber();
  public native @StdString BytePointer container(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_container(int index);
  public native void set_container(int index, @StdString BytePointer value);
  public native void set_container(int index, @StdString String value);
  public native void set_container(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_container(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_container();
  public native void add_container(@StdString BytePointer value);
  public native void add_container(@StdString String value);
  public native void add_container(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_container(String value, @Cast("size_t") long size);
}
