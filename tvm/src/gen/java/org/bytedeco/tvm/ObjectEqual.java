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


/** \brief String-aware ObjectRef hash functor */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ObjectEqual extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ObjectEqual() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ObjectEqual(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjectEqual(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ObjectEqual position(long position) {
        return (ObjectEqual)super.position(position);
    }
    @Override public ObjectEqual getPointer(long i) {
        return new ObjectEqual((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Check if the two ObjectRef are equal
   * @param a One ObjectRef
   * @param b The other ObjectRef
   * @return String equality if both are strings, pointer address equality otherwise.
   */
  public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef ObjectRef a, @Const @ByRef ObjectRef b);
}
