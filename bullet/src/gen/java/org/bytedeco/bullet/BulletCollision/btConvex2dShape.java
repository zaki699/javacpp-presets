// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;
  // for the types

/**The btConvex2dShape allows to use arbitrary convex shapes as 2d convex shapes, with the Z component assumed to be 0.
 * For 2d boxes, the btBox2dShape is recommended. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvex2dShape extends btConvexShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvex2dShape(Pointer p) { super(p); }


	public btConvex2dShape(btConvexShape convexChildShape) { super((Pointer)null); allocate(convexChildShape); }
	private native void allocate(btConvexShape convexChildShape);

	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);

	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);

	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native btConvexShape getChildShape();

	public native @Cast("const char*") BytePointer getName();

	///////////////////////////

	/**getAabb's default implementation is brute force, expected derived classes to implement a fast dedicated version */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void getAabbSlow(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
	public native @Const @ByRef btVector3 getLocalScaling();

	public native void setMargin(@Cast("btScalar") double margin);
	public native @Cast("btScalar") double getMargin();

	public native int getNumPreferredPenetrationDirections();

	public native void getPreferredPenetrationDirection(int index, @ByRef btVector3 penetrationVector);
}
