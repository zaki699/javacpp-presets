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


/**
 *  SimulationIslandManagerMt -- Multithread capable version of SimulationIslandManager
 *                        Splits the world up into islands which can be solved in parallel.
 *                        In order to solve islands in parallel, an IslandDispatch function
 *                        must be provided which will dispatch calls to multiple threads.
 *                        The amount of parallelism that can be achieved depends on the number
 *                        of islands. If only a single island exists, then no parallelism is
 *                        possible.
 *  */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSimulationIslandManagerMt extends btSimulationIslandManager {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimulationIslandManagerMt(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSimulationIslandManagerMt(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSimulationIslandManagerMt position(long position) {
        return (btSimulationIslandManagerMt)super.position(position);
    }
    @Override public btSimulationIslandManagerMt getPointer(long i) {
        return new btSimulationIslandManagerMt((Pointer)this).offsetAddress(i);
    }

	public static class Island extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public Island() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Island(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Island(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public Island position(long position) {
	        return (Island)super.position(position);
	    }
	    @Override public Island getPointer(long i) {
	        return new Island((Pointer)this).offsetAddress(i);
	    }
	
		// a simulation island consisting of bodies, manifolds and constraints,
		// to be passed into a constraint solver.
		public native @ByRef btCollisionObjectArray bodyArray(); public native Island bodyArray(btCollisionObjectArray setter);
		public native @ByRef btPersistentManifoldArray manifoldArray(); public native Island manifoldArray(btPersistentManifoldArray setter);
		public native @ByRef btTypedConstraintArray constraintArray(); public native Island constraintArray(btTypedConstraintArray setter);
		public native int id(); public native Island id(int setter);  // island id
		public native @Cast("bool") boolean isSleeping(); public native Island isSleeping(boolean setter);

		public native void append(@Const @ByRef Island other);  // add bodies, manifolds, constraints to my own
	}
	public static class SolverParams extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public SolverParams() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public SolverParams(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public SolverParams(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public SolverParams position(long position) {
	        return (SolverParams)super.position(position);
	    }
	    @Override public SolverParams getPointer(long i) {
	        return new SolverParams((Pointer)this).offsetAddress(i);
	    }
	
		public native btConstraintSolver m_solverPool(); public native SolverParams m_solverPool(btConstraintSolver setter);
		public native btConstraintSolver m_solverMt(); public native SolverParams m_solverMt(btConstraintSolver setter);
		public native btContactSolverInfo m_solverInfo(); public native SolverParams m_solverInfo(btContactSolverInfo setter);
		public native btIDebugDraw m_debugDrawer(); public native SolverParams m_debugDrawer(btIDebugDraw setter);
		public native btDispatcher m_dispatcher(); public native SolverParams m_dispatcher(btDispatcher setter);
	}
	public static native void solveIsland(btConstraintSolver solver, @ByRef Island island, @Const @ByRef SolverParams solverParams);

	public static class IslandDispatchFunc extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    IslandDispatchFunc(Pointer p) { super(p); }
	    protected IslandDispatchFunc() { allocate(); }
	    private native void allocate();
	    public native void call(IslandArray islands, @Const @ByRef SolverParams solverParams);
	}
	public static native void serialIslandDispatch(IslandArray islandsPtr, @Const @ByRef SolverParams solverParams);
	public static native void parallelIslandDispatch(IslandArray islandsPtr, @Const @ByRef SolverParams solverParams);
	public btSimulationIslandManagerMt() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void buildAndProcessIslands(btDispatcher dispatcher,
											btCollisionWorld collisionWorld,
											@ByRef btTypedConstraintArray constraints,
											@Const @ByRef SolverParams solverParams);

	public native void buildIslands(btDispatcher dispatcher, btCollisionWorld colWorld);

	public native int getMinimumSolverBatchSize();
	public native void setMinimumSolverBatchSize(int sz);
	public native IslandDispatchFunc getIslandDispatchFunction();
	// allow users to set their own dispatch function for multithreaded dispatch
	public native void setIslandDispatchFunction(IslandDispatchFunc func);
}
