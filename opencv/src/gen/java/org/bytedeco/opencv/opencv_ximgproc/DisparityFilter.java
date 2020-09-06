// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief Main interface for all disparity map filters.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class DisparityFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisparityFilter(Pointer p) { super(p); }


    /** \brief Apply filtering to the disparity map.
    <p>
    @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
    values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
    can have any resolution, it will be automatically resized to fit left_view resolution.
    <p>
    @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
    or three-channel image.
    <p>
    @param filtered_disparity_map output disparity map.
    <p>
    @param disparity_map_right optional argument, some implementations might also use the disparity map
    of the right view to compute confidence maps, for instance.
    <p>
    @param ROI region of the disparity map to filter. Optional, usually it should be set automatically.
    <p>
    @param right_view optional argument, some implementations might also use the right view of the original
    stereo-pair.
     */
    public native void filter(@ByVal Mat disparity_map_left, @ByVal Mat left_view, @ByVal Mat filtered_disparity_map, @ByVal(nullValue = "cv::InputArray(cv::Mat())") Mat disparity_map_right, @ByVal(nullValue = "cv::Rect()") Rect ROI, @ByVal(nullValue = "cv::InputArray(cv::Mat())") Mat right_view);
    public native void filter(@ByVal Mat disparity_map_left, @ByVal Mat left_view, @ByVal Mat filtered_disparity_map);
    public native void filter(@ByVal UMat disparity_map_left, @ByVal UMat left_view, @ByVal UMat filtered_disparity_map, @ByVal(nullValue = "cv::InputArray(cv::Mat())") UMat disparity_map_right, @ByVal(nullValue = "cv::Rect()") Rect ROI, @ByVal(nullValue = "cv::InputArray(cv::Mat())") UMat right_view);
    public native void filter(@ByVal UMat disparity_map_left, @ByVal UMat left_view, @ByVal UMat filtered_disparity_map);
    public native void filter(@ByVal GpuMat disparity_map_left, @ByVal GpuMat left_view, @ByVal GpuMat filtered_disparity_map, @ByVal(nullValue = "cv::InputArray(cv::Mat())") GpuMat disparity_map_right, @ByVal(nullValue = "cv::Rect()") Rect ROI, @ByVal(nullValue = "cv::InputArray(cv::Mat())") GpuMat right_view);
    public native void filter(@ByVal GpuMat disparity_map_left, @ByVal GpuMat left_view, @ByVal GpuMat filtered_disparity_map);
}
