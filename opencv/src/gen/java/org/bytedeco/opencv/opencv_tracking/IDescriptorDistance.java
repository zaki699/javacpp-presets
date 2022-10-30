// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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

import static org.bytedeco.opencv.global.opencv_tracking.*;



/**
 *  \brief The IDescriptorDistance class declares an interface for distance
 *  computation between reidentification descriptors.
 *  */
@Namespace("cv::detail::tracking::tbm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class IDescriptorDistance extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDescriptorDistance(Pointer p) { super(p); }

    /**
     *  \brief Computes distance between two descriptors.
     *  @param descr [in] 1 First descriptor.
     *  @param descr [in] 2 Second descriptor.
     *  @return Distance between two descriptors.
     *  */
    
    
    ///
    ///
    public native float compute(@Const @ByRef Mat descr1, @Const @ByRef Mat descr2);

    /**
     *  \brief Computes distances between two descriptors in batches.
     *  @param descrs [in] 1 Batch of first descriptors.
     *  @param descrs [in] 2 Batch of second descriptors.
     *  @return Distances between descriptors.
     *  */
    public native @StdVector FloatPointer compute(@Const @ByRef MatVector descrs1,
                                           @Const @ByRef MatVector descrs2);
}
