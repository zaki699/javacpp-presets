// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3ShortIntIndexTripletData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3ShortIntIndexTripletData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ShortIntIndexTripletData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ShortIntIndexTripletData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3ShortIntIndexTripletData position(long position) {
        return (b3ShortIntIndexTripletData)super.position(position);
    }
    @Override public b3ShortIntIndexTripletData getPointer(long i) {
        return new b3ShortIntIndexTripletData((Pointer)this).offsetAddress(i);
    }

	public native short m_values(int i); public native b3ShortIntIndexTripletData m_values(int i, short setter);
	@MemberGetter public native ShortPointer m_values();
	public native @Cast("char") byte m_pad(int i); public native b3ShortIntIndexTripletData m_pad(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_pad();
}
