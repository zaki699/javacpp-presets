// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The convex2dConvex2dAlgorithm collision algorithm support 2d collision detection for btConvex2dShape
 * Currently it requires the btMinkowskiPenetrationDepthSolver, it has support for 2d penetration depth computation */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvex2dConvex2dAlgorithm extends btActivatingCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvex2dConvex2dAlgorithm(Pointer p) { super(p); }

	public btConvex2dConvex2dAlgorithm(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold) { super((Pointer)null); allocate(mf, ci, body0Wrap, body1Wrap, simplexSolver, pdSolver, numPerturbationIterations, minimumPointsPerturbationThreshold); }
	private native void allocate(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") double calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void getAllContactManifolds(@Cast("btManifoldArray*") @ByRef btPersistentManifoldArray manifoldArray);

	public native void setLowLevelOfDetail(@Cast("bool") boolean useLowLevel);

	public native @Const btPersistentManifold getManifold();

	@NoOffset public static class CreateFunc extends btCollisionAlgorithmCreateFunc {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CreateFunc(Pointer p) { super(p); }
	
		public native btConvexPenetrationDepthSolver m_pdSolver(); public native CreateFunc m_pdSolver(btConvexPenetrationDepthSolver setter);
		public native btSimplexSolverInterface m_simplexSolver(); public native CreateFunc m_simplexSolver(btSimplexSolverInterface setter);
		public native int m_numPerturbationIterations(); public native CreateFunc m_numPerturbationIterations(int setter);
		public native int m_minimumPointsPerturbationThreshold(); public native CreateFunc m_minimumPointsPerturbationThreshold(int setter);

		public CreateFunc(btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver pdSolver) { super((Pointer)null); allocate(simplexSolver, pdSolver); }
		private native void allocate(btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver pdSolver);

		public native btCollisionAlgorithm CreateCollisionAlgorithm(@ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);
	}
}
