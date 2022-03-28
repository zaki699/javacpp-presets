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


/** Constraint similar to ODE Universal Joint
 *  has 2 rotatioonal degrees of freedom, similar to Euler rotations around Z (axis 1)
 *  and Y (axis 2)
 *  Description from ODE manual :
 *  "Given axis 1 on body 1, and axis 2 on body 2 that is perpendicular to axis 1, it keeps them perpendicular.
 *  In other words, rotation of the two bodies about the direction perpendicular to the two axes will be equal." */

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btUniversalConstraint extends btGeneric6DofConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btUniversalConstraint(Pointer p) { super(p); }


	// constructor
	// anchor, axis1 and axis2 are in world coordinate system
	// axis1 must be orthogonal to axis2
	public btUniversalConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 anchor, @Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2) { super((Pointer)null); allocate(rbA, rbB, anchor, axis1, axis2); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btVector3 anchor, @Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2);
	// access
	public native @Const @ByRef btVector3 getAnchor();
	public native @Const @ByRef btVector3 getAnchor2();
	public native @Const @ByRef btVector3 getAxis1();
	public native @Const @ByRef btVector3 getAxis2();
	public native @Cast("btScalar") float getAngle1();
	public native @Cast("btScalar") float getAngle2();
	// limits
	public native void setUpperLimit(@Cast("btScalar") float ang1max, @Cast("btScalar") float ang2max);
	public native void setLowerLimit(@Cast("btScalar") float ang1min, @Cast("btScalar") float ang2min);

	public native void setAxis(@Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2);
}
