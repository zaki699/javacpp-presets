// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Point2f structure
 *
 * x and y coordinates that define a 2D point.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Point2f extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point2f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point2f position(long position) {
        return (Point2f)super.position(position);
    }
    @Override public Point2f getPointer(long i) {
        return new Point2f((Pointer)this).offsetAddress(i);
    }

    public Point2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point2f(float x, float y) { super((Pointer)null); allocate(x, y); }
    private native void allocate(float x, float y);
    public native float x(); public native Point2f x(float setter);
    public native float y(); public native Point2f y(float setter);
}
