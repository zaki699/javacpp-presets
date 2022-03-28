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


/**The btSequentialImpulseConstraintSolver is a fast SIMD implementation of the Projected Gauss Seidel (iterative LCP) method. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSequentialImpulseConstraintSolver extends btConstraintSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSequentialImpulseConstraintSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSequentialImpulseConstraintSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSequentialImpulseConstraintSolver position(long position) {
        return (btSequentialImpulseConstraintSolver)super.position(position);
    }
    @Override public btSequentialImpulseConstraintSolver getPointer(long i) {
        return new btSequentialImpulseConstraintSolver((Pointer)this).offsetAddress(i);
    }


	public btSequentialImpulseConstraintSolver() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("btScalar") float solveGroup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifold, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native @Cast("btScalar") float solveGroup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifold, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);

	/**clear internal cached data and reset random seed */
	public native void reset();

	public native @Cast("unsigned long") long btRand2();

	public native int btRandInt2(int n);

	public native void setRandSeed(@Cast("unsigned long") long seed);
	public native @Cast("unsigned long") long getRandSeed();

	public native @Cast("btConstraintSolverType") int getSolverType();

	public native btSingleConstraintRowSolver getActiveConstraintRowSolverGeneric();
	public native void setConstraintRowSolverGeneric(btSingleConstraintRowSolver rowSolver);
	public native btSingleConstraintRowSolver getActiveConstraintRowSolverLowerLimit();
	public native void setConstraintRowSolverLowerLimit(btSingleConstraintRowSolver rowSolver);



	/**Various implementations of solving a single constraint row using a generic equality constraint, using scalar reference, SSE2 or SSE4 */
	public native btSingleConstraintRowSolver getScalarConstraintRowSolverGeneric();
	
	

	/**Various implementations of solving a single constraint row using an inequality (lower limit) constraint, using scalar reference, SSE2 or SSE4 */
	public native btSingleConstraintRowSolver getScalarConstraintRowSolverLowerLimit();
	
	
	public native @ByRef btSolverAnalyticsData m_analyticsData(); public native btSequentialImpulseConstraintSolver m_analyticsData(btSolverAnalyticsData setter);
}
