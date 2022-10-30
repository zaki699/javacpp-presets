// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* for internal use only */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _opaque extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _opaque() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _opaque(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _opaque(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _opaque position(long position) {
        return (_opaque)super.position(position);
    }
    @Override public _opaque getPointer(long i) {
        return new _opaque((Pointer)this).offsetAddress(i);
    }

    public native int computed_line(); public native _opaque computed_line(int setter);
    public native @Cast("const char*") BytePointer lo_next(); public native _opaque lo_next(BytePointer setter);
    public native @Name("limit") @Cast("const char*") BytePointer _limit(); public native _opaque _limit(BytePointer setter);
}
