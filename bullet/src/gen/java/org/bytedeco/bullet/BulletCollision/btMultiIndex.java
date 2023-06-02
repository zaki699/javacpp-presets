// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMultiIndex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMultiIndex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMultiIndex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiIndex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMultiIndex position(long position) {
        return (btMultiIndex)super.position(position);
    }
    @Override public btMultiIndex getPointer(long i) {
        return new btMultiIndex((Pointer)this).offsetAddress(i);
    }

	public native @Cast("unsigned int") int ijk(int i); public native btMultiIndex ijk(int i, int setter);
	@MemberGetter public native @Cast("unsigned int*") IntPointer ijk();
}
