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
 * Specify properties for EdgeDetector
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EdgeDetectorProperties extends EdgeDetectorPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public EdgeDetectorProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EdgeDetectorProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeDetectorProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EdgeDetectorProperties position(long position) {
        return (EdgeDetectorProperties)super.position(position);
    }
    @Override public EdgeDetectorProperties getPointer(long i) {
        return new EdgeDetectorProperties((Pointer)this).offsetAddress(i);
    }

    /** Initial edge detector config */
    public native @ByRef RawEdgeDetectorConfig initialConfig(); public native EdgeDetectorProperties initialConfig(RawEdgeDetectorConfig setter);

    /**
     * Maximum output frame size in bytes (eg: 300x300 BGR image -> 300*300*3 bytes)
     */
    public native int outputFrameSize(); public native EdgeDetectorProperties outputFrameSize(int setter);

    /** Num frames in output pool */
    public native int numFramesPool(); public native EdgeDetectorProperties numFramesPool(int setter);
}
