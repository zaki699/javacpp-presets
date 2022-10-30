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


/**
 *  \brief The Track class describes tracks.
 *  */
@Namespace("cv::detail::tracking::tbm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class Track extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Track(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Track(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Track position(long position) {
        return (Track)super.position(position);
    }
    @Override public Track getPointer(long i) {
        return new Track((Pointer)this).offsetAddress(i);
    }

    
    ///
    ///
    public Track() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
     *  \brief Track constructor.
     *  @param objs Detected objects sequence.
     *  @param last_image Image of last image in the detected object sequence.
     *  @param descriptor_fast Fast descriptor.
     *  @param descriptor_strong Strong descriptor (reid embedding).
     *  */
    
    
    ///
    ///
    public Track(@Cast("const cv::detail::tracking::tbm::TrackedObjects*") @ByRef TrackedObjectDeque objs, @Const @ByRef Mat last_image,
              @Const @ByRef Mat descriptor_fast, @Const @ByRef Mat descriptor_strong) { super((Pointer)null); allocate(objs, last_image, descriptor_fast, descriptor_strong); }
    private native void allocate(@Cast("const cv::detail::tracking::tbm::TrackedObjects*") @ByRef TrackedObjectDeque objs, @Const @ByRef Mat last_image,
              @Const @ByRef Mat descriptor_fast, @Const @ByRef Mat descriptor_strong);

    /**
     *  \brief empty returns if track does not contain objects.
     *  @return true if track does not contain objects.
     *  */
    
    
    ///
    ///
    public native @Cast("bool") boolean empty();

    /**
     *  \brief size returns number of detected objects in a track.
     *  @return number of detected objects in a track.
     *  */
    
    
    ///
    ///
    public native @Cast("size_t") long size();

    /**
     *  \brief operator [] return const reference to detected object with
     *         specified index.
     *  @param i Index of object.
     *  @return const reference to detected object with specified index.
     *  */

    /**
     *  \brief operator [] return non-const reference to detected object with
     *         specified index.
     *  @param i Index of object.
     *  @return non-const reference to detected object with specified index.
     *  */
    
    
    ///
    ///
    public native @ByRef @Name("operator []") TrackedObject get(@Cast("size_t") long i);

    /**
     *  \brief back returns const reference to last object in track.
     *  @return const reference to last object in track.
     *  */

    /**
     *  \brief back returns non-const reference to last object in track.
     *  @return non-const reference to last object in track.
     *  */
    public native @ByRef TrackedObject back();

    /** Detected objects; */
    public native @ByRef @Cast("cv::detail::tracking::tbm::TrackedObjects*") TrackedObjectDeque objects(); public native Track objects(TrackedObjectDeque setter);
    /** Rectangle that represents predicted position */
    public native @ByRef Rect predicted_rect(); public native Track predicted_rect(Rect setter);
                              /** and size of bounding box if track has been lost. */
    /** Image of last detected object in track. */
    public native @ByRef Mat last_image(); public native Track last_image(Mat setter);
    /** Fast descriptor. */
    public native @ByRef Mat descriptor_fast(); public native Track descriptor_fast(Mat setter);
    /** Strong descriptor (reid embedding). */
    public native @ByRef Mat descriptor_strong(); public native Track descriptor_strong(Mat setter);
    /** How many frames ago track has been lost. */
    public native @Cast("size_t") long lost(); public native Track lost(long setter);

    /** First object in track. */
    public native @ByRef TrackedObject first_object(); public native Track first_object(TrackedObject setter);
    /** Length of a track including number of objects that were */
    public native @Cast("size_t") long length(); public native Track length(long setter);
                    /** removed from track in order to avoid memory usage growth. */
}
