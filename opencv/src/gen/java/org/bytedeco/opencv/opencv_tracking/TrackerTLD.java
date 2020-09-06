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


/** \brief the TLD (Tracking, learning and detection) tracker
<p>
TLD is a novel tracking framework that explicitly decomposes the long-term tracking task into
tracking, learning and detection.
<p>
The tracker follows the object from frame to frame. The detector localizes all appearances that
have been observed so far and corrects the tracker if necessary. The learning estimates detector's
errors and updates it to avoid these errors in the future. The implementation is based on \cite TLD .
<p>
The Median Flow algorithm (see cv::TrackerMedianFlow) was chosen as a tracking component in this
implementation, following authors. The tracker is supposed to be able to handle rapid motions, partial
occlusions, object absence etc.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerTLD extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerTLD(Pointer p) { super(p); }

  public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
      @Override public Params getPointer(long i) {
          return new Params(this).position(position + i);
      }
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native void read( @Const @ByRef FileNode arg0 );
    public native void write( @ByRef FileStorage arg0 );
  }

  /** \brief Constructor
    @param parameters TLD parameters TrackerTLD::Params
     */
  public static native @Ptr TrackerTLD create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerTLD create();
}
