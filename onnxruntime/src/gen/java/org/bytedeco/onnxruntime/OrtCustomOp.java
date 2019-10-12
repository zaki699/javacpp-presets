// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/*
 * The OrtCustomOp structure defines a custom op's schema and its kernel callbacks. The callbacks are filled in by
 * the implementor of the custom op.
*/
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCustomOp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtCustomOp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtCustomOp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtCustomOp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtCustomOp position(long position) {
        return (OrtCustomOp)super.position(position);
    }

  public native @Cast("uint32_t") int version(); public native OrtCustomOp version(int setter);  // Initialize to ORT_API_VERSION

  // This callback creates the kernel, which is a user defined parameter that is passed to the Kernel* callbacks below.
  public static class CreateKernel_OrtCustomOp_OrtCustomOpApi_OrtKernelInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    CreateKernel_OrtCustomOp_OrtCustomOpApi_OrtKernelInfo(Pointer p) { super(p); }
      protected CreateKernel_OrtCustomOp_OrtCustomOpApi_OrtKernelInfo() { allocate(); }
      private native void allocate();
      public native Pointer call(OrtCustomOp op, @Const OrtCustomOpApi api, @Const OrtKernelInfo info);
  }
  public native CreateKernel_OrtCustomOp_OrtCustomOpApi_OrtKernelInfo CreateKernel(); public native OrtCustomOp CreateKernel(CreateKernel_OrtCustomOp_OrtCustomOpApi_OrtKernelInfo setter);

  // Returns the name of the op
  public static class GetName_OrtCustomOp extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetName_OrtCustomOp(Pointer p) { super(p); }
      protected GetName_OrtCustomOp() { allocate(); }
      private native void allocate();
      public native @Cast("const char*") BytePointer call(OrtCustomOp op);
  }
  public native GetName_OrtCustomOp GetName(); public native OrtCustomOp GetName(GetName_OrtCustomOp setter);

  // Returns the type of the execution provider, return nullptr to use CPU execution provider
  public static class GetExecutionProviderType_OrtCustomOp extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetExecutionProviderType_OrtCustomOp(Pointer p) { super(p); }
      protected GetExecutionProviderType_OrtCustomOp() { allocate(); }
      private native void allocate();
      public native @Cast("const char*") BytePointer call(OrtCustomOp op);
  }
  public native GetExecutionProviderType_OrtCustomOp GetExecutionProviderType(); public native OrtCustomOp GetExecutionProviderType(GetExecutionProviderType_OrtCustomOp setter);

  // Returns the count and types of the input & output tensors
  public static class GetInputType_OrtCustomOp_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetInputType_OrtCustomOp_long(Pointer p) { super(p); }
      protected GetInputType_OrtCustomOp_long() { allocate(); }
      private native void allocate();
      public native @Cast("ONNXTensorElementDataType") int call(OrtCustomOp op, @Cast("size_t") long index);
  }
  public native GetInputType_OrtCustomOp_long GetInputType(); public native OrtCustomOp GetInputType(GetInputType_OrtCustomOp_long setter);
  public static class GetInputTypeCount_OrtCustomOp extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetInputTypeCount_OrtCustomOp(Pointer p) { super(p); }
      protected GetInputTypeCount_OrtCustomOp() { allocate(); }
      private native void allocate();
      public native @Cast("size_t") long call(OrtCustomOp op);
  }
  public native GetInputTypeCount_OrtCustomOp GetInputTypeCount(); public native OrtCustomOp GetInputTypeCount(GetInputTypeCount_OrtCustomOp setter);
  public static class GetOutputType_OrtCustomOp_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetOutputType_OrtCustomOp_long(Pointer p) { super(p); }
      protected GetOutputType_OrtCustomOp_long() { allocate(); }
      private native void allocate();
      public native @Cast("ONNXTensorElementDataType") int call(OrtCustomOp op, @Cast("size_t") long index);
  }
  public native GetOutputType_OrtCustomOp_long GetOutputType(); public native OrtCustomOp GetOutputType(GetOutputType_OrtCustomOp_long setter);
  public static class GetOutputTypeCount_OrtCustomOp extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetOutputTypeCount_OrtCustomOp(Pointer p) { super(p); }
      protected GetOutputTypeCount_OrtCustomOp() { allocate(); }
      private native void allocate();
      public native @Cast("size_t") long call(OrtCustomOp op);
  }
  public native GetOutputTypeCount_OrtCustomOp GetOutputTypeCount(); public native OrtCustomOp GetOutputTypeCount(GetOutputTypeCount_OrtCustomOp setter);

  // Op kernel callbacks
  public static class KernelCompute_Pointer_OrtKernelContext extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelCompute_Pointer_OrtKernelContext(Pointer p) { super(p); }
      protected KernelCompute_Pointer_OrtKernelContext() { allocate(); }
      private native void allocate();
      public native void call(Pointer op_kernel, OrtKernelContext context);
  }
  public native KernelCompute_Pointer_OrtKernelContext KernelCompute(); public native OrtCustomOp KernelCompute(KernelCompute_Pointer_OrtKernelContext setter);
  public static class KernelDestroy_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelDestroy_Pointer(Pointer p) { super(p); }
      protected KernelDestroy_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer op_kernel);
  }
  public native KernelDestroy_Pointer KernelDestroy(); public native OrtCustomOp KernelDestroy(KernelDestroy_Pointer setter);
}
