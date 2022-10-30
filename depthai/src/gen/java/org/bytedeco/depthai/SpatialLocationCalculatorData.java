// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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
 * SpatialLocationCalculatorData message. Carries spatial information (X,Y,Z) and their configuration parameters
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialLocationCalculatorData extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialLocationCalculatorData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialLocationCalculatorData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SpatialLocationCalculatorData position(long position) {
        return (SpatialLocationCalculatorData)super.position(position);
    }
    @Override public SpatialLocationCalculatorData getPointer(long i) {
        return new SpatialLocationCalculatorData((Pointer)this).offsetAddress(i);
    }

    /**
     * Construct SpatialLocationCalculatorData message.
     */
    public SpatialLocationCalculatorData() { super((Pointer)null); allocate(); }
    private native void allocate();
    public SpatialLocationCalculatorData(@SharedPtr RawSpatialLocations ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawSpatialLocations ptr);

    /**
     * Retrieve configuration data for SpatialLocationCalculatorData.
     * @return Vector of spatial location data, carrying spatial information (X,Y,Z)
     */
    public native @StdVector SpatialLocations getSpatialLocations();

    public native @StdVector SpatialLocations spatialLocations(); public native SpatialLocationCalculatorData spatialLocations(SpatialLocations setter);

    /**
     * Retrieves image timestamp related to dai::Clock::now()
     */
    public native @ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer getTimestamp();

    /**
     * Retrieves image timestamp directly captured from device's monotonic clock,
     * not synchronized to host time. Used mostly for debugging
     */
    public native @ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer getTimestampDevice();

    /**
     * Retrieves image sequence number
     */
    public native @Cast("int64_t") long getSequenceNum();

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef SpatialLocationCalculatorData setTimestamp(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef SpatialLocationCalculatorData setTimestampDevice(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Retrieves image sequence number
     */
    public native @ByRef SpatialLocationCalculatorData setSequenceNum(@Cast("int64_t") long sequenceNum);
}
