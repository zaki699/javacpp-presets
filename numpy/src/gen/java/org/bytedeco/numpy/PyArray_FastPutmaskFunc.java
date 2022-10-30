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

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_FastPutmaskFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_FastPutmaskFunc(Pointer p) { super(p); }
    protected PyArray_FastPutmaskFunc() { allocate(); }
    private native void allocate();
    public native void call(Pointer in, Pointer mask, @Cast("npy_intp") long n_in,
                                       Pointer values, @Cast("npy_intp") long nv);
}
