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

// #endif

/*
 * Removed 2020-Nov-25, NumPy 1.20
 * #define NPY_SIZEOF_PYARRAYOBJECT (sizeof(PyArrayObject_fields))
 *
 * The above macro was removed as it gave a false sense of a stable ABI
 * with respect to the structures size.  If you require a runtime constant,
 * you can use `PyArray_Type.tp_basicsize` instead.  Otherwise, please
 * see the PyArrayObject documentation or ask the NumPy developers for
 * information on how to correctly replace the macro in a way that is
 * compatible with multiple NumPy versions.
 */


/* Array Flags Object */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayFlagsObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayFlagsObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayFlagsObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayFlagsObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayFlagsObject position(long position) {
        return (PyArrayFlagsObject)super.position(position);
    }
    @Override public PyArrayFlagsObject getPointer(long i) {
        return new PyArrayFlagsObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyArrayFlagsObject ob_base(PyObject setter);
        public native PyObject arr(); public native PyArrayFlagsObject arr(PyObject setter);
        public native int flags(); public native PyArrayFlagsObject flags(int setter);
}
