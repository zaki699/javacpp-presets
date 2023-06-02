// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
public class b3KernelArgData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3KernelArgData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3KernelArgData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3KernelArgData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3KernelArgData position(long position) {
        return (b3KernelArgData)super.position(position);
    }
    @Override public b3KernelArgData getPointer(long i) {
        return new b3KernelArgData((Pointer)this).offsetAddress(i);
    }

	public native int m_isBuffer(); public native b3KernelArgData m_isBuffer(int setter);
	public native int m_argIndex(); public native b3KernelArgData m_argIndex(int setter);
	public native int m_argSizeInBytes(); public native b3KernelArgData m_argSizeInBytes(int setter);
	public native int m_unusedPadding(); public native b3KernelArgData m_unusedPadding(int setter);
		public native @Cast("cl_mem") Pointer m_clBuffer(); public native b3KernelArgData m_clBuffer(Pointer setter);
		public native @Cast("unsigned char") byte m_argData(int i); public native b3KernelArgData m_argData(int i, byte setter);
		@MemberGetter public native @Cast("unsigned char*") BytePointer m_argData();
}
