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
public class btQuantizedBvhFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btQuantizedBvhFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuantizedBvhFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuantizedBvhFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btQuantizedBvhFloatData position(long position) {
        return (btQuantizedBvhFloatData)super.position(position);
    }
    @Override public btQuantizedBvhFloatData getPointer(long i) {
        return new btQuantizedBvhFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3FloatData m_bvhAabbMin(); public native btQuantizedBvhFloatData m_bvhAabbMin(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_bvhAabbMax(); public native btQuantizedBvhFloatData m_bvhAabbMax(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_bvhQuantization(); public native btQuantizedBvhFloatData m_bvhQuantization(btVector3FloatData setter);
	public native int m_curNodeIndex(); public native btQuantizedBvhFloatData m_curNodeIndex(int setter);
	public native int m_useQuantization(); public native btQuantizedBvhFloatData m_useQuantization(int setter);
	public native int m_numContiguousLeafNodes(); public native btQuantizedBvhFloatData m_numContiguousLeafNodes(int setter);
	public native int m_numQuantizedContiguousNodes(); public native btQuantizedBvhFloatData m_numQuantizedContiguousNodes(int setter);
	public native btOptimizedBvhNodeFloatData m_contiguousNodesPtr(); public native btQuantizedBvhFloatData m_contiguousNodesPtr(btOptimizedBvhNodeFloatData setter);
	public native btQuantizedBvhNodeData m_quantizedContiguousNodesPtr(); public native btQuantizedBvhFloatData m_quantizedContiguousNodesPtr(btQuantizedBvhNodeData setter);
	public native btBvhSubtreeInfoData m_subTreeInfoPtr(); public native btQuantizedBvhFloatData m_subTreeInfoPtr(btBvhSubtreeInfoData setter);
	public native int m_traversalMode(); public native btQuantizedBvhFloatData m_traversalMode(int setter);
	public native int m_numSubtreeHeaders(); public native btQuantizedBvhFloatData m_numSubtreeHeaders(int setter);
	
}
