// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Point3_<double>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point3d(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point3d position(long position) {
        return (Point3d)super.position(position);
    }
    @Override public Point3d getPointer(long i) {
        return new Point3d((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Point3d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3d(double _x, double _y, double _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(double _x, double _y, double _z);
// #if OPENCV_ABI_COMPATIBILITY < 500
    public Point3d(@Const @ByRef Point3d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3d pt);
// #endif
    public Point3d(@Const @ByRef Point2d pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2d pt);

// #if OPENCV_ABI_COMPATIBILITY < 500
    public native @ByRef @Name("operator =") Point3d put(@Const @ByRef Point3d pt);
// #endif
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native double dot(@Const @ByRef Point3d pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3d pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3d cross(@Const @ByRef Point3d pt);
    /** x coordinate of the 3D point */
    public native double x(); public native Point3d x(double setter);
    /** y coordinate of the 3D point */
    public native double y(); public native Point3d y(double setter);
    /** z coordinate of the 3D point */
    public native double z(); public native Point3d z(double setter);
}
