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
public class b3SortData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3SortData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3SortData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3SortData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3SortData position(long position) {
        return (b3SortData)super.position(position);
    }
    @Override public b3SortData getPointer(long i) {
        return new b3SortData((Pointer)this).offsetAddress(i);
    }

		public native @Cast("unsigned int") int m_key(); public native b3SortData m_key(int setter);
		public native @Cast("unsigned int") int x(); public native b3SortData x(int setter);
		public native @Cast("unsigned int") int m_value(); public native b3SortData m_value(int setter);
		public native @Cast("unsigned int") int y(); public native b3SortData y(int setter);
}
