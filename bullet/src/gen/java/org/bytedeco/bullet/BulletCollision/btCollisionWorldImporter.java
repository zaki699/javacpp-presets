// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCollisionWorldImporter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionWorldImporter(Pointer p) { super(p); }

	public btCollisionWorldImporter(btCollisionWorld world) { super((Pointer)null); allocate(world); }
	private native void allocate(btCollisionWorld world);

	/**delete all memory collision shapes, rigid bodies, constraints etc. allocated during the load.
	 * make sure you don't use the dynamics world containing objects after you call this method */
	public native void deleteAllData();

	public native void setVerboseMode(int verboseMode);

	public native int getVerboseMode();

	// query for data
	public native int getNumCollisionShapes();
	public native btCollisionShape getCollisionShapeByIndex(int index);
	public native int getNumRigidBodies();
	public native btCollisionObject getRigidBodyByIndex(int index);

	public native int getNumBvhs();
	public native btOptimizedBvh getBvhByIndex(int index);
	public native int getNumTriangleInfoMaps();
	public native btTriangleInfoMap getTriangleInfoMapByIndex(int index);

	// queris involving named objects
	public native btCollisionShape getCollisionShapeByName(@Cast("const char*") BytePointer name);
	public native btCollisionShape getCollisionShapeByName(String name);
	public native btCollisionObject getCollisionObjectByName(@Cast("const char*") BytePointer name);
	public native btCollisionObject getCollisionObjectByName(String name);

	public native @Cast("const char*") BytePointer getNameForPointer(@Const Pointer ptr);

	/**those virtuals are called by load and can be overridden by the user */

	//bodies

	public native btCollisionObject createCollisionObject(@Const @ByRef btTransform startTransform, btCollisionShape shape, @Cast("const char*") BytePointer bodyName);
	public native btCollisionObject createCollisionObject(@Const @ByRef btTransform startTransform, btCollisionShape shape, String bodyName);

	/**shapes */

	public native btCollisionShape createPlaneShape(@Const @ByRef btVector3 planeNormal, @Cast("btScalar") double planeConstant);
	public native btCollisionShape createBoxShape(@Const @ByRef btVector3 halfExtents);
	public native btCollisionShape createSphereShape(@Cast("btScalar") double radius);
	public native btCollisionShape createCapsuleShapeX(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createCapsuleShapeY(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createCapsuleShapeZ(@Cast("btScalar") double radius, @Cast("btScalar") double height);

	public native btCollisionShape createCylinderShapeX(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createCylinderShapeY(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createCylinderShapeZ(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createConeShapeX(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createConeShapeY(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btCollisionShape createConeShapeZ(@Cast("btScalar") double radius, @Cast("btScalar") double height);
	public native btTriangleIndexVertexArray createTriangleMeshContainer();
	public native btBvhTriangleMeshShape createBvhTriangleMeshShape(btStridingMeshInterface trimesh, btOptimizedBvh bvh);
	public native btCollisionShape createConvexTriangleMeshShape(btStridingMeshInterface trimesh);
// #ifdef SUPPORT_GIMPACT_SHAPE_IMPORT
// #endif  //SUPPORT_GIMPACT_SHAPE_IMPORT
	public native btStridingMeshInterfaceData createStridingMeshInterfaceData(btStridingMeshInterfaceData interfaceData);

	public native btConvexHullShape createConvexHullShape();
	public native btCompoundShape createCompoundShape();
	public native btScaledBvhTriangleMeshShape createScaledTrangleMeshShape(btBvhTriangleMeshShape meshShape, @Const @ByRef btVector3 localScalingbtBvhTriangleMeshShape);

	public native btMultiSphereShape createMultiSphereShape(@Const btVector3 positions, @Cast("const btScalar*") DoublePointer radi, int numSpheres);
	public native btMultiSphereShape createMultiSphereShape(@Const btVector3 positions, @Cast("const btScalar*") DoubleBuffer radi, int numSpheres);
	public native btMultiSphereShape createMultiSphereShape(@Const btVector3 positions, @Cast("const btScalar*") double[] radi, int numSpheres);

	public native btTriangleIndexVertexArray createMeshInterface(@ByRef btStridingMeshInterfaceData meshData);

	/**acceleration and connectivity structures */
	public native btOptimizedBvh createOptimizedBvh();
	public native btTriangleInfoMap createTriangleInfoMap();
}
