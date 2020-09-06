// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudafeatures2d;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudafeatures2d.*;


//
// ORB
//

/** \brief Class implementing the ORB (*oriented BRIEF*) keypoint detector and descriptor extractor
 *
 * @see cv::ORB
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudafeatures2d.class)
public class ORB extends Feature2DAsync {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ORB(Pointer p) { super(p); }

    @MemberGetter public static native int X_ROW();
    public static final int X_ROW = X_ROW();
    @MemberGetter public static native int Y_ROW();
    public static final int Y_ROW = Y_ROW();
    @MemberGetter public static native int RESPONSE_ROW();
    public static final int RESPONSE_ROW = RESPONSE_ROW();
    @MemberGetter public static native int ANGLE_ROW();
    public static final int ANGLE_ROW = ANGLE_ROW();
    @MemberGetter public static native int OCTAVE_ROW();
    public static final int OCTAVE_ROW = OCTAVE_ROW();
    @MemberGetter public static native int SIZE_ROW();
    public static final int SIZE_ROW = SIZE_ROW();
    @MemberGetter public static native int ROWS_COUNT();
    public static final int ROWS_COUNT = ROWS_COUNT();

    public static native @Ptr ORB create(int nfeatures/*=500*/,
                               float scaleFactor/*=1.2f*/,
                               int nlevels/*=8*/,
                               int edgeThreshold/*=31*/,
                               int firstLevel/*=0*/,
                               int WTA_K/*=2*/,
                               int scoreType/*=cv::ORB::HARRIS_SCORE*/,
                               int patchSize/*=31*/,
                               int fastThreshold/*=20*/,
                               @Cast("bool") boolean blurForDescriptor/*=false*/);
    public static native @Ptr ORB create();

    /** if true, image will be blurred before descriptors calculation */
    public native void setBlurForDescriptor(@Cast("bool") boolean blurForDescriptor);
    public native @Cast("bool") boolean getBlurForDescriptor();

    public native void setFastThreshold(int fastThreshold);
    public native int getFastThreshold();
}
