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


/**The btLemkeSolver is based on "Fast Implementation of Lemke’s Algorithm for Rigid Body Contact Simulation (John E. Lloyd) "
 * It is a slower but more accurate solver. Increase the m_maxLoops for better convergence, at the cost of more CPU time.
 * The original implementation of the btLemkeAlgorithm was done by Kilian Grundl from the MBSim team */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btLemkeSolver extends btMLCPSolverInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btLemkeSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btLemkeSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btLemkeSolver position(long position) {
        return (btLemkeSolver)super.position(position);
    }
    @Override public btLemkeSolver getPointer(long i) {
        return new btLemkeSolver((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_maxValue(); public native btLemkeSolver m_maxValue(double setter);
	public native int m_debugLevel(); public native btLemkeSolver m_debugLevel(int setter);
	public native int m_maxLoops(); public native btLemkeSolver m_maxLoops(int setter);
	public native @Cast("bool") boolean m_useLoHighBounds(); public native btLemkeSolver m_useLoHighBounds(boolean setter);

	public btLemkeSolver() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXd A, @Const @ByRef btVectorXd b, @ByRef btVectorXd x, @Const @ByRef btVectorXd lo, @Const @ByRef btVectorXd hi, @Const @ByRef btIntArray limitDependency, int numIterations, @Cast("bool") boolean useSparsity/*=true*/);
	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXd A, @Const @ByRef btVectorXd b, @ByRef btVectorXd x, @Const @ByRef btVectorXd lo, @Const @ByRef btVectorXd hi, @Const @ByRef btIntArray limitDependency, int numIterations);
}
