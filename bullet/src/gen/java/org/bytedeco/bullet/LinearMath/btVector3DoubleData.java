// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btVector3DoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btVector3DoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btVector3DoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btVector3DoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btVector3DoubleData position(long position) {
        return (btVector3DoubleData)super.position(position);
    }
    @Override public btVector3DoubleData getPointer(long i) {
        return new btVector3DoubleData((Pointer)this).offsetAddress(i);
    }

	public native double m_floats(int i); public native btVector3DoubleData m_floats(int i, double setter);
	@MemberGetter public native DoublePointer m_floats();
}
