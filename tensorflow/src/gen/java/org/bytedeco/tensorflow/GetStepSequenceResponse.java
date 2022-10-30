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
public class GetStepSequenceResponse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GetStepSequenceResponse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GetStepSequenceResponse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GetStepSequenceResponse position(long position) {
        return (GetStepSequenceResponse)super.position(position);
    }
    @Override public GetStepSequenceResponse getPointer(long i) {
        return new GetStepSequenceResponse((Pointer)this).offsetAddress(i);
    }

  public GetStepSequenceResponse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GetStepSequenceResponse(@Const @ByRef GetStepSequenceResponse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GetStepSequenceResponse from);

  public native @ByRef @Name("operator =") GetStepSequenceResponse put(@Const @ByRef GetStepSequenceResponse from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef GetStepSequenceResponse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GetStepSequenceResponse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(GetStepSequenceResponse other);
  public native void Swap(GetStepSequenceResponse other);
  

  // implements Message ----------------------------------------------

  public native GetStepSequenceResponse New();

  public native GetStepSequenceResponse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GetStepSequenceResponse from);
  public native void MergeFrom(@Const @ByRef GetStepSequenceResponse from);
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

  // repeated .tensorflow.StepSequence step_sequence = 1;
  public native int step_sequence_size();
  public native void clear_step_sequence();
  @MemberGetter public static native int kStepSequenceFieldNumber();
  public static final int kStepSequenceFieldNumber = kStepSequenceFieldNumber();
  public native StepSequence mutable_step_sequence(int index);
  public native @Const @ByRef StepSequence step_sequence(int index);
  public native StepSequence add_step_sequence();
}
