// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class MyCallback extends btTriangleRaycastCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MyCallback(Pointer p) { super(p); }

	public native int m_ignorePart(); public native MyCallback m_ignorePart(int setter);
	public native int m_ignoreTriangleIndex(); public native MyCallback m_ignoreTriangleIndex(int setter);

	public MyCallback(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, int ignorePart, int ignoreTriangleIndex) { super((Pointer)null); allocate(from, to, ignorePart, ignoreTriangleIndex); }
	private native void allocate(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, int ignorePart, int ignoreTriangleIndex);
	public native @Cast("btScalar") float reportHit(@Const @ByRef btVector3 hitNormalLocal, @Cast("btScalar") float hitFraction, int partId, int triangleIndex);
}
