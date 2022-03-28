// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


/**This solver is mainly for debug/learning purposes: it is functionally equivalent to the btSequentialImpulseConstraintSolver solver, but much slower (it builds the full LCP matrix) */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSolveProjectedGaussSeidel extends btMLCPSolverInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSolveProjectedGaussSeidel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSolveProjectedGaussSeidel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSolveProjectedGaussSeidel position(long position) {
        return (btSolveProjectedGaussSeidel)super.position(position);
    }
    @Override public btSolveProjectedGaussSeidel getPointer(long i) {
        return new btSolveProjectedGaussSeidel((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") float m_leastSquaresResidualThreshold(); public native btSolveProjectedGaussSeidel m_leastSquaresResidualThreshold(float setter);
	public native @Cast("btScalar") float m_leastSquaresResidual(); public native btSolveProjectedGaussSeidel m_leastSquaresResidual(float setter);

	public btSolveProjectedGaussSeidel() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXf A, @Const @ByRef btVectorXf b, @ByRef btVectorXf x, @Const @ByRef btVectorXf lo, @Const @ByRef btVectorXf hi, @Const @ByRef btIntArray limitDependency, int numIterations, @Cast("bool") boolean useSparsity/*=true*/);
	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXf A, @Const @ByRef btVectorXf b, @ByRef btVectorXf x, @Const @ByRef btVectorXf lo, @Const @ByRef btVectorXf hi, @Const @ByRef btIntArray limitDependency, int numIterations);
}
