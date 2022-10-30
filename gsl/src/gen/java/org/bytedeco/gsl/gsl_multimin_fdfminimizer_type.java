// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* minimisation of differentiable functions */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multimin_fdfminimizer_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multimin_fdfminimizer_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multimin_fdfminimizer_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multimin_fdfminimizer_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multimin_fdfminimizer_type position(long position) {
        return (gsl_multimin_fdfminimizer_type)super.position(position);
    }
    @Override public gsl_multimin_fdfminimizer_type getPointer(long i) {
        return new gsl_multimin_fdfminimizer_type((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_multimin_fdfminimizer_type name(BytePointer setter);
  public native @Cast("size_t") long size(); public native gsl_multimin_fdfminimizer_type size(long setter);
  public static class Alloc_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_Pointer_long(Pointer p) { super(p); }
      protected Alloc_Pointer_long() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("size_t") long n);
  }
  public native Alloc_Pointer_long alloc(); public native gsl_multimin_fdfminimizer_type alloc(Alloc_Pointer_long setter);
  public static class Set_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_double_double extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Set_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_double_double(Pointer p) { super(p); }
      protected Set_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_double_double() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, gsl_multimin_function_fdf fdf,
                @Const gsl_vector x, DoublePointer f, 
                gsl_vector gradient, double step_size, double tol);
  }
  public native Set_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_double_double set(); public native gsl_multimin_fdfminimizer_type set(Set_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_double_double setter);
  public static class Iterate_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_gsl_vector extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Iterate_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_gsl_vector(Pointer p) { super(p); }
      protected Iterate_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_gsl_vector() { allocate(); }
      private native void allocate();
      public native int call(Pointer state,gsl_multimin_function_fdf fdf, 
                    gsl_vector x, DoublePointer f, 
                    gsl_vector gradient, gsl_vector dx);
  }
  public native Iterate_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_gsl_vector iterate(); public native gsl_multimin_fdfminimizer_type iterate(Iterate_Pointer_gsl_multimin_function_fdf_gsl_vector_DoublePointer_gsl_vector_gsl_vector setter);
  public static class Restart_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Restart_Pointer(Pointer p) { super(p); }
      protected Restart_Pointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer state);
  }
  public native Restart_Pointer restart(); public native gsl_multimin_fdfminimizer_type restart(Restart_Pointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer state);
  }
  public native @Name("free") Free_Pointer _free(); public native gsl_multimin_fdfminimizer_type _free(Free_Pointer setter);
}
