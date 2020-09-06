// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyGetSetDescrObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyGetSetDescrObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyGetSetDescrObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyGetSetDescrObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyGetSetDescrObject position(long position) {
        return (PyGetSetDescrObject)super.position(position);
    }
    @Override public PyGetSetDescrObject getPointer(long i) {
        return new PyGetSetDescrObject(this).position(position + i);
    }

    public native @ByRef PyDescrObject d_common(); public native PyGetSetDescrObject d_common(PyDescrObject setter);
    public native PyGetSetDef d_getset(); public native PyGetSetDescrObject d_getset(PyGetSetDef setter);
}
