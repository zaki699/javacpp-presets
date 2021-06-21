// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * ImgFrame message. Carries image data and metadata.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ImgFrame extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImgFrame(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImgFrame(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ImgFrame position(long position) {
        return (ImgFrame)super.position(position);
    }
    @Override public ImgFrame getPointer(long i) {
        return new ImgFrame((Pointer)this).offsetAddress(i);
    }

    // Raw* mirror

    /**
     * Construct ImgFrame message.
     * Timestamp is set to now
     */
    public ImgFrame() { super((Pointer)null); allocate(); }
    private native void allocate();
    public ImgFrame(@SharedPtr RawImgFrame ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawImgFrame ptr);

    // getters
    /**
     * Retrievies image timestamp related to steady_clock / time.monotonic
     */
    public native @ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer getTimestamp();

    /**
     * Retrievies instance number
     */
    public native @Cast("unsigned int") int getInstanceNum();

    /**
     * Retrievies image category
     */
    public native @Cast("unsigned int") int getCategory();

    /**
     * Retrievies image sequence number
     */
    public native @Cast("unsigned int") int getSequenceNum();

    /**
     * Retrievies image width in pixels
     */
    public native @Cast("unsigned int") int getWidth();

    /**
     * Retrievies image height in pixels
     */
    public native @Cast("unsigned int") int getHeight();

    /**
     * Retrieves image type
     */
    public native RawImgFrame.Type getType();

    // setters
    /**
     * Specifies current timestamp, related to steady_clock / time.monotonic
     */
    public native void setTimestamp(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Instance number relates to the origin of the frame (which camera)
     *
     * @param instance Instance number
     */
    public native void setInstanceNum(@Cast("unsigned int") int instance);

    /**
     * @param category Image category
     */
    public native void setCategory(@Cast("unsigned int") int category);

    /**
     * Specifies sequence number
     *
     * @param seq Sequence number
     */
    public native void setSequenceNum(@Cast("unsigned int") int seq);

    /**
     * Specifies frame width
     *
     * @param width frame width
     */
    public native void setWidth(@Cast("unsigned int") int width);

    /**
     * Specifies frame height
     *
     * @param width frame height
     */
    public native void setHeight(@Cast("unsigned int") int arg0);

    /**
     * Specifies frame type, RGB, BGR, ...
     *
     * @param type Type of image
     */
    public native void setType(RawImgFrame.Type type);
    public native void setType(@Cast("dai::RawImgFrame::Type") int type);

// Optional - OpenCV support
// #ifdef DEPTHAI_HAVE_OPENCV_SUPPORT
    /**
     * \note This API only available if OpenCV support is enabled
     *
     * Copies cv::Mat data to ImgFrame buffer
     *
     * @param frame Input cv::Mat frame from which to copy the data
     */
    public native void setFrame(@ByVal Mat frame);

    /**
     * \note This API only available if OpenCV support is enabled
     *
     * Retrieves data as cv::Mat with specified width, height and type
     *
     * @param copy If false only a reference to data is made, otherwise a copy
     * @return cv::Mat with corresponding to ImgFrame parameters
     */
    public native @ByVal Mat getFrame(@Cast("bool") boolean copy/*=false*/);
    public native @ByVal Mat getFrame();

    /**
     * \note This API only available if OpenCV support is enabled
     *
     * Retrieves cv::Mat suitable for use in common opencv functions.
     * ImgFrame is converted to color BGR interleaved or grayscale depending on type.
     *
     * A copy is always made
     *
     * @return cv::Mat for use in opencv functions
     */
    public native @ByVal Mat getCvFrame();

// #else

// #endif
}
