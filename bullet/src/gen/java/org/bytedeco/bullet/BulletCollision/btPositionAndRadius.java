// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btPositionAndRadius extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btPositionAndRadius() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btPositionAndRadius(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPositionAndRadius(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btPositionAndRadius position(long position) {
        return (btPositionAndRadius)super.position(position);
    }
    @Override public btPositionAndRadius getPointer(long i) {
        return new btPositionAndRadius((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3FloatData m_pos(); public native btPositionAndRadius m_pos(btVector3FloatData setter);
	public native float m_radius(); public native btPositionAndRadius m_radius(float setter);
}
