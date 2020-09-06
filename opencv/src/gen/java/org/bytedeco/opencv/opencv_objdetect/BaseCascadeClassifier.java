// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_objdetect.*;


@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class BaseCascadeClassifier extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseCascadeClassifier(Pointer p) { super(p); }

    public native @Cast("bool") @Override boolean empty();
    public native @Cast("bool") boolean load( @Str BytePointer filename );
    public native @Cast("bool") boolean load( @Str String filename );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal UMat image,
                               @ByRef RectVector objects,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal GpuMat image,
                               @ByRef RectVector objects,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );

    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector IntPointer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector IntBuffer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector int[] numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal UMat image,
                               @ByRef RectVector objects,
                               @StdVector IntPointer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal UMat image,
                               @ByRef RectVector objects,
                               @StdVector IntBuffer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal UMat image,
                               @ByRef RectVector objects,
                               @StdVector int[] numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal GpuMat image,
                               @ByRef RectVector objects,
                               @StdVector IntPointer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal GpuMat image,
                               @ByRef RectVector objects,
                               @StdVector IntBuffer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal GpuMat image,
                               @ByRef RectVector objects,
                               @StdVector int[] numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );

    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntPointer rejectLevels,
                                       @StdVector DoublePointer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntBuffer rejectLevels,
                                       @StdVector DoubleBuffer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector int[] rejectLevels,
                                       @StdVector double[] levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal UMat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntPointer rejectLevels,
                                       @StdVector DoublePointer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal UMat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntBuffer rejectLevels,
                                       @StdVector DoubleBuffer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal UMat image,
                                       @ByRef RectVector objects,
                                       @StdVector int[] rejectLevels,
                                       @StdVector double[] levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal GpuMat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntPointer rejectLevels,
                                       @StdVector DoublePointer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal GpuMat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntBuffer rejectLevels,
                                       @StdVector DoubleBuffer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal GpuMat image,
                                       @ByRef RectVector objects,
                                       @StdVector int[] rejectLevels,
                                       @StdVector double[] levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );

    public native @Cast("bool") boolean isOldFormatCascade();
    public native @ByVal Size getOriginalWindowSize();
    public native int getFeatureType();
    public native Pointer getOldCascade();

    public static class MaskGenerator extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MaskGenerator(Pointer p) { super(p); }
    
        public native @ByVal Mat generateMask(@Const @ByRef Mat src);
        public native void initializeMask(@Const @ByRef Mat arg0);
    }
    public native void setMaskGenerator(@Ptr MaskGenerator maskGenerator);
    public native @Ptr MaskGenerator getMaskGenerator();
}
