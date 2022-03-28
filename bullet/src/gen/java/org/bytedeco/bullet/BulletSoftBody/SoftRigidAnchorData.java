// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftRigidAnchorData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftRigidAnchorData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftRigidAnchorData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftRigidAnchorData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftRigidAnchorData position(long position) {
        return (SoftRigidAnchorData)super.position(position);
    }
    @Override public SoftRigidAnchorData getPointer(long i) {
        return new SoftRigidAnchorData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btMatrix3x3FloatData m_c0(); public native SoftRigidAnchorData m_c0(btMatrix3x3FloatData setter);        // Impulse matrix
	public native @ByRef btVector3FloatData m_c1(); public native SoftRigidAnchorData m_c1(btVector3FloatData setter);          // Relative anchor
	public native @ByRef btVector3FloatData m_localFrame(); public native SoftRigidAnchorData m_localFrame(btVector3FloatData setter);  // Anchor position in body space
	public native btRigidBodyFloatData m_rigidBody(); public native SoftRigidAnchorData m_rigidBody(btRigidBodyFloatData setter);
	public native int m_nodeIndex(); public native SoftRigidAnchorData m_nodeIndex(int setter);  // Node pointer
	public native float m_c2(); public native SoftRigidAnchorData m_c2(float setter);       // ima*dt
}
