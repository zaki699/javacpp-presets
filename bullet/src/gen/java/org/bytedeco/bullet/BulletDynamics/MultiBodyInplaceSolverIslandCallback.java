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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class MultiBodyInplaceSolverIslandCallback extends btSimulationIslandManager.IslandCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiBodyInplaceSolverIslandCallback(Pointer p) { super(p); }


    public native btContactSolverInfo m_solverInfo(); public native MultiBodyInplaceSolverIslandCallback m_solverInfo(btContactSolverInfo setter);
    public native btMultiBodyConstraintSolver m_solver(); public native MultiBodyInplaceSolverIslandCallback m_solver(btMultiBodyConstraintSolver setter);
    public native btMultiBodyConstraint m_multiBodySortedConstraints(int i); public native MultiBodyInplaceSolverIslandCallback m_multiBodySortedConstraints(int i, btMultiBodyConstraint setter);
    public native @Cast("btMultiBodyConstraint**") PointerPointer m_multiBodySortedConstraints(); public native MultiBodyInplaceSolverIslandCallback m_multiBodySortedConstraints(PointerPointer setter);
    public native int m_numMultiBodyConstraints(); public native MultiBodyInplaceSolverIslandCallback m_numMultiBodyConstraints(int setter);
    
    public native btTypedConstraint m_sortedConstraints(int i); public native MultiBodyInplaceSolverIslandCallback m_sortedConstraints(int i, btTypedConstraint setter);
    public native @Cast("btTypedConstraint**") PointerPointer m_sortedConstraints(); public native MultiBodyInplaceSolverIslandCallback m_sortedConstraints(PointerPointer setter);
    public native int m_numConstraints(); public native MultiBodyInplaceSolverIslandCallback m_numConstraints(int setter);
    public native btIDebugDraw m_debugDrawer(); public native MultiBodyInplaceSolverIslandCallback m_debugDrawer(btIDebugDraw setter);
    public native btDispatcher m_dispatcher(); public native MultiBodyInplaceSolverIslandCallback m_dispatcher(btDispatcher setter);
    
    public native @ByRef btCollisionObjectArray m_bodies(); public native MultiBodyInplaceSolverIslandCallback m_bodies(btCollisionObjectArray setter);
	public native @ByRef btCollisionObjectArray m_softBodies(); public native MultiBodyInplaceSolverIslandCallback m_softBodies(btCollisionObjectArray setter);
    public native @ByRef btPersistentManifoldArray m_manifolds(); public native MultiBodyInplaceSolverIslandCallback m_manifolds(btPersistentManifoldArray setter);
    public native @ByRef btTypedConstraintArray m_constraints(); public native MultiBodyInplaceSolverIslandCallback m_constraints(btTypedConstraintArray setter);
    public native @ByRef btMultiBodyConstraintArray m_multiBodyConstraints(); public native MultiBodyInplaceSolverIslandCallback m_multiBodyConstraints(btMultiBodyConstraintArray setter);
    
    public native @ByRef btSolverAnalyticsDataArray m_islandAnalyticsData(); public native MultiBodyInplaceSolverIslandCallback m_islandAnalyticsData(btSolverAnalyticsDataArray setter);
    
    public MultiBodyInplaceSolverIslandCallback(btMultiBodyConstraintSolver solver,
                                             btDispatcher dispatcher) { super((Pointer)null); allocate(solver, dispatcher); }
    private native void allocate(btMultiBodyConstraintSolver solver,
                                             btDispatcher dispatcher);
    
    public native @ByRef @Name("operator =") MultiBodyInplaceSolverIslandCallback put(@Const @ByRef MultiBodyInplaceSolverIslandCallback other);
    
    public native void setup(btContactSolverInfo solverInfo, @Cast("btTypedConstraint**") PointerPointer sortedConstraints, int numConstraints, @Cast("btMultiBodyConstraint**") PointerPointer sortedMultiBodyConstraints, int numMultiBodyConstraints, btIDebugDraw debugDrawer);
    public native void setup(btContactSolverInfo solverInfo, @ByPtrPtr btTypedConstraint sortedConstraints, int numConstraints, @ByPtrPtr btMultiBodyConstraint sortedMultiBodyConstraints, int numMultiBodyConstraints, btIDebugDraw debugDrawer);
    
    public native void setMultiBodyConstraintSolver(btMultiBodyConstraintSolver solver);
    
    public native void processIsland(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btPersistentManifold**") PointerPointer manifolds, int numManifolds, int islandId);
    public native void processIsland(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btPersistentManifold manifolds, int numManifolds, int islandId);
    
    public native void processConstraints(int islandId/*=-1*/);
    public native void processConstraints();
}
