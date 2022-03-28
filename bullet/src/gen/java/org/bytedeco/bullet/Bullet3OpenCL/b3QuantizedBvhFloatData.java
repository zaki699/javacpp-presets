// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class b3QuantizedBvhFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3QuantizedBvhFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3QuantizedBvhFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3QuantizedBvhFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3QuantizedBvhFloatData position(long position) {
        return (b3QuantizedBvhFloatData)super.position(position);
    }
    @Override public b3QuantizedBvhFloatData getPointer(long i) {
        return new b3QuantizedBvhFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3FloatData m_bvhAabbMin(); public native b3QuantizedBvhFloatData m_bvhAabbMin(b3Vector3FloatData setter);
	public native @ByRef b3Vector3FloatData m_bvhAabbMax(); public native b3QuantizedBvhFloatData m_bvhAabbMax(b3Vector3FloatData setter);
	public native @ByRef b3Vector3FloatData m_bvhQuantization(); public native b3QuantizedBvhFloatData m_bvhQuantization(b3Vector3FloatData setter);
	public native int m_curNodeIndex(); public native b3QuantizedBvhFloatData m_curNodeIndex(int setter);
	public native int m_useQuantization(); public native b3QuantizedBvhFloatData m_useQuantization(int setter);
	public native int m_numContiguousLeafNodes(); public native b3QuantizedBvhFloatData m_numContiguousLeafNodes(int setter);
	public native int m_numQuantizedContiguousNodes(); public native b3QuantizedBvhFloatData m_numQuantizedContiguousNodes(int setter);
	public native b3OptimizedBvhNodeFloatData m_contiguousNodesPtr(); public native b3QuantizedBvhFloatData m_contiguousNodesPtr(b3OptimizedBvhNodeFloatData setter);
	public native b3QuantizedBvhNodeData m_quantizedContiguousNodesPtr(); public native b3QuantizedBvhFloatData m_quantizedContiguousNodesPtr(b3QuantizedBvhNodeData setter);
	public native b3BvhSubtreeInfoData m_subTreeInfoPtr(); public native b3QuantizedBvhFloatData m_subTreeInfoPtr(b3BvhSubtreeInfoData setter);
	public native int m_traversalMode(); public native b3QuantizedBvhFloatData m_traversalMode(int setter);
	public native int m_numSubtreeHeaders(); public native b3QuantizedBvhFloatData m_numSubtreeHeaders(int setter);
}
