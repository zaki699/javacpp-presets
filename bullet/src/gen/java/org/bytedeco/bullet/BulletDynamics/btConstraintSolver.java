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


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btConstraintSolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConstraintSolver(Pointer p) { super(p); }


	public native void prepareSolve(int arg0, int arg1);

	/**solve a group of constraints */
	public native @Cast("btScalar") double solveGroup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifold, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native @Cast("btScalar") double solveGroup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifold, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);

	public native void allSolved(@Const @ByRef btContactSolverInfo arg0, btIDebugDraw arg1);

	/**clear internal cached data and reset random seed */
	public native void reset();

	public native @Cast("btConstraintSolverType") int getSolverType();
}
