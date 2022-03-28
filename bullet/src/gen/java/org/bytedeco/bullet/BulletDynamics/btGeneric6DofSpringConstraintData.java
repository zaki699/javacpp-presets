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


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofSpringConstraintData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGeneric6DofSpringConstraintData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGeneric6DofSpringConstraintData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofSpringConstraintData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGeneric6DofSpringConstraintData position(long position) {
        return (btGeneric6DofSpringConstraintData)super.position(position);
    }
    @Override public btGeneric6DofSpringConstraintData getPointer(long i) {
        return new btGeneric6DofSpringConstraintData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btGeneric6DofConstraintData m_6dofData(); public native btGeneric6DofSpringConstraintData m_6dofData(btGeneric6DofConstraintData setter);

	public native int m_springEnabled(int i); public native btGeneric6DofSpringConstraintData m_springEnabled(int i, int setter);
	@MemberGetter public native IntPointer m_springEnabled();
	public native float m_equilibriumPoint(int i); public native btGeneric6DofSpringConstraintData m_equilibriumPoint(int i, float setter);
	@MemberGetter public native FloatPointer m_equilibriumPoint();
	public native float m_springStiffness(int i); public native btGeneric6DofSpringConstraintData m_springStiffness(int i, float setter);
	@MemberGetter public native FloatPointer m_springStiffness();
	public native float m_springDamping(int i); public native btGeneric6DofSpringConstraintData m_springDamping(int i, float setter);
	@MemberGetter public native FloatPointer m_springDamping();
}
