// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * \brief Accelerometer
 *
 * Units are [m/s^2]
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUReportAccelerometer extends IMUReport {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMUReportAccelerometer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUReportAccelerometer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUReportAccelerometer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMUReportAccelerometer position(long position) {
        return (IMUReportAccelerometer)super.position(position);
    }
    @Override public IMUReportAccelerometer getPointer(long i) {
        return new IMUReportAccelerometer((Pointer)this).offsetAddress(i);
    }

    public native float x(); public native IMUReportAccelerometer x(float setter);
    public native float y(); public native IMUReportAccelerometer y(float setter);
    public native float z(); public native IMUReportAccelerometer z(float setter);
}
