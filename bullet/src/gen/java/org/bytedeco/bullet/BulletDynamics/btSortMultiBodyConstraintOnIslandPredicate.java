// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class btSortMultiBodyConstraintOnIslandPredicate extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSortMultiBodyConstraintOnIslandPredicate() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSortMultiBodyConstraintOnIslandPredicate(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSortMultiBodyConstraintOnIslandPredicate(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSortMultiBodyConstraintOnIslandPredicate position(long position) {
        return (btSortMultiBodyConstraintOnIslandPredicate)super.position(position);
    }
    @Override public btSortMultiBodyConstraintOnIslandPredicate getPointer(long i) {
        return new btSortMultiBodyConstraintOnIslandPredicate((Pointer)this).offsetAddress(i);
    }

    public native @Cast("bool") @Name("operator ()") boolean apply(@Const btMultiBodyConstraint lhs, @Const btMultiBodyConstraint rhs);
}
