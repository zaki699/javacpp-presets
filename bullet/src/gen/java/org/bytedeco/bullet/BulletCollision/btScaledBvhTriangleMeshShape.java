// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btScaledBvhTriangleMeshShape allows to instance a scaled version of an existing btBvhTriangleMeshShape.
 * Note that each btBvhTriangleMeshShape still can have its own local scaling, independent from this btScaledBvhTriangleMeshShape 'localScaling' */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btScaledBvhTriangleMeshShape extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btScaledBvhTriangleMeshShape(Pointer p) { super(p); }


	public btScaledBvhTriangleMeshShape(btBvhTriangleMeshShape childShape, @Const @ByRef btVector3 localScaling) { super((Pointer)null); allocate(childShape, localScaling); }
	private native void allocate(btBvhTriangleMeshShape childShape, @Const @ByRef btVector3 localScaling);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);
	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
	public native @Const @ByRef btVector3 getLocalScaling();
	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	public native btBvhTriangleMeshShape getChildShape();

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
