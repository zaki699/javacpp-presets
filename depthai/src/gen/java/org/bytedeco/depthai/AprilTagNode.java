// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
 * \brief AprilTag node.
 */
@Name("dai::node::AprilTag") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AprilTagNode extends AprilTagPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AprilTagNode(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public AprilTagNode(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public AprilTagNode(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr AprilTagProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr AprilTagProperties props);

    /**
     * Initial config to use when calculating spatial location data.
     */
    @MemberGetter public native @ByRef AprilTagConfig initialConfig();

    /**
     * Input AprilTagConfig message with ability to modify parameters in runtime.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputConfig();
    /**
     * Input message with depth data used to retrieve spatial information about detected object.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputImage();

    /**
     * Outputs AprilTags message that carries spatial location results.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Outputs AprilTagConfig message that contains current configuration.
     */
    @MemberGetter public native @ByRef Output outConfig();

    /**
     * Passthrough message on which the calculation was performed.
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughInputImage();

    // Functions to set properties
    /**
     * Specify whether or not wait until configuration message arrives to inputConfig Input.
     * @param wait True to wait for configuration message, false otherwise.
     */
    public native void setWaitForConfigInput(@Cast("bool") boolean _wait);
}
