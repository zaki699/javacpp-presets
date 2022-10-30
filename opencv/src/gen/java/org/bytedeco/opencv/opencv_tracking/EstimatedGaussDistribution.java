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


@Namespace("cv::detail::tracking::online_boosting") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class EstimatedGaussDistribution extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EstimatedGaussDistribution(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EstimatedGaussDistribution(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EstimatedGaussDistribution position(long position) {
        return (EstimatedGaussDistribution)super.position(position);
    }
    @Override public EstimatedGaussDistribution getPointer(long i) {
        return new EstimatedGaussDistribution((Pointer)this).offsetAddress(i);
    }


  public EstimatedGaussDistribution() { super((Pointer)null); allocate(); }
  private native void allocate();
  public EstimatedGaussDistribution( float P_mean, float R_mean, float P_sigma, float R_sigma ) { super((Pointer)null); allocate(P_mean, R_mean, P_sigma, R_sigma); }
  private native void allocate( float P_mean, float R_mean, float P_sigma, float R_sigma );
  public native void update( float value );  //, float timeConstant = -1.0);
  public native float getMean();
  public native float getSigma();
  public native void setValues( float mean, float sigma );
}
