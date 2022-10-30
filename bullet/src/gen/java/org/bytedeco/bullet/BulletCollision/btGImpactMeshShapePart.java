// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** This class manages a sub part of a mesh supplied by the btStridingMeshInterface interface.
/**
- Simply create this shape by passing the btStridingMeshInterface to the constructor btGImpactMeshShapePart, then you must call updateBound() after creating the mesh
- When making operations with this shape, you must call <b>lock</b> before accessing to the trimesh primitives, and then call <b>unlock</b>
- You can handle deformable meshes with this shape, by calling postUpdate() every time when changing the mesh vertices.
<p>
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactMeshShapePart extends btGImpactShapeInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactMeshShapePart(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGImpactMeshShapePart(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btGImpactMeshShapePart position(long position) {
        return (btGImpactMeshShapePart)super.position(position);
    }
    @Override public btGImpactMeshShapePart getPointer(long i) {
        return new btGImpactMeshShapePart((Pointer)this).offsetAddress(i);
    }

	/** Trimesh primitive manager
	/**
	Manages the info from btStridingMeshInterface object and controls the Lock/Unlock mechanism
	*/
	@NoOffset public static class TrimeshPrimitiveManager extends btPrimitiveManagerBase {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public TrimeshPrimitiveManager(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public TrimeshPrimitiveManager(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public TrimeshPrimitiveManager position(long position) {
	        return (TrimeshPrimitiveManager)super.position(position);
	    }
	    @Override public TrimeshPrimitiveManager getPointer(long i) {
	        return new TrimeshPrimitiveManager((Pointer)this).offsetAddress(i);
	    }
	
		public native @Cast("btScalar") double m_margin(); public native TrimeshPrimitiveManager m_margin(double setter);
		public native btStridingMeshInterface m_meshInterface(); public native TrimeshPrimitiveManager m_meshInterface(btStridingMeshInterface setter);
		public native @ByRef btVector3 m_scale(); public native TrimeshPrimitiveManager m_scale(btVector3 setter);
		public native int m_part(); public native TrimeshPrimitiveManager m_part(int setter);
		public native int m_lock_count(); public native TrimeshPrimitiveManager m_lock_count(int setter);
		public native @Cast("const unsigned char*") BytePointer vertexbase(); public native TrimeshPrimitiveManager vertexbase(BytePointer setter);
		public native int numverts(); public native TrimeshPrimitiveManager numverts(int setter);
		public native @Cast("PHY_ScalarType") int type(); public native TrimeshPrimitiveManager type(int setter);
		public native int stride(); public native TrimeshPrimitiveManager stride(int setter);
		public native @Cast("const unsigned char*") BytePointer indexbase(); public native TrimeshPrimitiveManager indexbase(BytePointer setter);
		public native int indexstride(); public native TrimeshPrimitiveManager indexstride(int setter);
		public native int numfaces(); public native TrimeshPrimitiveManager numfaces(int setter);
		public native @Cast("PHY_ScalarType") int indicestype(); public native TrimeshPrimitiveManager indicestype(int setter);

		public TrimeshPrimitiveManager() { super((Pointer)null); allocate(); }
		private native void allocate();

		public TrimeshPrimitiveManager(@Const @ByRef TrimeshPrimitiveManager manager) { super((Pointer)null); allocate(manager); }
		private native void allocate(@Const @ByRef TrimeshPrimitiveManager manager);

		public TrimeshPrimitiveManager(
					btStridingMeshInterface meshInterface, int part) { super((Pointer)null); allocate(meshInterface, part); }
		private native void allocate(
					btStridingMeshInterface meshInterface, int part);

		public native void lock();

		public native void unlock();

		public native @Cast("bool") boolean is_trimesh();

		public native int get_primitive_count();

		public native int get_vertex_count();

		public native void get_indices(int face_index, @Cast("unsigned int*") @ByRef IntPointer i0, @Cast("unsigned int*") @ByRef IntPointer i1, @Cast("unsigned int*") @ByRef IntPointer i2);
		public native void get_indices(int face_index, @Cast("unsigned int*") @ByRef IntBuffer i0, @Cast("unsigned int*") @ByRef IntBuffer i1, @Cast("unsigned int*") @ByRef IntBuffer i2);
		public native void get_indices(int face_index, @Cast("unsigned int*") @ByRef int[] i0, @Cast("unsigned int*") @ByRef int[] i1, @Cast("unsigned int*") @ByRef int[] i2);

		public native void get_vertex(@Cast("unsigned int") int vertex_index, @ByRef btVector3 vertex);

		public native void get_primitive_triangle(int prim_index, @ByRef btPrimitiveTriangle triangle);

		public native void get_bullet_triangle(int prim_index, @ByRef btTriangleShapeEx triangle);
	}
	public btGImpactMeshShapePart() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btGImpactMeshShapePart(btStridingMeshInterface meshInterface, int part) { super((Pointer)null); allocate(meshInterface, part); }
	private native void allocate(btStridingMeshInterface meshInterface, int part);

	/** if true, then its children must get transforms. */
	public native @Cast("bool") boolean childrenHasTransform();

	/** call when reading child shapes */
	public native void lockChildShapes();
	public native void unlockChildShapes();

	/** Gets the number of children */
	public native int getNumChildShapes();

	/** Gets the children */
	public native btCollisionShape getChildShape(int index);

	/** Gets the child */

	/** Gets the children transform */
	public native @ByVal btTransform getChildTransform(int index);

	/** Sets the children transform
	/**
	\post You must call updateBound() for update the box set.
	*/
	public native void setChildTransform(int index, @Const @ByRef btTransform transform);

	/** Obtains the primitive manager */
	public native @Const btPrimitiveManagerBase getPrimitiveManager();

	public native TrimeshPrimitiveManager getTrimeshPrimitiveManager();

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @Cast("const char*") BytePointer getName();

	public native @Cast("eGIMPACT_SHAPE_TYPE") int getGImpactShapeType();

	/** Determines if this shape has triangles */
	public native @Cast("bool") boolean needsRetrieveTriangles();

	/** Determines if this shape has tetrahedrons */
	public native @Cast("bool") boolean needsRetrieveTetrahedrons();

	public native void getBulletTriangle(int prim_index, @ByRef btTriangleShapeEx triangle);

	public native void getBulletTetrahedron(int prim_index, @ByRef btTetrahedronShapeEx tetrahedron);

	public native int getVertexCount();

	public native void getVertex(int vertex_index, @ByRef btVector3 vertex);

	public native void setMargin(@Cast("btScalar") double margin);

	public native @Cast("btScalar") double getMargin();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native @Const @ByRef btVector3 getLocalScaling();

	public native int getPart();

	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);
	public native void processAllTrianglesRay(btTriangleCallback callback, @Const @ByRef btVector3 rayFrom, @Const @ByRef btVector3 rayTo);
}
