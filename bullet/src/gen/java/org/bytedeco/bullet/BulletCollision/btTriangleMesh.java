// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btTriangleMesh class is a convenience class derived from btTriangleIndexVertexArray, that provides storage for a concave triangle mesh. It can be used as data for the btBvhTriangleMeshShape.
 * It allows either 32bit or 16bit indices, and 4 (x-y-z-w) or 3 (x-y-z) component vertices.
 * If you want to share triangle/index data between graphics mesh and collision mesh (btBvhTriangleMeshShape), you can directly use btTriangleIndexVertexArray or derive your own class from btStridingMeshInterface.
 * Performance of btTriangleMesh and btTriangleIndexVertexArray used in a btBvhTriangleMeshShape is the same. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleMesh extends btTriangleIndexVertexArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleMesh(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleMesh(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleMesh position(long position) {
        return (btTriangleMesh)super.position(position);
    }
    @Override public btTriangleMesh getPointer(long i) {
        return new btTriangleMesh((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") float m_weldingThreshold(); public native btTriangleMesh m_weldingThreshold(float setter);

	public btTriangleMesh(@Cast("bool") boolean use32bitIndices/*=true*/, @Cast("bool") boolean use4componentVertices/*=true*/) { super((Pointer)null); allocate(use32bitIndices, use4componentVertices); }
	private native void allocate(@Cast("bool") boolean use32bitIndices/*=true*/, @Cast("bool") boolean use4componentVertices/*=true*/);
	public btTriangleMesh() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean getUse32bitIndices();

	public native @Cast("bool") boolean getUse4componentVertices();
	/**By default addTriangle won't search for duplicate vertices, because the search is very slow for large triangle meshes.
	 * In general it is better to directly use btTriangleIndexVertexArray instead. */
	public native void addTriangle(@Const @ByRef btVector3 vertex0, @Const @ByRef btVector3 vertex1, @Const @ByRef btVector3 vertex2, @Cast("bool") boolean removeDuplicateVertices/*=false*/);
	public native void addTriangle(@Const @ByRef btVector3 vertex0, @Const @ByRef btVector3 vertex1, @Const @ByRef btVector3 vertex2);

	/**Add a triangle using its indices. Make sure the indices are pointing within the vertices array, so add the vertices first (and to be sure, avoid removal of duplicate vertices) */
	public native void addTriangleIndices(int index1, int index2, int index3);

	public native int getNumTriangles();

	public native void preallocateVertices(int numverts);
	public native void preallocateIndices(int numindices);

	/**findOrAddVertex is an internal method, use addTriangle instead */
	public native int findOrAddVertex(@Const @ByRef btVector3 vertex, @Cast("bool") boolean removeDuplicateVertices);
	/**addIndex is an internal method, use addTriangle instead */
	public native void addIndex(int index);
}
