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


/**
 * MemoryInfo structure
 *
 * Free, remaining and total memory stats
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MemoryInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MemoryInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemoryInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MemoryInfo position(long position) {
        return (MemoryInfo)super.position(position);
    }
    @Override public MemoryInfo getPointer(long i) {
        return new MemoryInfo((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long remaining(); public native MemoryInfo remaining(long setter);
    public native @Cast("int64_t") long used(); public native MemoryInfo used(long setter);
    public native @Cast("int64_t") long total(); public native MemoryInfo total(long setter);
}
