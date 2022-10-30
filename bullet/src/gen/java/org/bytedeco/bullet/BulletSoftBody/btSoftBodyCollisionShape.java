// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


//
// btSoftBodyCollisionShape
//
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftBodyCollisionShape extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftBodyCollisionShape(Pointer p) { super(p); }

	public native btSoftBody m_body(); public native btSoftBodyCollisionShape m_body(btSoftBody setter);

	public btSoftBodyCollisionShape(btSoftBody backptr) { super((Pointer)null); allocate(backptr); }
	private native void allocate(btSoftBody backptr);

	public native void processAllTriangles(btTriangleCallback arg0, @Const @ByRef btVector3 arg1, @Const @ByRef btVector3 arg2);

	/**getAabb returns the axis aligned bounding box in the coordinate frame of the given transform t. */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void setLocalScaling(@Const @ByRef btVector3 arg0);
	public native @Const @ByRef btVector3 getLocalScaling();
	public native void calculateLocalInertia(@Cast("btScalar") double arg0, @ByRef btVector3 arg1);
	public native @Cast("const char*") BytePointer getName();
}
