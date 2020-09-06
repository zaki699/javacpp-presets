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


/** \brief Multi Object %Tracker for TLD.
<p>
TLD is a novel tracking framework that explicitly decomposes
the long-term tracking task into tracking, learning and detection.
<p>
The tracker follows the object from frame to frame. The detector localizes all appearances that
have been observed so far and corrects the tracker if necessary. The learning estimates detector's
errors and updates it to avoid these errors in the future. The implementation is based on \cite TLD .
<p>
The Median Flow algorithm (see cv::TrackerMedianFlow) was chosen as a tracking component in this
implementation, following authors. The tracker is supposed to be able to handle rapid motions, partial
occlusions, object absence etc.
<p>
@see Tracker, MultiTracker, TrackerTLD
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class MultiTrackerTLD extends MultiTracker_Alt {
    static { Loader.load(); }
    /** Default native constructor. */
    public MultiTrackerTLD() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiTrackerTLD(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiTrackerTLD(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MultiTrackerTLD position(long position) {
        return (MultiTrackerTLD)super.position(position);
    }
    @Override public MultiTrackerTLD getPointer(long i) {
        return new MultiTrackerTLD(this).position(position + i);
    }

  /** \brief Update all trackers from the tracking-list, find a new most likely bounding boxes for the targets by
  optimized update method using some techniques to speedup calculations specifically for MO TLD. The only limitation
  is that all target bounding boxes should have approximately same aspect ratios. Speed boost is around 20%
  <p>
  @param image The current frame.
  <p>
  @return True means that all targets were located and false means that tracker couldn't locate one of the targets in
  current frame. Note, that latter *does not* imply that tracker has failed, maybe target is indeed
  missing from the frame (say, out of sight)
  */
  public native @Cast("bool") boolean update_opt(@ByVal Mat image);
  public native @Cast("bool") boolean update_opt(@ByVal UMat image);
  public native @Cast("bool") boolean update_opt(@ByVal GpuMat image);
}
