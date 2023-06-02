// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** The btCylinderShape class implements a cylinder shape primitive, centered around the origin. Its central axis aligned with the Y axis. btCylinderShapeX is aligned with the X axis and btCylinderShapeZ around the Z axis. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCylinderShape extends btConvexInternalShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCylinderShape(Pointer p) { super(p); }


	public native @ByVal btVector3 getHalfExtentsWithMargin();

	public native @Const @ByRef btVector3 getHalfExtentsWithoutMargin();

	public btCylinderShape(@Const @ByRef btVector3 halfExtents) { super((Pointer)null); allocate(halfExtents); }
	private native void allocate(@Const @ByRef btVector3 halfExtents);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);

	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void setMargin(@Cast("btScalar") double collisionMargin);

	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);

	//use box inertia
	//	virtual void	calculateLocalInertia(btScalar mass,btVector3& inertia) const;

	public native int getUpAxis();

	public native @ByVal btVector3 getAnisotropicRollingFrictionDirection();

	public native @Cast("btScalar") double getRadius();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
