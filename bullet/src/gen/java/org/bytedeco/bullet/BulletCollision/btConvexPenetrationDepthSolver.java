// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**ConvexPenetrationDepthSolver provides an interface for penetration depth calculation. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexPenetrationDepthSolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexPenetrationDepthSolver(Pointer p) { super(p); }

	public native @Cast("bool") boolean calcPenDepth(@ByRef btSimplexSolverInterface simplexSolver,
								  @Const btConvexShape convexA, @Const btConvexShape convexB,
								  @Const @ByRef btTransform transA, @Const @ByRef btTransform transB,
								  @ByRef btVector3 v, @ByRef btVector3 pa, @ByRef btVector3 pb,
								  btIDebugDraw debugDraw);
}
