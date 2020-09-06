// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyType_Slot extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyType_Slot() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyType_Slot(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyType_Slot(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyType_Slot position(long position) {
        return (PyType_Slot)super.position(position);
    }
    @Override public PyType_Slot getPointer(long i) {
        return new PyType_Slot(this).position(position + i);
    }

    public native int slot(); public native PyType_Slot slot(int setter);    /* slot id, see below */
    public native Pointer pfunc(); public native PyType_Slot pfunc(Pointer setter); /* function pointer */
}
