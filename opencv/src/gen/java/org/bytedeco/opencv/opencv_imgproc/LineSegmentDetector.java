// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \} imgproc_subdiv2d
 <p>
 *  \addtogroup imgproc_feature
 *  \{
<p>
/** \brief Line segment detector class
<p>
following the algorithm described at \cite Rafael12 .
<p>
\note Implementation has been removed due original code license conflict
<p>
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class LineSegmentDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LineSegmentDetector(Pointer p) { super(p); }


    /** \brief Finds lines in the input image.
    <p>
    This is the output of the default parameters of the algorithm on the above shown image.
    <p>
    ![image](pics/building_lsd.png)
    <p>
    @param _image A grayscale (CV_8UC1) input image. If only a roi needs to be selected, use:
    {@code lsd_ptr-\>detect(image(roi), lines, ...); lines += Scalar(roi.x, roi.y, roi.x, roi.y);}
    @param _lines A vector of Vec4i or Vec4f elements specifying the beginning and ending point of a line. Where
    Vec4i/Vec4f is (x1, y1, x2, y2), point 1 is the start, point 2 - end. Returned lines are strictly
    oriented depending on the gradient.
    @param width Vector of widths of the regions, where the lines are found. E.g. Width of line.
    @param prec Vector of precisions with which the lines are found.
    @param nfa Vector containing number of false alarms in the line region, with precision of 10%. The
    bigger the value, logarithmically better the detection.
    - -1 corresponds to 10 mean false alarms
    - 0 corresponds to 1 mean false alarm
    - 1 corresponds to 0.1 mean false alarms
    This vector will be calculated only when the objects type is #LSD_REFINE_ADV.
    */
    public native void detect(@ByVal Mat _image, @ByVal Mat _lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat nfa);
    public native void detect(@ByVal Mat _image, @ByVal Mat _lines);
    public native void detect(@ByVal UMat _image, @ByVal UMat _lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat nfa);
    public native void detect(@ByVal UMat _image, @ByVal UMat _lines);
    public native void detect(@ByVal GpuMat _image, @ByVal GpuMat _lines,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat width, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat prec,
                            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat nfa);
    public native void detect(@ByVal GpuMat _image, @ByVal GpuMat _lines);

    /** \brief Draws the line segments on a given image.
    @param _image The image, where the lines will be drawn. Should be bigger or equal to the image,
    where the lines were found.
    @param lines A vector of the lines that needed to be drawn.
     */
    public native void drawSegments(@ByVal Mat _image, @ByVal Mat lines);
    public native void drawSegments(@ByVal UMat _image, @ByVal UMat lines);
    public native void drawSegments(@ByVal GpuMat _image, @ByVal GpuMat lines);

    /** \brief Draws two groups of lines in blue and red, counting the non overlapping (mismatching) pixels.
    <p>
    @param size The size of the image, where lines1 and lines2 were found.
    @param lines1 The first group of lines that needs to be drawn. It is visualized in blue color.
    @param lines2 The second group of lines. They visualized in red color.
    @param _image Optional image, where the lines will be drawn. The image should be color(3-channel)
    in order for lines1 and lines2 to be drawn in the above mentioned colors.
     */
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat _image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2);
    public native int compareSegments(@Const @ByRef Size size, @ByVal UMat lines1, @ByVal UMat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat _image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal UMat lines1, @ByVal UMat lines2);
    public native int compareSegments(@Const @ByRef Size size, @ByVal GpuMat lines1, @ByVal GpuMat lines2, @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat _image);
    public native int compareSegments(@Const @ByRef Size size, @ByVal GpuMat lines1, @ByVal GpuMat lines2);
}
