// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_histogram2d_pdf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_histogram2d_pdf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_histogram2d_pdf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_histogram2d_pdf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_histogram2d_pdf position(long position) {
        return (gsl_histogram2d_pdf)super.position(position);
    }
    @Override public gsl_histogram2d_pdf getPointer(long i) {
        return new gsl_histogram2d_pdf((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long nx(); public native gsl_histogram2d_pdf nx(long setter);
  public native @Cast("size_t") long ny(); public native gsl_histogram2d_pdf ny(long setter);
  public native DoublePointer xrange(); public native gsl_histogram2d_pdf xrange(DoublePointer setter);
  public native DoublePointer yrange(); public native gsl_histogram2d_pdf yrange(DoublePointer setter);
  public native DoublePointer sum(); public native gsl_histogram2d_pdf sum(DoublePointer setter);
} 
