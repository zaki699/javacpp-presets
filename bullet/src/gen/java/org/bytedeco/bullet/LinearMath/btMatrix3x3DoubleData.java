// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**for serialization */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btMatrix3x3DoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMatrix3x3DoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMatrix3x3DoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMatrix3x3DoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMatrix3x3DoubleData position(long position) {
        return (btMatrix3x3DoubleData)super.position(position);
    }
    @Override public btMatrix3x3DoubleData getPointer(long i) {
        return new btMatrix3x3DoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3DoubleData m_el(int i); public native btMatrix3x3DoubleData m_el(int i, btVector3DoubleData setter);
	@MemberGetter public native btVector3DoubleData m_el();
}
