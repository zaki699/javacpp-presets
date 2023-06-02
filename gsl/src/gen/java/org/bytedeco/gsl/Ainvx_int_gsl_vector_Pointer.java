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
public class Ainvx_int_gsl_vector_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Ainvx_int_gsl_vector_Pointer(Pointer p) { super(p); }
    protected Ainvx_int_gsl_vector_Pointer() { allocate(); }
    private native void allocate();
    public native int call(@Cast("CBLAS_TRANSPOSE_t") int TransA, gsl_vector x, Pointer params);
}
