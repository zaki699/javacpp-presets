// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3MyFace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3MyFace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3MyFace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3MyFace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3MyFace position(long position) {
        return (b3MyFace)super.position(position);
    }
    @Override public b3MyFace getPointer(long i) {
        return new b3MyFace((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3IntArray m_indices(); public native b3MyFace m_indices(b3IntArray setter);
	public native @Cast("b3Scalar") float m_plane(int i); public native b3MyFace m_plane(int i, float setter);
	@MemberGetter public native @Cast("b3Scalar*") FloatPointer m_plane();
}
