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
public class b3GpuFace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuFace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuFace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuFace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuFace position(long position) {
        return (b3GpuFace)super.position(position);
    }
    @Override public b3GpuFace getPointer(long i) {
        return new b3GpuFace((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_plane(); public native b3GpuFace m_plane(b3Vector3 setter);
	public native int m_indexOffset(); public native b3GpuFace m_indexOffset(int setter);
	public native int m_numIndices(); public native b3GpuFace m_numIndices(int setter);
	public native int m_unusedPadding1(); public native b3GpuFace m_unusedPadding1(int setter);
	public native int m_unusedPadding2(); public native b3GpuFace m_unusedPadding2(int setter);
}
