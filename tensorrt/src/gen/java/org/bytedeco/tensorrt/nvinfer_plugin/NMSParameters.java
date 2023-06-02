// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \brief The NMSParameters are used by the BatchedNMSPlugin for performing
 *  the non_max_suppression operation over boxes for object detection networks.
 *  @param shareLocation If set to true, the boxes inputs are shared across all
 *         classes. If set to false, the boxes input should account for per class box data.
 *  @param backgroundLabelId Label ID for the background class. If there is no background class, set it as -1
 *  @param numClasses Number of classes in the network.
 *  @param topK Number of bounding boxes to be fed into the NMS step.
 *  @param keepTopK Number of total bounding boxes to be kept per image after NMS step.
 *         Should be less than or equal to the topK value.
 *  @param scoreThreshold Scalar threshold for score (low scoring boxes are removed).
 *  @param iouThreshold scalar threshold for IOU (new boxes that have high IOU overlap
 *         with previously selected boxes are removed).
 *  @param isNormalized Set to false, if the box coordinates are not
 *         normalized, i.e. not in the range [0,1]. Defaults to false.
 *  */

@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class NMSParameters extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NMSParameters() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NMSParameters(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NMSParameters(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NMSParameters position(long position) {
        return (NMSParameters)super.position(position);
    }
    @Override public NMSParameters getPointer(long i) {
        return new NMSParameters((Pointer)this).offsetAddress(i);
    }

    public native @Cast("bool") boolean shareLocation(); public native NMSParameters shareLocation(boolean setter);
    public native int backgroundLabelId(); public native NMSParameters backgroundLabelId(int setter);
    public native int numClasses(); public native NMSParameters numClasses(int setter);
    public native int topK(); public native NMSParameters topK(int setter);
    public native int keepTopK(); public native NMSParameters keepTopK(int setter);
    public native float scoreThreshold(); public native NMSParameters scoreThreshold(float setter);
    public native float iouThreshold(); public native NMSParameters iouThreshold(float setter);
    public native @Cast("bool") boolean isNormalized(); public native NMSParameters isNormalized(boolean setter);
}
