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
 * EdgeDetectorConfig message. Carries sobel edge filter config.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EdgeDetectorConfig extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeDetectorConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EdgeDetectorConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EdgeDetectorConfig position(long position) {
        return (EdgeDetectorConfig)super.position(position);
    }
    @Override public EdgeDetectorConfig getPointer(long i) {
        return new EdgeDetectorConfig((Pointer)this).offsetAddress(i);
    }

    /**
     * Construct EdgeDetectorConfig message.
     */
    public EdgeDetectorConfig() { super((Pointer)null); allocate(); }
    private native void allocate();
    public EdgeDetectorConfig(@SharedPtr RawEdgeDetectorConfig ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawEdgeDetectorConfig ptr);

    /**
     * Set sobel filter horizontal and vertical 3x3 kernels
     * @param horizontalKernel Used for horizontal gradient computation in 3x3 Sobel filter
     * @param verticalKernel Used for vertical gradient computation in 3x3 Sobel filter
     */
    public native void setSobelFilterKernels(@Const @ByRef IntVectorVector horizontalKernel, @Const @ByRef IntVectorVector verticalKernel);

    /**
     * Retrieve configuration data for EdgeDetector
     * @return EdgeDetectorConfigData: sobel filter horizontal and vertical 3x3 kernels
     */
    public native @ByVal EdgeDetectorConfigData getConfigData();
}
