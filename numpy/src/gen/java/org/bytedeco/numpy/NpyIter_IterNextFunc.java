// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/* Iterator function pointers that may be specialized */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class NpyIter_IterNextFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    NpyIter_IterNextFunc(Pointer p) { super(p); }
    protected NpyIter_IterNextFunc() { allocate(); }
    private native void allocate();
    public native int call(NpyIter iter);
}
