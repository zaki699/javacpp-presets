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
 * SpatialLocations structure
 *
 * Contains configuration data, average depth for the calculated ROI on depth map.
 * Together with spatial coordinates: x,y,z relative to the center of depth map.
 * Units are in millimeters.
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialLocations extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialLocations() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialLocations(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialLocations(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialLocations position(long position) {
        return (SpatialLocations)super.position(position);
    }
    @Override public SpatialLocations getPointer(long i) {
        return new SpatialLocations((Pointer)this).offsetAddress(i);
    }

    /**
     *  Configuration for selected ROI
     */
    public native @ByRef SpatialLocationCalculatorConfigData config(); public native SpatialLocations config(SpatialLocationCalculatorConfigData setter);
    /**
     *  Average of depth values inside the ROI between the specified thresholds in config
     */
    public native float depthAverage(); public native SpatialLocations depthAverage(float setter);
    /**
     *  Minimum of depth values inside the ROI between the specified thresholds in config
     */
    public native @Cast("std::uint16_t") short depthMin(); public native SpatialLocations depthMin(short setter);
    /**
     *  Maximum of depth values inside the ROI between the specified thresholds in config
     */
    public native @Cast("std::uint16_t") short depthMax(); public native SpatialLocations depthMax(short setter);
    /**
     *  Number of depth values used to calculate depthAverage based on config
     */
    public native @Cast("std::uint32_t") int depthAveragePixelCount(); public native SpatialLocations depthAveragePixelCount(int setter);
    /**
     *  Spatial coordinates: x,y,z; x,y are the relative positions of the center of ROI to the center of depth map
     */
    public native @ByRef Point3f spatialCoordinates(); public native SpatialLocations spatialCoordinates(Point3f setter);
}
