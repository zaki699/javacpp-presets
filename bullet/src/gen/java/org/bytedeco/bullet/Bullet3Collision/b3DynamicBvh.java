// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


/**The b3DynamicBvh class implements a fast dynamic bounding volume tree based on axis aligned bounding boxes (aabb tree).
 * This b3DynamicBvh is used for soft body collision detection and for the b3DynamicBvhBroadphase. It has a fast insert, remove and update of nodes.
 * Unlike the b3QuantizedBvh, nodes can be dynamically moved around, which allows for change in topology of the underlying data structure. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3DynamicBvh extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3DynamicBvh(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3DynamicBvh(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3DynamicBvh position(long position) {
        return (b3DynamicBvh)super.position(position);
    }
    @Override public b3DynamicBvh getPointer(long i) {
        return new b3DynamicBvh((Pointer)this).offsetAddress(i);
    }

	/* Stack element	*/
	@NoOffset public static class sStkNN extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sStkNN(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public sStkNN(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public sStkNN position(long position) {
	        return (sStkNN)super.position(position);
	    }
	    @Override public sStkNN getPointer(long i) {
	        return new sStkNN((Pointer)this).offsetAddress(i);
	    }
	
		public native @Const b3DbvtNode a(); public native sStkNN a(b3DbvtNode setter);
		public native @Const b3DbvtNode b(); public native sStkNN b(b3DbvtNode setter);
		public sStkNN() { super((Pointer)null); allocate(); }
		private native void allocate();
		public sStkNN(@Const b3DbvtNode na, @Const b3DbvtNode nb) { super((Pointer)null); allocate(na, nb); }
		private native void allocate(@Const b3DbvtNode na, @Const b3DbvtNode nb);
	}
	@NoOffset public static class sStkNP extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sStkNP(Pointer p) { super(p); }
	
		public native @Const b3DbvtNode node(); public native sStkNP node(b3DbvtNode setter);
		public native int mask(); public native sStkNP mask(int setter);
		public sStkNP(@Const b3DbvtNode n, @Cast("unsigned") int m) { super((Pointer)null); allocate(n, m); }
		private native void allocate(@Const b3DbvtNode n, @Cast("unsigned") int m);
	}
	@NoOffset public static class sStkNPS extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sStkNPS(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public sStkNPS(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public sStkNPS position(long position) {
	        return (sStkNPS)super.position(position);
	    }
	    @Override public sStkNPS getPointer(long i) {
	        return new sStkNPS((Pointer)this).offsetAddress(i);
	    }
	
		public native @Const b3DbvtNode node(); public native sStkNPS node(b3DbvtNode setter);
		public native int mask(); public native sStkNPS mask(int setter);
		public native @Cast("b3Scalar") float value(); public native sStkNPS value(float setter);
		public sStkNPS() { super((Pointer)null); allocate(); }
		private native void allocate();
		public sStkNPS(@Const b3DbvtNode n, @Cast("unsigned") int m, @Cast("b3Scalar") float v) { super((Pointer)null); allocate(n, m, v); }
		private native void allocate(@Const b3DbvtNode n, @Cast("unsigned") int m, @Cast("b3Scalar") float v);
	}
	@NoOffset public static class sStkCLN extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sStkCLN(Pointer p) { super(p); }
	
		public native @Const b3DbvtNode node(); public native sStkCLN node(b3DbvtNode setter);
		public native b3DbvtNode parent(); public native sStkCLN parent(b3DbvtNode setter);
		public sStkCLN(@Const b3DbvtNode n, b3DbvtNode p) { super((Pointer)null); allocate(n, p); }
		private native void allocate(@Const b3DbvtNode n, b3DbvtNode p);
	}
	// Policies/Interfaces

	/* ICollide	*/
	public static class ICollide extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public ICollide() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public ICollide(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ICollide(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public ICollide position(long position) {
	        return (ICollide)super.position(position);
	    }
	    @Override public ICollide getPointer(long i) {
	        return new ICollide((Pointer)this).offsetAddress(i);
	    }
	
		public native void Process(@Const b3DbvtNode arg0, @Const b3DbvtNode arg1);
		public native void Process(@Const b3DbvtNode arg0);
		public native void Process(@Const b3DbvtNode n, @Cast("b3Scalar") float arg1);
		public native @Cast("bool") boolean Descent(@Const b3DbvtNode arg0);
		public native @Cast("bool") boolean AllLeaves(@Const b3DbvtNode arg0);
	}
	/* IWriter	*/
	public static class IWriter extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public IWriter(Pointer p) { super(p); }
	
		public native void Prepare(@Const b3DbvtNode root, int numnodes);
		public native void WriteNode(@Const b3DbvtNode arg0, int index, int parent, int child0, int child1);
		public native void WriteLeaf(@Const b3DbvtNode arg0, int index, int parent);
	}
	/* IClone	*/
	public static class IClone extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public IClone() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public IClone(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public IClone(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public IClone position(long position) {
	        return (IClone)super.position(position);
	    }
	    @Override public IClone getPointer(long i) {
	        return new IClone((Pointer)this).offsetAddress(i);
	    }
	
		public native void CloneLeaf(b3DbvtNode arg0);
	}

	// Constants
	/** enum b3DynamicBvh:: */
	public static final int
		B3_SIMPLE_STACKSIZE = 64,
		B3_DOUBLE_STACKSIZE = B3_SIMPLE_STACKSIZE * 2;

	// Fields
	public native b3DbvtNode m_root(); public native b3DynamicBvh m_root(b3DbvtNode setter);
	public native b3DbvtNode m_free(); public native b3DynamicBvh m_free(b3DbvtNode setter);
	public native int m_lkhd(); public native b3DynamicBvh m_lkhd(int setter);
	public native int m_leaves(); public native b3DynamicBvh m_leaves(int setter);
	public native @Cast("unsigned") int m_opath(); public native b3DynamicBvh m_opath(int setter);

	public native @ByRef sStkNNArray m_stkStack(); public native b3DynamicBvh m_stkStack(sStkNNArray setter);
	

	// Methods
	public b3DynamicBvh() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void clear();
	public native @Cast("bool") boolean empty();
	public native void optimizeBottomUp();
	public native void optimizeTopDown(int bu_treshold/*=128*/);
	public native void optimizeTopDown();
	public native void optimizeIncremental(int passes);
	public native b3DbvtNode insert(@Cast("const b3DbvtVolume*") @ByRef b3DbvtAabbMm box, Pointer data);
	public native void update(b3DbvtNode leaf, int lookahead/*=-1*/);
	public native void update(b3DbvtNode leaf);
	public native void update(b3DbvtNode leaf, @Cast("b3DbvtVolume*") @ByRef b3DbvtAabbMm volume);
	public native @Cast("bool") boolean update(b3DbvtNode leaf, @Cast("b3DbvtVolume*") @ByRef b3DbvtAabbMm volume, @Const @ByRef b3Vector3 velocity, @Cast("b3Scalar") float margin);
	public native @Cast("bool") boolean update(b3DbvtNode leaf, @Cast("b3DbvtVolume*") @ByRef b3DbvtAabbMm volume, @Const @ByRef b3Vector3 velocity);
	public native @Cast("bool") boolean update(b3DbvtNode leaf, @Cast("b3DbvtVolume*") @ByRef b3DbvtAabbMm volume, @Cast("b3Scalar") float margin);
	public native void remove(b3DbvtNode leaf);
	public native void write(IWriter iwriter);
	public native void clone(@ByRef b3DynamicBvh dest, IClone iclone/*=0*/);
	public native void clone(@ByRef b3DynamicBvh dest);
	public static native int maxdepth(@Const b3DbvtNode node);
	public static native int countLeaves(@Const b3DbvtNode node);
	
// #if B3_DBVT_ENABLE_BENCHMARK
	public static native void benchmark();
// #else
// #endif
	// B3_DBVT_IPOLICY must support ICollide policy/interface
	public static native void enumNodes(@Const b3DbvtNode root,
							  @ByRef ICollide policy);
	public static native void enumLeaves(@Const b3DbvtNode root,
							   @ByRef ICollide policy);
	public native void collideTT(@Const b3DbvtNode root0,
					   @Const b3DbvtNode root1,
					   @ByRef ICollide policy);

	public native void collideTTpersistentStack(@Const b3DbvtNode root0,
									  @Const b3DbvtNode root1,
									  @ByRef ICollide policy);
// #if 0
// #endif

	public native void collideTV(@Const b3DbvtNode root,
					   @Cast("const b3DbvtVolume*") @ByRef b3DbvtAabbMm volume,
					   @ByRef ICollide policy);
	/**rayTest is a re-entrant ray test, and can be called in parallel as long as the b3AlignedAlloc is thread-safe (uses locking etc)
	 * rayTest is slower than rayTestInternal, because it builds a local stack, using memory allocations, and it recomputes signs/rayDirectionInverses each time */
	public static native void rayTest(@Const b3DbvtNode root,
							@Const @ByRef b3Vector3 rayFrom,
							@Const @ByRef b3Vector3 rayTo,
							@ByRef ICollide policy);
	/**rayTestInternal is faster than rayTest, because it uses a persistent stack (to reduce dynamic memory allocations to a minimum) and it uses precomputed signs/rayInverseDirections
	 * rayTestInternal is used by b3DynamicBvhBroadphase to accelerate world ray casts */
	public native void rayTestInternal(@Const b3DbvtNode root,
							 @Const @ByRef b3Vector3 rayFrom,
							 @Const @ByRef b3Vector3 rayTo,
							 @Const @ByRef b3Vector3 rayDirectionInverse,
							 @Cast("unsigned int*") IntPointer signs,
							 @Cast("b3Scalar") float lambda_max,
							 @Const @ByRef b3Vector3 aabbMin,
							 @Const @ByRef b3Vector3 aabbMax,
							 @ByRef ICollide policy);
	public native void rayTestInternal(@Const b3DbvtNode root,
							 @Const @ByRef b3Vector3 rayFrom,
							 @Const @ByRef b3Vector3 rayTo,
							 @Const @ByRef b3Vector3 rayDirectionInverse,
							 @Cast("unsigned int*") IntBuffer signs,
							 @Cast("b3Scalar") float lambda_max,
							 @Const @ByRef b3Vector3 aabbMin,
							 @Const @ByRef b3Vector3 aabbMax,
							 @ByRef ICollide policy);
	public native void rayTestInternal(@Const b3DbvtNode root,
							 @Const @ByRef b3Vector3 rayFrom,
							 @Const @ByRef b3Vector3 rayTo,
							 @Const @ByRef b3Vector3 rayDirectionInverse,
							 @Cast("unsigned int*") int[] signs,
							 @Cast("b3Scalar") float lambda_max,
							 @Const @ByRef b3Vector3 aabbMin,
							 @Const @ByRef b3Vector3 aabbMax,
							 @ByRef ICollide policy);

	public static native void collideKDOP(@Const b3DbvtNode root,
								@Const b3Vector3 normals,
								@Cast("const b3Scalar*") FloatPointer offsets,
								int count,
								@ByRef ICollide policy);
	public static native void collideKDOP(@Const b3DbvtNode root,
								@Const b3Vector3 normals,
								@Cast("const b3Scalar*") FloatBuffer offsets,
								int count,
								@ByRef ICollide policy);
	public static native void collideKDOP(@Const b3DbvtNode root,
								@Const b3Vector3 normals,
								@Cast("const b3Scalar*") float[] offsets,
								int count,
								@ByRef ICollide policy);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") FloatPointer offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy,
							   @Cast("bool") boolean fullsort/*=true*/);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") FloatPointer offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") FloatBuffer offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy,
							   @Cast("bool") boolean fullsort/*=true*/);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") FloatBuffer offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") float[] offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy,
							   @Cast("bool") boolean fullsort/*=true*/);
	public static native void collideOCL(@Const b3DbvtNode root,
							   @Const b3Vector3 normals,
							   @Cast("const b3Scalar*") float[] offsets,
							   @Const @ByRef b3Vector3 sortaxis,
							   int count,
							   @ByRef ICollide policy);
	public static native void collideTU(@Const b3DbvtNode root,
							  @ByRef ICollide policy);
	// Helpers
	public static native int nearest(@Const IntPointer i, @Const sStkNPS a, @Cast("b3Scalar") float v, int l, int h);
	public static native int nearest(@Const IntBuffer i, @Const sStkNPS a, @Cast("b3Scalar") float v, int l, int h);
	public static native int nearest(@Const int[] i, @Const sStkNPS a, @Cast("b3Scalar") float v, int l, int h);
	public static native @Name("allocate") int _allocate(@ByRef b3IntArray ifree,
										   @ByRef sStkNPSArray stock,
										   @Const @ByRef sStkNPS value);
}
