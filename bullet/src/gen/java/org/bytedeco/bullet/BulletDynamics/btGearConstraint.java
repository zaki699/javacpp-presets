// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;

// #else
// #endif  //BT_USE_DOUBLE_PRECISION

/**The btGeatConstraint will couple the angular velocity for two bodies around given local axis and ratio.
 * See Bullet/Demos/ConstraintDemo for an example use. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGearConstraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGearConstraint(Pointer p) { super(p); }

	public btGearConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 axisInA, @Const @ByRef btVector3 axisInB, @Cast("btScalar") double ratio/*=1.f*/) { super((Pointer)null); allocate(rbA, rbB, axisInA, axisInB, ratio); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 axisInA, @Const @ByRef btVector3 axisInB, @Cast("btScalar") double ratio/*=1.f*/);
	public btGearConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 axisInA, @Const @ByRef btVector3 axisInB) { super((Pointer)null); allocate(rbA, rbB, axisInA, axisInB); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 axisInA, @Const @ByRef btVector3 axisInB);

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo1(btConstraintInfo1 info);

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo2(btConstraintInfo2 info);

	public native void setAxisA(@ByRef btVector3 axisA);
	public native void setAxisB(@ByRef btVector3 axisB);
	public native void setRatio(@Cast("btScalar") double ratio);
	public native @Const @ByRef btVector3 getAxisA();
	public native @Const @ByRef btVector3 getAxisB();
	public native @Cast("btScalar") double getRatio();

	public native void setParam(int num, @Cast("btScalar") double value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") double value);

	/**return the local value of parameter */
	public native @Cast("btScalar") double getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") double getParam(int num);

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
