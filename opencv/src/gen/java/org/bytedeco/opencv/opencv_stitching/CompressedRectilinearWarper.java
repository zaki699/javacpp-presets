// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class CompressedRectilinearWarper extends WarperCreator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompressedRectilinearWarper(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompressedRectilinearWarper(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompressedRectilinearWarper position(long position) {
        return (CompressedRectilinearWarper)super.position(position);
    }
    @Override public CompressedRectilinearWarper getPointer(long i) {
        return new CompressedRectilinearWarper(this).position(position + i);
    }

    public CompressedRectilinearWarper(float A/*=1*/, float B/*=1*/) { super((Pointer)null); allocate(A, B); }
    private native void allocate(float A/*=1*/, float B/*=1*/);
    public CompressedRectilinearWarper() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @Ptr RotationWarper create(float scale);
}
