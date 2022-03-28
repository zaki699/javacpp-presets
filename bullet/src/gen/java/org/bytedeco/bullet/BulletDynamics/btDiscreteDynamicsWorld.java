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


/**btDiscreteDynamicsWorld provides discrete rigid body simulation
 * those classes replace the obsolete CcdPhysicsEnvironment/CcdPhysicsController */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btDiscreteDynamicsWorld extends btDynamicsWorld {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDiscreteDynamicsWorld(Pointer p) { super(p); }


	/**this btDiscreteDynamicsWorld constructor gets created objects from the user, and will not delete those */
	public btDiscreteDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, pairCache, constraintSolver, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration);

	/**if maxSubSteps > 0, it will interpolate motion between fixedTimeStep's */
	public native int stepSimulation(@Cast("btScalar") float timeStep, int maxSubSteps/*=1*/, @Cast("btScalar") float fixedTimeStep/*=btScalar(1.) / btScalar(60.)*/);
	public native int stepSimulation(@Cast("btScalar") float timeStep);

    public native void solveConstraints(@ByRef btContactSolverInfo solverInfo);
    
	public native void synchronizeMotionStates();

	/**this can be useful to synchronize a single rigid body -> graphics object */
	public native void synchronizeSingleMotionState(btRigidBody body);

	public native void addConstraint(btTypedConstraint constraint, @Cast("bool") boolean disableCollisionsBetweenLinkedBodies/*=false*/);
	public native void addConstraint(btTypedConstraint constraint);

	public native void removeConstraint(btTypedConstraint constraint);

	public native void addAction(btActionInterface arg0);

	public native void removeAction(btActionInterface arg0);

	public native btSimulationIslandManager getSimulationIslandManager();

	public native btCollisionWorld getCollisionWorld();

	public native void setGravity(@Const @ByRef btVector3 gravity);

	public native @ByVal btVector3 getGravity();

	public native void addCollisionObject(btCollisionObject collisionObject, int collisionFilterGroup/*=btBroadphaseProxy::StaticFilter*/, int collisionFilterMask/*=btBroadphaseProxy::AllFilter ^ btBroadphaseProxy::StaticFilter*/);
	public native void addCollisionObject(btCollisionObject collisionObject);

	public native void addRigidBody(btRigidBody body);

	public native void addRigidBody(btRigidBody body, int group, int mask);

	public native void removeRigidBody(btRigidBody body);

	/**removeCollisionObject will first check if it is a rigid body, if so call removeRigidBody otherwise call btCollisionWorld::removeCollisionObject */
	public native void removeCollisionObject(btCollisionObject collisionObject);

	public native void debugDrawConstraint(btTypedConstraint constraint);

	public native void debugDrawWorld();

	public native void setConstraintSolver(btConstraintSolver solver);

	public native btConstraintSolver getConstraintSolver();

	public native int getNumConstraints();

	public native btTypedConstraint getConstraint(int index);

	public native @Cast("btDynamicsWorldType") int getWorldType();

	/**the forces on each rigidbody is accumulating together with gravity. clear this after each timestep. */
	public native void clearForces();

	/**apply gravity, call this once per timestep */
	public native void applyGravity();

	public native void setNumTasks(int numTasks);

	/**obsolete, use updateActions instead */
	public native void updateVehicles(@Cast("btScalar") float timeStep);

	/**obsolete, use addAction instead */
	public native void addVehicle(btActionInterface vehicle);
	/**obsolete, use removeAction instead */
	public native void removeVehicle(btActionInterface vehicle);
	/**obsolete, use addAction instead */
	public native void addCharacter(btActionInterface character);
	/**obsolete, use removeAction instead */
	public native void removeCharacter(btActionInterface character);

	public native void setSynchronizeAllMotionStates(@Cast("bool") boolean synchronizeAll);
	public native @Cast("bool") boolean getSynchronizeAllMotionStates();

	public native void setApplySpeculativeContactRestitution(@Cast("bool") boolean enable);

	public native @Cast("bool") boolean getApplySpeculativeContactRestitution();

	/**Preliminary serialization test for Bullet 2.76. Loading those files requires a separate parser (see Bullet/Demos/SerializeDemo) */
	public native void serialize(btSerializer serializer);

	/**Interpolate motion state between previous and current transform, instead of current and next transform.
	 * This can relieve discontinuities in the rendering, due to penetrations */
	public native void setLatencyMotionStateInterpolation(@Cast("bool") boolean latencyInterpolation);
	public native @Cast("bool") boolean getLatencyMotionStateInterpolation();
    
    public native @ByRef btRigidBodyArray getNonStaticRigidBodies();
}
