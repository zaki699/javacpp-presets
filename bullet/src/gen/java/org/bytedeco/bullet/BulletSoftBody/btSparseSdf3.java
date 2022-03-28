// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Name("btSparseSdf<3>") @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSparseSdf3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSparseSdf3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSparseSdf3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSparseSdf3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSparseSdf3 position(long position) {
        return (btSparseSdf3)super.position(position);
    }
    @Override public btSparseSdf3 getPointer(long i) {
        return new btSparseSdf3((Pointer)this).offsetAddress(i);
    }

	//
	// Inner types
	//
	public static class IntFrac extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public IntFrac() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public IntFrac(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public IntFrac(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public IntFrac position(long position) {
	        return (IntFrac)super.position(position);
	    }
	    @Override public IntFrac getPointer(long i) {
	        return new IntFrac((Pointer)this).offsetAddress(i);
	    }
	
		public native int b(); public native IntFrac b(int setter);
		public native int i(); public native IntFrac i(int setter);
		public native @Cast("btScalar") float f(); public native IntFrac f(float setter);
	}
	public static class Cell extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public Cell() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Cell(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Cell(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public Cell position(long position) {
	        return (Cell)super.position(position);
	    }
	    @Override public Cell getPointer(long i) {
	        return new Cell((Pointer)this).offsetAddress(i);
	    }
	
		public native @Cast("btScalar") float d(int i, int j, int k); public native Cell d(int i, int j, int k, float setter);
		@MemberGetter public native @Cast("btScalar*") FloatPointer d();
		public native int c(int i); public native Cell c(int i, int setter);
		@MemberGetter public native IntPointer c();
		public native int puid(); public native Cell puid(int setter);
		public native @Cast("unsigned") int hash(); public native Cell hash(int setter);
		public native @Const btCollisionShape pclient(); public native Cell pclient(btCollisionShape setter);
		public native Cell next(); public native Cell next(Cell setter);
	}
	//
	// Fields
	//

	public native @ByRef btSparseSdf3CellArray cells(); public native btSparseSdf3 cells(btSparseSdf3CellArray setter);
	public native @Cast("btScalar") float voxelsz(); public native btSparseSdf3 voxelsz(float setter);
	public native @Cast("btScalar") float m_defaultVoxelsz(); public native btSparseSdf3 m_defaultVoxelsz(float setter);
	public native int puid(); public native btSparseSdf3 puid(int setter);
	public native int ncells(); public native btSparseSdf3 ncells(int setter);
	public native int m_clampCells(); public native btSparseSdf3 m_clampCells(int setter);
	public native int nprobes(); public native btSparseSdf3 nprobes(int setter);
	public native int nqueries(); public native btSparseSdf3 nqueries(int setter);
	//
	// Methods
	//

	//
	public native void Initialize(int hashsize/*=2383*/, int clampCells/*=256 * 1024*/);
	public native void Initialize();
	//

	public native void setDefaultVoxelsz(@Cast("btScalar") float sz);

	public native void Reset();
	//
	public native void GarbageCollect(int lifetime/*=256*/);
	public native void GarbageCollect();
	//
	public native int RemoveReferences(btCollisionShape pcs);
	//
	public native @Cast("btScalar") float Evaluate(@Const @ByRef btVector3 x,
						  @Const btCollisionShape shape,
						  @ByRef btVector3 normal,
						  @Cast("btScalar") float margin);
	//
	public native void BuildCell(@ByRef Cell c);
	//
	public static native @Cast("btScalar") float DistanceToShape(@Const @ByRef btVector3 x,
											   @Const btCollisionShape shape);
	//
	public static native @ByVal IntFrac Decompose(@Cast("btScalar") float x);
	//
	public static native @Cast("btScalar") float Lerp(@Cast("btScalar") float a, @Cast("btScalar") float b, @Cast("btScalar") float t);

	//
	public static native @Cast("unsigned int") int Hash(int x, int y, int z, @Const btCollisionShape shape);
}
