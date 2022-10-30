// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btElement extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btElement() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btElement(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btElement(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btElement position(long position) {
        return (btElement)super.position(position);
    }
    @Override public btElement getPointer(long i) {
        return new btElement((Pointer)this).offsetAddress(i);
    }

	public native int m_id(); public native btElement m_id(int setter);
	public native int m_sz(); public native btElement m_sz(int setter);
}
