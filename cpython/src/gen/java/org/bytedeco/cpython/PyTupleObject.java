// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyTupleObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTupleObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTupleObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTupleObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTupleObject position(long position) {
        return (PyTupleObject)super.position(position);
    }
    @Override public PyTupleObject getPointer(long i) {
        return new PyTupleObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native PyTupleObject ob_base(PyVarObject setter);
    /* ob_item contains space for 'ob_size' elements.
       Items must normally not be NULL, except during construction when
       the tuple is not yet visible outside the function that builds it. */
    public native PyObject ob_item(int i); public native PyTupleObject ob_item(int i, PyObject setter);
    @MemberGetter public native @Cast("PyObject**") PointerPointer ob_item();
}
