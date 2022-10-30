// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A weld joint essentially glues two bodies together. A weld joint may
 *  distort somewhat because the island constraint solver is approximate. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2WeldJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2WeldJoint(Pointer p) { super(p); }

	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** The local anchor point relative to bodyA's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorA();

	/** The local anchor point relative to bodyB's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorB();

	/** Get the reference angle. */
	public native @Cast("float32") float GetReferenceAngle();

	/** Set/get frequency in Hz. */
	public native void SetFrequency(@Cast("float32") float hz);
	public native @Cast("float32") float GetFrequency();

	/** Set/get damping ratio. */
	public native void SetDampingRatio(@Cast("float32") float ratio);
	public native @Cast("float32") float GetDampingRatio();

	/** Dump to b2Log */
	public native void Dump();
}
