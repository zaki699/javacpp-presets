// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3BvhSubtreeInfoData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3BvhSubtreeInfoData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3BvhSubtreeInfoData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3BvhSubtreeInfoData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3BvhSubtreeInfoData position(long position) {
        return (b3BvhSubtreeInfoData)super.position(position);
    }
    @Override public b3BvhSubtreeInfoData getPointer(long i) {
        return new b3BvhSubtreeInfoData((Pointer)this).offsetAddress(i);
    }

	//12 bytes
	public native @Cast("unsigned short int") short m_quantizedAabbMin(int i); public native b3BvhSubtreeInfoData m_quantizedAabbMin(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMin();
	public native @Cast("unsigned short int") short m_quantizedAabbMax(int i); public native b3BvhSubtreeInfoData m_quantizedAabbMax(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMax();
	//4 bytes, points to the root of the subtree
	public native int m_rootNodeIndex(); public native b3BvhSubtreeInfoData m_rootNodeIndex(int setter);
	//4 bytes
	public native int m_subtreeSize(); public native b3BvhSubtreeInfoData m_subtreeSize(int setter);
	public native int m_padding(int i); public native b3BvhSubtreeInfoData m_padding(int i, int setter);
	@MemberGetter public native IntPointer m_padding();
}
