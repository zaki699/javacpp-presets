// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class MyTest extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MyTest() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MyTest(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MyTest(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MyTest position(long position) {
        return (MyTest)super.position(position);
    }
    @Override public MyTest getPointer(long i) {
        return new MyTest((Pointer)this).offsetAddress(i);
    }

	public native int bla(); public native MyTest bla(int setter);
}
