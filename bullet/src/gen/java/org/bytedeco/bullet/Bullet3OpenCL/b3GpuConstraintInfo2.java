// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuConstraintInfo2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuConstraintInfo2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuConstraintInfo2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuConstraintInfo2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuConstraintInfo2 position(long position) {
        return (b3GpuConstraintInfo2)super.position(position);
    }
    @Override public b3GpuConstraintInfo2 getPointer(long i) {
        return new b3GpuConstraintInfo2((Pointer)this).offsetAddress(i);
    }

	// integrator parameters: frames per second (1/stepsize), default error
	// reduction parameter (0..1).
	public native @Cast("b3Scalar") float fps(); public native b3GpuConstraintInfo2 fps(float setter);
	public native @Cast("b3Scalar") float erp(); public native b3GpuConstraintInfo2 erp(float setter);

	// for the first and second body, pointers to two (linear and angular)
	// n*3 jacobian sub matrices, stored by rows. these matrices will have
	// been initialized to 0 on entry. if the second body is zero then the
	// J2xx pointers may be 0.
	public native @Cast("b3Scalar*") FloatPointer m_J1linearAxis(); public native b3GpuConstraintInfo2 m_J1linearAxis(FloatPointer setter);
	public native @Cast("b3Scalar*") FloatPointer m_J1angularAxis(); public native b3GpuConstraintInfo2 m_J1angularAxis(FloatPointer setter);
	public native @Cast("b3Scalar*") FloatPointer m_J2linearAxis(); public native b3GpuConstraintInfo2 m_J2linearAxis(FloatPointer setter);
	public native @Cast("b3Scalar*") FloatPointer m_J2angularAxis(); public native b3GpuConstraintInfo2 m_J2angularAxis(FloatPointer setter);

	// elements to jump from one row to the next in J's
	public native int rowskip(); public native b3GpuConstraintInfo2 rowskip(int setter);

	// right hand sides of the equation J*v = c + cfm * lambda. cfm is the
	// "constraint force mixing" vector. c is set to zero on entry, cfm is
	// set to a constant value (typically very small or zero) value on entry.
	public native @Cast("b3Scalar*") FloatPointer m_constraintError(); public native b3GpuConstraintInfo2 m_constraintError(FloatPointer setter);
	public native @Cast("b3Scalar*") FloatPointer cfm(); public native b3GpuConstraintInfo2 cfm(FloatPointer setter);

	// lo and hi limits for variables (set to -/+ infinity on entry).
	public native @Cast("b3Scalar*") FloatPointer m_lowerLimit(); public native b3GpuConstraintInfo2 m_lowerLimit(FloatPointer setter);
	public native @Cast("b3Scalar*") FloatPointer m_upperLimit(); public native b3GpuConstraintInfo2 m_upperLimit(FloatPointer setter);

	// findex vector for variables. see the LCP solver interface for a
	// description of what this does. this is set to -1 on entry.
	// note that the returned indexes are relative to the first index of
	// the constraint.
	public native IntPointer findex(); public native b3GpuConstraintInfo2 findex(IntPointer setter);
	// number of solver iterations
	public native int m_numIterations(); public native b3GpuConstraintInfo2 m_numIterations(int setter);

	//damping of the velocity
	public native @Cast("b3Scalar") float m_damping(); public native b3GpuConstraintInfo2 m_damping(float setter);
}
