// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**btGjkEpaSolver contributed under zlib by Nathanael Presson */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GjkEpaSolver2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GjkEpaSolver2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GjkEpaSolver2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GjkEpaSolver2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GjkEpaSolver2 position(long position) {
        return (b3GjkEpaSolver2)super.position(position);
    }
    @Override public b3GjkEpaSolver2 getPointer(long i) {
        return new b3GjkEpaSolver2((Pointer)this).offsetAddress(i);
    }

	public static class sResults extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public sResults() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public sResults(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sResults(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public sResults position(long position) {
	        return (sResults)super.position(position);
	    }
	    @Override public sResults getPointer(long i) {
	        return new sResults((Pointer)this).offsetAddress(i);
	    }
	
		/** enum b3GjkEpaSolver2::sResults::eStatus */
		public static final int
			Separated = 0,   /* Shapes doesnt penetrate												*/
			Penetrating = 1, /* Shapes are penetrating												*/
			GJK_Failed = 2,  /* GJK phase fail, no big issue, shapes are probably just 'touching'	*/
			EPA_Failed = 3;   /* EPA phase fail, bigger problem, need to save parameters, and debug	*/
		public native @ByRef b3Vector3 witnesses(int i); public native sResults witnesses(int i, b3Vector3 setter);
		@MemberGetter public native b3Vector3 witnesses();
		public native @ByRef b3Vector3 normal(); public native sResults normal(b3Vector3 setter);
		public native @Cast("b3Scalar") float distance(); public native sResults distance(float setter);
	}

	public static native int StackSizeRequirement();

	public static native @Cast("bool") boolean Distance(@Const @ByRef b3Transform transA, @Const @ByRef b3Transform transB,
							 @Const b3ConvexPolyhedronData hullA, @Const b3ConvexPolyhedronData hullB,
							 @Const @ByRef b3Vector3Array verticesA,
							 @Const @ByRef b3Vector3Array verticesB,
							 @Const @ByRef b3Vector3 guess,
							 @ByRef sResults results);

	public static native @Cast("bool") boolean Penetration(@Const @ByRef b3Transform transA, @Const @ByRef b3Transform transB,
								@Const b3ConvexPolyhedronData hullA, @Const b3ConvexPolyhedronData hullB,
								@Const @ByRef b3Vector3Array verticesA,
								@Const @ByRef b3Vector3Array verticesB,
								@Const @ByRef b3Vector3 guess,
								@ByRef sResults results,
								@Cast("bool") boolean usemargins/*=true*/);
	public static native @Cast("bool") boolean Penetration(@Const @ByRef b3Transform transA, @Const @ByRef b3Transform transB,
								@Const b3ConvexPolyhedronData hullA, @Const b3ConvexPolyhedronData hullB,
								@Const @ByRef b3Vector3Array verticesA,
								@Const @ByRef b3Vector3Array verticesB,
								@Const @ByRef b3Vector3 guess,
								@ByRef sResults results);
// #if 0
// #endif
}
