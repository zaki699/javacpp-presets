// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;



@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class DpSeamFinder extends SeamFinder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DpSeamFinder(Pointer p) { super(p); }

    /** enum cv::detail::DpSeamFinder::CostFunction */
    public static final int COLOR = 0, COLOR_GRAD = 1;

    public DpSeamFinder(@Cast("cv::detail::DpSeamFinder::CostFunction") int costFunc/*=cv::detail::DpSeamFinder::COLOR*/) { super((Pointer)null); allocate(costFunc); }
    private native void allocate(@Cast("cv::detail::DpSeamFinder::CostFunction") int costFunc/*=cv::detail::DpSeamFinder::COLOR*/);
    public DpSeamFinder() { super((Pointer)null); allocate(); }
    private native void allocate();
    public DpSeamFinder(@Str BytePointer costFunc ) { super((Pointer)null); allocate(costFunc); }
    private native void allocate(@Str BytePointer costFunc );
    public DpSeamFinder(@Str String costFunc ) { super((Pointer)null); allocate(costFunc); }
    private native void allocate(@Str String costFunc );

    public native @Cast("cv::detail::DpSeamFinder::CostFunction") int costFunction();
    public native void setCostFunction(@Cast("cv::detail::DpSeamFinder::CostFunction") int val);
    public native void setCostFunction(@Str BytePointer val);
    public native void setCostFunction(@Str String val);

    public native void find(@Const @ByRef UMatVector src, @Const @ByRef PointVector corners,
                          @ByRef UMatVector masks);
}
