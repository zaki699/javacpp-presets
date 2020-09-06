// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_bspline_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_bspline_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_bspline_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_bspline_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_bspline_workspace position(long position) {
        return (gsl_bspline_workspace)super.position(position);
    }
    @Override public gsl_bspline_workspace getPointer(long i) {
        return new gsl_bspline_workspace(this).position(position + i);
    }

    public native @Cast("size_t") long k(); public native gsl_bspline_workspace k(long setter);      /* spline order */
    public native @Cast("size_t") long km1(); public native gsl_bspline_workspace km1(long setter);    /* k - 1 (polynomial order) */
    public native @Cast("size_t") long l(); public native gsl_bspline_workspace l(long setter);      /* number of polynomial pieces on interval */
    public native @Cast("size_t") long nbreak(); public native gsl_bspline_workspace nbreak(long setter); /* number of breakpoints (l + 1) */
    public native @Cast("size_t") long n(); public native gsl_bspline_workspace n(long setter);      /* number of bspline basis functions (l + k - 1) */

    public native gsl_vector knots(); public native gsl_bspline_workspace knots(gsl_vector setter);  /* knots vector */
    public native gsl_vector deltal(); public native gsl_bspline_workspace deltal(gsl_vector setter); /* left delta */
    public native gsl_vector deltar(); public native gsl_bspline_workspace deltar(gsl_vector setter); /* right delta */
    public native gsl_vector B(); public native gsl_bspline_workspace B(gsl_vector setter);      /* temporary spline results */

    /* bspline derivative parameters */
    public native gsl_matrix A(); public native gsl_bspline_workspace A(gsl_matrix setter);      /* work matrix */
    public native gsl_matrix dB(); public native gsl_bspline_workspace dB(gsl_matrix setter);     /* temporary derivative results */
}
