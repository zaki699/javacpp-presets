// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Parameters for asymmetric quantization across a dimension (i.e per output
// channel quantization).
// quantized_dimension specifies which dimension the scales and zero_points
// correspond to.
// For a particular value in quantized_dimension, quantized values can be
// converted back to float using:
//     real_value = scale * (quantized_value - zero_point)
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteAffineQuantization extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteAffineQuantization() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteAffineQuantization(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteAffineQuantization(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteAffineQuantization position(long position) {
        return (TfLiteAffineQuantization)super.position(position);
    }
    @Override public TfLiteAffineQuantization getPointer(long i) {
        return new TfLiteAffineQuantization((Pointer)this).offsetAddress(i);
    }

  public native TfLiteFloatArray scale(); public native TfLiteAffineQuantization scale(TfLiteFloatArray setter);
  public native TfLiteIntArray zero_point(); public native TfLiteAffineQuantization zero_point(TfLiteIntArray setter);
  public native int quantized_dimension(); public native TfLiteAffineQuantization quantized_dimension(int setter);
}
