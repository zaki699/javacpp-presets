// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \todo document */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Formatter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Formatter(Pointer p) { super(p); }

    /** enum cv::Formatter::FormatType */
    public static final int
           FMT_DEFAULT = 0,
           FMT_MATLAB  = 1,
           FMT_CSV     = 2,
           FMT_PYTHON  = 3,
           FMT_NUMPY   = 4,
           FMT_C       = 5;

    public native @Ptr Formatted format(@Const @ByRef Mat mtx);

    public native void set16fPrecision(int p/*=4*/);
    public native void set16fPrecision();
    public native void set32fPrecision(int p/*=8*/);
    public native void set32fPrecision();
    public native void set64fPrecision(int p/*=16*/);
    public native void set64fPrecision();
    public native void setMultiline(@Cast("bool") boolean ml/*=true*/);
    public native void setMultiline();

    public static native @Ptr Formatter get(@Cast("cv::Formatter::FormatType") int fmt/*=cv::Formatter::FMT_DEFAULT*/);
    public static native @Ptr Formatter get();

}
