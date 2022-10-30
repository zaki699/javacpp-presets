// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3BvhInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3BvhInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3BvhInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3BvhInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3BvhInfo position(long position) {
        return (b3BvhInfo)super.position(position);
    }
    @Override public b3BvhInfo getPointer(long i) {
        return new b3BvhInfo((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_aabbMin(); public native b3BvhInfo m_aabbMin(b3Vector3 setter);
	public native @ByRef b3Vector3 m_aabbMax(); public native b3BvhInfo m_aabbMax(b3Vector3 setter);
	public native @ByRef b3Vector3 m_quantization(); public native b3BvhInfo m_quantization(b3Vector3 setter);
	public native int m_numNodes(); public native b3BvhInfo m_numNodes(int setter);
	public native int m_numSubTrees(); public native b3BvhInfo m_numSubTrees(int setter);
	public native int m_nodeOffset(); public native b3BvhInfo m_nodeOffset(int setter);
	public native int m_subTreeOffset(); public native b3BvhInfo m_subTreeOffset(int setter);
}
