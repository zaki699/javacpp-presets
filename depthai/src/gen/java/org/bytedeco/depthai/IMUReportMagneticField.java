// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * \brief Magnetic field
 *
 * Units are [uTesla]
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUReportMagneticField extends IMUReport {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMUReportMagneticField() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUReportMagneticField(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUReportMagneticField(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMUReportMagneticField position(long position) {
        return (IMUReportMagneticField)super.position(position);
    }
    @Override public IMUReportMagneticField getPointer(long i) {
        return new IMUReportMagneticField((Pointer)this).offsetAddress(i);
    }

    public native float x(); public native IMUReportMagneticField x(float setter);
    public native float y(); public native IMUReportMagneticField y(float setter);
    public native float z(); public native IMUReportMagneticField z(float setter);
}
