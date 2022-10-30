// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;



@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STHdad extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STHdad() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STHdad(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STHdad(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STHdad position(long position) {
        return (STHdad)super.position(position);
    }
    @Override public STHdad getPointer(long i) {
        return new STHdad((Pointer)this).offsetAddress(i);
    }

    public native float lambdaCensus(); public native STHdad lambdaCensus(float setter);
    public native float lambdaAD(); public native STHdad lambdaAD(float setter);
    public native @Cast("uint32_t") int ignoreSAD(); public native STHdad ignoreSAD(int setter);
}
