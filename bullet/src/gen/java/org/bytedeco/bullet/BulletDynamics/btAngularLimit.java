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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btAngularLimit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btAngularLimit(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btAngularLimit(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btAngularLimit position(long position) {
        return (btAngularLimit)super.position(position);
    }
    @Override public btAngularLimit getPointer(long i) {
        return new btAngularLimit((Pointer)this).offsetAddress(i);
    }

	/** Default constructor initializes limit as inactive, allowing free constraint movement */
	public btAngularLimit() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Sets all limit's parameters.
	 *  When low > high limit becomes inactive.
	 *  When high - low > 2PI limit is ineffective too becouse no angle can exceed the limit */
	public native void set(@Cast("btScalar") double low, @Cast("btScalar") double high, @Cast("btScalar") double _softness/*=0.9f*/, @Cast("btScalar") double _biasFactor/*=0.3f*/, @Cast("btScalar") double _relaxationFactor/*=1.0f*/);
	public native void set(@Cast("btScalar") double low, @Cast("btScalar") double high);

	/** Checks conastaint angle against limit. If limit is active and the angle violates the limit
	 *  correction is calculated. */
	public native void test(@Cast("const btScalar") double angle);

	/** Returns limit's softness */
	public native @Cast("btScalar") double getSoftness();

	/** Returns limit's bias factor */
	public native @Cast("btScalar") double getBiasFactor();

	/** Returns limit's relaxation factor */
	public native @Cast("btScalar") double getRelaxationFactor();

	/** Returns correction value evaluated when test() was invoked */
	public native @Cast("btScalar") double getCorrection();

	/** Returns sign value evaluated when test() was invoked */
	public native @Cast("btScalar") double getSign();

	/** Gives half of the distance between min and max limit angle */
	public native @Cast("btScalar") double getHalfRange();

	/** Returns true when the last test() invocation recognized limit violation */
	public native @Cast("bool") boolean isLimit();

	/** Checks given angle against limit. If limit is active and angle doesn't fit it, the angle
	 *  returned is modified so it equals to the limit closest to given angle. */
	public native void fit(@Cast("btScalar*") @ByRef DoublePointer angle);
	public native void fit(@Cast("btScalar*") @ByRef DoubleBuffer angle);
	public native void fit(@Cast("btScalar*") @ByRef double[] angle);

	/** Returns correction value multiplied by sign value */
	public native @Cast("btScalar") double getError();

	public native @Cast("btScalar") double getLow();

	public native @Cast("btScalar") double getHigh();
}
