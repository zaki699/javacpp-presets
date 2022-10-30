// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::hal") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class DFT1D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DFT1D(Pointer p) { super(p); }

    public static native @Ptr DFT1D create(int len, int count, int depth, int flags, @Cast("bool*") BoolPointer useBuffer/*=0*/);
    public static native @Ptr DFT1D create(int len, int count, int depth, int flags);
    public static native @Ptr DFT1D create(int len, int count, int depth, int flags, @Cast("bool*") boolean[] useBuffer/*=0*/);
    public native void apply(@Cast("const uchar*") BytePointer src, @Cast("uchar*") BytePointer dst);
    public native void apply(@Cast("const uchar*") ByteBuffer src, @Cast("uchar*") ByteBuffer dst);
    public native void apply(@Cast("const uchar*") byte[] src, @Cast("uchar*") byte[] dst);
}
