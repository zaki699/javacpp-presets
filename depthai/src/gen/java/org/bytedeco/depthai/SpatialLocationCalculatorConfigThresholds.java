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
 * SpatialLocation configuration thresholds structure
 *
 * Contains configuration data for lower and upper threshold in millimeters for ROI.
 * Values outside of threshold range will be ignored when calculating spatial coordinates from depth map.
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialLocationCalculatorConfigThresholds extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialLocationCalculatorConfigThresholds() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialLocationCalculatorConfigThresholds(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialLocationCalculatorConfigThresholds(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialLocationCalculatorConfigThresholds position(long position) {
        return (SpatialLocationCalculatorConfigThresholds)super.position(position);
    }
    @Override public SpatialLocationCalculatorConfigThresholds getPointer(long i) {
        return new SpatialLocationCalculatorConfigThresholds((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int lowerThreshold(); public native SpatialLocationCalculatorConfigThresholds lowerThreshold(int setter);
    public native @Cast("uint32_t") int upperThreshold(); public native SpatialLocationCalculatorConfigThresholds upperThreshold(int setter);
}
