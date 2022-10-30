// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Contact impulses for reporting. Impulses are used instead of forces because
 *  sub-step forces may approach infinity for rigid body collisions. These
 *  match up one-to-one with the contact points in b2Manifold. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactImpulse extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ContactImpulse() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactImpulse(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactImpulse(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ContactImpulse position(long position) {
        return (b2ContactImpulse)super.position(position);
    }
    @Override public b2ContactImpulse getPointer(long i) {
        return new b2ContactImpulse((Pointer)this).offsetAddress(i);
    }

	public native @Cast("float32") float normalImpulses(int i); public native b2ContactImpulse normalImpulses(int i, float setter);
	@MemberGetter public native @Cast("float32*") FloatPointer normalImpulses();
	public native @Cast("float32") float tangentImpulses(int i); public native b2ContactImpulse tangentImpulses(int i, float setter);
	@MemberGetter public native @Cast("float32*") FloatPointer tangentImpulses();
	public native @Cast("int32") int count(); public native b2ContactImpulse count(int setter);
}
