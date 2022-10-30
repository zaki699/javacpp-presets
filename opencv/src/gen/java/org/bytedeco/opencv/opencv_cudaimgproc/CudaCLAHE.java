// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;


/** \brief Base class for Contrast Limited Adaptive Histogram Equalization. :
 */
@Name("cv::cuda::CLAHE") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class CudaCLAHE extends CLAHE {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CudaCLAHE(Pointer p) { super(p); }

    /** \brief Equalizes the histogram of a grayscale image using Contrast Limited Adaptive Histogram Equalization.
    <p>
    @param src Source image with CV_8UC1 type.
    @param dst Destination image.
    @param stream Stream for the asynchronous version.
     */
    public native void apply(@ByVal Mat src, @ByVal Mat dst, @ByRef Stream stream);
    public native void apply(@ByVal UMat src, @ByVal UMat dst, @ByRef Stream stream);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst, @ByRef Stream stream);
}
