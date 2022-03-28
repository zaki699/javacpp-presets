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


//@todo add m_optionalMotionState and m_constraintRefs to btRigidBodyData
/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btRigidBodyFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btRigidBodyFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btRigidBodyFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btRigidBodyFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btRigidBodyFloatData position(long position) {
        return (btRigidBodyFloatData)super.position(position);
    }
    @Override public btRigidBodyFloatData getPointer(long i) {
        return new btRigidBodyFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btCollisionObjectFloatData m_collisionObjectData(); public native btRigidBodyFloatData m_collisionObjectData(btCollisionObjectFloatData setter);
	public native @ByRef btMatrix3x3FloatData m_invInertiaTensorWorld(); public native btRigidBodyFloatData m_invInertiaTensorWorld(btMatrix3x3FloatData setter);
	public native @ByRef btVector3FloatData m_linearVelocity(); public native btRigidBodyFloatData m_linearVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularVelocity(); public native btRigidBodyFloatData m_angularVelocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularFactor(); public native btRigidBodyFloatData m_angularFactor(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearFactor(); public native btRigidBodyFloatData m_linearFactor(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_gravity(); public native btRigidBodyFloatData m_gravity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_gravity_acceleration(); public native btRigidBodyFloatData m_gravity_acceleration(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_invInertiaLocal(); public native btRigidBodyFloatData m_invInertiaLocal(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_totalForce(); public native btRigidBodyFloatData m_totalForce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_totalTorque(); public native btRigidBodyFloatData m_totalTorque(btVector3FloatData setter);
	public native float m_inverseMass(); public native btRigidBodyFloatData m_inverseMass(float setter);
	public native float m_linearDamping(); public native btRigidBodyFloatData m_linearDamping(float setter);
	public native float m_angularDamping(); public native btRigidBodyFloatData m_angularDamping(float setter);
	public native float m_additionalDampingFactor(); public native btRigidBodyFloatData m_additionalDampingFactor(float setter);
	public native float m_additionalLinearDampingThresholdSqr(); public native btRigidBodyFloatData m_additionalLinearDampingThresholdSqr(float setter);
	public native float m_additionalAngularDampingThresholdSqr(); public native btRigidBodyFloatData m_additionalAngularDampingThresholdSqr(float setter);
	public native float m_additionalAngularDampingFactor(); public native btRigidBodyFloatData m_additionalAngularDampingFactor(float setter);
	public native float m_linearSleepingThreshold(); public native btRigidBodyFloatData m_linearSleepingThreshold(float setter);
	public native float m_angularSleepingThreshold(); public native btRigidBodyFloatData m_angularSleepingThreshold(float setter);
	public native int m_additionalDamping(); public native btRigidBodyFloatData m_additionalDamping(int setter);
}
