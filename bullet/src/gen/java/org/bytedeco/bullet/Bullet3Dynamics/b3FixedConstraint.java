// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3FixedConstraint extends b3TypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3FixedConstraint(Pointer p) { super(p); }

	public b3FixedConstraint(int rbA, int rbB, @Const @ByRef b3Transform frameInA, @Const @ByRef b3Transform frameInB) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB); }
	private native void allocate(int rbA, int rbB, @Const @ByRef b3Transform frameInA, @Const @ByRef b3Transform frameInB);

	public native void getInfo1(b3ConstraintInfo1 info, @Const b3RigidBodyData bodies);

	public native void getInfo2(b3ConstraintInfo2 info, @Const b3RigidBodyData bodies);

	public native void setParam(int num, @Cast("b3Scalar") float value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("b3Scalar") float value);
	public native @Cast("b3Scalar") float getParam(int num, int axis/*=-1*/);
	public native @Cast("b3Scalar") float getParam(int num);
}
