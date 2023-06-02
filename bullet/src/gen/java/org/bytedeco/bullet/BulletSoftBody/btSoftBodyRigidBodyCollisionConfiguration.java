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


/**btSoftBodyRigidBodyCollisionConfiguration add softbody interaction on top of btDefaultCollisionConfiguration */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftBodyRigidBodyCollisionConfiguration extends btDefaultCollisionConfiguration {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftBodyRigidBodyCollisionConfiguration(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSoftBodyRigidBodyCollisionConfiguration(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSoftBodyRigidBodyCollisionConfiguration position(long position) {
        return (btSoftBodyRigidBodyCollisionConfiguration)super.position(position);
    }
    @Override public btSoftBodyRigidBodyCollisionConfiguration getPointer(long i) {
        return new btSoftBodyRigidBodyCollisionConfiguration((Pointer)this).offsetAddress(i);
    }

	public btSoftBodyRigidBodyCollisionConfiguration(@Const @ByRef(nullValue = "btDefaultCollisionConstructionInfo()") btDefaultCollisionConstructionInfo constructionInfo) { super((Pointer)null); allocate(constructionInfo); }
	private native void allocate(@Const @ByRef(nullValue = "btDefaultCollisionConstructionInfo()") btDefaultCollisionConstructionInfo constructionInfo);
	public btSoftBodyRigidBodyCollisionConfiguration() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**creation of soft-soft and soft-rigid, and otherwise fallback to base class implementation */
	public native btCollisionAlgorithmCreateFunc getCollisionAlgorithmCreateFunc(int proxyType0, int proxyType1);
}
