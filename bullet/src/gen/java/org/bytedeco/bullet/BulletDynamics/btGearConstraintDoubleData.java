// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
public class btGearConstraintDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGearConstraintDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGearConstraintDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGearConstraintDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGearConstraintDoubleData position(long position) {
        return (btGearConstraintDoubleData)super.position(position);
    }
    @Override public btGearConstraintDoubleData getPointer(long i) {
        return new btGearConstraintDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintDoubleData m_typeConstraintData(); public native btGearConstraintDoubleData m_typeConstraintData(btTypedConstraintDoubleData setter);

	public native @ByRef btVector3DoubleData m_axisInA(); public native btGearConstraintDoubleData m_axisInA(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_axisInB(); public native btGearConstraintDoubleData m_axisInB(btVector3DoubleData setter);

	public native double m_ratio(); public native btGearConstraintDoubleData m_ratio(double setter);
}
