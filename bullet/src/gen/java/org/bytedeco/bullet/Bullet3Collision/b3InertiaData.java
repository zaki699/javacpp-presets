// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3InertiaData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3InertiaData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3InertiaData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3InertiaData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3InertiaData position(long position) {
        return (b3InertiaData)super.position(position);
    }
    @Override public b3InertiaData getPointer(long i) {
        return new b3InertiaData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Matrix3x3 m_invInertiaWorld(); public native b3InertiaData m_invInertiaWorld(b3Matrix3x3 setter);
	public native @ByRef b3Matrix3x3 m_initInvInertia(); public native b3InertiaData m_initInvInertia(b3Matrix3x3 setter);
}
