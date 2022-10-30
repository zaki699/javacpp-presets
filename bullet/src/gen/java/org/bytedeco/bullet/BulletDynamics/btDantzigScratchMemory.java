// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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
public class btDantzigScratchMemory extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btDantzigScratchMemory() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDantzigScratchMemory(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDantzigScratchMemory(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btDantzigScratchMemory position(long position) {
        return (btDantzigScratchMemory)super.position(position);
    }
    @Override public btDantzigScratchMemory getPointer(long i) {
        return new btDantzigScratchMemory((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btScalarArray m_scratch(); public native btDantzigScratchMemory m_scratch(btScalarArray setter);
	public native @ByRef btScalarArray L(); public native btDantzigScratchMemory L(btScalarArray setter);
	public native @ByRef btScalarArray d(); public native btDantzigScratchMemory d(btScalarArray setter);
	public native @ByRef btScalarArray delta_w(); public native btDantzigScratchMemory delta_w(btScalarArray setter);
	public native @ByRef btScalarArray delta_x(); public native btDantzigScratchMemory delta_x(btScalarArray setter);
	public native @ByRef btScalarArray Dell(); public native btDantzigScratchMemory Dell(btScalarArray setter);
	public native @ByRef btScalarArray ell(); public native btDantzigScratchMemory ell(btScalarArray setter);
	
	public native @ByRef btIntArray p(); public native btDantzigScratchMemory p(btIntArray setter);
	public native @ByRef btIntArray C(); public native btDantzigScratchMemory C(btIntArray setter);
	public native @ByRef btBoolArray state(); public native btDantzigScratchMemory state(btBoolArray setter);
}
