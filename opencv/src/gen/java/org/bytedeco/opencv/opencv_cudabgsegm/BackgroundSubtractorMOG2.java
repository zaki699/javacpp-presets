// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudabgsegm;

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

import static org.bytedeco.opencv.global.opencv_cudabgsegm.*;


////////////////////////////////////////////////////
// MOG2

/** \brief Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
<p>
The class discriminates between foreground and background pixels by building and maintaining a model
of the background. Any pixel which does not fit this model is then deemed to be foreground. The
class implements algorithm described in \cite Zivkovic2004 .
<p>
@see BackgroundSubtractorMOG2
 */
@Name("cv::cuda::BackgroundSubtractorMOG2") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudabgsegm.class)
public class BackgroundSubtractorMOG2 extends org.bytedeco.opencv.opencv_video.BackgroundSubtractorMOG2 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorMOG2(Pointer p) { super(p); }


    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate, @ByRef Stream stream);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate, @ByRef Stream stream);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate, @ByRef Stream stream);

    public native void getBackgroundImage(@ByVal Mat backgroundImage, @ByRef Stream stream);
    public native void getBackgroundImage(@ByVal UMat backgroundImage, @ByRef Stream stream);

    public native void getBackgroundImage(@ByRef GpuMat backgroundImage, @ByRef Stream stream);
}
