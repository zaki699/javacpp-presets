// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;
  // for the types

/**The btSphereShape implements an implicit sphere, centered around a local origin with radius. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSphereShape extends btConvexInternalShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSphereShape(Pointer p) { super(p); }


	public btSphereShape(@Cast("btScalar") float radius) { super((Pointer)null); allocate(radius); }
	private native void allocate(@Cast("btScalar") float radius);

	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);
	//notice that the vectors should be unit length
	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void calculateLocalInertia(@Cast("btScalar") float mass, @ByRef btVector3 inertia);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native @Cast("btScalar") float getRadius();

	public native void setUnscaledRadius(@Cast("btScalar") float radius);

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native void setMargin(@Cast("btScalar") float margin);
	public native @Cast("btScalar") float getMargin();
}
