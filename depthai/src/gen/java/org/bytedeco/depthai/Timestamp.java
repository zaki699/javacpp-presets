// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** Timestamp structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Timestamp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Timestamp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Timestamp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Timestamp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Timestamp position(long position) {
        return (Timestamp)super.position(position);
    }
    @Override public Timestamp getPointer(long i) {
        return new Timestamp((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long sec(); public native Timestamp sec(long setter);
    public native @Cast("int64_t") long nsec(); public native Timestamp nsec(long setter);
    public native @ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer get();
}
