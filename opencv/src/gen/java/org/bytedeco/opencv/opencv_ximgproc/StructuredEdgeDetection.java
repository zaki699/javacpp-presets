// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;




/** \brief Class implementing edge detection algorithm from \cite Dollar2013 :
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class StructuredEdgeDetection extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructuredEdgeDetection(Pointer p) { super(p); }


    /** \brief The function detects edges in src and draw them to dst.
    <p>
    The algorithm underlies this function is much more robust to texture presence, than common
    approaches, e.g. Sobel
    @param src source image (RGB, float, in [0;1]) to detect edges
    @param dst destination image (grayscale, float, in [0;1]) where edges are drawn
    @see Sobel, Canny
     */
    public native void detectEdges(@ByVal Mat src, @ByVal Mat dst);
    public native void detectEdges(@ByVal UMat src, @ByVal UMat dst);
    public native void detectEdges(@ByVal GpuMat src, @ByVal GpuMat dst);

    /** \brief The function computes orientation from edge image.
    <p>
    @param src edge image.
    @param dst orientation image.
     */
    public native void computeOrientation(@ByVal Mat src, @ByVal Mat dst);
    public native void computeOrientation(@ByVal UMat src, @ByVal UMat dst);
    public native void computeOrientation(@ByVal GpuMat src, @ByVal GpuMat dst);


    /** \brief The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
    <p>
    @param edge_image edge image from detectEdges function.
    @param orientation_image orientation image from computeOrientation function.
    @param dst suppressed image (grayscale, float, in [0;1])
    @param r radius for NMS suppression.
    @param s radius for boundary suppression.
    @param m multiplier for conservative suppression.
    @param isParallel enables/disables parallel computing.
     */
    public native void edgesNms(@ByVal Mat edge_image, @ByVal Mat orientation_image, @ByVal Mat dst, int r/*=2*/, int s/*=0*/, float m/*=1*/, @Cast("bool") boolean isParallel/*=true*/);
    public native void edgesNms(@ByVal Mat edge_image, @ByVal Mat orientation_image, @ByVal Mat dst);
    public native void edgesNms(@ByVal UMat edge_image, @ByVal UMat orientation_image, @ByVal UMat dst, int r/*=2*/, int s/*=0*/, float m/*=1*/, @Cast("bool") boolean isParallel/*=true*/);
    public native void edgesNms(@ByVal UMat edge_image, @ByVal UMat orientation_image, @ByVal UMat dst);
    public native void edgesNms(@ByVal GpuMat edge_image, @ByVal GpuMat orientation_image, @ByVal GpuMat dst, int r/*=2*/, int s/*=0*/, float m/*=1*/, @Cast("bool") boolean isParallel/*=true*/);
    public native void edgesNms(@ByVal GpuMat edge_image, @ByVal GpuMat orientation_image, @ByVal GpuMat dst);
}
