// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSimpleBroadphaseProxy extends btBroadphaseProxy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimpleBroadphaseProxy(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSimpleBroadphaseProxy(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSimpleBroadphaseProxy position(long position) {
        return (btSimpleBroadphaseProxy)super.position(position);
    }
    @Override public btSimpleBroadphaseProxy getPointer(long i) {
        return new btSimpleBroadphaseProxy((Pointer)this).offsetAddress(i);
    }

	public native int m_nextFree(); public native btSimpleBroadphaseProxy m_nextFree(int setter);

	//	int			m_handleId;

	public btSimpleBroadphaseProxy() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btSimpleBroadphaseProxy(@Const @ByRef btVector3 minpt, @Const @ByRef btVector3 maxpt, int shapeType, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask) { super((Pointer)null); allocate(minpt, maxpt, shapeType, userPtr, collisionFilterGroup, collisionFilterMask); }
	private native void allocate(@Const @ByRef btVector3 minpt, @Const @ByRef btVector3 maxpt, int shapeType, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask);

	public native void SetNextFree(int next);
	public native int GetNextFree();
}
