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
public class btDantzigSolver extends btMLCPSolverInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDantzigSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDantzigSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDantzigSolver position(long position) {
        return (btDantzigSolver)super.position(position);
    }
    @Override public btDantzigSolver getPointer(long i) {
        return new btDantzigSolver((Pointer)this).offsetAddress(i);
    }

	public btDantzigSolver() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXd A, @Const @ByRef btVectorXd b, @ByRef btVectorXd x, @Const @ByRef btVectorXd lo, @Const @ByRef btVectorXd hi, @Const @ByRef btIntArray limitDependency, int numIterations, @Cast("bool") boolean useSparsity/*=true*/);
	public native @Cast("bool") boolean solveMLCP(@Const @ByRef btMatrixXd A, @Const @ByRef btVectorXd b, @ByRef btVectorXd x, @Const @ByRef btVectorXd lo, @Const @ByRef btVectorXd hi, @Const @ByRef btIntArray limitDependency, int numIterations);
}
