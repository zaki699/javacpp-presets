// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A transform contains translation and rotation. It is used to represent
 *  the position and orientation of rigid frames. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Transform extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Transform(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Transform(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Transform position(long position) {
        return (b2Transform)super.position(position);
    }
    @Override public b2Transform getPointer(long i) {
        return new b2Transform((Pointer)this).offsetAddress(i);
    }

	/** The default constructor does nothing. */
	public b2Transform() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize using a position vector and a rotation. */
	public b2Transform(@Const @ByRef b2Vec2 _position, @Const @ByRef b2Rot rotation) { super((Pointer)null); allocate(_position, rotation); }
	private native void allocate(@Const @ByRef b2Vec2 _position, @Const @ByRef b2Rot rotation);

	/** Set this to the identity transform. */
	public native void SetIdentity();

	/** Set this based on the position and angle. */
	public native void Set(@Const @ByRef b2Vec2 _position, @Cast("float32") float angle);

// #if LIQUIDFUN_EXTERNAL_LANGUAGE_API
	/** Get x-coordinate of p. */
	public native @Cast("float32") float GetPositionX();

	/** Get y-coordinate of p. */
	public native @Cast("float32") float GetPositionY();

	/** Get sine-component of q. */
	public native @Cast("float32") float GetRotationSin();

	/** Get cosine-component of q. */
	public native @Cast("float32") float GetRotationCos();
// #endif // LIQUIDFUN_EXTERNAL_LANGUAGE_API

	public native @ByRef b2Vec2 p(); public native b2Transform p(b2Vec2 setter);
	public native @ByRef b2Rot q(); public native b2Transform q(b2Rot setter);
}
