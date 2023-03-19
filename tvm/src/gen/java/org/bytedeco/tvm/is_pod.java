// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \cond Doxygen_Suppress */
// declare special traits when C++11 is not available
// #if DMLC_USE_CXX11 == 0
@Name("dmlc::is_pod<char>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class is_pod extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public is_pod() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public is_pod(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public is_pod(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public is_pod position(long position) {
        return (is_pod)super.position(position);
    }
    @Override public is_pod getPointer(long i) {
        return new is_pod((Pointer)this).offsetAddress(i);
    }

    @MemberGetter public static native @Cast("const bool") boolean value();
    public static final boolean value = value();
  }
