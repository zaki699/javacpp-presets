// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btQuantizedBvhNode is a compressed aabb node, 16 bytes.
 * Node can be used for leafnode or internal node. Leafnodes can point to 32-bit triangle index (non-negative range). */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class BT_QUANTIZED_BVH_NODE extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BT_QUANTIZED_BVH_NODE(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BT_QUANTIZED_BVH_NODE(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BT_QUANTIZED_BVH_NODE position(long position) {
        return (BT_QUANTIZED_BVH_NODE)super.position(position);
    }
    @Override public BT_QUANTIZED_BVH_NODE getPointer(long i) {
        return new BT_QUANTIZED_BVH_NODE((Pointer)this).offsetAddress(i);
    }

	//12 bytes
	public native @Cast("unsigned short int") short m_quantizedAabbMin(int i); public native BT_QUANTIZED_BVH_NODE m_quantizedAabbMin(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMin();
	public native @Cast("unsigned short int") short m_quantizedAabbMax(int i); public native BT_QUANTIZED_BVH_NODE m_quantizedAabbMax(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMax();
	//4 bytes
	public native int m_escapeIndexOrDataIndex(); public native BT_QUANTIZED_BVH_NODE m_escapeIndexOrDataIndex(int setter);

	public BT_QUANTIZED_BVH_NODE() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean isLeafNode();

	public native int getEscapeIndex();

	public native void setEscapeIndex(int index);

	public native int getDataIndex();

	public native void setDataIndex(int index);

	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			@Cast("unsigned short*") ShortPointer quantizedMin, @Cast("unsigned short*") ShortPointer quantizedMax);
	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			@Cast("unsigned short*") ShortBuffer quantizedMin, @Cast("unsigned short*") ShortBuffer quantizedMax);
	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			@Cast("unsigned short*") short[] quantizedMin, @Cast("unsigned short*") short[] quantizedMax);
}
