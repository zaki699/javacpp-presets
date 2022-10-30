// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class LagrangeMultiplier extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LagrangeMultiplier() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LagrangeMultiplier(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LagrangeMultiplier(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LagrangeMultiplier position(long position) {
        return (LagrangeMultiplier)super.position(position);
    }
    @Override public LagrangeMultiplier getPointer(long i) {
        return new LagrangeMultiplier((Pointer)this).offsetAddress(i);
    }

	public native int m_num_constraints(); public native LagrangeMultiplier m_num_constraints(int setter);  // Number of constraints
	public native int m_num_nodes(); public native LagrangeMultiplier m_num_nodes(int setter);        // Number of nodes in these constraints
	public native @Cast("btScalar") double m_weights(int i); public native LagrangeMultiplier m_weights(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_weights();  // weights of the nodes involved, same size as m_num_nodes
	public native @ByRef btVector3 m_dirs(int i); public native LagrangeMultiplier m_dirs(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_dirs();    // Constraint directions, same size of m_num_constraints;
	public native int m_indices(int i); public native LagrangeMultiplier m_indices(int i, int setter);
	@MemberGetter public native IntPointer m_indices();       // indices of the nodes involved, same size as m_num_nodes;
}
