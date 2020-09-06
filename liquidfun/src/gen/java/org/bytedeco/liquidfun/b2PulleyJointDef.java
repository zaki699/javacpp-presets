// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Pulley joint definition. This requires two ground anchors,
 *  two dynamic body anchor points, and a pulley ratio. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2PulleyJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2PulleyJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2PulleyJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2PulleyJointDef position(long position) {
        return (b2PulleyJointDef)super.position(position);
    }
    @Override public b2PulleyJointDef getPointer(long i) {
        return new b2PulleyJointDef(this).position(position + i);
    }

	public b2PulleyJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize the bodies, anchors, lengths, max lengths, and ratio using the world anchors. */
	public native void Initialize(b2Body bodyA, b2Body bodyB,
						@Const @ByRef b2Vec2 groundAnchorA, @Const @ByRef b2Vec2 groundAnchorB,
						@Const @ByRef b2Vec2 anchorA, @Const @ByRef b2Vec2 anchorB,
						@Cast("float32") float ratio);

	/** The first ground anchor in world coordinates. This point never moves. */
	public native @ByRef b2Vec2 groundAnchorA(); public native b2PulleyJointDef groundAnchorA(b2Vec2 setter);

	/** The second ground anchor in world coordinates. This point never moves. */
	public native @ByRef b2Vec2 groundAnchorB(); public native b2PulleyJointDef groundAnchorB(b2Vec2 setter);

	/** The local anchor point relative to bodyA's origin. */
	public native @ByRef b2Vec2 localAnchorA(); public native b2PulleyJointDef localAnchorA(b2Vec2 setter);

	/** The local anchor point relative to bodyB's origin. */
	public native @ByRef b2Vec2 localAnchorB(); public native b2PulleyJointDef localAnchorB(b2Vec2 setter);

	/** The a reference length for the segment attached to bodyA. */
	public native @Cast("float32") float lengthA(); public native b2PulleyJointDef lengthA(float setter);

	/** The a reference length for the segment attached to bodyB. */
	public native @Cast("float32") float lengthB(); public native b2PulleyJointDef lengthB(float setter);

	/** The pulley ratio, used to simulate a block-and-tackle. */
	public native @Cast("float32") float ratio(); public native b2PulleyJointDef ratio(float setter);
}
