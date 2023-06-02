// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3UnsignedInt4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3UnsignedInt4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3UnsignedInt4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3UnsignedInt4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3UnsignedInt4 position(long position) {
        return (b3UnsignedInt4)super.position(position);
    }
    @Override public b3UnsignedInt4 getPointer(long i) {
        return new b3UnsignedInt4((Pointer)this).offsetAddress(i);
    }

			public native @Cast("unsigned int") int x(); public native b3UnsignedInt4 x(int setter);
			public native @Cast("unsigned int") int y(); public native b3UnsignedInt4 y(int setter);
			public native @Cast("unsigned int") int z(); public native b3UnsignedInt4 z(int setter);
			public native @Cast("unsigned int") int w(); public native b3UnsignedInt4 w(int setter);
			public native @Cast("unsigned int") int s(int i); public native b3UnsignedInt4 s(int i, int setter);
			@MemberGetter public native @Cast("unsigned int*") IntPointer s();
}
