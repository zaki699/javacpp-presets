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
public class gsl_interp2d extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_interp2d() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_interp2d(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_interp2d(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_interp2d position(long position) {
        return (gsl_interp2d)super.position(position);
    }
    @Override public gsl_interp2d getPointer(long i) {
        return new gsl_interp2d((Pointer)this).offsetAddress(i);
    }

    public native @Const gsl_interp2d_type type(); public native gsl_interp2d type(gsl_interp2d_type setter); /* interpolation type */
    public native double xmin(); public native gsl_interp2d xmin(double setter);                    /* minimum value of x for which data have been provided */
    public native double xmax(); public native gsl_interp2d xmax(double setter);                    /* maximum value of x for which data have been provided */
    public native double ymin(); public native gsl_interp2d ymin(double setter);                    /* minimum value of y for which data have been provided */
    public native double ymax(); public native gsl_interp2d ymax(double setter);                    /* maximum value of y for which data have been provided */
    public native @Cast("size_t") long xsize(); public native gsl_interp2d xsize(long setter);                   /* number of x values provided */
    public native @Cast("size_t") long ysize(); public native gsl_interp2d ysize(long setter);                   /* number of y values provided */
    public native Pointer state(); public native gsl_interp2d state(Pointer setter);                   /* internal state object specific to the interpolation type */
}
