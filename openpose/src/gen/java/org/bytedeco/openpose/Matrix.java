// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;


    /**
     * Matrix: Bind of cv::Mat to avoid OpenCV as dependency in the headers.
     */
    @Namespace("op") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class Matrix extends Pointer {
        static { Loader.load(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Matrix(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Matrix position(long position) {
            return (Matrix)super.position(position);
        }
        @Override public Matrix getPointer(long i) {
            return new Matrix((Pointer)this).offsetAddress(i);
        }
    
        /**
         * @param matrixesResized For 3-D OpenPose, if >1, it will assume the image is composed of
         * numberImagesStackedHorizontally horizontally stacked images. It must be already resized to avoid
         * internally allocating/removing elements of std::vector (to avoid errors if using different std DLLs)
         * @param cvMatPtr should be a cv::Mat element or it will provoke a core dumped. Done to
         * avoid explicitly exposing 3rdparty libraries on the headers.
         */
        public static native void splitCvMatIntoVectorMatrix(@StdVector Matrix matrixesResized, @Const Pointer cvMatPtr);

        public Matrix() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * @param cvMatPtr should be a cv::Mat element or it will provoke a core dumped. Done to
         * avoid explicitly exposing 3rdparty libraries on the headers.
         */
        public Matrix(@Const Pointer cvMatPtr) { super((Pointer)null); allocate(cvMatPtr); }
        private native void allocate(@Const Pointer cvMatPtr);

        /**
         * Analog to cv::Mat(int rows, int cols, int type, void *data, size_t step=AUTO_STEP)
         */
        public Matrix(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
        private native void allocate(int rows, int cols, int type);

        /**
         * Analog to cv::Mat(int rows, int cols, int type, void *data, size_t step=AUTO_STEP)
         * Very important: This Matrix will only "borrow" this pointer, so the caller must make sure to maintain the
         * memory allocated until this Matrix destructor is called and also to handle the ucharPtr memory deallocation.
         * @param ucharPtr should be a cv::Mat::data (or analog) element or it will provoke a core dumped. Done to
         * avoid explicitly exposing 3rdparty libraries on the headers.
         */
        public Matrix(int rows, int cols, int type, Pointer cvMatPtr) { super((Pointer)null); allocate(rows, cols, type, cvMatPtr); }
        private native void allocate(int rows, int cols, int type, Pointer cvMatPtr);

        public native @ByVal Matrix clone();

        /**
         * @return cv::Mat*.
         */
        public native Pointer getCvMat();

        /**
         * @return const cv::Mat*.
         */
        public native @Const Pointer getConstCvMat();

        /**
         * Equivalent to cv::Mat::data
         * @return A raw pointer to the internal data of cv::Mat.
         */
        public native @Cast("unsigned char*") BytePointer data();
        /**
         * Equivalent to cv::Mat::data
         * @return A raw pointer to the internal data of cv::Mat.
         */
        public native @Cast("const unsigned char*") BytePointer dataConst();
        /**
         * Similar to dataConst(), but it allows the data to be edited.
         * This function is only implemented for Pybind11 usage.
         * @return A raw pointer to the internal data of cv::Mat.
         */
        public native @Cast("unsigned char*") BytePointer dataPseudoConst();

        /**
         * Equivalent to cv::Mat::eye
         */
        public static native @ByVal Matrix eye(int rows, int cols, int type);
        /**
         * Equivalent to cv::Mat::cols
         */
        public native int cols();
        /**
         * Equivalent to cv::Mat::rows
         */
        public native int rows();
        /**
         * Equivalent to cv::Mat::size[dimension]
         */
        public native int size(int dimension);
        /**
         * Equivalent to cv::Mat::dims
         */
        public native int dims();

        /**
         * Equivalent to their analog cv::Mat functions
         */
        public native @Cast("bool") boolean isContinuous();
        public native @Cast("bool") boolean isSubmatrix();
        public native @Cast("size_t") long elemSize();
        public native @Cast("size_t") long elemSize1();
        public native int type();
        public native int depth();
        public native int channels();
        public native @Cast("size_t") long step1(int i/*=0*/);
        public native @Cast("size_t") long step1();
        public native @Cast("bool") boolean empty();
        public native @Cast("size_t") long total();
        public native int checkVector(int elemChannels, int depth/*=-1*/, @Cast("const bool") boolean requireContinuous/*=true*/);
        public native int checkVector(int elemChannels);

        /**
         * Similar to their analog cv::Mat functions
         */
        public native void setTo(double value);
        public native void copyTo(@ByRef Matrix outputMat);
    }
