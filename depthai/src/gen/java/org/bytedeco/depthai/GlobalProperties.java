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
 * Specify properties which apply for whole pipeline
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class GlobalProperties extends GlobalPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public GlobalProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GlobalProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GlobalProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GlobalProperties position(long position) {
        return (GlobalProperties)super.position(position);
    }
    @Override public GlobalProperties getPointer(long i) {
        return new GlobalProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Set frequency of Leon OS - Increasing can improve performance, at the cost of higher power
     * draw
     */
    public native double leonCssFrequencyHz(); public native GlobalProperties leonCssFrequencyHz(double setter);
    /**
     * Set frequency of Leon RT - Increasing can improve performance, at the cost of higher power
     * draw
     */
    public native double leonMssFrequencyHz(); public native GlobalProperties leonMssFrequencyHz(double setter);
    public native @ByRef StringOptional pipelineName(); public native GlobalProperties pipelineName(StringOptional setter);
    public native @ByRef StringOptional pipelineVersion(); public native GlobalProperties pipelineVersion(StringOptional setter);
    /**
     * Calibration data sent through pipeline
     */

    public native @ByRef EepromDataOptional calibData(); public native GlobalProperties calibData(EepromDataOptional setter);

    /**
     * Camera tuning blob size in bytes
     */
    public native @ByRef @Cast("tl::optional<std::uint32_t>*") IntOptional cameraTuningBlobSize(); public native GlobalProperties cameraTuningBlobSize(IntOptional setter);
    /**
     * Uri which points to camera tuning blob
     */
    public native @StdString BytePointer cameraTuningBlobUri(); public native GlobalProperties cameraTuningBlobUri(BytePointer setter);

    /**
     * Chunk size for splitting device-sent XLink packets, in bytes. A larger value could
     * increase performance, with 0 disabling chunking. A negative value won't modify the
     * device defaults - configured per protocol, currently 64*1024 for both USB and Ethernet.
     */
    public native int xlinkChunkSize(); public native GlobalProperties xlinkChunkSize(int setter);
}
