// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/** point to point constraint between two rigidbodies each with a pivotpoint that descibes the 'ballsocket' location in local space */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btPoint2PointConstraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPoint2PointConstraint(Pointer p) { super(p); }


	/**for backwards compatibility during the transition to 'getInfo/getInfo2' */
	public native @Cast("bool") boolean m_useSolveConstraintObsolete(); public native btPoint2PointConstraint m_useSolveConstraintObsolete(boolean setter);

	public native @ByRef btConstraintSetting m_setting(); public native btPoint2PointConstraint m_setting(btConstraintSetting setter);

	public btPoint2PointConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB) { super((Pointer)null); allocate(rbA, rbB, pivotInA, pivotInB); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB);

	public btPoint2PointConstraint(@ByRef btRigidBody rbA, @Const @ByRef btVector3 pivotInA) { super((Pointer)null); allocate(rbA, pivotInA); }
	private native void allocate(@ByRef btRigidBody rbA, @Const @ByRef btVector3 pivotInA);

	public native void buildJacobian();

	public native void getInfo1(btConstraintInfo1 info);

	public native void getInfo1NonVirtual(btConstraintInfo1 info);

	public native void getInfo2(btConstraintInfo2 info);

	public native void getInfo2NonVirtual(btConstraintInfo2 info, @Const @ByRef btTransform body0_trans, @Const @ByRef btTransform body1_trans);

	public native void updateRHS(@Cast("btScalar") double timeStep);

	public native void setPivotA(@Const @ByRef btVector3 pivotA);

	public native void setPivotB(@Const @ByRef btVector3 pivotB);

	public native @Const @ByRef btVector3 getPivotInA();

	public native @Const @ByRef btVector3 getPivotInB();

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("btScalar") double value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") double value);
	/**return the local value of parameter */
	public native @Cast("btScalar") double getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") double getParam(int num);

	public native int getFlags();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
