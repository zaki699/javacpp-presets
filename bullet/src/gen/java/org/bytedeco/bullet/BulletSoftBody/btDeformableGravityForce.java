// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableGravityForce extends btDeformableLagrangianForce {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableGravityForce(Pointer p) { super(p); }

	public native @ByRef btVector3 m_gravity(); public native btDeformableGravityForce m_gravity(btVector3 setter);

	public btDeformableGravityForce(@Const @ByRef btVector3 g) { super((Pointer)null); allocate(g); }
	private native void allocate(@Const @ByRef btVector3 g);

	public native void addScaledForces(@Cast("btScalar") double scale, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledExplicitForce(@Cast("btScalar") double scale, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledDampingForce(@Cast("btScalar") double scale, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledElasticForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableGravityForce::TVStack*") @ByRef btVector3Array dx, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array df);

	public native void addScaledDampingForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableGravityForce::TVStack*") @ByRef btVector3Array dv, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array df);

	public native void buildDampingForceDifferentialDiagonal(@Cast("btScalar") double scale, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array diagA);

	public native void addScaledGravityForce(@Cast("btScalar") double scale, @Cast("btDeformableGravityForce::TVStack*") @ByRef btVector3Array force);

	public native @Cast("btDeformableLagrangianForceType") int getForceType();

	// the gravitational potential energy
	public native double totalEnergy(@Cast("btScalar") double dt);
}
