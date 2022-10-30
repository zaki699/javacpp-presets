// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* data for a Chebyshev series over a given interval */

@Name("gsl_cheb_series_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_cheb_series extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_cheb_series() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_cheb_series(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_cheb_series(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_cheb_series position(long position) {
        return (gsl_cheb_series)super.position(position);
    }
    @Override public gsl_cheb_series getPointer(long i) {
        return new gsl_cheb_series((Pointer)this).offsetAddress(i);
    }


  public native DoublePointer c(); public native gsl_cheb_series c(DoublePointer setter);   /* coefficients                */
  public native @Cast("size_t") long order(); public native gsl_cheb_series order(long setter); /* order of expansion          */
  public native double a(); public native gsl_cheb_series a(double setter);     /* lower interval point        */
  public native double b(); public native gsl_cheb_series b(double setter);     /* upper interval point        */

  /* The following exists (mostly) for the benefit
   * of the implementation. It is an effective single
   * precision order, for use in single precision
   * evaluation. Users can use it if they like, but
   * only they know how to calculate it, since it is
   * specific to the approximated function. By default,
   * order_sp = order.
   * It is used explicitly only by the gsl_cheb_eval_mode
   * functions, which are not meant for casual use.
   */
  public native @Cast("size_t") long order_sp(); public native gsl_cheb_series order_sp(long setter);

  /* Additional elements not used by specfunc */

  public native DoublePointer f(); public native gsl_cheb_series f(DoublePointer setter);   /* function evaluated at chebyschev points  */
}
