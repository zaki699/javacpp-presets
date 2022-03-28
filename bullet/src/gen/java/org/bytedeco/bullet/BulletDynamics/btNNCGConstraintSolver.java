// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class btNNCGConstraintSolver extends btSequentialImpulseConstraintSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btNNCGConstraintSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btNNCGConstraintSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btNNCGConstraintSolver position(long position) {
        return (btNNCGConstraintSolver)super.position(position);
    }
    @Override public btNNCGConstraintSolver getPointer(long i) {
        return new btNNCGConstraintSolver((Pointer)this).offsetAddress(i);
    }


	public btNNCGConstraintSolver() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("btConstraintSolverType") int getSolverType();

	public native @Cast("bool") boolean m_onlyForNoneContact(); public native btNNCGConstraintSolver m_onlyForNoneContact(boolean setter);
}
