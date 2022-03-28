// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// clang-format off
// parser needs * with the name
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBvhSubtreeInfoData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btBvhSubtreeInfoData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btBvhSubtreeInfoData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBvhSubtreeInfoData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btBvhSubtreeInfoData position(long position) {
        return (btBvhSubtreeInfoData)super.position(position);
    }
    @Override public btBvhSubtreeInfoData getPointer(long i) {
        return new btBvhSubtreeInfoData((Pointer)this).offsetAddress(i);
    }

	public native int m_rootNodeIndex(); public native btBvhSubtreeInfoData m_rootNodeIndex(int setter);
	public native int m_subtreeSize(); public native btBvhSubtreeInfoData m_subtreeSize(int setter);
	public native @Cast("unsigned short") short m_quantizedAabbMin(int i); public native btBvhSubtreeInfoData m_quantizedAabbMin(int i, short setter);
	@MemberGetter public native @Cast("unsigned short*") ShortPointer m_quantizedAabbMin();
	public native @Cast("unsigned short") short m_quantizedAabbMax(int i); public native btBvhSubtreeInfoData m_quantizedAabbMax(int i, short setter);
	@MemberGetter public native @Cast("unsigned short*") ShortPointer m_quantizedAabbMax();
}
