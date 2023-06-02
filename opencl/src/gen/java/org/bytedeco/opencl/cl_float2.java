// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;



/* --- cl_floatn ---- */

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_float2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_float2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_float2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_float2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_float2 position(long position) {
        return (cl_float2)super.position(position);
    }
    @Override public cl_float2 getPointer(long i) {
        return new cl_float2((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_float") float s(int i); public native cl_float2 s(int i, float setter);
    @MemberGetter public native @Cast("cl_float*") FloatPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_FLOAT2__)
// #endif
}
