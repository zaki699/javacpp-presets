// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_attr Attributes
 *  An extension for controlling primitive behavior.
 * 
 *  @see \ref c_api_attributes in \ref c_api
 *  \{ */

// #ifndef DOXYGEN_SHOULD_SKIP_THIS
// #endif

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class post_ops extends mkldnn_post_ops_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public post_ops(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public post_ops(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public post_ops position(long position) {
        return (post_ops)super.position(position);
    }
    @Override public post_ops getPointer(long i) {
        return new post_ops((Pointer)this).offsetAddress(i);
    }

    public post_ops() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native int len();

    public native @Cast("mkldnn::primitive::kind") int kind(int index);

    public native void append_sum(float scale/*=1.*/);
    public native void append_sum();

    public native void get_params_sum(int index, @ByRef FloatPointer scale);
    public native void get_params_sum(int index, @ByRef FloatBuffer scale);
    public native void get_params_sum(int index, @ByRef float[] scale);

    public native void append_eltwise(float scale, @Cast("mkldnn::algorithm") int alg, float alpha,
                float beta);

    public native void get_params_eltwise(int index, @ByRef FloatPointer scale, @Cast("mkldnn::algorithm*") @ByRef IntPointer alg,
                @ByRef FloatPointer alpha, @ByRef FloatPointer beta);
    public native void get_params_eltwise(int index, @ByRef FloatBuffer scale, @Cast("mkldnn::algorithm*") @ByRef IntBuffer alg,
                @ByRef FloatBuffer alpha, @ByRef FloatBuffer beta);
    public native void get_params_eltwise(int index, @ByRef float[] scale, @Cast("mkldnn::algorithm*") @ByRef int[] alg,
                @ByRef float[] alpha, @ByRef float[] beta);
}
