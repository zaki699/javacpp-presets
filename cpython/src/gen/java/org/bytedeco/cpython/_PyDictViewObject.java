// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* _PyDictView */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyDictViewObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyDictViewObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyDictViewObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyDictViewObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyDictViewObject position(long position) {
        return (_PyDictViewObject)super.position(position);
    }
    @Override public _PyDictViewObject getPointer(long i) {
        return new _PyDictViewObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native _PyDictViewObject ob_base(PyObject setter);
    public native PyDictObject dv_dict(); public native _PyDictViewObject dv_dict(PyDictObject setter);
}
