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
 * \brief ColorCamera node. For use with color sensors.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ColorCamera extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColorCamera(Pointer p) { super(p); }

    /**
     * Constructs ColorCamera node.
     */
    public ColorCamera(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    /**
     * Initial control options to apply to sensor
     */
    @MemberGetter public native @ByRef CameraControl initialControl();

    /**
     * Input for ImageManipConfig message, which can modify crop paremeters in runtime
     *
     * Default queue is non-blocking with size 8
     */
    @MemberGetter public native @ByRef Input inputConfig();

    /**
     * Input for CameraControl message, which can modify camera parameters in runtime
     *
     * Default queue is blocking with size 8
     */
    @MemberGetter public native @ByRef Input inputControl();

    /**
     * Outputs ImgFrame message that carries NV12 encoded (YUV420, UV plane interleaved) frame data.
     *
     * Suitable for use with VideoEncoder node
     */
    @MemberGetter public native @ByRef Output video();

    /**
     * Outputs ImgFrame message that carries BGR/RGB planar/interleaved encoded frame data.
     *
     * Suitable for use with NeuralNetwork node
     */
    @MemberGetter public native @ByRef Output preview();

    /**
     * Outputs ImgFrame message that carries NV12 encoded (YUV420, UV plane interleaved) frame data.
     *
     * The message is sent only when a CameraControl message arrives to inputControl with captureStill command set.
     */
    @MemberGetter public native @ByRef Output still();

    /**
     * Outputs ImgFrame message that carries YUV420 planar (I420/IYUV) frame data.
     *
     * Generated by the ISP engine, and the source for the 'video', 'preview' and 'still' outputs
     */
    @MemberGetter public native @ByRef Output isp();

    /**
     * Outputs ImgFrame message that carries RAW10-packed (MIPI CSI-2 format) frame data.
     *
     * Captured directly from the camera sensor, and the source for the 'isp' output.
     */
    @MemberGetter public native @ByRef Output raw();

    /**
     * Specify which board socket to use
     * @param boardSocket Board socket to use
     */
    public native void setBoardSocket(CameraBoardSocket boardSocket);
    public native void setBoardSocket(@Cast("dai::CameraBoardSocket") int boardSocket);

    /**
     * Retrieves which board socket to use
     * @return Board socket to use
     */
    public native CameraBoardSocket getBoardSocket();

    /** Set which color camera to use */
    public native @Deprecated void setCamId(@Cast("int64_t") long id);

    /** Get which color camera to use */
    public native @Cast("int64_t") @Deprecated long getCamId();

    /** Set camera image orientation */
    public native void setImageOrientation(CameraImageOrientation imageOrientation);
    public native void setImageOrientation(@Cast("dai::CameraImageOrientation") int imageOrientation);

    /** Get camera image orientation */
    public native CameraImageOrientation getImageOrientation();

    /** Set color order of preview output images. RGB or BGR */
    public native void setColorOrder(ColorCameraProperties.ColorOrder colorOrder);
    public native void setColorOrder(@Cast("dai::ColorCameraProperties::ColorOrder") int colorOrder);

    /** Get color order of preview output frames. RGB or BGR */
    public native ColorCameraProperties.ColorOrder getColorOrder();

    /** Set planar or interleaved data of preview output frames */
    public native void setInterleaved(@Cast("bool") boolean interleaved);

    /** Get planar or interleaved data of preview output frames */
    public native @Cast("bool") boolean getInterleaved();

    /** Set fp16 (0..255) data type of preview output frames */
    public native void setFp16(@Cast("bool") boolean fp16);

    /** Get fp16 (0..255) data of preview output frames */
    public native @Cast("bool") boolean getFp16();

    /** Set preview output size */
    public native void setPreviewSize(int width, int height);

    /** Set preview output size, as a tuple <width, height> */
    public native void setPreviewSize(@ByVal @Cast("std::tuple<int,int>*") Pointer size);

    /** Set video output size */
    public native void setVideoSize(int width, int height);

    /** Set video output size, as a tuple <width, height> */
    public native void setVideoSize(@ByVal @Cast("std::tuple<int,int>*") Pointer size);

    /** Set still output size */
    public native void setStillSize(int width, int height);

    /** Set still output size, as a tuple <width, height> */
    public native void setStillSize(@ByVal @Cast("std::tuple<int,int>*") Pointer size);

    /** Set sensor resolution */
    public native void setResolution(@ByVal ColorCameraProperties.SensorResolution resolution);

    /** Get sensor resolution */
    public native @ByVal ColorCameraProperties.SensorResolution getResolution();

    /**
     * Set 'isp' output scaling (numerator/denominator), preserving the aspect ratio.
     * The fraction numerator/denominator is simplified first to a irreducible form,
     * then a set of hardware scaler constraints applies:
     * max numerator = 16, max denominator = 63
     */
    public native void setIspScale(int numerator, int denominator);

    /** Set 'isp' output scaling, as a tuple <numerator, denominator> */
    public native void setIspScale(@ByVal @Cast("std::tuple<int,int>*") Pointer scale);

    /**
     * Set 'isp' output scaling, per each direction. If the horizontal scaling factor
     * (horizNum/horizDen) is different than the vertical scaling factor
     * (vertNum/vertDen), a distorted (stretched or squished) image is generated
     */
    public native void setIspScale(int horizNum, int horizDenom, int vertNum, int vertDenom);

    /** Set 'isp' output scaling, per each direction, as <numerator, denominator> tuples */
    public native void setIspScale(@ByVal @Cast("std::tuple<int,int>*") Pointer horizScale, @ByVal @Cast("std::tuple<int,int>*") Pointer vertScale);

    /**
     * Set rate at which camera should produce frames
     * @param fps Rate in frames per second
     */
    public native void setFps(float fps);

    /**
     * Get rate at which camera should produce frames
     * @return Rate in frames per second
     */
    public native float getFps();

    /** Get preview size as tuple */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getPreviewSize();
    /** Get preview width */
    public native int getPreviewWidth();
    /** Get preview height */
    public native int getPreviewHeight();

    /** Get video size as tuple */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getVideoSize();
    /** Get video width */
    public native int getVideoWidth();
    /** Get video height */
    public native int getVideoHeight();

    /** Get still size as tuple */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getStillSize();
    /** Get still width */
    public native int getStillWidth();
    /** Get still height */
    public native int getStillHeight();

    /** Get sensor resolution as size */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getResolutionSize();
    /** Get sensor resolution width */
    public native int getResolutionWidth();
    /** Get sensor resolution height */
    public native int getResolutionHeight();

    /** Get 'isp' output resolution as size, after scaling */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getIspSize();
    /** Get 'isp' output width */
    public native int getIspWidth();
    /** Get 'isp' output height */
    public native int getIspHeight();

    /**
     * Specify sensor center crop.
     * Resolution size / video size
     */
    public native void sensorCenterCrop();

    /**
     * Specifies sensor crop rectangle
     * @param x Top left X coordinate
     * @param y Top left Y coordinate
     */
    public native void setSensorCrop(float x, float y);

    /**
     * @return Sensor top left crop coordinates
     */
    public native @ByVal @Cast("std::tuple<float,float>*") Pointer getSensorCrop();
    /** Get sensor top left x crop coordinate */
    public native float getSensorCropX();
    /** Get sensor top left y crop coordinate */
    public native float getSensorCropY();

    // Node properties configuration
    /**
     * Specify to wait until inputConfig receives a configuration message,
     * before sending out a frame.
     * @param wait True to wait for inputConfig message, false otherwise
     */
    public native void setWaitForConfigInput(@Cast("bool") boolean _wait);

    /**
     * @see setWaitForConfigInput
     * @return True if wait for inputConfig message, false otherwise
     */
    public native @Cast("bool") boolean getWaitForConfigInput();

    /**
     * Specifies whether preview output should preserve aspect ratio,
     * after downscaling from video size or not.
     *
     * @param keep If true, a larger crop region will be considered to still be able to
     * create the final image in the specified aspect ratio. Otherwise video size is resized to fit preview size
     */
    public native void setPreviewKeepAspectRatio(@Cast("bool") boolean keep);

    /**
     * @see setPreviewKeepAspectRatio
     * @return Preview keep aspect ratio option
     */
    public native @Cast("bool") boolean getPreviewKeepAspectRatio();
}
