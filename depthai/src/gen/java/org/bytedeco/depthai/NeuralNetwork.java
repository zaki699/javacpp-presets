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
 * \brief NeuralNetwork node. Runs a neural inference on input data.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NeuralNetwork extends NeuralNetworkPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NeuralNetwork(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public NeuralNetwork(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public NeuralNetwork(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr NeuralNetworkProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr NeuralNetworkProperties props);

    /**
     * Input message with data to be inferred upon
     * Default queue is blocking with size 5
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Outputs NNData message that carries inference results
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Passthrough message on which the inference was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthrough();

    /**
     * Inputs mapped to network inputs. Useful for inferring from separate data sources
     * Default input is non-blocking with queue size 1 and waits for messages
     */
    @MemberGetter public native @ByRef InputMap inputs();

    /**
     * Passthroughs which correspond to specified input
     */
    @MemberGetter public native @ByRef OutputMap passthroughs();

    // Specify local filesystem path to load the blob (which gets loaded at loadAssets)
    /**
     * Load network blob into assets and use once pipeline is started.
     *
     * @throws Error if file doesn't exist or isn't a valid network blob.
     * @param path Path to network blob
     */
    public native void setBlobPath(@Const @ByRef Path path);

    /**
     * Load network blob into assets and use once pipeline is started.
     *
     * @param blob Network blob
     */
    public native void setBlob(@ByVal OpenVINO.Blob blob);

    /**
     * Same functionality as the setBlobPath(). Load network blob into assets and use once pipeline is started.
     *
     * @throws Error if file doesn't exist or isn't a valid network blob.
     * @param path Path to network blob
     */
    public native void setBlob(@Const @ByRef Path path);

    /**
     * Specifies how many frames will be available in the pool
     * @param numFrames How many frames will pool have
     */
    public native void setNumPoolFrames(int numFrames);

    /**
     * How many threads should the node use to run the network.
     * @param numThreads Number of threads to dedicate to this node
     */
    public native void setNumInferenceThreads(int numThreads);

    /**
     * How many Neural Compute Engines should a single thread use for inference
     * @param numNCEPerThread Number of NCE per thread
     */
    public native void setNumNCEPerInferenceThread(int numNCEPerThread);

    /**
     * How many inference threads will be used to run the network
     * @return Number of threads, 0, 1 or 2. Zero means AUTO
     */
    public native int getNumInferenceThreads();
    // TODO add getters for other API
}
