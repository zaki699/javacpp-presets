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
 * \brief Represents the pipeline, set of nodes and connections between them
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Pipeline extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Pipeline(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Pipeline(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Pipeline position(long position) {
        return (Pipeline)super.position(position);
    }
    @Override public Pipeline getPointer(long i) {
        return new Pipeline((Pointer)this).offsetAddress(i);
    }

    /**
     * Constructs a new pipeline
     */
    public Pipeline() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Pipeline(@SharedPtr PipelineImpl pimpl) { super((Pointer)null); allocate(pimpl); }
    private native void allocate(@SharedPtr PipelineImpl pimpl);

    /** Clone the pipeline (Creates a copy) */
    public native @ByVal Pipeline clone();

    /**
     * @return Global properties of current pipeline
     */
    public native @ByVal GlobalProperties getGlobalProperties();

    /**
     * @return Pipeline schema
     */
    public native @ByVal PipelineSchema getPipelineSchema(SerializationType type/*=dai::DEFAULT_SERIALIZATION_TYPE*/);
    public native @ByVal PipelineSchema getPipelineSchema();
    public native @ByVal PipelineSchema getPipelineSchema(@Cast("dai::SerializationType") int type/*=dai::DEFAULT_SERIALIZATION_TYPE*/);

    // void loadAssets(AssetManager& assetManager);
    public native void serialize(@ByRef PipelineSchema schema, @ByRef Assets assets, @Cast("std::uint8_t*") @StdVector BytePointer assetStorage);
    public native void serialize(@ByRef PipelineSchema schema, @ByRef Assets assets, @Cast("std::uint8_t*") @StdVector ByteBuffer assetStorage);
    public native void serialize(@ByRef PipelineSchema schema, @ByRef Assets assets, @Cast("std::uint8_t*") @StdVector byte[] assetStorage);

    /** Returns whole pipeline represented as JSON */
    public native @ByVal @Cast("nlohmann::json*") Pointer serializeToJson();

    /**
     * Adds a node to pipeline.
     *
     * Node is specified by template argument N
     */
    public native @Name("create<dai::node::IMU>") @SharedPtr IMU createIMU();
    public native @Name("create<dai::node::AprilTag>") @SharedPtr AprilTagNode createAprilTag();
    public native @Name("create<dai::node::ColorCamera>") @SharedPtr ColorCamera createColorCamera();
    public native @Name("create<dai::node::ImageManip>") @SharedPtr ImageManip createImageManip();
    public native @Name("create<dai::node::MonoCamera>") @SharedPtr MonoCamera createMonoCamera();
    public native @Name("create<dai::node::NeuralNetwork>") @SharedPtr NeuralNetwork createNeuralNetwork();
    public native @Name("create<dai::node::DetectionParser>") @SharedPtr DetectionParser createDetectionParser();
    public native @Name("create<dai::node::MobileNetDetectionNetwork>") @SharedPtr MobileNetDetectionNetwork createMobileNetDetectionNetwork();
    public native @Name("create<dai::node::YoloDetectionNetwork>") @SharedPtr YoloDetectionNetwork createYoloDetectionNetwork();
    public native @Name("create<dai::node::ObjectTracker>") @SharedPtr ObjectTracker createObjectTracker();
    public native @Name("create<dai::node::SPIOut>") @SharedPtr SPIOut createSPIOut();
    public native @Name("create<dai::node::MobileNetSpatialDetectionNetwork>") @SharedPtr MobileNetSpatialDetectionNetwork createMobileNetSpatialDetectionNetwork();
    public native @Name("create<dai::node::YoloSpatialDetectionNetwork>") @SharedPtr YoloSpatialDetectionNetwork createYoloSpatialDetectionNetwork();
    public native @Name("create<dai::node::SpatialLocationCalculator>") @SharedPtr SpatialLocationCalculator createSpatialLocationCalculator();
    public native @Name("create<dai::node::StereoDepth>") @SharedPtr StereoDepth createStereoDepth();
    public native @Name("create<dai::node::SystemLogger>") @SharedPtr SystemLogger createSystemLogger();
    public native @Name("create<dai::node::VideoEncoder>") @SharedPtr VideoEncoder createVideoEncoder();
    public native @Name("create<dai::node::Warp>") @SharedPtr Warp createWarp();
    public native @Name("create<dai::node::XLinkIn>") @SharedPtr XLinkIn createXLinkIn();
    public native @Name("create<dai::node::XLinkOut>") @SharedPtr XLinkOut createXLinkOut();

    /** Removes a node from pipeline */
    public native void remove(@SharedPtr @ByVal Node node);

    /** Get a vector of all nodes */
    /** Get a vector of all nodes */
    public native @ByVal NodeVector getAllNodes();

    /** Get node with id if it exists, nullptr otherwise */
    /** Get node with id if it exists, nullptr otherwise */
    public native @SharedPtr @ByVal Node getNode(@Cast("dai::Node::Id") long id);

    /** Get all connections */
    public native @StdVector Node.Connection getConnections();
    /** Get a reference to internal connection representation */
    public native @Cast("const dai::Pipeline::NodeConnectionMap*") @ByRef NodeIdConnectionSetMap getConnectionMap();
    /** Get a reference to internal node map */
    public native @Cast("const dai::Pipeline::NodeMap*") @ByRef NodeIdNodeMap getNodeMap();

    /**
     * Link output to an input. Both nodes must be on the same pipeline
     *
     * Throws an error if they aren't or cannot be connected
     *
     * @param out Nodes output to connect from
     * @param in Nodes input to connect to
     */
    public native void link(@Const @ByRef Node.Output out, @Const @ByRef Node.Input in);

    /**
     * Unlink output from an input.
     *
     * Throws an error if link doesn't exists
     *
     * @param out Nodes output to unlink from
     * @param in Nodes input to unlink to
     */
    public native void unlink(@Const @ByRef Node.Output out, @Const @ByRef Node.Input in);

    /** Get pipelines AssetManager as reference */

    /** Get pipelines AssetManager as reference */
    public native @ByRef AssetManager getAssetManager();

    /** Set a specific OpenVINO version to use with this pipeline */
    public native void setOpenVINOVersion(@Cast("dai::OpenVINO::Version") int version);

    /**
     * Sets the calibration in pipeline which overrides the calibration data in eeprom
     *
     * @param calibrationDataHandler CalibrationHandler object which is loaded with calibration information.
     */
    public native void setCalibrationData(@ByVal CalibrationHandler calibrationDataHandler);

    /**
     * gets the calibration data which is set through pipeline
     *
     * @return the calibrationHandler with calib data in the pipeline
     */
    public native @ByVal CalibrationHandler getCalibrationData();

    /** Get possible OpenVINO version to run this pipeline */
    public native @Cast("dai::OpenVINO::Version") int getOpenVINOVersion();

    /** Get required OpenVINO version to run this pipeline. Can be none */
    public native @ByVal @Cast("tl::optional<dai::OpenVINO::Version>*") IntOptional getRequiredOpenVINOVersion();

    /** Set a camera IQ (Image Quality) tuning blob, used for all cameras */
    public native void setCameraTuningBlobPath(@Const @ByRef Path path);

    /**
     * Set chunk size for splitting device-sent XLink packets, in bytes. A larger value could
     * increase performance, with 0 disabling chunking. A negative value won't modify the
     * device defaults - configured per protocol, currently 64*1024 for both USB and Ethernet.
     */
    public native void setXLinkChunkSize(int sizeBytes);

    /** Checks whether a given OpenVINO version is compatible with the pipeline */
    public native @Cast("bool") boolean isOpenVINOVersionCompatible(@Cast("dai::OpenVINO::Version") int version);

    /** Sets board configuration */
    public native void setBoardConfig(@ByVal BoardConfig board);

    /** Gets board configuration */
    public native @ByVal BoardConfig getBoardConfig();

    /** Get device configuration needed for this pipeline */
    public native @ByVal DeviceBase.Config getDeviceConfig();
}
