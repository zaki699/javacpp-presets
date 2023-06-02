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


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofSpring2ConstraintData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGeneric6DofSpring2ConstraintData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGeneric6DofSpring2ConstraintData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofSpring2ConstraintData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGeneric6DofSpring2ConstraintData position(long position) {
        return (btGeneric6DofSpring2ConstraintData)super.position(position);
    }
    @Override public btGeneric6DofSpring2ConstraintData getPointer(long i) {
        return new btGeneric6DofSpring2ConstraintData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintData m_typeConstraintData(); public native btGeneric6DofSpring2ConstraintData m_typeConstraintData(btTypedConstraintData setter);
	public native @ByRef btTransformFloatData m_rbAFrame(); public native btGeneric6DofSpring2ConstraintData m_rbAFrame(btTransformFloatData setter);
	public native @ByRef btTransformFloatData m_rbBFrame(); public native btGeneric6DofSpring2ConstraintData m_rbBFrame(btTransformFloatData setter);

	public native @ByRef btVector3FloatData m_linearUpperLimit(); public native btGeneric6DofSpring2ConstraintData m_linearUpperLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearLowerLimit(); public native btGeneric6DofSpring2ConstraintData m_linearLowerLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearBounce(); public native btGeneric6DofSpring2ConstraintData m_linearBounce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearStopERP(); public native btGeneric6DofSpring2ConstraintData m_linearStopERP(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearStopCFM(); public native btGeneric6DofSpring2ConstraintData m_linearStopCFM(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearMotorERP(); public native btGeneric6DofSpring2ConstraintData m_linearMotorERP(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearMotorCFM(); public native btGeneric6DofSpring2ConstraintData m_linearMotorCFM(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearTargetVelocity(); public native btGeneric6DofSpring2ConstraintData m_linearTargetVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearMaxMotorForce(); public native btGeneric6DofSpring2ConstraintData m_linearMaxMotorForce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearServoTarget(); public native btGeneric6DofSpring2ConstraintData m_linearServoTarget(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearSpringStiffness(); public native btGeneric6DofSpring2ConstraintData m_linearSpringStiffness(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearSpringDamping(); public native btGeneric6DofSpring2ConstraintData m_linearSpringDamping(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearEquilibriumPoint(); public native btGeneric6DofSpring2ConstraintData m_linearEquilibriumPoint(btVector3FloatData setter);
	public native @Cast("char") byte m_linearEnableMotor(int i); public native btGeneric6DofSpring2ConstraintData m_linearEnableMotor(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_linearEnableMotor();
	public native @Cast("char") byte m_linearServoMotor(int i); public native btGeneric6DofSpring2ConstraintData m_linearServoMotor(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_linearServoMotor();
	public native @Cast("char") byte m_linearEnableSpring(int i); public native btGeneric6DofSpring2ConstraintData m_linearEnableSpring(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_linearEnableSpring();
	public native @Cast("char") byte m_linearSpringStiffnessLimited(int i); public native btGeneric6DofSpring2ConstraintData m_linearSpringStiffnessLimited(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_linearSpringStiffnessLimited();
	public native @Cast("char") byte m_linearSpringDampingLimited(int i); public native btGeneric6DofSpring2ConstraintData m_linearSpringDampingLimited(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_linearSpringDampingLimited();
	public native @Cast("char") byte m_padding1(int i); public native btGeneric6DofSpring2ConstraintData m_padding1(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding1();

	public native @ByRef btVector3FloatData m_angularUpperLimit(); public native btGeneric6DofSpring2ConstraintData m_angularUpperLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularLowerLimit(); public native btGeneric6DofSpring2ConstraintData m_angularLowerLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularBounce(); public native btGeneric6DofSpring2ConstraintData m_angularBounce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularStopERP(); public native btGeneric6DofSpring2ConstraintData m_angularStopERP(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularStopCFM(); public native btGeneric6DofSpring2ConstraintData m_angularStopCFM(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularMotorERP(); public native btGeneric6DofSpring2ConstraintData m_angularMotorERP(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularMotorCFM(); public native btGeneric6DofSpring2ConstraintData m_angularMotorCFM(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularTargetVelocity(); public native btGeneric6DofSpring2ConstraintData m_angularTargetVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularMaxMotorForce(); public native btGeneric6DofSpring2ConstraintData m_angularMaxMotorForce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularServoTarget(); public native btGeneric6DofSpring2ConstraintData m_angularServoTarget(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularSpringStiffness(); public native btGeneric6DofSpring2ConstraintData m_angularSpringStiffness(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularSpringDamping(); public native btGeneric6DofSpring2ConstraintData m_angularSpringDamping(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularEquilibriumPoint(); public native btGeneric6DofSpring2ConstraintData m_angularEquilibriumPoint(btVector3FloatData setter);
	public native @Cast("char") byte m_angularEnableMotor(int i); public native btGeneric6DofSpring2ConstraintData m_angularEnableMotor(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_angularEnableMotor();
	public native @Cast("char") byte m_angularServoMotor(int i); public native btGeneric6DofSpring2ConstraintData m_angularServoMotor(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_angularServoMotor();
	public native @Cast("char") byte m_angularEnableSpring(int i); public native btGeneric6DofSpring2ConstraintData m_angularEnableSpring(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_angularEnableSpring();
	public native @Cast("char") byte m_angularSpringStiffnessLimited(int i); public native btGeneric6DofSpring2ConstraintData m_angularSpringStiffnessLimited(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_angularSpringStiffnessLimited();
	public native @Cast("char") byte m_angularSpringDampingLimited(int i); public native btGeneric6DofSpring2ConstraintData m_angularSpringDampingLimited(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_angularSpringDampingLimited();

	public native int m_rotateOrder(); public native btGeneric6DofSpring2ConstraintData m_rotateOrder(int setter);
}
