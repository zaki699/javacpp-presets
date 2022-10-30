// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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
public class b3CharIndexTripletData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3CharIndexTripletData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3CharIndexTripletData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3CharIndexTripletData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3CharIndexTripletData position(long position) {
        return (b3CharIndexTripletData)super.position(position);
    }
    @Override public b3CharIndexTripletData getPointer(long i) {
        return new b3CharIndexTripletData((Pointer)this).offsetAddress(i);
    }

	public native @Cast("unsigned char") byte m_values(int i); public native b3CharIndexTripletData m_values(int i, byte setter);
	@MemberGetter public native @Cast("unsigned char*") BytePointer m_values();
	public native @Cast("char") byte m_pad(); public native b3CharIndexTripletData m_pad(byte setter);
}
