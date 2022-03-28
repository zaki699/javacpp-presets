// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


//#define NO_FRICTION_TANGENTIALS 1

/**1D constraint along a normal axis between bodyA and bodyB. It can be combined to solve contact and friction constraints. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuSolverConstraint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuSolverConstraint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuSolverConstraint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuSolverConstraint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuSolverConstraint position(long position) {
        return (b3GpuSolverConstraint)super.position(position);
    }
    @Override public b3GpuSolverConstraint getPointer(long i) {
        return new b3GpuSolverConstraint((Pointer)this).offsetAddress(i);
    }


	public native @ByRef b3Vector3 m_relpos1CrossNormal(); public native b3GpuSolverConstraint m_relpos1CrossNormal(b3Vector3 setter);
	public native @ByRef b3Vector3 m_contactNormal(); public native b3GpuSolverConstraint m_contactNormal(b3Vector3 setter);

	public native @ByRef b3Vector3 m_relpos2CrossNormal(); public native b3GpuSolverConstraint m_relpos2CrossNormal(b3Vector3 setter);
	//b3Vector3		m_contactNormal2;//usually m_contactNormal2 == -m_contactNormal

	public native @ByRef b3Vector3 m_angularComponentA(); public native b3GpuSolverConstraint m_angularComponentA(b3Vector3 setter);
	public native @ByRef b3Vector3 m_angularComponentB(); public native b3GpuSolverConstraint m_angularComponentB(b3Vector3 setter);

	public native @Cast("b3Scalar") float m_appliedPushImpulse(); public native b3GpuSolverConstraint m_appliedPushImpulse(float setter);
	public native @Cast("b3Scalar") float m_appliedImpulse(); public native b3GpuSolverConstraint m_appliedImpulse(float setter);
	public native int m_padding1(); public native b3GpuSolverConstraint m_padding1(int setter);
	public native int m_padding2(); public native b3GpuSolverConstraint m_padding2(int setter);
	public native @Cast("b3Scalar") float m_friction(); public native b3GpuSolverConstraint m_friction(float setter);
	public native @Cast("b3Scalar") float m_jacDiagABInv(); public native b3GpuSolverConstraint m_jacDiagABInv(float setter);
	public native @Cast("b3Scalar") float m_rhs(); public native b3GpuSolverConstraint m_rhs(float setter);
	public native @Cast("b3Scalar") float m_cfm(); public native b3GpuSolverConstraint m_cfm(float setter);

	public native @Cast("b3Scalar") float m_lowerLimit(); public native b3GpuSolverConstraint m_lowerLimit(float setter);
	public native @Cast("b3Scalar") float m_upperLimit(); public native b3GpuSolverConstraint m_upperLimit(float setter);
	public native @Cast("b3Scalar") float m_rhsPenetration(); public native b3GpuSolverConstraint m_rhsPenetration(float setter);
		public native Pointer m_originalContactPoint(); public native b3GpuSolverConstraint m_originalContactPoint(Pointer setter);
		public native int m_originalConstraintIndex(); public native b3GpuSolverConstraint m_originalConstraintIndex(int setter);
		public native @Cast("b3Scalar") float m_unusedPadding4(); public native b3GpuSolverConstraint m_unusedPadding4(float setter);

	public native int m_overrideNumSolverIterations(); public native b3GpuSolverConstraint m_overrideNumSolverIterations(int setter);
	public native int m_frictionIndex(); public native b3GpuSolverConstraint m_frictionIndex(int setter);
	public native int m_solverBodyIdA(); public native b3GpuSolverConstraint m_solverBodyIdA(int setter);
	public native int m_solverBodyIdB(); public native b3GpuSolverConstraint m_solverBodyIdB(int setter);

	/** enum b3GpuSolverConstraint::b3SolverConstraintType */
	public static final int
		B3_SOLVER_CONTACT_1D = 0,
		B3_SOLVER_FRICTION_1D = 1;
}
