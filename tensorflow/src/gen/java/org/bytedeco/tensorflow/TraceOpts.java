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
public class TraceOpts extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TraceOpts(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TraceOpts(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TraceOpts position(long position) {
        return (TraceOpts)super.position(position);
    }
    @Override public TraceOpts getPointer(long i) {
        return new TraceOpts((Pointer)this).offsetAddress(i);
    }

  public TraceOpts() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TraceOpts(@Const @ByRef TraceOpts from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TraceOpts from);

  public native @ByRef @Name("operator =") TraceOpts put(@Const @ByRef TraceOpts from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TraceOpts default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TraceOpts internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TraceOpts other);
  public native void Swap(TraceOpts other);
  

  // implements Message ----------------------------------------------

  public native TraceOpts New();

  public native TraceOpts New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TraceOpts from);
  public native void MergeFrom(@Const @ByRef TraceOpts from);
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

  // double duration = 1;
  public native void clear_duration();
  @MemberGetter public static native int kDurationFieldNumber();
  public static final int kDurationFieldNumber = kDurationFieldNumber();
  public native double duration();
  public native void set_duration(double value);

  // bool use_step_profiler = 2;
  public native void clear_use_step_profiler();
  @MemberGetter public static native int kUseStepProfilerFieldNumber();
  public static final int kUseStepProfilerFieldNumber = kUseStepProfilerFieldNumber();
  public native @Cast("bool") boolean use_step_profiler();
  public native void set_use_step_profiler(@Cast("bool") boolean value);

  // bool use_kernel_profiler = 3;
  public native void clear_use_kernel_profiler();
  @MemberGetter public static native int kUseKernelProfilerFieldNumber();
  public static final int kUseKernelProfilerFieldNumber = kUseKernelProfilerFieldNumber();
  public native @Cast("bool") boolean use_kernel_profiler();
  public native void set_use_kernel_profiler(@Cast("bool") boolean value);

  // bool use_extended_profiler = 4;
  public native void clear_use_extended_profiler();
  @MemberGetter public static native int kUseExtendedProfilerFieldNumber();
  public static final int kUseExtendedProfilerFieldNumber = kUseExtendedProfilerFieldNumber();
  public native @Cast("bool") boolean use_extended_profiler();
  public native void set_use_extended_profiler(@Cast("bool") boolean value);

  // bool use_gpu_profiler = 5;
  public native void clear_use_gpu_profiler();
  @MemberGetter public static native int kUseGpuProfilerFieldNumber();
  public static final int kUseGpuProfilerFieldNumber = kUseGpuProfilerFieldNumber();
  public native @Cast("bool") boolean use_gpu_profiler();
  public native void set_use_gpu_profiler(@Cast("bool") boolean value);

  // bool use_sample_profiler = 6;
  public native void clear_use_sample_profiler();
  @MemberGetter public static native int kUseSampleProfilerFieldNumber();
  public static final int kUseSampleProfilerFieldNumber = kUseSampleProfilerFieldNumber();
  public native @Cast("bool") boolean use_sample_profiler();
  public native void set_use_sample_profiler(@Cast("bool") boolean value);
}
