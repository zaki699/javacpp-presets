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


/**The btRigidBody is the main class for rigid body objects. It is derived from btCollisionObject, so it keeps a pointer to a btCollisionShape.
 * It is recommended for performance and memory use to share btCollisionShape objects whenever possible.
 * There are 3 types of rigid bodies:
 * - A) Dynamic rigid bodies, with positive mass. Motion is controlled by rigid body dynamics.
 * - B) Fixed objects with zero mass. They are not moving (basically collision objects)
 * - C) Kinematic objects, which are objects without mass, but the user can move them. There is one-way interaction, and Bullet calculates a velocity based on the timestep and previous and current world transform.
 * Bullet automatically deactivates dynamic rigid bodies, when the velocity is below a threshold for a given time.
 * Deactivated (sleeping) rigid bodies don't take any processing time, except a minor broadphase collision detection impact (to allow active objects to activate/wake up sleeping objects) */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btRigidBody extends btCollisionObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btRigidBody(Pointer p) { super(p); }

	/**The btRigidBodyConstructionInfo structure provides information to create a rigid body. Setting mass to zero creates a fixed (non-dynamic) rigid body.
	 * For dynamic objects, you can use the collision shape to approximate the local inertia tensor, otherwise use the zero vector (default argument)
	 * You can use the motion state to synchronize the world transform between physics and graphics objects.
	 * And if the motion state is provided, the rigid body will initialize its initial world transform from the motion state,
	 * m_startWorldTransform is only used when you don't provide a motion state. */
	@NoOffset public static class btRigidBodyConstructionInfo extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public btRigidBodyConstructionInfo(Pointer p) { super(p); }
	
		public native @Cast("btScalar") float m_mass(); public native btRigidBodyConstructionInfo m_mass(float setter);

		/**When a motionState is provided, the rigid body will initialize its world transform from the motion state
		 * In this case, m_startWorldTransform is ignored. */
		public native btMotionState m_motionState(); public native btRigidBodyConstructionInfo m_motionState(btMotionState setter);
		public native @ByRef btTransform m_startWorldTransform(); public native btRigidBodyConstructionInfo m_startWorldTransform(btTransform setter);

		public native btCollisionShape m_collisionShape(); public native btRigidBodyConstructionInfo m_collisionShape(btCollisionShape setter);
		public native @ByRef btVector3 m_localInertia(); public native btRigidBodyConstructionInfo m_localInertia(btVector3 setter);
		public native @Cast("btScalar") float m_linearDamping(); public native btRigidBodyConstructionInfo m_linearDamping(float setter);
		public native @Cast("btScalar") float m_angularDamping(); public native btRigidBodyConstructionInfo m_angularDamping(float setter);

		/**best simulation results when friction is non-zero */
		public native @Cast("btScalar") float m_friction(); public native btRigidBodyConstructionInfo m_friction(float setter);
		/**the m_rollingFriction prevents rounded shapes, such as spheres, cylinders and capsules from rolling forever.
		 * See Bullet/Demos/RollingFrictionDemo for usage */
		public native @Cast("btScalar") float m_rollingFriction(); public native btRigidBodyConstructionInfo m_rollingFriction(float setter);
		public native @Cast("btScalar") float m_spinningFriction(); public native btRigidBodyConstructionInfo m_spinningFriction(float setter);  //torsional friction around contact normal

		/**best simulation results using zero restitution. */
		public native @Cast("btScalar") float m_restitution(); public native btRigidBodyConstructionInfo m_restitution(float setter);

		public native @Cast("btScalar") float m_linearSleepingThreshold(); public native btRigidBodyConstructionInfo m_linearSleepingThreshold(float setter);
		public native @Cast("btScalar") float m_angularSleepingThreshold(); public native btRigidBodyConstructionInfo m_angularSleepingThreshold(float setter);

		//Additional damping can help avoiding lowpass jitter motion, help stability for ragdolls etc.
		//Such damping is undesirable, so once the overall simulation quality of the rigid body dynamics system has improved, this should become obsolete
		public native @Cast("bool") boolean m_additionalDamping(); public native btRigidBodyConstructionInfo m_additionalDamping(boolean setter);
		public native @Cast("btScalar") float m_additionalDampingFactor(); public native btRigidBodyConstructionInfo m_additionalDampingFactor(float setter);
		public native @Cast("btScalar") float m_additionalLinearDampingThresholdSqr(); public native btRigidBodyConstructionInfo m_additionalLinearDampingThresholdSqr(float setter);
		public native @Cast("btScalar") float m_additionalAngularDampingThresholdSqr(); public native btRigidBodyConstructionInfo m_additionalAngularDampingThresholdSqr(float setter);
		public native @Cast("btScalar") float m_additionalAngularDampingFactor(); public native btRigidBodyConstructionInfo m_additionalAngularDampingFactor(float setter);

		public btRigidBodyConstructionInfo(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 localInertia) { super((Pointer)null); allocate(mass, motionState, collisionShape, localInertia); }
		private native void allocate(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 localInertia);
		public btRigidBodyConstructionInfo(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape) { super((Pointer)null); allocate(mass, motionState, collisionShape); }
		private native void allocate(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape);
	}

	/**btRigidBody constructor using construction info */
	public btRigidBody(@Const @ByRef btRigidBodyConstructionInfo constructionInfo) { super((Pointer)null); allocate(constructionInfo); }
	private native void allocate(@Const @ByRef btRigidBodyConstructionInfo constructionInfo);

	/**btRigidBody constructor for backwards compatibility.
	 * To specify friction (etc) during rigid body construction, please use the other constructor (using btRigidBodyConstructionInfo) */
	public btRigidBody(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 localInertia) { super((Pointer)null); allocate(mass, motionState, collisionShape, localInertia); }
	private native void allocate(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 localInertia);
	public btRigidBody(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape) { super((Pointer)null); allocate(mass, motionState, collisionShape); }
	private native void allocate(@Cast("btScalar") float mass, btMotionState motionState, btCollisionShape collisionShape);
	public native void proceedToTransform(@Const @ByRef btTransform newTrans);

	/**to keep collision detection and dynamics separate we don't store a rigidbody pointer
	 * but a rigidbody is derived from btCollisionObject, so we can safely perform an upcast */
	public static native @Const btRigidBody upcast(@Const btCollisionObject colObj);

	/** continuous collision detection needs prediction */
	public native void predictIntegratedTransform(@Cast("btScalar") float step, @ByRef btTransform predictedTransform);

	public native void saveKinematicState(@Cast("btScalar") float step);

	public native void applyGravity();
    
    public native void clearGravity();

	public native void setGravity(@Const @ByRef btVector3 acceleration);

	public native @Const @ByRef btVector3 getGravity();

	public native void setDamping(@Cast("btScalar") float lin_damping, @Cast("btScalar") float ang_damping);

	public native @Cast("btScalar") float getLinearDamping();

	public native @Cast("btScalar") float getAngularDamping();

	public native @Cast("btScalar") float getLinearSleepingThreshold();

	public native @Cast("btScalar") float getAngularSleepingThreshold();

	public native void applyDamping(@Cast("btScalar") float timeStep);

	public native btCollisionShape getCollisionShape();

	public native void setMassProps(@Cast("btScalar") float mass, @Const @ByRef btVector3 inertia);

	public native @Const @ByRef btVector3 getLinearFactor();
	public native void setLinearFactor(@Const @ByRef btVector3 linearFactor);
	public native @Cast("btScalar") float getInvMass();
	public native @Cast("btScalar") float getMass();
	public native @Const @ByRef btMatrix3x3 getInvInertiaTensorWorld();

	public native void integrateVelocities(@Cast("btScalar") float step);

	public native void setCenterOfMassTransform(@Const @ByRef btTransform xform);

	public native void applyCentralForce(@Const @ByRef btVector3 force);

	public native @Const @ByRef btVector3 getTotalForce();

	public native @Const @ByRef btVector3 getTotalTorque();

	public native @Const @ByRef btVector3 getInvInertiaDiagLocal();

	public native void setInvInertiaDiagLocal(@Const @ByRef btVector3 diagInvInertia);

	public native void setSleepingThresholds(@Cast("btScalar") float linear, @Cast("btScalar") float angular);

	public native void applyTorque(@Const @ByRef btVector3 torque);

	public native void applyForce(@Const @ByRef btVector3 force, @Const @ByRef btVector3 rel_pos);

	public native void applyCentralImpulse(@Const @ByRef btVector3 impulse);

	public native void applyTorqueImpulse(@Const @ByRef btVector3 torque);

	public native void applyImpulse(@Const @ByRef btVector3 impulse, @Const @ByRef btVector3 rel_pos);
    
    public native void applyPushImpulse(@Const @ByRef btVector3 impulse, @Const @ByRef btVector3 rel_pos);
    
    public native @ByVal btVector3 getPushVelocity();
    
    public native @ByVal btVector3 getTurnVelocity();
    
    public native void setPushVelocity(@Const @ByRef btVector3 v);

//     #if defined(BT_CLAMP_VELOCITY_TO) && BT_CLAMP_VELOCITY_TO > 0
//     #endif

    public native void setTurnVelocity(@Const @ByRef btVector3 v);
    
    public native void applyCentralPushImpulse(@Const @ByRef btVector3 impulse);
    
    public native void applyTorqueTurnImpulse(@Const @ByRef btVector3 torque);

	public native void clearForces();

	public native void updateInertiaTensor();

	public native @Const @ByRef btVector3 getCenterOfMassPosition();
	public native @ByVal btQuaternion getOrientation();

	public native @Const @ByRef btTransform getCenterOfMassTransform();
	public native @Const @ByRef btVector3 getLinearVelocity();
	public native @Const @ByRef btVector3 getAngularVelocity();

	public native void setLinearVelocity(@Const @ByRef btVector3 lin_vel);

	public native void setAngularVelocity(@Const @ByRef btVector3 ang_vel);

	public native @ByVal btVector3 getVelocityInLocalPoint(@Const @ByRef btVector3 rel_pos);
    
    public native @ByVal btVector3 getPushVelocityInLocalPoint(@Const @ByRef btVector3 rel_pos);

	public native void translate(@Const @ByRef btVector3 v);

	public native void getAabb(@ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native @Cast("btScalar") float computeImpulseDenominator(@Const @ByRef btVector3 pos, @Const @ByRef btVector3 normal);

	public native @Cast("btScalar") float computeAngularImpulseDenominator(@Const @ByRef btVector3 axis);

	public native void updateDeactivation(@Cast("btScalar") float timeStep);

	public native @Cast("bool") boolean wantsSleeping();
	public native btBroadphaseProxy getBroadphaseProxy();
	public native void setNewBroadphaseProxy(btBroadphaseProxy broadphaseProxy);

	//btMotionState allows to automatic synchronize the world transform for active objects
	public native btMotionState getMotionState();
	public native void setMotionState(btMotionState motionState);

	//for experimental overriding of friction/contact solver func
	public native int m_contactSolverType(); public native btRigidBody m_contactSolverType(int setter);
	public native int m_frictionSolverType(); public native btRigidBody m_frictionSolverType(int setter);

	public native void setAngularFactor(@Const @ByRef btVector3 angFac);

	public native void setAngularFactor(@Cast("btScalar") float angFac);
	public native @Const @ByRef btVector3 getAngularFactor();

	//is this rigidbody added to a btCollisionWorld/btDynamicsWorld/btBroadphase?
	public native @Cast("bool") boolean isInWorld();

	public native void addConstraintRef(btTypedConstraint c);
	public native void removeConstraintRef(btTypedConstraint c);

	public native btTypedConstraint getConstraintRef(int index);

	public native int getNumConstraintRefs();

	public native void setFlags(int flags);

	public native int getFlags();

	/**perform implicit force computation in world space */
	public native @ByVal btVector3 computeGyroscopicImpulseImplicit_World(@Cast("btScalar") float dt);

	/**perform implicit force computation in body space (inertial frame) */
	public native @ByVal btVector3 computeGyroscopicImpulseImplicit_Body(@Cast("btScalar") float step);

	/**explicit version is best avoided, it gains energy */
	public native @ByVal btVector3 computeGyroscopicForceExplicit(@Cast("btScalar") float maxGyroscopicForce);
	public native @ByVal btVector3 getLocalInertia();

	///////////////////////////////////////////////

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native void serializeSingleObject(btSerializer serializer);
}
