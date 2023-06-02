// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaobjdetect;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaobjdetect.*;


//
// CascadeClassifier
//

/** \brief Cascade classifier class used for object detection. Supports HAAR and LBP cascades. :
<p>
\note
   -   A cascade classifier example can be found at
        opencv_source_code/samples/gpu/cascadeclassifier.cpp
    -   A Nvidea API specific cascade classifier example can be found at
        opencv_source_code/samples/gpu/cascadeclassifier_nvidia_api.cpp
 */
@Name("cv::cuda::CascadeClassifier") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaobjdetect.class)
public class CudaCascadeClassifier extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CudaCascadeClassifier(Pointer p) { super(p); }

    /** \brief Loads the classifier from a file. Cascade type is detected automatically by constructor parameter.
    <p>
    @param filename Name of the file from which the classifier is loaded. Only the old haar classifier
    (trained by the haar training application) and NVIDIA's nvbin are supported for HAAR and only new
    type of OpenCV XML cascade supported for LBP. The working haar models can be found at opencv_folder/data/haarcascades_cuda/
     */
    public static native @Ptr CudaCascadeClassifier create(@Str BytePointer filename);
    public static native @Ptr CudaCascadeClassifier create(@Str String filename);
    /** \overload
     */
    public static native @Ptr CudaCascadeClassifier create(@Const @ByRef FileStorage file);

    /** Maximum possible object size. Objects larger than that are ignored. Used for
     *  second signature and supported only for LBP cascades. */
    public native void setMaxObjectSize(@ByVal Size maxObjectSize);
    public native @ByVal Size getMaxObjectSize();

    /** Minimum possible object size. Objects smaller than that are ignored. */
    public native void setMinObjectSize(@ByVal Size minSize);
    public native @ByVal Size getMinObjectSize();

    /** Parameter specifying how much the image size is reduced at each image scale. */
    public native void setScaleFactor(double scaleFactor);
    public native double getScaleFactor();

    /** Parameter specifying how many neighbors each candidate rectangle should have
     *  to retain it. */
    public native void setMinNeighbors(int minNeighbors);
    public native int getMinNeighbors();

    public native void setFindLargestObject(@Cast("bool") boolean findLargestObject);
    public native @Cast("bool") boolean getFindLargestObject();

    public native void setMaxNumObjects(int maxNumObjects);
    public native int getMaxNumObjects();

    public native @ByVal Size getClassifierSize();

    /** \brief Detects objects of different sizes in the input image.
    <p>
    @param image Matrix of type CV_8U containing an image where objects should be detected.
    @param objects Buffer to store detected objects (rectangles).
    @param stream CUDA stream.
    <p>
    To get final array of detected objects use CascadeClassifier::convert method.
    <p>
    <pre>{@code
        Ptr<cuda::CascadeClassifier> cascade_gpu = cuda::CascadeClassifier::create(...);

        Mat image_cpu = imread(...)
        GpuMat image_gpu(image_cpu);

        GpuMat objbuf;
        cascade_gpu->detectMultiScale(image_gpu, objbuf);

        std::vector<Rect> faces;
        cascade_gpu->convert(objbuf, faces);

        for(int i = 0; i < detections_num; ++i)
           cv::rectangle(image_cpu, faces[i], Scalar(255));

        imshow("Faces", image_cpu);
    }</pre>
    <p>
    @see CascadeClassifier::detectMultiScale
     */
    public native void detectMultiScale(@ByVal Mat image,
                                      @ByVal Mat objects,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detectMultiScale(@ByVal Mat image,
                                      @ByVal Mat objects);
    public native void detectMultiScale(@ByVal UMat image,
                                      @ByVal UMat objects,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detectMultiScale(@ByVal UMat image,
                                      @ByVal UMat objects);
    public native void detectMultiScale(@ByVal GpuMat image,
                                      @ByVal GpuMat objects,
                                      @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detectMultiScale(@ByVal GpuMat image,
                                      @ByVal GpuMat objects);

    /** \brief Converts objects array from internal representation to standard vector.
    <p>
    @param gpu_objects Objects array in internal representation.
    @param objects Resulting array.
     */
    public native void convert(@ByVal Mat gpu_objects,
                             @ByRef RectVector objects);
    public native void convert(@ByVal UMat gpu_objects,
                             @ByRef RectVector objects);
    public native void convert(@ByVal GpuMat gpu_objects,
                             @ByRef RectVector objects);
}
