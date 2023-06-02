// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_optflow.*;

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
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;

public class opencv_optflow extends org.bytedeco.opencv.presets.opencv_optflow {
    static { Loader.load(); }

// Parsed from <opencv2/optflow.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_OPTFLOW_HPP__
// #define __OPENCV_OPTFLOW_HPP__

// #include "opencv2/core.hpp"
// #include "opencv2/video.hpp"

/**
\defgroup optflow Optical Flow Algorithms
<p>
Dense optical flow algorithms compute motion for each point:
<p>
- cv::optflow::calcOpticalFlowSF
- cv::optflow::createOptFlow_DeepFlow
<p>
Motion templates is alternative technique for detecting motion and computing its direction.
See samples/motempl.py.
<p>
- cv::motempl::updateMotionHistory
- cv::motempl::calcMotionGradient
- cv::motempl::calcGlobalOrientation
- cv::motempl::segmentMotion
<p>
Functions reading and writing .flo files in "Middlebury" format, see: <http://vision.middlebury.edu/flow/code/flow-code/README.txt>
<p>
- cv::optflow::readOpticalFlow
- cv::optflow::writeOpticalFlow
 <p>
 */

// #include "opencv2/optflow/pcaflow.hpp"
// #include "opencv2/optflow/sparse_matching_gpc.hpp"
// #include "opencv2/optflow/rlofflow.hpp"

/** \addtogroup optflow
 *  \{
<p>
/** \overload */
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal Mat from, @ByVal Mat to, @ByVal Mat flow,
                                     int layers, int averaging_block_size, int max_flow);
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal UMat from, @ByVal UMat to, @ByVal UMat flow,
                                     int layers, int averaging_block_size, int max_flow);
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal GpuMat from, @ByVal GpuMat to, @ByVal GpuMat flow,
                                     int layers, int averaging_block_size, int max_flow);

/** \brief Calculate an optical flow using "SimpleFlow" algorithm.
<p>
@param from First 8-bit 3-channel image.
@param to Second 8-bit 3-channel image of the same size as prev
@param flow computed flow image that has the same size as prev and type CV_32FC2
@param layers Number of layers
@param averaging_block_size Size of block through which we sum up when calculate cost function
for pixel
@param max_flow maximal flow that we search at each level
@param sigma_dist vector smooth spatial sigma parameter
@param sigma_color vector smooth color sigma parameter
@param postprocess_window window size for postprocess cross bilateral filter
@param sigma_dist_fix spatial sigma for postprocess cross bilateralf filter
@param sigma_color_fix color sigma for postprocess cross bilateral filter
@param occ_thr threshold for detecting occlusions
@param upscale_averaging_radius window size for bilateral upscale operation
@param upscale_sigma_dist spatial sigma for bilateral upscale operation
@param upscale_sigma_color color sigma for bilateral upscale operation
@param speed_up_thr threshold to detect point with irregular flow - where flow should be
recalculated after upscale
<p>
See \cite Tao2012 . And site of project - <http://graphics.berkeley.edu/papers/Tao-SAN-2012-05/>.
<p>
\note
   -   An example using the simpleFlow algorithm can be found at samples/simpleflow_demo.cpp
 */
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal Mat from, @ByVal Mat to, @ByVal Mat flow, int layers,
                                     int averaging_block_size, int max_flow,
                                     double sigma_dist, double sigma_color, int postprocess_window,
                                     double sigma_dist_fix, double sigma_color_fix, double occ_thr,
                                     int upscale_averaging_radius, double upscale_sigma_dist,
                                     double upscale_sigma_color, double speed_up_thr );
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal UMat from, @ByVal UMat to, @ByVal UMat flow, int layers,
                                     int averaging_block_size, int max_flow,
                                     double sigma_dist, double sigma_color, int postprocess_window,
                                     double sigma_dist_fix, double sigma_color_fix, double occ_thr,
                                     int upscale_averaging_radius, double upscale_sigma_dist,
                                     double upscale_sigma_color, double speed_up_thr );
@Namespace("cv::optflow") public static native void calcOpticalFlowSF( @ByVal GpuMat from, @ByVal GpuMat to, @ByVal GpuMat flow, int layers,
                                     int averaging_block_size, int max_flow,
                                     double sigma_dist, double sigma_color, int postprocess_window,
                                     double sigma_dist_fix, double sigma_color_fix, double occ_thr,
                                     int upscale_averaging_radius, double upscale_sigma_dist,
                                     double upscale_sigma_color, double speed_up_thr );

/** \brief Fast dense optical flow based on PyrLK sparse matches interpolation.
<p>
@param from first 8-bit 3-channel or 1-channel image.
@param to  second 8-bit 3-channel or 1-channel image of the same size as from
@param flow computed flow image that has the same size as from and CV_32FC2 type
@param grid_step stride used in sparse match computation. Lower values usually
       result in higher quality but slow down the algorithm.
@param k number of nearest-neighbor matches considered, when fitting a locally affine
       model. Lower values can make the algorithm noticeably faster at the cost of
       some quality degradation.
@param sigma parameter defining how fast the weights decrease in the locally-weighted affine
       fitting. Higher values can help preserve fine details, lower values can help to get rid
       of the noise in the output flow.
@param use_post_proc defines whether the ximgproc::fastGlobalSmootherFilter() is used
       for post-processing after interpolation
@param fgs_lambda see the respective parameter of the ximgproc::fastGlobalSmootherFilter()
@param fgs_sigma  see the respective parameter of the ximgproc::fastGlobalSmootherFilter()
 */
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal Mat from, @ByVal Mat to, @ByVal Mat flow,
                                                 int grid_step/*=8*/, int k/*=128*/, float sigma/*=0.05f*/,
                                                 @Cast("bool") boolean use_post_proc/*=true*/, float fgs_lambda/*=500.0f*/,
                                                 float fgs_sigma/*=1.5f*/ );
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal Mat from, @ByVal Mat to, @ByVal Mat flow );
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal UMat from, @ByVal UMat to, @ByVal UMat flow,
                                                 int grid_step/*=8*/, int k/*=128*/, float sigma/*=0.05f*/,
                                                 @Cast("bool") boolean use_post_proc/*=true*/, float fgs_lambda/*=500.0f*/,
                                                 float fgs_sigma/*=1.5f*/ );
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal UMat from, @ByVal UMat to, @ByVal UMat flow );
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal GpuMat from, @ByVal GpuMat to, @ByVal GpuMat flow,
                                                 int grid_step/*=8*/, int k/*=128*/, float sigma/*=0.05f*/,
                                                 @Cast("bool") boolean use_post_proc/*=true*/, float fgs_lambda/*=500.0f*/,
                                                 float fgs_sigma/*=1.5f*/ );
@Namespace("cv::optflow") public static native void calcOpticalFlowSparseToDense( @ByVal GpuMat from, @ByVal GpuMat to, @ByVal GpuMat flow );

/** \brief DeepFlow optical flow algorithm implementation.
<p>
The class implements the DeepFlow optical flow algorithm described in \cite Weinzaepfel2013 . See
also <http://lear.inrialpes.fr/src/deepmatching/> .
Parameters - class fields - that may be modified after creating a class instance:
-   member float alpha
Smoothness assumption weight
-   member float delta
Color constancy assumption weight
-   member float gamma
Gradient constancy weight
-   member float sigma
Gaussian smoothing parameter
-   member int minSize
Minimal dimension of an image in the pyramid (next, smaller images in the pyramid are generated
until one of the dimensions reaches this size)
-   member float downscaleFactor
Scaling factor in the image pyramid (must be \< 1)
-   member int fixedPointIterations
How many iterations on each level of the pyramid
-   member int sorIterations
Iterations of Succesive Over-Relaxation (solver)
-   member float omega
Relaxation factor in SOR
 */
@Namespace("cv::optflow") public static native @Ptr DenseOpticalFlow createOptFlow_DeepFlow();

/** Additional interface to the SimpleFlow algorithm - calcOpticalFlowSF() */
@Namespace("cv::optflow") public static native @Ptr DenseOpticalFlow createOptFlow_SimpleFlow();

/** Additional interface to the Farneback's algorithm - calcOpticalFlowFarneback() */
@Namespace("cv::optflow") public static native @Ptr DenseOpticalFlow createOptFlow_Farneback();

/** Additional interface to the SparseToDenseFlow algorithm - calcOpticalFlowSparseToDense() */
@Namespace("cv::optflow") public static native @Ptr DenseOpticalFlow createOptFlow_SparseToDense();
// Targeting ../opencv_optflow/DualTVL1OpticalFlow.java



/** \brief Creates instance of cv::DenseOpticalFlow
*/
@Namespace("cv::optflow") public static native @Ptr DualTVL1OpticalFlow createOptFlow_DualTVL1();

/** \} */

 //optflow


// #include "opencv2/optflow/motempl.hpp"

// #endif


// Parsed from <opencv2/optflow/motempl.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_OPTFLOW_MOTEMPL_HPP__
// #define __OPENCV_OPTFLOW_MOTEMPL_HPP__

// #include "opencv2/core.hpp"

/** \addtogroup optflow
 *  \{
<p>
/** \brief Updates the motion history image by a moving silhouette.
<p>
@param silhouette Silhouette mask that has non-zero pixels where the motion occurs.
@param mhi Motion history image that is updated by the function (single-channel, 32-bit
floating-point).
@param timestamp Current time in milliseconds or other units.
@param duration Maximal duration of the motion track in the same units as timestamp .
<p>
The function updates the motion history image as follows:
<p>
<pre>{@code \[\texttt{mhi} (x,y)= \forkthree{\texttt{timestamp}}{if \(\texttt{silhouette}(x,y) \ne 0\)}{0}{if \(\texttt{silhouette}(x,y) = 0\) and \(\texttt{mhi} < (\texttt{timestamp} - \texttt{duration})\)}{\texttt{mhi}(x,y)}{otherwise}\]}</pre>
<p>
That is, MHI pixels where the motion occurs are set to the current timestamp , while the pixels
where the motion happened last time a long time ago are cleared.
<p>
The function, together with calcMotionGradient and calcGlobalOrientation , implements a motion
templates technique described in \cite Davis97 and \cite Bradski00 .
 */
@Namespace("cv::motempl") public static native void updateMotionHistory( @ByVal Mat silhouette, @ByVal Mat mhi,
                                       double timestamp, double duration );
@Namespace("cv::motempl") public static native void updateMotionHistory( @ByVal UMat silhouette, @ByVal UMat mhi,
                                       double timestamp, double duration );
@Namespace("cv::motempl") public static native void updateMotionHistory( @ByVal GpuMat silhouette, @ByVal GpuMat mhi,
                                       double timestamp, double duration );

/** \brief Calculates a gradient orientation of a motion history image.
<p>
@param mhi Motion history single-channel floating-point image.
@param mask Output mask image that has the type CV_8UC1 and the same size as mhi . Its non-zero
elements mark pixels where the motion gradient data is correct.
@param orientation Output motion gradient orientation image that has the same type and the same
size as mhi . Each pixel of the image is a motion orientation, from 0 to 360 degrees.
@param delta1 Minimal (or maximal) allowed difference between mhi values within a pixel
neighborhood.
@param delta2 Maximal (or minimal) allowed difference between mhi values within a pixel
neighborhood. That is, the function finds the minimum ( {@code m(x,y)} ) and maximum ( {@code M(x,y)} ) mhi
values over {@code 3 \times 3} neighborhood of each pixel and marks the motion orientation at {@code (x, y)}
as valid only if
<pre>{@code \[\min ( \texttt{delta1}  ,  \texttt{delta2}  )  \le  M(x,y)-m(x,y)  \le   \max ( \texttt{delta1}  , \texttt{delta2} ).\]}</pre>
@param apertureSize Aperture size of the Sobel operator.
<p>
The function calculates a gradient orientation at each pixel {@code (x, y)} as:
<p>
<pre>{@code \[\texttt{orientation} (x,y)= \arctan{\frac{d\texttt{mhi}/dy}{d\texttt{mhi}/dx}}\]}</pre>
<p>
In fact, fastAtan2 and phase are used so that the computed angle is measured in degrees and covers
the full range 0..360. Also, the mask is filled to indicate pixels where the computed angle is
valid.
<p>
\note
   -   (Python) An example on how to perform a motion template technique can be found at
        opencv_source_code/samples/python2/motempl.py
 */
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal Mat mhi, @ByVal Mat mask, @ByVal Mat orientation,
                                      double delta1, double delta2, int apertureSize/*=3*/ );
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal Mat mhi, @ByVal Mat mask, @ByVal Mat orientation,
                                      double delta1, double delta2 );
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal UMat mhi, @ByVal UMat mask, @ByVal UMat orientation,
                                      double delta1, double delta2, int apertureSize/*=3*/ );
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal UMat mhi, @ByVal UMat mask, @ByVal UMat orientation,
                                      double delta1, double delta2 );
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal GpuMat mhi, @ByVal GpuMat mask, @ByVal GpuMat orientation,
                                      double delta1, double delta2, int apertureSize/*=3*/ );
@Namespace("cv::motempl") public static native void calcMotionGradient( @ByVal GpuMat mhi, @ByVal GpuMat mask, @ByVal GpuMat orientation,
                                      double delta1, double delta2 );

/** \brief Calculates a global motion orientation in a selected region.
<p>
@param orientation Motion gradient orientation image calculated by the function calcMotionGradient
@param mask Mask image. It may be a conjunction of a valid gradient mask, also calculated by
calcMotionGradient , and the mask of a region whose direction needs to be calculated.
@param mhi Motion history image calculated by updateMotionHistory .
@param timestamp Timestamp passed to updateMotionHistory .
@param duration Maximum duration of a motion track in milliseconds, passed to updateMotionHistory
<p>
The function calculates an average motion direction in the selected region and returns the angle
between 0 degrees and 360 degrees. The average direction is computed from the weighted orientation
histogram, where a recent motion has a larger weight and the motion occurred in the past has a
smaller weight, as recorded in mhi .
 */
@Namespace("cv::motempl") public static native double calcGlobalOrientation( @ByVal Mat orientation, @ByVal Mat mask, @ByVal Mat mhi,
                                           double timestamp, double duration );
@Namespace("cv::motempl") public static native double calcGlobalOrientation( @ByVal UMat orientation, @ByVal UMat mask, @ByVal UMat mhi,
                                           double timestamp, double duration );
@Namespace("cv::motempl") public static native double calcGlobalOrientation( @ByVal GpuMat orientation, @ByVal GpuMat mask, @ByVal GpuMat mhi,
                                           double timestamp, double duration );

/** \brief Splits a motion history image into a few parts corresponding to separate independent motions (for
example, left hand, right hand).
<p>
@param mhi Motion history image.
@param segmask Image where the found mask should be stored, single-channel, 32-bit floating-point.
@param boundingRects Vector containing ROIs of motion connected components.
@param timestamp Current time in milliseconds or other units.
@param segThresh Segmentation threshold that is recommended to be equal to the interval between
motion history "steps" or greater.
<p>
The function finds all of the motion segments and marks them in segmask with individual values
(1,2,...). It also computes a vector with ROIs of motion connected components. After that the motion
direction for every component can be calculated with calcGlobalOrientation using the extracted mask
of the particular component.
 */
@Namespace("cv::motempl") public static native void segmentMotion( @ByVal Mat mhi, @ByVal Mat segmask,
                                 @ByRef RectVector boundingRects,
                                 double timestamp, double segThresh );
@Namespace("cv::motempl") public static native void segmentMotion( @ByVal UMat mhi, @ByVal UMat segmask,
                                 @ByRef RectVector boundingRects,
                                 double timestamp, double segThresh );
@Namespace("cv::motempl") public static native void segmentMotion( @ByVal GpuMat mhi, @ByVal GpuMat segmask,
                                 @ByRef RectVector boundingRects,
                                 double timestamp, double segThresh );
                                 

/** \} */


                                 
                                 
// #endif


}
