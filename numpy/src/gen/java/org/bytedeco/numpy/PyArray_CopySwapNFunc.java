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
public class PyArray_CopySwapNFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_CopySwapNFunc(Pointer p) { super(p); }
    protected PyArray_CopySwapNFunc() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, @Cast("npy_intp") long arg1, Pointer arg2, @Cast("npy_intp") long arg3,
                                     @Cast("npy_intp") long arg4, int arg5, Pointer arg6);
}
