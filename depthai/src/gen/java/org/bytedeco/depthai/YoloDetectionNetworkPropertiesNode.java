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

@Name("dai::NodeCRTP<dai::node::DetectionNetwork,dai::node::YoloDetectionNetwork,dai::DetectionNetworkProperties>") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class YoloDetectionNetworkPropertiesNode extends DetectionNetwork {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public YoloDetectionNetworkPropertiesNode(Pointer p) { super(p); }

    /** Underlying properties */
    public native @Cast("dai::NodeCRTP<dai::node::DetectionNetwork,dai::node::YoloDetectionNetwork,dai::DetectionNetworkProperties>::Properties*") @ByRef DetectionNetworkProperties properties(); public native YoloDetectionNetworkPropertiesNode properties(DetectionNetworkProperties setter);
    public native @Override @Cast("const char*") BytePointer getName();
    public native @UniquePtr @Override Node clone();
}
