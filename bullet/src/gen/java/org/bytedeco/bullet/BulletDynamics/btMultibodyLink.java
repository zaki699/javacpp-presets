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


//}

//
// Link struct
//

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultibodyLink extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultibodyLink(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMultibodyLink(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btMultibodyLink position(long position) {
        return (btMultibodyLink)super.position(position);
    }
    @Override public btMultibodyLink getPointer(long i) {
        return new btMultibodyLink((Pointer)this).offsetAddress(i);
    }


	public native @Cast("btScalar") double m_mass(); public native btMultibodyLink m_mass(double setter);           // mass of link
	public native @ByRef btVector3 m_inertiaLocal(); public native btMultibodyLink m_inertiaLocal(btVector3 setter);  // inertia of link (local frame; diagonal)

	public native int m_parent(); public native btMultibodyLink m_parent(int setter);  // index of the parent link (assumed to be < index of this link), or -1 if parent is the base link.

	public native @ByRef btQuaternion m_zeroRotParentToThis(); public native btMultibodyLink m_zeroRotParentToThis(btQuaternion setter);  // rotates vectors in parent-frame to vectors in local-frame (when q=0). constant.

	public native @ByRef btVector3 m_dVector(); public native btMultibodyLink m_dVector(btVector3 setter);  // vector from the inboard joint pos to this link's COM. (local frame.) constant.
						  //this is set to zero for planar joint (see also m_eVector comment)

	// m_eVector is constant, but depends on the joint type:
	// revolute, fixed, prismatic, spherical: vector from parent's COM to the pivot point, in PARENT's frame.
	// planar: vector from COM of parent to COM of this link, WHEN Q = 0. (local frame.)
	// todo: fix the planar so it is consistent with the other joints

	public native @ByRef btVector3 m_eVector(); public native btMultibodyLink m_eVector(btVector3 setter);

	public native @ByRef btSpatialMotionVector m_absFrameTotVelocity(); public native btMultibodyLink m_absFrameTotVelocity(btSpatialMotionVector setter);
	public native @ByRef btSpatialMotionVector m_absFrameLocVelocity(); public native btMultibodyLink m_absFrameLocVelocity(btSpatialMotionVector setter);

	/** enum btMultibodyLink::eFeatherstoneJointType */
	public static final int
		eRevolute = 0,
		ePrismatic = 1,
		eSpherical = 2,
		ePlanar = 3,
		eFixed = 4,
		eInvalid = 5;

	// "axis" = spatial joint axis (Mirtich Defn 9 p104). (expressed in local frame.) constant.
	// for prismatic: m_axesTop[0] = zero;
	//                m_axesBottom[0] = unit vector along the joint axis.
	// for revolute: m_axesTop[0] = unit vector along the rotation axis (u);
	//               m_axesBottom[0] = u cross m_dVector (i.e. COM linear motion due to the rotation at the joint)
	//
	// for spherical: m_axesTop[0][1][2] (u1,u2,u3) form a 3x3 identity matrix (3 rotation axes)
	//				  m_axesBottom[0][1][2] cross u1,u2,u3 (i.e. COM linear motion due to the rotation at the joint)
	//
	// for planar: m_axesTop[0] = unit vector along the rotation axis (u); defines the plane of motion
	//			   m_axesTop[1][2] = zero
	//			   m_axesBottom[0] = zero
	//			   m_axesBottom[1][2] = unit vectors along the translational axes on that plane
	public native @ByRef btSpatialMotionVector m_axes(int i); public native btMultibodyLink m_axes(int i, btSpatialMotionVector setter);
	@MemberGetter public native btSpatialMotionVector m_axes();
	public native void setAxisTop(int dof, @Const @ByRef btVector3 axis);
	public native void setAxisBottom(int dof, @Const @ByRef btVector3 axis);
	public native void setAxisTop(int dof, @Cast("const btScalar") double x, @Cast("const btScalar") double y, @Cast("const btScalar") double z);
	public native void setAxisBottom(int dof, @Cast("const btScalar") double x, @Cast("const btScalar") double y, @Cast("const btScalar") double z);
	public native @Const @ByRef btVector3 getAxisTop(int dof);
	public native @Const @ByRef btVector3 getAxisBottom(int dof);

	public native int m_dofOffset(); public native btMultibodyLink m_dofOffset(int setter);
	public native int m_cfgOffset(); public native btMultibodyLink m_cfgOffset(int setter);

	public native @ByRef btQuaternion m_cachedRotParentToThis(); public native btMultibodyLink m_cachedRotParentToThis(btQuaternion setter);  // rotates vectors in parent frame to vectors in local frame
	public native @ByRef btVector3 m_cachedRVector(); public native btMultibodyLink m_cachedRVector(btVector3 setter);             // vector from COM of parent to COM of this link, in local frame.
    
    // predicted verstion
    public native @ByRef btQuaternion m_cachedRotParentToThis_interpolate(); public native btMultibodyLink m_cachedRotParentToThis_interpolate(btQuaternion setter);  // rotates vectors in parent frame to vectors in local frame
    public native @ByRef btVector3 m_cachedRVector_interpolate(); public native btMultibodyLink m_cachedRVector_interpolate(btVector3 setter);             // vector from COM of parent to COM of this link, in local frame.

	public native @ByRef btVector3 m_appliedForce(); public native btMultibodyLink m_appliedForce(btVector3 setter);   // In WORLD frame
	public native @ByRef btVector3 m_appliedTorque(); public native btMultibodyLink m_appliedTorque(btVector3 setter);  // In WORLD frame

	public native @ByRef btVector3 m_appliedConstraintForce(); public native btMultibodyLink m_appliedConstraintForce(btVector3 setter);   // In WORLD frame
	public native @ByRef btVector3 m_appliedConstraintTorque(); public native btMultibodyLink m_appliedConstraintTorque(btVector3 setter);  // In WORLD frame

	public native @Cast("btScalar") double m_jointPos(int i); public native btMultibodyLink m_jointPos(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_jointPos();
    public native @Cast("btScalar") double m_jointPos_interpolate(int i); public native btMultibodyLink m_jointPos_interpolate(int i, double setter);
    @MemberGetter public native @Cast("btScalar*") DoublePointer m_jointPos_interpolate();

	//m_jointTorque is the joint torque applied by the user using 'addJointTorque'.
	//It gets set to zero after each internal stepSimulation call
	public native @Cast("btScalar") double m_jointTorque(int i); public native btMultibodyLink m_jointTorque(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_jointTorque();

	public native btMultiBodyLinkCollider m_collider(); public native btMultibodyLink m_collider(btMultiBodyLinkCollider setter);
	public native int m_flags(); public native btMultibodyLink m_flags(int setter);

	public native int m_dofCount(); public native btMultibodyLink m_dofCount(int setter);
	public native int m_posVarCount(); public native btMultibodyLink m_posVarCount(int setter);  //redundant but handy

	public native @Cast("btMultibodyLink::eFeatherstoneJointType") int m_jointType(); public native btMultibodyLink m_jointType(int setter);

	public native btMultiBodyJointFeedback m_jointFeedback(); public native btMultibodyLink m_jointFeedback(btMultiBodyJointFeedback setter);

	public native @ByRef btTransform m_cachedWorldTransform(); public native btMultibodyLink m_cachedWorldTransform(btTransform setter);  //this cache is updated when calling btMultiBody::forwardKinematics

	public native @Cast("const char*") BytePointer m_linkName(); public native btMultibodyLink m_linkName(BytePointer setter);   //m_linkName memory needs to be managed by the developer/user!
	public native @Cast("const char*") BytePointer m_jointName(); public native btMultibodyLink m_jointName(BytePointer setter);  //m_jointName memory needs to be managed by the developer/user!
	public native @Const Pointer m_userPtr(); public native btMultibodyLink m_userPtr(Pointer setter);    //m_userPtr ptr needs to be managed by the developer/user!

	public native @Cast("btScalar") double m_jointDamping(); public native btMultibodyLink m_jointDamping(double setter);      //todo: implement this internally. It is unused for now, it is set by a URDF loader. User can apply manual damping.
	public native @Cast("btScalar") double m_jointFriction(); public native btMultibodyLink m_jointFriction(double setter);     //todo: implement this internally. It is unused for now, it is set by a URDF loader. User can apply manual friction using a velocity motor.
	public native @Cast("btScalar") double m_jointLowerLimit(); public native btMultibodyLink m_jointLowerLimit(double setter);   //todo: implement this internally. It is unused for now, it is set by a URDF loader.
	public native @Cast("btScalar") double m_jointUpperLimit(); public native btMultibodyLink m_jointUpperLimit(double setter);   //todo: implement this internally. It is unused for now, it is set by a URDF loader.
	public native @Cast("btScalar") double m_jointMaxForce(); public native btMultibodyLink m_jointMaxForce(double setter);     //todo: implement this internally. It is unused for now, it is set by a URDF loader.
	public native @Cast("btScalar") double m_jointMaxVelocity(); public native btMultibodyLink m_jointMaxVelocity(double setter);  //todo: implement this internally. It is unused for now, it is set by a URDF loader.

	// ctor: set some sensible defaults
	public btMultibodyLink() { super((Pointer)null); allocate(); }
	private native void allocate();

	// routine to update m_cachedRotParentToThis and m_cachedRVector
	public native void updateCacheMultiDof(@Cast("btScalar*") DoublePointer pq/*=0*/);
	public native void updateCacheMultiDof();
	public native void updateCacheMultiDof(@Cast("btScalar*") DoubleBuffer pq/*=0*/);
	public native void updateCacheMultiDof(@Cast("btScalar*") double[] pq/*=0*/);
    
    public native void updateInterpolationCacheMultiDof();

 

}
