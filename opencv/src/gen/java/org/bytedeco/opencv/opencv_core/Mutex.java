// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #else // OPENCV_DISABLE_THREAD_SUPPORT
// Custom (failing) implementation of `std::recursive_mutex`.
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Mutex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Mutex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Mutex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Mutex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Mutex position(long position) {
        return (Mutex)super.position(position);
    }
    @Override public Mutex getPointer(long i) {
        return new Mutex((Pointer)this).offsetAddress(i);
    }

    public native void lock();
    public native void unlock();
}
