// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


/**TypedConstraint is the baseclass for Bullet constraints and vehicles */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3TypedConstraint extends b3TypedObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3TypedConstraint(Pointer p) { super(p); }


	public static class b3ConstraintInfo1 extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public b3ConstraintInfo1() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public b3ConstraintInfo1(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public b3ConstraintInfo1(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public b3ConstraintInfo1 position(long position) {
	        return (b3ConstraintInfo1)super.position(position);
	    }
	    @Override public b3ConstraintInfo1 getPointer(long i) {
	        return new b3ConstraintInfo1((Pointer)this).offsetAddress(i);
	    }
	
		public native int m_numConstraintRows(); public native b3ConstraintInfo1 m_numConstraintRows(int setter);
		public native int nub(); public native b3ConstraintInfo1 nub(int setter);
	}

	public static class b3ConstraintInfo2 extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public b3ConstraintInfo2() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public b3ConstraintInfo2(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public b3ConstraintInfo2(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public b3ConstraintInfo2 position(long position) {
	        return (b3ConstraintInfo2)super.position(position);
	    }
	    @Override public b3ConstraintInfo2 getPointer(long i) {
	        return new b3ConstraintInfo2((Pointer)this).offsetAddress(i);
	    }
	
		// integrator parameters: frames per second (1/stepsize), default error
		// reduction parameter (0..1).
		public native @Cast("b3Scalar") float fps(); public native b3ConstraintInfo2 fps(float setter);
		public native @Cast("b3Scalar") float erp(); public native b3ConstraintInfo2 erp(float setter);

		// for the first and second body, pointers to two (linear and angular)
		// n*3 jacobian sub matrices, stored by rows. these matrices will have
		// been initialized to 0 on entry. if the second body is zero then the
		// J2xx pointers may be 0.
		public native @Cast("b3Scalar*") FloatPointer m_J1linearAxis(); public native b3ConstraintInfo2 m_J1linearAxis(FloatPointer setter);
		public native @Cast("b3Scalar*") FloatPointer m_J1angularAxis(); public native b3ConstraintInfo2 m_J1angularAxis(FloatPointer setter);
		public native @Cast("b3Scalar*") FloatPointer m_J2linearAxis(); public native b3ConstraintInfo2 m_J2linearAxis(FloatPointer setter);
		public native @Cast("b3Scalar*") FloatPointer m_J2angularAxis(); public native b3ConstraintInfo2 m_J2angularAxis(FloatPointer setter);

		// elements to jump from one row to the next in J's
		public native int rowskip(); public native b3ConstraintInfo2 rowskip(int setter);

		// right hand sides of the equation J*v = c + cfm * lambda. cfm is the
		// "constraint force mixing" vector. c is set to zero on entry, cfm is
		// set to a constant value (typically very small or zero) value on entry.
		public native @Cast("b3Scalar*") FloatPointer m_constraintError(); public native b3ConstraintInfo2 m_constraintError(FloatPointer setter);
		public native @Cast("b3Scalar*") FloatPointer cfm(); public native b3ConstraintInfo2 cfm(FloatPointer setter);

		// lo and hi limits for variables (set to -/+ infinity on entry).
		public native @Cast("b3Scalar*") FloatPointer m_lowerLimit(); public native b3ConstraintInfo2 m_lowerLimit(FloatPointer setter);
		public native @Cast("b3Scalar*") FloatPointer m_upperLimit(); public native b3ConstraintInfo2 m_upperLimit(FloatPointer setter);

		// findex vector for variables. see the LCP solver interface for a
		// description of what this does. this is set to -1 on entry.
		// note that the returned indexes are relative to the first index of
		// the constraint.
		public native IntPointer findex(); public native b3ConstraintInfo2 findex(IntPointer setter);
		// number of solver iterations
		public native int m_numIterations(); public native b3ConstraintInfo2 m_numIterations(int setter);

		//damping of the velocity
		public native @Cast("b3Scalar") float m_damping(); public native b3ConstraintInfo2 m_damping(float setter);
	}

	public native int getOverrideNumSolverIterations();

	/**override the number of constraint solver iterations used to solve this constraint
	 * -1 will use the default number of iterations, as specified in SolverInfo.m_numIterations */
	public native void setOverrideNumSolverIterations(int overideNumIterations);

	/**internal method used by the constraint solver, don't use them directly */
	public native void setupSolverConstraint(@Cast("b3ConstraintArray*") @ByRef b3TypedConstraintArray ca, int solverBodyA, int solverBodyB, @Cast("b3Scalar") float timeStep);

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo1(b3ConstraintInfo1 info, @Const b3RigidBodyData bodies);

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo2(b3ConstraintInfo2 info, @Const b3RigidBodyData bodies);

	/**internal method used by the constraint solver, don't use them directly */
	public native void internalSetAppliedImpulse(@Cast("b3Scalar") float appliedImpulse);
	/**internal method used by the constraint solver, don't use them directly */
	public native @Cast("b3Scalar") float internalGetAppliedImpulse();

	public native @Cast("b3Scalar") float getBreakingImpulseThreshold();

	public native void setBreakingImpulseThreshold(@Cast("b3Scalar") float threshold);

	public native @Cast("bool") boolean isEnabled();

	public native void setEnabled(@Cast("bool") boolean enabled);

	/**internal method used by the constraint solver, don't use them directly */
	public native void solveConstraintObsolete(@ByRef b3SolverBody arg0, @ByRef b3SolverBody arg1, @Cast("b3Scalar") float arg2);

	public native int getRigidBodyA();
	public native int getRigidBodyB();

	public native int getUserConstraintType();

	public native void setUserConstraintType(int userConstraintType);

	public native void setUserConstraintId(int uid);

	public native int getUserConstraintId();

	public native void setUserConstraintPtr(Pointer ptr);

	public native Pointer getUserConstraintPtr();

	public native void setJointFeedback(b3JointFeedback jointFeedback);

	public native b3JointFeedback getJointFeedback();

	public native int getUid();

	public native @Cast("bool") boolean needsFeedback();

	/**enableFeedback will allow to read the applied linear and angular impulse
	 * use getAppliedImpulse, getAppliedLinearImpulse and getAppliedAngularImpulse to read feedback information */
	public native void enableFeedback(@Cast("bool") boolean needsFeedback);

	/**getAppliedImpulse is an estimated total applied impulse.
	 * This feedback could be used to determine breaking constraints or playing sounds. */
	public native @Cast("b3Scalar") float getAppliedImpulse();

	public native @Cast("b3TypedConstraintType") int getConstraintType();

	public native void setDbgDrawSize(@Cast("b3Scalar") float dbgDrawSize);
	public native @Cast("b3Scalar") float getDbgDrawSize();

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("b3Scalar") float value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("b3Scalar") float value);

	/**return the local value of parameter */
	public native @Cast("b3Scalar") float getParam(int num, int axis/*=-1*/);
	public native @Cast("b3Scalar") float getParam(int num);

	//	virtual	int	calculateSerializeBufferSize() const;

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	//virtual	const char*	serialize(void* dataBuffer, b3Serializer* serializer) const;
}
