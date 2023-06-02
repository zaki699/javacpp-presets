// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class KDTreeIndexParams extends IndexParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KDTreeIndexParams(Pointer p) { super(p); }

    public KDTreeIndexParams(int trees/*=4*/) { super((Pointer)null); allocate(trees); }
    private native void allocate(int trees/*=4*/);
    public KDTreeIndexParams() { super((Pointer)null); allocate(); }
    private native void allocate();
}
