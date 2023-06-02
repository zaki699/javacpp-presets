// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyStructSequence_Desc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyStructSequence_Desc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyStructSequence_Desc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyStructSequence_Desc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyStructSequence_Desc position(long position) {
        return (PyStructSequence_Desc)super.position(position);
    }
    @Override public PyStructSequence_Desc getPointer(long i) {
        return new PyStructSequence_Desc((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native PyStructSequence_Desc name(BytePointer setter);
    public native @Cast("const char*") BytePointer doc(); public native PyStructSequence_Desc doc(BytePointer setter);
    public native PyStructSequence_Field fields(); public native PyStructSequence_Desc fields(PyStructSequence_Field setter);
    public native int n_in_sequence(); public native PyStructSequence_Desc n_in_sequence(int setter);
}
