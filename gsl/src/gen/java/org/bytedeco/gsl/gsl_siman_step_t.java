// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_siman_step_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    gsl_siman_step_t(Pointer p) { super(p); }
    protected gsl_siman_step_t() { allocate(); }
    private native void allocate();
    public native void call(@Const gsl_rng r, Pointer xp, double step_size);
}
