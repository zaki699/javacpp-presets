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
 * Specify properties for SpatialLocationCalculator
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialLocationCalculatorProperties extends SpatialLocationCalculatorPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialLocationCalculatorProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialLocationCalculatorProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialLocationCalculatorProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialLocationCalculatorProperties position(long position) {
        return (SpatialLocationCalculatorProperties)super.position(position);
    }
    @Override public SpatialLocationCalculatorProperties getPointer(long i) {
        return new SpatialLocationCalculatorProperties((Pointer)this).offsetAddress(i);
    }

    public native @ByRef RawSpatialLocationCalculatorConfig roiConfig(); public native SpatialLocationCalculatorProperties roiConfig(RawSpatialLocationCalculatorConfig setter);
}
