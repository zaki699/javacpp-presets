// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**box-box collision detection */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBoxBoxCollisionAlgorithm extends btActivatingCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBoxBoxCollisionAlgorithm(Pointer p) { super(p); }

	public btBoxBoxCollisionAlgorithm(@Const @ByRef btCollisionAlgorithmConstructionInfo ci) { super((Pointer)null); allocate(ci); }
	private native void allocate(@Const @ByRef btCollisionAlgorithmConstructionInfo ci);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") double calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public btBoxBoxCollisionAlgorithm(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap) { super((Pointer)null); allocate(mf, ci, body0Wrap, body1Wrap); }
	private native void allocate(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);

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
