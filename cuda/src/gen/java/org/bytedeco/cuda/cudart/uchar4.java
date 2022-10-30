// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class uchar4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public uchar4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public uchar4 position(long position) {
        return (uchar4)super.position(position);
    }
    @Override public uchar4 getPointer(long i) {
        return new uchar4((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte x(); public native uchar4 x(byte setter);
    public native @Cast("unsigned char") byte y(); public native uchar4 y(byte setter);
    public native @Cast("unsigned char") byte z(); public native uchar4 z(byte setter);
    public native @Cast("unsigned char") byte w(); public native uchar4 w(byte setter);
}
