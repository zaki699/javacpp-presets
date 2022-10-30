// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btGImpactCompoundShape allows to handle multiple btCollisionShape objects at once
/**
This class only can manage Convex subshapes
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactCompoundShape extends btGImpactShapeInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactCompoundShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGImpactCompoundShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btGImpactCompoundShape position(long position) {
        return (btGImpactCompoundShape)super.position(position);
    }
    @Override public btGImpactCompoundShape getPointer(long i) {
        return new btGImpactCompoundShape((Pointer)this).offsetAddress(i);
    }

	/** compound primitive manager */
	@NoOffset public static class CompoundPrimitiveManager extends btPrimitiveManagerBase {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CompoundPrimitiveManager(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CompoundPrimitiveManager(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public CompoundPrimitiveManager position(long position) {
	        return (CompoundPrimitiveManager)super.position(position);
	    }
	    @Override public CompoundPrimitiveManager getPointer(long i) {
	        return new CompoundPrimitiveManager((Pointer)this).offsetAddress(i);
	    }
	
		public native btGImpactCompoundShape m_compoundShape(); public native CompoundPrimitiveManager m_compoundShape(btGImpactCompoundShape setter);

		public CompoundPrimitiveManager(@Const @ByRef CompoundPrimitiveManager compound) { super((Pointer)null); allocate(compound); }
		private native void allocate(@Const @ByRef CompoundPrimitiveManager compound);

		public CompoundPrimitiveManager(btGImpactCompoundShape compoundShape) { super((Pointer)null); allocate(compoundShape); }
		private native void allocate(btGImpactCompoundShape compoundShape);

		public CompoundPrimitiveManager() { super((Pointer)null); allocate(); }
		private native void allocate();

		public native @Cast("bool") boolean is_trimesh();

		public native int get_primitive_count();

		public native void get_primitive_triangle(int prim_index, @ByRef btPrimitiveTriangle triangle);
	}
	public btGImpactCompoundShape(@Cast("bool") boolean children_has_transform/*=true*/) { super((Pointer)null); allocate(children_has_transform); }
	private native void allocate(@Cast("bool") boolean children_has_transform/*=true*/);
	public btGImpactCompoundShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** if true, then its children must get transforms. */
	public native @Cast("bool") boolean childrenHasTransform();

	/** Obtains the primitive manager */
	public native @Const btPrimitiveManagerBase getPrimitiveManager();

	/** Obtains the compopund primitive manager */
	public native CompoundPrimitiveManager getCompoundPrimitiveManager();

	/** Gets the number of children */
	public native int getNumChildShapes();

	/** Use this method for adding children. Only Convex shapes are allowed. */
	public native void addChildShape(@Const @ByRef btTransform localTransform, btCollisionShape shape);

	/** Use this method for adding children. Only Convex shapes are allowed. */
	public native void addChildShape(btCollisionShape shape);

	/** Gets the children */
	public native btCollisionShape getChildShape(int index);

	/** Gets the children */

	/** Retrieves the bound from a child
	/**
    */
	public native void getChildAabb(int child_index, @Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	/** Gets the children transform */
	public native @ByVal btTransform getChildTransform(int index);

	/** Sets the children transform
	/**
	\post You must call updateBound() for update the box set.
	*/
	public native void setChildTransform(int index, @Const @ByRef btTransform transform);

	/** Determines if this shape has triangles */
	public native @Cast("bool") boolean needsRetrieveTriangles();

	/** Determines if this shape has tetrahedrons */
	public native @Cast("bool") boolean needsRetrieveTetrahedrons();

	public native void getBulletTriangle(int prim_index, @ByRef btTriangleShapeEx triangle);

	public native void getBulletTetrahedron(int prim_index, @ByRef btTetrahedronShapeEx tetrahedron);

	/** Calculates the exact inertia tensor for this shape */
	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @Cast("const char*") BytePointer getName();

	public native @Cast("eGIMPACT_SHAPE_TYPE") int getGImpactShapeType();
}
