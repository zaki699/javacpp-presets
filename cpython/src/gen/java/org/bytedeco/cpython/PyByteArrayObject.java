// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* Object layout */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyByteArrayObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyByteArrayObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyByteArrayObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyByteArrayObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyByteArrayObject position(long position) {
        return (PyByteArrayObject)super.position(position);
    }
    @Override public PyByteArrayObject getPointer(long i) {
        return new PyByteArrayObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native PyByteArrayObject ob_base(PyVarObject setter);
    public native @Cast("Py_ssize_t") long ob_alloc(); public native PyByteArrayObject ob_alloc(long setter);   /* How many bytes allocated in ob_bytes */
    public native @Cast("char*") BytePointer ob_bytes(); public native PyByteArrayObject ob_bytes(BytePointer setter);        /* Physical backing buffer */
    public native @Cast("char*") BytePointer ob_start(); public native PyByteArrayObject ob_start(BytePointer setter);        /* Logical start inside ob_bytes */
    public native @Cast("Py_ssize_t") long ob_exports(); public native PyByteArrayObject ob_exports(long setter); /* How many buffer exports */
}
