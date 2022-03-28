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


/**
 *  btDiscreteDynamicsWorldMt -- a version of DiscreteDynamicsWorld with some minor changes to support
 *                               solving simulation islands on multiple threads.
 * 
 *   Should function exactly like btDiscreteDynamicsWorld.
 *   Also 3 methods that iterate over all of the rigidbodies can run in parallel:
 *      - predictUnconstraintMotion
 *      - integrateTransforms
 *      - createPredictiveContacts
 *  */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btDiscreteDynamicsWorldMt extends btDiscreteDynamicsWorld {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDiscreteDynamicsWorldMt(Pointer p) { super(p); }


	public btDiscreteDynamicsWorldMt(btDispatcher dispatcher,
								  btBroadphaseInterface pairCache,
								  btConstraintSolverPoolMt solverPool,
								  btConstraintSolver constraintSolverMt,
								  btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, pairCache, solverPool, constraintSolverMt, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher,
								  btBroadphaseInterface pairCache,
								  btConstraintSolverPoolMt solverPool,
								  btConstraintSolver constraintSolverMt,
								  btCollisionConfiguration collisionConfiguration);

	public native int stepSimulation(@Cast("btScalar") float timeStep, int maxSubSteps, @Cast("btScalar") float fixedTimeStep);
}
