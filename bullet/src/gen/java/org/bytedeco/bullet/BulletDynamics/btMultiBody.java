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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBody extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBody(Pointer p) { super(p); }


	//
	// initialization
	//

	public btMultiBody(int n_links,
					@Cast("btScalar") double mass,
					@Const @ByRef btVector3 inertia,
					@Cast("bool") boolean fixedBase,
					@Cast("bool") boolean canSleep, @Cast("bool") boolean deprecatedMultiDof/*=true*/) { super((Pointer)null); allocate(n_links, mass, inertia, fixedBase, canSleep, deprecatedMultiDof); }
	private native void allocate(int n_links,
					@Cast("btScalar") double mass,
					@Const @ByRef btVector3 inertia,
					@Cast("bool") boolean fixedBase,
					@Cast("bool") boolean canSleep, @Cast("bool") boolean deprecatedMultiDof/*=true*/);
	public btMultiBody(int n_links,
					@Cast("btScalar") double mass,
					@Const @ByRef btVector3 inertia,
					@Cast("bool") boolean fixedBase,
					@Cast("bool") boolean canSleep) { super((Pointer)null); allocate(n_links, mass, inertia, fixedBase, canSleep); }
	private native void allocate(int n_links,
					@Cast("btScalar") double mass,
					@Const @ByRef btVector3 inertia,
					@Cast("bool") boolean fixedBase,
					@Cast("bool") boolean canSleep);

	//note: fixed link collision with parent is always disabled
	public native void setupFixed(int i,
						@Cast("btScalar") double mass,
						@Const @ByRef btVector3 inertia,
						int parent,
						@Const @ByRef btQuaternion rotParentToThis,
						@Const @ByRef btVector3 parentComToThisPivotOffset,
						@Const @ByRef btVector3 thisPivotToThisComOffset, @Cast("bool") boolean deprecatedDisableParentCollision/*=true*/);
	public native void setupFixed(int i,
						@Cast("btScalar") double mass,
						@Const @ByRef btVector3 inertia,
						int parent,
						@Const @ByRef btQuaternion rotParentToThis,
						@Const @ByRef btVector3 parentComToThisPivotOffset,
						@Const @ByRef btVector3 thisPivotToThisComOffset);

	public native void setupPrismatic(int i,
							@Cast("btScalar") double mass,
							@Const @ByRef btVector3 inertia,
							int parent,
							@Const @ByRef btQuaternion rotParentToThis,
							@Const @ByRef btVector3 jointAxis,
							@Const @ByRef btVector3 parentComToThisPivotOffset,
							@Const @ByRef btVector3 thisPivotToThisComOffset,
							@Cast("bool") boolean disableParentCollision);

	public native void setupRevolute(int i,
						   @Cast("btScalar") double mass,
						   @Const @ByRef btVector3 inertia,
						   int parentIndex,
						   @Const @ByRef btQuaternion rotParentToThis,
						   @Const @ByRef btVector3 jointAxis,
						   @Const @ByRef btVector3 parentComToThisPivotOffset,
						   @Const @ByRef btVector3 thisPivotToThisComOffset,
						   @Cast("bool") boolean disableParentCollision/*=false*/);
	public native void setupRevolute(int i,
						   @Cast("btScalar") double mass,
						   @Const @ByRef btVector3 inertia,
						   int parentIndex,
						   @Const @ByRef btQuaternion rotParentToThis,
						   @Const @ByRef btVector3 jointAxis,
						   @Const @ByRef btVector3 parentComToThisPivotOffset,
						   @Const @ByRef btVector3 thisPivotToThisComOffset);

	public native void setupSpherical(int i,
							@Cast("btScalar") double mass,
							@Const @ByRef btVector3 inertia,
							int parent,
							@Const @ByRef btQuaternion rotParentToThis,
							@Const @ByRef btVector3 parentComToThisPivotOffset,
							@Const @ByRef btVector3 thisPivotToThisComOffset,
							@Cast("bool") boolean disableParentCollision/*=false*/);
	public native void setupSpherical(int i,
							@Cast("btScalar") double mass,
							@Const @ByRef btVector3 inertia,
							int parent,
							@Const @ByRef btQuaternion rotParentToThis,
							@Const @ByRef btVector3 parentComToThisPivotOffset,
							@Const @ByRef btVector3 thisPivotToThisComOffset);

	public native void setupPlanar(int i,
						 @Cast("btScalar") double mass,
						 @Const @ByRef btVector3 inertia,
						 int parent,
						 @Const @ByRef btQuaternion rotParentToThis,
						 @Const @ByRef btVector3 rotationAxis,
						 @Const @ByRef btVector3 parentComToThisComOffset,
						 @Cast("bool") boolean disableParentCollision/*=false*/);
	public native void setupPlanar(int i,
						 @Cast("btScalar") double mass,
						 @Const @ByRef btVector3 inertia,
						 int parent,
						 @Const @ByRef btQuaternion rotParentToThis,
						 @Const @ByRef btVector3 rotationAxis,
						 @Const @ByRef btVector3 parentComToThisComOffset);

	public native @ByRef btMultibodyLink getLink(int index);

	public native void setBaseCollider(btMultiBodyLinkCollider collider);
	public native btMultiBodyLinkCollider getBaseCollider();

	public native btMultiBodyLinkCollider getLinkCollider(int index);

	//
	// get parent
	// input: link num from 0 to num_links-1
	// output: link num from 0 to num_links-1, OR -1 to mean the base.
	//
	public native int getParent(int link_num);

	//
	// get number of m_links, masses, moments of inertia
	//

	public native int getNumLinks();
	public native int getNumDofs();
	public native int getNumPosVars();
	public native @Cast("btScalar") double getBaseMass();
	public native @Const @ByRef btVector3 getBaseInertia();
	public native @Cast("btScalar") double getLinkMass(int i);
	public native @Const @ByRef btVector3 getLinkInertia(int i);

	//
	// change mass (incomplete: can only change base mass and inertia at present)
	//

	public native void setBaseMass(@Cast("btScalar") double mass);
	public native void setBaseInertia(@Const @ByRef btVector3 inertia);

	//
	// get/set pos/vel/rot/omega for the base link
	//

	public native @Const @ByRef btVector3 getBasePos();  // in world frame
	public native @Const @ByVal btVector3 getBaseVel();  // in world frame
	public native @Const @ByRef btQuaternion getWorldToBaseRot();
    
    public native @Const @ByRef btVector3 getInterpolateBasePos();  // in world frame
    public native @Const @ByRef btQuaternion getInterpolateWorldToBaseRot();
    
    // rotates world vectors into base frame
	public native @ByVal btVector3 getBaseOmega();  // in world frame

	public native void setBasePos(@Const @ByRef btVector3 pos);

	public native void setInterpolateBasePos(@Const @ByRef btVector3 pos);

	public native void setBaseWorldTransform(@Const @ByRef btTransform tr);

	public native @ByVal btTransform getBaseWorldTransform();

	public native void setInterpolateBaseWorldTransform(@Const @ByRef btTransform tr);

	public native @ByVal btTransform getInterpolateBaseWorldTransform();

	public native void setBaseVel(@Const @ByRef btVector3 vel);

	public native void setWorldToBaseRot(@Const @ByRef btQuaternion rot);

	public native void setInterpolateWorldToBaseRot(@Const @ByRef btQuaternion rot);

	public native void setBaseOmega(@Const @ByRef btVector3 omega);

	public native void saveKinematicState(@Cast("btScalar") double timeStep);

	//
	// get/set pos/vel for child m_links (i = 0 to num_links-1)
	//

	public native @Cast("btScalar") double getJointPos(int i);
	public native @Cast("btScalar") double getJointVel(int i);

	public native @Cast("btScalar*") DoublePointer getJointVelMultiDof(int i);
	public native @Cast("btScalar*") DoublePointer getJointPosMultiDof(int i);

	public native void setJointPos(int i, @Cast("btScalar") double q);
	public native void setJointVel(int i, @Cast("btScalar") double qdot);
	public native void setJointPosMultiDof(int i, @Const DoublePointer q);
	public native void setJointPosMultiDof(int i, @Const DoubleBuffer q);
	public native void setJointPosMultiDof(int i, @Const double[] q);
	public native void setJointVelMultiDof(int i, @Const DoublePointer qdot);
	public native void setJointVelMultiDof(int i, @Const DoubleBuffer qdot);
	public native void setJointVelMultiDof(int i, @Const double[] qdot);
	public native void setJointPosMultiDof(int i, @Const FloatPointer q);
	public native void setJointPosMultiDof(int i, @Const FloatBuffer q);
	public native void setJointPosMultiDof(int i, @Const float[] q);
	public native void setJointVelMultiDof(int i, @Const FloatPointer qdot);
	public native void setJointVelMultiDof(int i, @Const FloatBuffer qdot);
	public native void setJointVelMultiDof(int i, @Const float[] qdot);

	//
	// direct access to velocities as a vector of 6 + num_links elements.
	// (omega first, then v, then joint velocities.)
	//
	public native @Cast("const btScalar*") DoublePointer getVelocityVector();
    
    public native @Cast("const btScalar*") DoublePointer getDeltaVelocityVector();
    
    public native @Cast("const btScalar*") DoublePointer getSplitVelocityVector();
	/*    btScalar * getVelocityVector() 
	{ 
		return &real_buf[0]; 
	}
  */

	//
	// get the frames of reference (positions and orientations) of the child m_links
	// (i = 0 to num_links-1)
	//

	public native @Const @ByRef btVector3 getRVector(int i);              // vector from COM(parent(i)) to COM(i), in frame i's coords
	public native @Const @ByRef btQuaternion getParentToLocalRot(int i);  // rotates vectors in frame parent(i) to vectors in frame i.
    public native @Const @ByRef btVector3 getInterpolateRVector(int i);              // vector from COM(parent(i)) to COM(i), in frame i's coords
    public native @Const @ByRef btQuaternion getInterpolateParentToLocalRot(int i);  // rotates vectors in frame parent(i) to vectors in frame i.

	//
	// transform vectors in local frame of link i to world frame (or vice versa)
	//
	public native @ByVal btVector3 localPosToWorld(int i, @Const @ByRef btVector3 local_pos);
	public native @ByVal btVector3 localDirToWorld(int i, @Const @ByRef btVector3 local_dir);
	public native @ByVal btVector3 worldPosToLocal(int i, @Const @ByRef btVector3 world_pos);
	public native @ByVal btVector3 worldDirToLocal(int i, @Const @ByRef btVector3 world_dir);

	//
	// transform a frame in local coordinate to a frame in world coordinate
	//
	public native @ByVal btMatrix3x3 localFrameToWorld(int i, @Const @ByRef btMatrix3x3 local_frame);


	//
	// set external forces and torques. Note all external forces/torques are given in the WORLD frame.
	//

	public native void clearForcesAndTorques();
	public native void clearConstraintForces();

	public native void clearVelocities();

	public native void addBaseForce(@Const @ByRef btVector3 f);
	public native void addBaseTorque(@Const @ByRef btVector3 t);
	public native void addLinkForce(int i, @Const @ByRef btVector3 f);
	public native void addLinkTorque(int i, @Const @ByRef btVector3 t);

	public native void addBaseConstraintForce(@Const @ByRef btVector3 f);
	public native void addBaseConstraintTorque(@Const @ByRef btVector3 t);
	public native void addLinkConstraintForce(int i, @Const @ByRef btVector3 f);
	public native void addLinkConstraintTorque(int i, @Const @ByRef btVector3 t);

	public native void addJointTorque(int i, @Cast("btScalar") double Q);
	public native void addJointTorqueMultiDof(int i, int dof, @Cast("btScalar") double Q);
	public native void addJointTorqueMultiDof(int i, @Cast("const btScalar*") DoublePointer Q);
	public native void addJointTorqueMultiDof(int i, @Cast("const btScalar*") DoubleBuffer Q);
	public native void addJointTorqueMultiDof(int i, @Cast("const btScalar*") double[] Q);

	public native @Const @ByRef btVector3 getBaseForce();
	public native @Const @ByRef btVector3 getBaseTorque();
	public native @Const @ByRef btVector3 getLinkForce(int i);
	public native @Const @ByRef btVector3 getLinkTorque(int i);
	public native @Cast("btScalar") double getJointTorque(int i);
	public native @Cast("btScalar*") DoublePointer getJointTorqueMultiDof(int i);

	//
	// dynamics routines.
	//

	// timestep the velocities (given the external forces/torques set using addBaseForce etc).
	// also sets up caches for calcAccelerationDeltas.
	//
	// Note: the caller must provide three vectors which are used as
	// temporary scratch space. The idea here is to reduce dynamic
	// memory allocation: the same scratch vectors can be re-used
	// again and again for different Multibodies, instead of each
	// btMultiBody allocating (and then deallocating) their own
	// individual scratch buffers. This gives a considerable speed
	// improvement, at least on Windows (where dynamic memory
	// allocation appears to be fairly slow).
	//

	public native void computeAccelerationsArticulatedBodyAlgorithmMultiDof(@Cast("btScalar") double dt,
																  @ByRef btScalarArray scratch_r,
																  @ByRef btVector3Array scratch_v,
																  @ByRef btMatrix3x3Array scratch_m,
																  @Cast("bool") boolean isConstraintPass,
	                                                              @Cast("bool") boolean jointFeedbackInWorldSpace,
	                                                              @Cast("bool") boolean jointFeedbackInJointFrame
	                                                              );

	/**stepVelocitiesMultiDof is deprecated, use computeAccelerationsArticulatedBodyAlgorithmMultiDof instead */
	//void stepVelocitiesMultiDof(btScalar dt,
	//							btAlignedObjectArray<btScalar> & scratch_r,
	//							btAlignedObjectArray<btVector3> & scratch_v,
	//							btAlignedObjectArray<btMatrix3x3> & scratch_m,
	//							bool isConstraintPass = false)
	//{
	//	computeAccelerationsArticulatedBodyAlgorithmMultiDof(dt, scratch_r, scratch_v, scratch_m, isConstraintPass, false, false);
	//}

	// calcAccelerationDeltasMultiDof
	// input: force vector (in same format as jacobian, i.e.:
	//                      3 torque values, 3 force values, num_links joint torque values)
	// output: 3 omegadot values, 3 vdot values, num_links q_double_dot values
	// (existing contents of output array are replaced)
	// calcAccelerationDeltasMultiDof must have been called first.
	public native void calcAccelerationDeltasMultiDof(@Cast("const btScalar*") DoublePointer force, @Cast("btScalar*") DoublePointer output,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v);
	public native void calcAccelerationDeltasMultiDof(@Cast("const btScalar*") DoubleBuffer force, @Cast("btScalar*") DoubleBuffer output,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v);
	public native void calcAccelerationDeltasMultiDof(@Cast("const btScalar*") double[] force, @Cast("btScalar*") double[] output,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v);

	public native void applyDeltaVeeMultiDof2(@Cast("const btScalar*") DoublePointer delta_vee, @Cast("btScalar") double multiplier);
	public native void applyDeltaVeeMultiDof2(@Cast("const btScalar*") DoubleBuffer delta_vee, @Cast("btScalar") double multiplier);
	public native void applyDeltaVeeMultiDof2(@Cast("const btScalar*") double[] delta_vee, @Cast("btScalar") double multiplier);
    public native void applyDeltaSplitVeeMultiDof(@Cast("const btScalar*") DoublePointer delta_vee, @Cast("btScalar") double multiplier);
    public native void applyDeltaSplitVeeMultiDof(@Cast("const btScalar*") DoubleBuffer delta_vee, @Cast("btScalar") double multiplier);
    public native void applyDeltaSplitVeeMultiDof(@Cast("const btScalar*") double[] delta_vee, @Cast("btScalar") double multiplier);
    public native void addSplitV();
    public native void substractSplitV();
	public native void processDeltaVeeMultiDof2();

	public native void applyDeltaVeeMultiDof(@Cast("const btScalar*") DoublePointer delta_vee, @Cast("btScalar") double multiplier);
	public native void applyDeltaVeeMultiDof(@Cast("const btScalar*") DoubleBuffer delta_vee, @Cast("btScalar") double multiplier);
	public native void applyDeltaVeeMultiDof(@Cast("const btScalar*") double[] delta_vee, @Cast("btScalar") double multiplier);

	// timestep the positions (given current velocities).
	public native void stepPositionsMultiDof(@Cast("btScalar") double dt, @Cast("btScalar*") DoublePointer pq/*=0*/, @Cast("btScalar*") DoublePointer pqd/*=0*/);
	public native void stepPositionsMultiDof(@Cast("btScalar") double dt);
	public native void stepPositionsMultiDof(@Cast("btScalar") double dt, @Cast("btScalar*") DoubleBuffer pq/*=0*/, @Cast("btScalar*") DoubleBuffer pqd/*=0*/);
	public native void stepPositionsMultiDof(@Cast("btScalar") double dt, @Cast("btScalar*") double[] pq/*=0*/, @Cast("btScalar*") double[] pqd/*=0*/);
    
    // predict the positions
    public native void predictPositionsMultiDof(@Cast("btScalar") double dt);

	//
	// contacts
	//

	// This routine fills out a contact constraint jacobian for this body.
	// the 'normal' supplied must be -n for body1 or +n for body2 of the contact.
	// 'normal' & 'contact_point' are both given in world coordinates.

	public native void fillContactJacobianMultiDof(int link,
										 @Const @ByRef btVector3 contact_point,
										 @Const @ByRef btVector3 normal,
										 @Cast("btScalar*") DoublePointer jac,
										 @ByRef btScalarArray scratch_r,
										 @ByRef btVector3Array scratch_v,
										 @ByRef btMatrix3x3Array scratch_m);
	public native void fillContactJacobianMultiDof(int link,
										 @Const @ByRef btVector3 contact_point,
										 @Const @ByRef btVector3 normal,
										 @Cast("btScalar*") DoubleBuffer jac,
										 @ByRef btScalarArray scratch_r,
										 @ByRef btVector3Array scratch_v,
										 @ByRef btMatrix3x3Array scratch_m);
	public native void fillContactJacobianMultiDof(int link,
										 @Const @ByRef btVector3 contact_point,
										 @Const @ByRef btVector3 normal,
										 @Cast("btScalar*") double[] jac,
										 @ByRef btScalarArray scratch_r,
										 @ByRef btVector3Array scratch_v,
										 @ByRef btMatrix3x3Array scratch_m);

	//a more general version of fillContactJacobianMultiDof which does not assume..
	//.. that the constraint in question is contact or, to be more precise, constrains linear velocity only
	public native void fillConstraintJacobianMultiDof(int link,
											@Const @ByRef btVector3 contact_point,
											@Const @ByRef btVector3 normal_ang,
											@Const @ByRef btVector3 normal_lin,
											@Cast("btScalar*") DoublePointer jac,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v,
											@ByRef btMatrix3x3Array scratch_m);
	public native void fillConstraintJacobianMultiDof(int link,
											@Const @ByRef btVector3 contact_point,
											@Const @ByRef btVector3 normal_ang,
											@Const @ByRef btVector3 normal_lin,
											@Cast("btScalar*") DoubleBuffer jac,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v,
											@ByRef btMatrix3x3Array scratch_m);
	public native void fillConstraintJacobianMultiDof(int link,
											@Const @ByRef btVector3 contact_point,
											@Const @ByRef btVector3 normal_ang,
											@Const @ByRef btVector3 normal_lin,
											@Cast("btScalar*") double[] jac,
											@ByRef btScalarArray scratch_r,
											@ByRef btVector3Array scratch_v,
											@ByRef btMatrix3x3Array scratch_m);

	//
	// sleeping
	//
	public native void setCanSleep(@Cast("bool") boolean canSleep);

	public native @Cast("bool") boolean getCanSleep();

	public native @Cast("bool") boolean getCanWakeup();
	
	public native void setCanWakeup(@Cast("bool") boolean canWakeup);
	public native @Cast("bool") boolean isAwake();
	public native void wakeUp();
	public native void goToSleep();
	public native void checkMotionAndSleepIfRequired(@Cast("btScalar") double timestep);

	public native @Cast("bool") boolean hasFixedBase();

	public native @Cast("bool") boolean isBaseKinematic();

	public native @Cast("bool") boolean isBaseStaticOrKinematic();

	// set the dynamic type in the base's collision flags.
	public native void setBaseDynamicType(int dynamicType);

	public native void setFixedBase(@Cast("bool") boolean fixedBase);

	public native int getCompanionId();
	public native void setCompanionId(int id);

	public native void setNumLinks(int numLinks);

	public native @Cast("btScalar") double getLinearDamping();
	public native void setLinearDamping(@Cast("btScalar") double damp);
	public native @Cast("btScalar") double getAngularDamping();
	public native void setAngularDamping(@Cast("btScalar") double damp);

	public native @Cast("bool") boolean getUseGyroTerm();
	public native void setUseGyroTerm(@Cast("bool") boolean useGyro);
	public native @Cast("btScalar") double getMaxCoordinateVelocity();
	public native void setMaxCoordinateVelocity(@Cast("btScalar") double maxVel);

	public native @Cast("btScalar") double getMaxAppliedImpulse();
	public native void setMaxAppliedImpulse(@Cast("btScalar") double maxImp);
	public native void setHasSelfCollision(@Cast("bool") boolean hasSelfCollision);
	public native @Cast("bool") boolean hasSelfCollision();

	public native void finalizeMultiDof();

	public native void useRK4Integration(@Cast("bool") boolean use);
	public native @Cast("bool") boolean isUsingRK4Integration();
	public native void useGlobalVelocities(@Cast("bool") boolean use);
	public native @Cast("bool") boolean isUsingGlobalVelocities();

	public native @Cast("bool") boolean isPosUpdated();
	public native void setPosUpdated(@Cast("bool") boolean updated);

	//internalNeedsJointFeedback is for internal use only
	public native @Cast("bool") boolean internalNeedsJointFeedback();
	public native void forwardKinematics(@ByRef btQuaternionArray world_to_local, @ByRef btVector3Array local_origin);

	public native void compTreeLinkVelocities(btVector3 omega, btVector3 vel);

	public native void updateCollisionObjectWorldTransforms(@ByRef btQuaternionArray world_to_local, @ByRef btVector3Array local_origin);
    public native void updateCollisionObjectInterpolationWorldTransforms(@ByRef btQuaternionArray world_to_local, @ByRef btVector3Array local_origin);

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native @Cast("const char*") BytePointer getBaseName();
	/**memory of setBaseName needs to be manager by user */
	public native void setBaseName(@Cast("const char*") BytePointer name);
	public native void setBaseName(String name);

	/**users can point to their objects, userPointer is not used by Bullet */
	public native Pointer getUserPointer();

	public native int getUserIndex();

	public native int getUserIndex2();
	/**users can point to their objects, userPointer is not used by Bullet */
	public native void setUserPointer(Pointer userPointer);

	/**users can point to their objects, userPointer is not used by Bullet */
	public native void setUserIndex(int index);

	public native void setUserIndex2(int index);

	public static native void spatialTransform(@Const @ByRef btMatrix3x3 rotation_matrix,
			@Const @ByRef btVector3 displacement,
			@Const @ByRef btVector3 top_in,
			@Const @ByRef btVector3 bottom_in,
			@ByRef btVector3 top_out,
			@ByRef btVector3 bottom_out);      // bottom part of output vector

	public native void setLinkDynamicType(int i, int type);

	public native @Cast("bool") boolean isLinkStaticOrKinematic(int i);

	public native @Cast("bool") boolean isLinkKinematic(int i);

	public native @Cast("bool") boolean isLinkAndAllAncestorsStaticOrKinematic(int i);

	public native @Cast("bool") boolean isLinkAndAllAncestorsKinematic(int i);

	public native void setSleepThreshold(@Cast("btScalar") double sleepThreshold);

	public native void setSleepTimeout(@Cast("btScalar") double sleepTimeout);
}
