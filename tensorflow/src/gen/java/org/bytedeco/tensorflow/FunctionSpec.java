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
public class FunctionSpec extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionSpec(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionSpec(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FunctionSpec position(long position) {
        return (FunctionSpec)super.position(position);
    }
    @Override public FunctionSpec getPointer(long i) {
        return new FunctionSpec((Pointer)this).offsetAddress(i);
    }

  public FunctionSpec() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FunctionSpec(@Const @ByRef FunctionSpec from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FunctionSpec from);

  public native @ByRef @Name("operator =") FunctionSpec put(@Const @ByRef FunctionSpec from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef FunctionSpec default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FunctionSpec internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(FunctionSpec other);
  public native void Swap(FunctionSpec other);
  

  // implements Message ----------------------------------------------

  public native FunctionSpec New();

  public native FunctionSpec New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef FunctionSpec from);
  public native void MergeFrom(@Const @ByRef FunctionSpec from);
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

  // .tensorflow.StructuredValue fullargspec = 1;
  public native @Cast("bool") boolean has_fullargspec();
  public native void clear_fullargspec();
  @MemberGetter public static native int kFullargspecFieldNumber();
  public static final int kFullargspecFieldNumber = kFullargspecFieldNumber();
  public native @Const @ByRef StructuredValue fullargspec();
  public native StructuredValue release_fullargspec();
  public native StructuredValue mutable_fullargspec();
  public native void set_allocated_fullargspec(StructuredValue fullargspec);
  public native void unsafe_arena_set_allocated_fullargspec(
        StructuredValue fullargspec);
  public native StructuredValue unsafe_arena_release_fullargspec();

  // .tensorflow.StructuredValue input_signature = 5;
  public native @Cast("bool") boolean has_input_signature();
  public native void clear_input_signature();
  @MemberGetter public static native int kInputSignatureFieldNumber();
  public static final int kInputSignatureFieldNumber = kInputSignatureFieldNumber();
  public native @Const @ByRef StructuredValue input_signature();
  public native StructuredValue release_input_signature();
  public native StructuredValue mutable_input_signature();
  public native void set_allocated_input_signature(StructuredValue input_signature);
  public native void unsafe_arena_set_allocated_input_signature(
        StructuredValue input_signature);
  public native StructuredValue unsafe_arena_release_input_signature();

  // bool is_method = 2;
  public native void clear_is_method();
  @MemberGetter public static native int kIsMethodFieldNumber();
  public static final int kIsMethodFieldNumber = kIsMethodFieldNumber();
  public native @Cast("bool") boolean is_method();
  public native void set_is_method(@Cast("bool") boolean value);
}
