// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of a Batch Normalization operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_batch_normalization_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_batch_normalization_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_batch_normalization_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_batch_normalization_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_batch_normalization_desc_t position(long position) {
        return (mkldnn_batch_normalization_desc_t)super.position(position);
    }
    @Override public mkldnn_batch_normalization_desc_t getPointer(long i) {
        return new mkldnn_batch_normalization_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_batch_normalization. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_batch_normalization_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, #mkldnn_backward, and #mkldnn_backward_data.
     */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_batch_normalization_desc_t prop_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t data_desc(); public native mkldnn_batch_normalization_desc_t data_desc(mkldnn_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_data_desc(); public native mkldnn_batch_normalization_desc_t diff_data_desc(mkldnn_memory_desc_t setter);
    /** Scale and shift data and gradient memory descriptors.
     *
     * Scaleshift memory descriptor uses 2D #mkldnn_nc format[2,Channels]. 1-st
     * dimension contains gamma parameter, 2-nd dimension contains beta
     * parameter. */
    public native @ByRef mkldnn_memory_desc_t data_scaleshift_desc(); public native mkldnn_batch_normalization_desc_t data_scaleshift_desc(mkldnn_memory_desc_t setter);
    public native @ByRef mkldnn_memory_desc_t diff_data_scaleshift_desc(); public native mkldnn_batch_normalization_desc_t diff_data_scaleshift_desc(mkldnn_memory_desc_t setter);
    /** Mean and variance data memory descriptors.
     *
     * Mean and variance memory descriptors use 1D #mkldnn_x format[Channels].
     */
    public native @ByRef mkldnn_memory_desc_t mean_desc(); public native mkldnn_batch_normalization_desc_t mean_desc(mkldnn_memory_desc_t setter);
    public native @ByRef mkldnn_memory_desc_t variance_desc(); public native mkldnn_batch_normalization_desc_t variance_desc(mkldnn_memory_desc_t setter);
    /** Batch normalization epsilon parameter. */
    public native float batch_norm_epsilon(); public native mkldnn_batch_normalization_desc_t batch_norm_epsilon(float setter);
    public native @Cast("unsigned") int flags(); public native mkldnn_batch_normalization_desc_t flags(int setter);
}
