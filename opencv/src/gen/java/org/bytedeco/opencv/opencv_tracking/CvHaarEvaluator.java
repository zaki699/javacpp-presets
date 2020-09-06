// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class CvHaarEvaluator extends CvFeatureEvaluator {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHaarEvaluator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHaarEvaluator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHaarEvaluator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHaarEvaluator position(long position) {
        return (CvHaarEvaluator)super.position(position);
    }
    @Override public CvHaarEvaluator getPointer(long i) {
        return new CvHaarEvaluator(this).position(position + i);
    }


  @NoOffset public static class FeatureHaar extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FeatureHaar(Pointer p) { super(p); }
  

    public FeatureHaar( @ByVal Size patchSize ) { super((Pointer)null); allocate(patchSize); }
    private native void allocate( @ByVal Size patchSize );
    public native @Cast("bool") boolean eval( @Const @ByRef Mat image, @ByVal Rect ROI, FloatPointer result );
    public native @Cast("bool") boolean eval( @Const @ByRef Mat image, @ByVal Rect ROI, FloatBuffer result );
    public native @Cast("bool") boolean eval( @Const @ByRef Mat image, @ByVal Rect ROI, float[] result );
    public native int getNumAreas();
    public native @StdVector FloatPointer getWeights();
    public native @Const @ByRef RectVector getAreas();
    public native void write( @ByVal FileStorage arg0 );
    public native float getInitMean();
    public native float getInitSigma();

  }

  public native void init( @Const CvFeatureParams _featureParams, int _maxSampleCount, @ByVal Size _winSize );
  public native void setImage( @Const @ByRef Mat img, @Cast("uchar") byte clsLabel/*=0*/, int idx/*=1*/ );
  public native void setImage( @Const @ByRef Mat img );
  public native @Name("operator ()") float apply( int featureIdx, int sampleIdx );
  public native void writeFeatures( @ByRef FileStorage fs, @Const @ByRef Mat featureMap );
  public native void writeFeature( @ByRef FileStorage fs );  // for old file format
  public native @StdVector FeatureHaar getFeatures();
  public native @ByRef FeatureHaar getFeatures( int idx );
  public native @Function void setWinSize( @ByVal Size patchSize );
  public native @ByVal @Function Size setWinSize();
  public native void generateFeatures();

  /**
   * TODO new method
   * \brief Overload the original generateFeatures in order to limit the number of the features
   * @param numFeatures Number of the features
   */

  public native void generateFeatures( int numFeatures );
}
