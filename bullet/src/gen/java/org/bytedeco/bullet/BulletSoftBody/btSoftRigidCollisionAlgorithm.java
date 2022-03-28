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


/** btSoftRigidCollisionAlgorithm  provides collision detection between btSoftBody and btRigidBody */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftRigidCollisionAlgorithm extends btCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftRigidCollisionAlgorithm(Pointer p) { super(p); }

	public btSoftRigidCollisionAlgorithm(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper col0, @Const btCollisionObjectWrapper col1Wrap, @Cast("bool") boolean isSwapped) { super((Pointer)null); allocate(mf, ci, col0, col1Wrap, isSwapped); }
	private native void allocate(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper col0, @Const btCollisionObjectWrapper col1Wrap, @Cast("bool") boolean isSwapped);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") float calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void getAllContactManifolds(@Cast("btManifoldArray*") @ByRef btPersistentManifoldArray manifoldArray);

	public static class CreateFunc extends btCollisionAlgorithmCreateFunc {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CreateFunc() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CreateFunc(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CreateFunc(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CreateFunc position(long position) {
	        return (CreateFunc)super.position(position);
	    }
	    @Override public CreateFunc getPointer(long i) {
	        return new CreateFunc((Pointer)this).offsetAddress(i);
	    }
	
		public native btCollisionAlgorithm CreateCollisionAlgorithm(@ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);
	}
}
