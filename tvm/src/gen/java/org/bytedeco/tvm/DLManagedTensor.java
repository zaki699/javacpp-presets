// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief C Tensor object, manage memory of DLTensor. This data structure is
 *  intended to facilitate the borrowing of DLTensor by another framework. It is
 *  not meant to transfer the tensor. When the borrowing framework doesn't need
 *  the tensor, it should call the deleter to notify the host that the resource
 *  is no longer needed.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DLManagedTensor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DLManagedTensor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DLManagedTensor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLManagedTensor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DLManagedTensor position(long position) {
        return (DLManagedTensor)super.position(position);
    }
    @Override public DLManagedTensor getPointer(long i) {
        return new DLManagedTensor((Pointer)this).offsetAddress(i);
    }

  /** \brief DLTensor which is being memory managed */
  public native @ByRef DLTensor dl_tensor(); public native DLManagedTensor dl_tensor(DLTensor setter);
  /** \brief the context of the original host framework of DLManagedTensor in
   *   which DLManagedTensor is used in the framework. It can also be NULL.
   */
  public native Pointer manager_ctx(); public native DLManagedTensor manager_ctx(Pointer setter);
  /** \brief Destructor signature void (*)(void*) - this should be called
   *   to destruct manager_ctx which holds the DLManagedTensor. It can be NULL
   *   if there is no way for the caller to provide a reasonable destructor.
   *   The destructors deletes the argument self as well.
   */
  public static class Deleter_DLManagedTensor extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Deleter_DLManagedTensor(Pointer p) { super(p); }
      protected Deleter_DLManagedTensor() { allocate(); }
      private native void allocate();
      public native void call(DLManagedTensor self);
  }
  public native Deleter_DLManagedTensor deleter(); public native DLManagedTensor deleter(Deleter_DLManagedTensor setter);
}
