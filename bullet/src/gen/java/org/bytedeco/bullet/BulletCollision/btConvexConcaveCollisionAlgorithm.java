// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btConvexConcaveCollisionAlgorithm  supports collision between convex shapes and (concave) trianges meshes. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexConcaveCollisionAlgorithm extends btActivatingCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexConcaveCollisionAlgorithm(Pointer p) { super(p); }


	public btConvexConcaveCollisionAlgorithm(@Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped) { super((Pointer)null); allocate(ci, body0Wrap, body1Wrap, isSwapped); }
	private native void allocate(@Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") double calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void getAllContactManifolds(@Cast("btManifoldArray*") @ByRef btPersistentManifoldArray manifoldArray);

	public native void clearCache();

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

	public static class SwappedCreateFunc extends btCollisionAlgorithmCreateFunc {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public SwappedCreateFunc() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public SwappedCreateFunc(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public SwappedCreateFunc(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public SwappedCreateFunc position(long position) {
	        return (SwappedCreateFunc)super.position(position);
	    }
	    @Override public SwappedCreateFunc getPointer(long i) {
	        return new SwappedCreateFunc((Pointer)this).offsetAddress(i);
	    }
	
		public native btCollisionAlgorithm CreateCollisionAlgorithm(@ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);
	}
}
