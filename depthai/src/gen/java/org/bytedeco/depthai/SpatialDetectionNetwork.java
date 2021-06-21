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
 * \brief SpatialDetectionNetwork node. Runs a neural inference on input image and calculates spatial location data.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialDetectionNetwork extends DetectionNetwork {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialDetectionNetwork(Pointer p) { super(p); }


    public native @StdString @Override BytePointer getName();
    public native @StdVector @Override Input getInputs();
    public native @StdVector @Override Output getOutputs();
    /**
     * Input message with data to be infered upon
     * Default queue is blocking with size 5
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Input message with depth data used to retrieve spatial information about detected object
     * Default queue is non-blocking with size 4
     */
    @MemberGetter public native @ByRef Input inputDepth();

    /**
     * Outputs ImgDetections message that carries parsed detection results.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Outputs mapping of detected bounding boxes relative to depth map
     *
     * Suitable for when displaying remapped bounding boxes on depth frame
     */
    @MemberGetter public native @ByRef Output boundingBoxMapping();

    /**
     * Passthrough message on which the inference was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthrough();

    /**
     * Passthrough message for depth frame on which the spatial location calculation was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughDepth();

    /**
     * Specifies scale factor for detected bounding boxes.
     * @param scaleFactor Scale factor must be in the interval (0,1].
     */
    public native void setBoundingBoxScaleFactor(float scaleFactor);

    /**
     * Specifies lower threshold in milimeters for depth values which will used to calculate spatial data
     * @param lowerThreshold LowerThreshold must be in the interval [0,upperThreshold] and less than upperThreshold.
     */
    public native void setDepthLowerThreshold(@Cast("uint32_t") int lowerThreshold);

    /**
     * Specifies upper threshold in milimeters for depth values which will used to calculate spatial data
     * @param upperThreshold UpperThreshold must be in the interval (lowerThreshold,65535].
     */
    public native void setDepthUpperThreshold(@Cast("uint32_t") int upperThreshold);
}
