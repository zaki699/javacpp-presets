// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Pair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2Pair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Pair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Pair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2Pair position(long position) {
        return (b2Pair)super.position(position);
    }
    @Override public b2Pair getPointer(long i) {
        return new b2Pair(this).position(position + i);
    }

	public native @Cast("int32") int proxyIdA(); public native b2Pair proxyIdA(int setter);
	public native @Cast("int32") int proxyIdB(); public native b2Pair proxyIdB(int setter);
}
