// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
public class btDeformableLinearElasticityForce extends btDeformableLagrangianForce {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableLinearElasticityForce(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableLinearElasticityForce(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableLinearElasticityForce position(long position) {
        return (btDeformableLinearElasticityForce)super.position(position);
    }
    @Override public btDeformableLinearElasticityForce getPointer(long i) {
        return new btDeformableLinearElasticityForce((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_mu(); public native btDeformableLinearElasticityForce m_mu(double setter);
	public native @Cast("btScalar") double m_lambda(); public native btDeformableLinearElasticityForce m_lambda(double setter);
	public native @Cast("btScalar") double m_E(); public native btDeformableLinearElasticityForce m_E(double setter);
	public native @Cast("btScalar") double m_nu(); public native btDeformableLinearElasticityForce m_nu(double setter);  // Young's modulus and Poisson ratio
	public native @Cast("btScalar") double m_damping_alpha(); public native btDeformableLinearElasticityForce m_damping_alpha(double setter);
	public native @Cast("btScalar") double m_damping_beta(); public native btDeformableLinearElasticityForce m_damping_beta(double setter);
	public btDeformableLinearElasticityForce() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btDeformableLinearElasticityForce(@Cast("btScalar") double mu, @Cast("btScalar") double lambda, @Cast("btScalar") double damping_alpha/*=0.01*/, @Cast("btScalar") double damping_beta/*=0.01*/) { super((Pointer)null); allocate(mu, lambda, damping_alpha, damping_beta); }
	private native void allocate(@Cast("btScalar") double mu, @Cast("btScalar") double lambda, @Cast("btScalar") double damping_alpha/*=0.01*/, @Cast("btScalar") double damping_beta/*=0.01*/);
	public btDeformableLinearElasticityForce(@Cast("btScalar") double mu, @Cast("btScalar") double lambda) { super((Pointer)null); allocate(mu, lambda); }
	private native void allocate(@Cast("btScalar") double mu, @Cast("btScalar") double lambda);

	public native void updateYoungsModulusAndPoissonRatio();

	public native void updateLameParameters();

	public native void setYoungsModulus(@Cast("btScalar") double E);

	public native void setPoissonRatio(@Cast("btScalar") double nu);

	public native void setDamping(@Cast("btScalar") double damping_alpha, @Cast("btScalar") double damping_beta);

	public native void setLameParameters(@Cast("btScalar") double mu, @Cast("btScalar") double lambda);

	public native void addScaledForces(@Cast("btScalar") double scale, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledExplicitForce(@Cast("btScalar") double scale, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array force);

	// The damping matrix is calculated using the time n state as described in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native void addScaledDampingForce(@Cast("btScalar") double scale, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array force);

	public native double totalElasticEnergy(@Cast("btScalar") double dt);

	// The damping energy is formulated as in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native double totalDampingEnergy(@Cast("btScalar") double dt);

	public native double elasticEnergyDensity(@Const @ByRef btSoftBody.TetraScratch s);

	public native void addScaledElasticForce(@Cast("btScalar") double scale, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array force);

	public native void buildDampingForceDifferentialDiagonal(@Cast("btScalar") double scale, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array diagA);

	// The damping matrix is calculated using the time n state as described in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native void addScaledDampingForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array dv, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array df);

	public native void addScaledElasticForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array dx, @Cast("btDeformableLinearElasticityForce::TVStack*") @ByRef btVector3Array df);

	public native void firstPiola(@Const @ByRef btSoftBody.TetraScratch s, @ByRef btMatrix3x3 P);

	// Let P be the first piola stress.
	// This function calculates the dP = dP/dF * dF
	public native void firstPiolaDifferential(@Const @ByRef btSoftBody.TetraScratch s, @Const @ByRef btMatrix3x3 dF, @ByRef btMatrix3x3 dP);

	// Let Q be the damping stress.
	// This function calculates the dP = dQ/dF * dF
	public native void firstPiolaDampingDifferential(@Const @ByRef btSoftBody.TetraScratch s, @Const @ByRef btMatrix3x3 dF, @ByRef btMatrix3x3 dP);

	public native void addScaledHessian(@Cast("btScalar") double scale);

	public native @Cast("btDeformableLagrangianForceType") int getForceType();
}
