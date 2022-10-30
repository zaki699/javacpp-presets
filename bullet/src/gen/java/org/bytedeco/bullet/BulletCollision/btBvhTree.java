// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Basic Box tree structure */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBvhTree extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBvhTree(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btBvhTree(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btBvhTree position(long position) {
        return (btBvhTree)super.position(position);
    }
    @Override public btBvhTree getPointer(long i) {
        return new btBvhTree((Pointer)this).offsetAddress(i);
    }

	public btBvhTree() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** prototype functions for box tree management
	 * \{ */
	public native void build_tree(@ByRef GIM_BVH_DATA_ARRAY primitive_boxes);

	public native void clearNodes();

	/** node count */
	public native int getNodeCount();

	/** tells if the node is a leaf */
	public native @Cast("bool") boolean isLeafNode(int nodeindex);

	public native int getNodeData(int nodeindex);

	public native int getLeftNode(int nodeindex);

	public native int getRightNode(int nodeindex);

	public native int getEscapeNodeIndex(int nodeindex);

	public native @Const GIM_BVH_TREE_NODE get_node_pointer(int index/*=0*/);
	public native @Const GIM_BVH_TREE_NODE get_node_pointer();

	/**\} */
}
