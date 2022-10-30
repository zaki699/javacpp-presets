// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3TranslationalLimitMotor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3TranslationalLimitMotor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3TranslationalLimitMotor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3TranslationalLimitMotor position(long position) {
        return (b3TranslationalLimitMotor)super.position(position);
    }
    @Override public b3TranslationalLimitMotor getPointer(long i) {
        return new b3TranslationalLimitMotor((Pointer)this).offsetAddress(i);
    }

	/** the constraint lower limits */
	public native @ByRef b3Vector3 m_lowerLimit(); public native b3TranslationalLimitMotor m_lowerLimit(b3Vector3 setter);
	/** the constraint upper limits */
	public native @ByRef b3Vector3 m_upperLimit(); public native b3TranslationalLimitMotor m_upperLimit(b3Vector3 setter);
	public native @ByRef b3Vector3 m_accumulatedImpulse(); public native b3TranslationalLimitMotor m_accumulatedImpulse(b3Vector3 setter);
	/** Linear_Limit_parameters
	 * \{ */
	/** Constraint force mixing factor */
	public native @ByRef b3Vector3 m_normalCFM(); public native b3TranslationalLimitMotor m_normalCFM(b3Vector3 setter);
	/** Error tolerance factor when joint is at limit */
	public native @ByRef b3Vector3 m_stopERP(); public native b3TranslationalLimitMotor m_stopERP(b3Vector3 setter);
	/** Constraint force mixing factor when joint is at limit */
	public native @ByRef b3Vector3 m_stopCFM(); public native b3TranslationalLimitMotor m_stopCFM(b3Vector3 setter);
	/** target motor velocity */
	public native @ByRef b3Vector3 m_targetVelocity(); public native b3TranslationalLimitMotor m_targetVelocity(b3Vector3 setter);
	/** max force on motor */
	public native @ByRef b3Vector3 m_maxMotorForce(); public native b3TranslationalLimitMotor m_maxMotorForce(b3Vector3 setter);
	public native @ByRef b3Vector3 m_currentLimitError(); public native b3TranslationalLimitMotor m_currentLimitError(b3Vector3 setter);  /**  How much is violated this limit */
	public native @ByRef b3Vector3 m_currentLinearDiff(); public native b3TranslationalLimitMotor m_currentLinearDiff(b3Vector3 setter);  /**  Current relative offset of constraint frames */
	/** Softness for linear limit */
	public native @Cast("b3Scalar") float m_limitSoftness(); public native b3TranslationalLimitMotor m_limitSoftness(float setter);
	/** Damping for linear limit */
	public native @Cast("b3Scalar") float m_damping(); public native b3TranslationalLimitMotor m_damping(float setter);
	public native @Cast("b3Scalar") float m_restitution(); public native b3TranslationalLimitMotor m_restitution(float setter);         /** Bounce parameter for linear limit
	 * \} */
	public native @Cast("bool") boolean m_enableMotor(int i); public native b3TranslationalLimitMotor m_enableMotor(int i, boolean setter);
	@MemberGetter public native @Cast("bool*") BoolPointer m_enableMotor();
	/** 0=free, 1=at lower limit, 2=at upper limit */
	public native int m_currentLimit(int i); public native b3TranslationalLimitMotor m_currentLimit(int i, int setter);
	@MemberGetter public native IntPointer m_currentLimit();

	public b3TranslationalLimitMotor() { super((Pointer)null); allocate(); }
	private native void allocate();

	public b3TranslationalLimitMotor(@Const @ByRef b3TranslationalLimitMotor other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef b3TranslationalLimitMotor other);

	/** Test limit
	/**
    - free means upper < lower,
    - locked means upper == lower
    - limited means upper > lower
    - limitIndex: first 3 are linear, next 3 are angular
    */
	public native @Cast("bool") boolean isLimited(int limitIndex);
	public native @Cast("bool") boolean needApplyForce(int limitIndex);
	public native int testLimitValue(int limitIndex, @Cast("b3Scalar") float test_value);

	
}
