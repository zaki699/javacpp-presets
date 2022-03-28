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


/** constraint class used for lateral tyre friction. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSolve2LinearConstraint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSolve2LinearConstraint(Pointer p) { super(p); }

	public btSolve2LinearConstraint(@Cast("btScalar") float tau, @Cast("btScalar") float damping) { super((Pointer)null); allocate(tau, damping); }
	private native void allocate(@Cast("btScalar") float tau, @Cast("btScalar") float damping);
	//
	// solve unilateral constraint (equality, direct method)
	//
	public native void resolveUnilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
	
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef FloatPointer imp0, @Cast("btScalar*") @ByRef FloatPointer imp1);
	public native void resolveUnilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
	
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef FloatBuffer imp0, @Cast("btScalar*") @ByRef FloatBuffer imp1);
	public native void resolveUnilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
	
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef float[] imp0, @Cast("btScalar*") @ByRef float[] imp1);

	//
	// solving 2x2 lcp problem (inequality, direct solution )
	//
	public native void resolveBilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef FloatPointer imp0, @Cast("btScalar*") @ByRef FloatPointer imp1);
	public native void resolveBilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef FloatBuffer imp0, @Cast("btScalar*") @ByRef FloatBuffer imp1);
	public native void resolveBilateralPairConstraint(
			btRigidBody body0,
			btRigidBody body1,
			@Const @ByRef btMatrix3x3 world2A,
			@Const @ByRef btMatrix3x3 world2B,
	
			@Const @ByRef btVector3 invInertiaADiag,
			@Cast("const btScalar") float invMassA,
			@Const @ByRef btVector3 linvelA, @Const @ByRef btVector3 angvelA,
			@Const @ByRef btVector3 rel_posA1,
			@Const @ByRef btVector3 invInertiaBDiag,
			@Cast("const btScalar") float invMassB,
			@Const @ByRef btVector3 linvelB, @Const @ByRef btVector3 angvelB,
			@Const @ByRef btVector3 rel_posA2,
	
			@Cast("btScalar") float depthA, @Const @ByRef btVector3 normalA,
			@Const @ByRef btVector3 rel_posB1, @Const @ByRef btVector3 rel_posB2,
			@Cast("btScalar") float depthB, @Const @ByRef btVector3 normalB,
			@Cast("btScalar*") @ByRef float[] imp0, @Cast("btScalar*") @ByRef float[] imp1);

	/*
	void resolveAngularConstraint(	const btMatrix3x3& invInertiaAWS,
						const btScalar invMassA,
						const btVector3& linvelA,const btVector3& angvelA,
						const btVector3& rel_posA1,
						const btMatrix3x3& invInertiaBWS,
						const btScalar invMassB,
						const btVector3& linvelB,const btVector3& angvelB,
						const btVector3& rel_posA2,

					  btScalar depthA, const btVector3& normalA, 
					  const btVector3& rel_posB1,const btVector3& rel_posB2,
					  btScalar depthB, const btVector3& normalB, 
					  btScalar& imp0,btScalar& imp1);

*/
}
