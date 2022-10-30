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


/**1D constraint along a normal axis between bodyA and bodyB. It can be combined to solve contact and friction constraints. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSolverConstraint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSolverConstraint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSolverConstraint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSolverConstraint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSolverConstraint position(long position) {
        return (btSolverConstraint)super.position(position);
    }
    @Override public btSolverConstraint getPointer(long i) {
        return new btSolverConstraint((Pointer)this).offsetAddress(i);
    }


	public native @ByRef btVector3 m_relpos1CrossNormal(); public native btSolverConstraint m_relpos1CrossNormal(btVector3 setter);
	public native @ByRef btVector3 m_contactNormal1(); public native btSolverConstraint m_contactNormal1(btVector3 setter);

	public native @ByRef btVector3 m_relpos2CrossNormal(); public native btSolverConstraint m_relpos2CrossNormal(btVector3 setter);
	public native @ByRef btVector3 m_contactNormal2(); public native btSolverConstraint m_contactNormal2(btVector3 setter);  //usually m_contactNormal2 == -m_contactNormal1, but not always

	public native @ByRef btVector3 m_angularComponentA(); public native btSolverConstraint m_angularComponentA(btVector3 setter);
	public native @ByRef btVector3 m_angularComponentB(); public native btSolverConstraint m_angularComponentB(btVector3 setter);

	public native @Cast("btScalar") double m_appliedPushImpulse(); public native btSolverConstraint m_appliedPushImpulse(double setter);
	public native @Cast("btScalar") double m_appliedImpulse(); public native btSolverConstraint m_appliedImpulse(double setter);

	public native @Cast("btScalar") double m_friction(); public native btSolverConstraint m_friction(double setter);
	public native @Cast("btScalar") double m_jacDiagABInv(); public native btSolverConstraint m_jacDiagABInv(double setter);
	public native @Cast("btScalar") double m_rhs(); public native btSolverConstraint m_rhs(double setter);
	public native @Cast("btScalar") double m_cfm(); public native btSolverConstraint m_cfm(double setter);

	public native @Cast("btScalar") double m_lowerLimit(); public native btSolverConstraint m_lowerLimit(double setter);
	public native @Cast("btScalar") double m_upperLimit(); public native btSolverConstraint m_upperLimit(double setter);
	public native @Cast("btScalar") double m_rhsPenetration(); public native btSolverConstraint m_rhsPenetration(double setter);
		public native Pointer m_originalContactPoint(); public native btSolverConstraint m_originalContactPoint(Pointer setter);
		public native @Cast("btScalar") double m_unusedPadding4(); public native btSolverConstraint m_unusedPadding4(double setter);
		public native int m_numRowsForNonContactConstraint(); public native btSolverConstraint m_numRowsForNonContactConstraint(int setter);

	public native int m_overrideNumSolverIterations(); public native btSolverConstraint m_overrideNumSolverIterations(int setter);
	public native int m_frictionIndex(); public native btSolverConstraint m_frictionIndex(int setter);
	public native int m_solverBodyIdA(); public native btSolverConstraint m_solverBodyIdA(int setter);
	public native int m_solverBodyIdB(); public native btSolverConstraint m_solverBodyIdB(int setter);

	/** enum btSolverConstraint::btSolverConstraintType */
	public static final int
		BT_SOLVER_CONTACT_1D = 0,
		BT_SOLVER_FRICTION_1D = 1;
}
