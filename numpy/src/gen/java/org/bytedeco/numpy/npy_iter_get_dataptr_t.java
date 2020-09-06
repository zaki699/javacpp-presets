// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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


/*
 * type of the function which translates a set of coordinates to a
 * pointer to the data
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class npy_iter_get_dataptr_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    npy_iter_get_dataptr_t(Pointer p) { super(p); }
    protected npy_iter_get_dataptr_t() { allocate(); }
    private native void allocate();
    public native @Cast("char*") BytePointer call(
        PyArrayIterObject iter, @Cast("const npy_intp*") SizeTPointer arg1);
}
