// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \} features2d_main
 <p>
 *  \addtogroup features2d_main
 *  \{
<p>
/** \brief Class implementing the KAZE keypoint detector and descriptor extractor, described in \cite ABD12 .
<p>
\note AKAZE descriptor can only be used with KAZE or AKAZE keypoints .. [ABD12] KAZE Features. Pablo
F. Alcantarilla, Adrien Bartoli and Andrew J. Davison. In European Conference on Computer Vision
(ECCV), Fiorenze, Italy, October 2012.
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class KAZE extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KAZE(Pointer p) { super(p); }

    /** enum cv::KAZE::DiffusivityType */
    public static final int
        DIFF_PM_G1 = 0,
        DIFF_PM_G2 = 1,
        DIFF_WEICKERT = 2,
        DIFF_CHARBONNIER = 3;

    /** \brief The KAZE constructor
    <p>
    @param extended Set to enable extraction of extended (128-byte) descriptor.
    @param upright Set to enable use of upright descriptors (non rotation-invariant).
    @param threshold Detector response threshold to accept point
    @param nOctaves Maximum octave evolution of the image
    @param nOctaveLayers Default number of sublevels per scale level
    @param diffusivity Diffusivity type. DIFF_PM_G1, DIFF_PM_G2, DIFF_WEICKERT or
    DIFF_CHARBONNIER
     */
    public static native @Ptr KAZE create(@Cast("bool") boolean extended/*=false*/, @Cast("bool") boolean upright/*=false*/,
                                        float threshold/*=0.001f*/,
                                        int nOctaves/*=4*/, int nOctaveLayers/*=4*/,
                                        @Cast("cv::KAZE::DiffusivityType") int diffusivity/*=cv::KAZE::DIFF_PM_G2*/);
    public static native @Ptr KAZE create();

    public native void setExtended(@Cast("bool") boolean extended);
    public native @Cast("bool") boolean getExtended();

    public native void setUpright(@Cast("bool") boolean upright);
    public native @Cast("bool") boolean getUpright();

    public native void setThreshold(double threshold);
    public native double getThreshold();

    public native void setNOctaves(int octaves);
    public native int getNOctaves();

    public native void setNOctaveLayers(int octaveLayers);
    public native int getNOctaveLayers();

    public native void setDiffusivity(@Cast("cv::KAZE::DiffusivityType") int diff);
    public native @Cast("cv::KAZE::DiffusivityType") int getDiffusivity();
    public native @Str @Override BytePointer getDefaultName();
}
