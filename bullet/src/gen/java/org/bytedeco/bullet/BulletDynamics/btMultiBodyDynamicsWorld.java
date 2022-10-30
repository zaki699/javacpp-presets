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


/**The btMultiBodyDynamicsWorld adds Featherstone multi body dynamics to Bullet
 * This implementation is still preliminary/experimental. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyDynamicsWorld extends btDiscreteDynamicsWorld {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyDynamicsWorld(Pointer p) { super(p); }

	public btMultiBodyDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(dispatcher, pairCache, constraintSolver, collisionConfiguration); }
	private native void allocate(btDispatcher dispatcher, btBroadphaseInterface pairCache, btMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration);
    
    public native void solveConstraints(@ByRef btContactSolverInfo solverInfo);
    
	public native void addMultiBody(btMultiBody body, int group/*=btBroadphaseProxy::DefaultFilter*/, int mask/*=btBroadphaseProxy::AllFilter*/);
	public native void addMultiBody(btMultiBody body);

	public native void removeMultiBody(btMultiBody body);

	public native int getNumMultibodies();

	public native btMultiBody getMultiBody(int mbIndex);

	public native void addMultiBodyConstraint(btMultiBodyConstraint constraint);

	public native int getNumMultiBodyConstraints();

	public native btMultiBodyConstraint getMultiBodyConstraint(int constraintIndex);

	public native void removeMultiBodyConstraint(btMultiBodyConstraint constraint);

	public native void integrateTransforms(@Cast("btScalar") double timeStep);
    public native void integrateMultiBodyTransforms(@Cast("btScalar") double timeStep);
    public native void predictMultiBodyTransforms(@Cast("btScalar") double timeStep);
    
    public native void predictUnconstraintMotion(@Cast("btScalar") double timeStep);
	public native void debugDrawWorld();

	public native void debugDrawMultiBodyConstraint(btMultiBodyConstraint constraint);

	public native void forwardKinematics();
	public native void clearForces();
	public native void clearMultiBodyConstraintForces();
	public native void clearMultiBodyForces();
	public native void applyGravity();

	public native void serialize(btSerializer serializer);
	public native void setMultiBodyConstraintSolver(btMultiBodyConstraintSolver solver);
	public native void setConstraintSolver(btConstraintSolver solver);
	public native void getAnalyticsData(@ByRef btSolverAnalyticsDataArray m_islandAnalyticsData);
    
    public native void solveExternalForces(@ByRef btContactSolverInfo solverInfo);
    public native void solveInternalConstraints(@ByRef btContactSolverInfo solverInfo);
    public native void buildIslands();

	public native void saveKinematicState(@Cast("btScalar") double timeStep);
}
