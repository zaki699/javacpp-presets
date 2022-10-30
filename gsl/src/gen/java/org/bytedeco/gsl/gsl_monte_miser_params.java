// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_monte_miser_params extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_monte_miser_params() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_monte_miser_params(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_monte_miser_params(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_monte_miser_params position(long position) {
        return (gsl_monte_miser_params)super.position(position);
    }
    @Override public gsl_monte_miser_params getPointer(long i) {
        return new gsl_monte_miser_params((Pointer)this).offsetAddress(i);
    }

  public native double estimate_frac(); public native gsl_monte_miser_params estimate_frac(double setter);
  public native @Cast("size_t") long min_calls(); public native gsl_monte_miser_params min_calls(long setter);
  public native @Cast("size_t") long min_calls_per_bisection(); public native gsl_monte_miser_params min_calls_per_bisection(long setter);
  public native double alpha(); public native gsl_monte_miser_params alpha(double setter);
  public native double dither(); public native gsl_monte_miser_params dither(double setter);
}
