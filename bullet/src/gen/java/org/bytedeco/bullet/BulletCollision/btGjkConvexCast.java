// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**GjkConvexCast performs a raycast on a convex object using support mapping. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGjkConvexCast extends btConvexCast {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGjkConvexCast(Pointer p) { super(p); }

	public btGjkConvexCast(@Const btConvexShape convexA, @Const btConvexShape convexB, btSimplexSolverInterface simplexSolver) { super((Pointer)null); allocate(convexA, convexB, simplexSolver); }
	private native void allocate(@Const btConvexShape convexA, @Const btConvexShape convexB, btSimplexSolverInterface simplexSolver);

	/** cast a convex against another convex object */
	public native @Cast("bool") boolean calcTimeOfImpact(
			@Const @ByRef btTransform fromA,
			@Const @ByRef btTransform toA,
			@Const @ByRef btTransform fromB,
			@Const @ByRef btTransform toB,
			@ByRef CastResult result);
}
