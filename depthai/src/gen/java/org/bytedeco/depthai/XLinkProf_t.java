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


@Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkProf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XLinkProf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XLinkProf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkProf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XLinkProf_t position(long position) {
        return (XLinkProf_t)super.position(position);
    }
    @Override public XLinkProf_t getPointer(long i) {
        return new XLinkProf_t((Pointer)this).offsetAddress(i);
    }

    public native float totalReadTime(); public native XLinkProf_t totalReadTime(float setter);
    public native float totalWriteTime(); public native XLinkProf_t totalWriteTime(float setter);
    public native @Cast("unsigned long") long totalReadBytes(); public native XLinkProf_t totalReadBytes(long setter);
    public native @Cast("unsigned long") long totalWriteBytes(); public native XLinkProf_t totalWriteBytes(long setter);
    public native @Cast("unsigned long") long totalBootCount(); public native XLinkProf_t totalBootCount(long setter);
    public native float totalBootTime(); public native XLinkProf_t totalBootTime(float setter);
}
