// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class float1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public float1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public float1 position(long position) {
        return (float1)super.position(position);
    }
    @Override public float1 getPointer(long i) {
        return new float1((Pointer)this).offsetAddress(i);
    }

    public native float x(); public native float1 x(float setter);
}
