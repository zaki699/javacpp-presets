// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* General step size control object.
 *
 * The hadjust() method controls the adjustment of
 * step size given the result of a step and the error.
 * Valid hadjust() methods must return one of the codes below.
 *
 * The general data can be used by specializations
 * to store state and control their heuristics.
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_odeiv_control_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_odeiv_control_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_odeiv_control_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_odeiv_control_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_odeiv_control_type position(long position) {
        return (gsl_odeiv_control_type)super.position(position);
    }
    @Override public gsl_odeiv_control_type getPointer(long i) {
        return new gsl_odeiv_control_type((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_odeiv_control_type name(BytePointer setter);
  public static class Pointer_Alloc extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Pointer_Alloc(Pointer p) { super(p); }
      protected Pointer_Alloc() { allocate(); }
      private native void allocate();
      public native Pointer call();
  }
  public native Pointer_Alloc alloc(); public native gsl_odeiv_control_type alloc(Pointer_Alloc setter);
  public static class Init_Pointer_double_double_double_double extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_Pointer_double_double_double_double(Pointer p) { super(p); }
      protected Init_Pointer_double_double_double_double() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, double eps_abs, double eps_rel, double a_y, double a_dydt);
  }
  public native Init_Pointer_double_double_double_double init(); public native gsl_odeiv_control_type init(Init_Pointer_double_double_double_double setter);
  public static class Hadjust_Pointer_long_int_DoublePointer_DoublePointer_DoublePointer_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Hadjust_Pointer_long_int_DoublePointer_DoublePointer_DoublePointer_DoublePointer(Pointer p) { super(p); }
      protected Hadjust_Pointer_long_int_DoublePointer_DoublePointer_DoublePointer_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("size_t") long dim, @Cast("unsigned int") int ord, @Const DoublePointer y, @Const DoublePointer yerr, @Const DoublePointer yp, DoublePointer h);
  }
  public native Hadjust_Pointer_long_int_DoublePointer_DoublePointer_DoublePointer_DoublePointer hadjust(); public native gsl_odeiv_control_type hadjust(Hadjust_Pointer_long_int_DoublePointer_DoublePointer_DoublePointer_DoublePointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer state);
  }
  public native @Name("free") Free_Pointer _free(); public native gsl_odeiv_control_type _free(Free_Pointer setter);
}
