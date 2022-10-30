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
public class btMLCPSolver extends btSequentialImpulseConstraintSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMLCPSolver(Pointer p) { super(p); }

	public btMLCPSolver(btMLCPSolverInterface solver) { super((Pointer)null); allocate(solver); }
	private native void allocate(btMLCPSolverInterface solver);

	public native void setMLCPSolver(btMLCPSolverInterface solver);

	public native int getNumFallbacks();
	public native void setNumFallbacks(int num);

	public native @Cast("btConstraintSolverType") int getSolverType();
}
