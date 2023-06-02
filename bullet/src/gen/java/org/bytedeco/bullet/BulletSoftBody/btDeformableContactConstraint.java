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


// btDeformableContactConstraint is an abstract class specifying the method that each type of contact constraint needs to implement
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableContactConstraint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableContactConstraint(Pointer p) { super(p); }

	// True if the friction is static
	// False if the friction is dynamic
	public native @Cast("bool") boolean m_static(); public native btDeformableContactConstraint m_static(boolean setter);
	public native @Const btContactSolverInfo m_infoGlobal(); public native btDeformableContactConstraint m_infoGlobal(btContactSolverInfo setter);

	// normal of the contact
	public native @ByRef btVector3 m_normal(); public native btDeformableContactConstraint m_normal(btVector3 setter);

	// solve the constraint with inelastic impulse and return the error, which is the square of normal component of velocity diffrerence
	// the constraint is solved by calculating the impulse between object A and B in the contact and apply the impulse to both objects involved in the contact
	public native @Cast("btScalar") double solveConstraint(@Const @ByRef btContactSolverInfo infoGlobal);

	// get the velocity of the object A in the contact
	public native @ByVal btVector3 getVa();

	// get the velocity of the object B in the contact
	public native @ByVal btVector3 getVb();

	// get the velocity change of the soft body node in the constraint
	public native @ByVal btVector3 getDv(@Const btSoftBody.Node arg0);

	// apply impulse to the soft body node and/or face involved
	public native void applyImpulse(@Const @ByRef btVector3 impulse);

	// scale the penetration depth by erp
	public native void setPenetrationScale(@Cast("btScalar") double scale);
}
