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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyConstraintSolver extends btSequentialImpulseConstraintSolver {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMultiBodyConstraintSolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMultiBodyConstraintSolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyConstraintSolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMultiBodyConstraintSolver position(long position) {
        return (btMultiBodyConstraintSolver)super.position(position);
    }
    @Override public btMultiBodyConstraintSolver getPointer(long i) {
        return new btMultiBodyConstraintSolver((Pointer)this).offsetAddress(i);
    }


	/**this method should not be called, it was just used during porting/integration of Featherstone btMultiBody, providing backwards compatibility but no support for btMultiBodyConstraint (only contact constraints) */
	public native @Cast("btScalar") float solveGroup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifold, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native @Cast("btScalar") float solveGroup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifold, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native @Cast("btScalar") float solveGroupCacheFriendlyFinish(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Const @ByRef btContactSolverInfo infoGlobal);
	public native @Cast("btScalar") float solveGroupCacheFriendlyFinish(@ByPtrPtr btCollisionObject bodies, int numBodies, @Const @ByRef btContactSolverInfo infoGlobal);

	public native void solveMultiBodyGroup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifold, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Cast("btMultiBodyConstraint**") PointerPointer multiBodyConstraints, int numMultiBodyConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native void solveMultiBodyGroup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifold, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @ByPtrPtr btMultiBodyConstraint multiBodyConstraints, int numMultiBodyConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
}
