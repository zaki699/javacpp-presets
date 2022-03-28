// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**MinkowskiPenetrationDepthSolver implements bruteforce penetration depth estimation.
 * Implementation is based on sampling the depth using support mapping, and using GJK step to get the witness points. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMinkowskiPenetrationDepthSolver extends btConvexPenetrationDepthSolver {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMinkowskiPenetrationDepthSolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMinkowskiPenetrationDepthSolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMinkowskiPenetrationDepthSolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMinkowskiPenetrationDepthSolver position(long position) {
        return (btMinkowskiPenetrationDepthSolver)super.position(position);
    }
    @Override public btMinkowskiPenetrationDepthSolver getPointer(long i) {
        return new btMinkowskiPenetrationDepthSolver((Pointer)this).offsetAddress(i);
    }

	public native @Cast("bool") boolean calcPenDepth(@ByRef btSimplexSolverInterface simplexSolver,
								  @Const btConvexShape convexA, @Const btConvexShape convexB,
								  @Const @ByRef btTransform transA, @Const @ByRef btTransform transB,
								  @ByRef btVector3 v, @ByRef btVector3 pa, @ByRef btVector3 pb,
								  btIDebugDraw debugDraw);
}
