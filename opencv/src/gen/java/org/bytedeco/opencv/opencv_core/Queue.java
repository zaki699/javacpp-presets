// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Queue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Queue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Queue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Queue position(long position) {
        return (Queue)super.position(position);
    }
    @Override public Queue getPointer(long i) {
        return new Queue((Pointer)this).offsetAddress(i);
    }

    public Queue() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public Queue(@Const @ByRef Context c, @Const @ByRef(nullValue = "cv::ocl::Device()") Device d) { super((Pointer)null); allocate(c, d); }
    private native void allocate(@Const @ByRef Context c, @Const @ByRef(nullValue = "cv::ocl::Device()") Device d);
    public Queue(@Const @ByRef Context c) { super((Pointer)null); allocate(c); }
    private native void allocate(@Const @ByRef Context c);
    public Queue(@Const @ByRef Queue q) { super((Pointer)null); allocate(q); }
    private native void allocate(@Const @ByRef Queue q);
    public native @ByRef @Name("operator =") Queue put(@Const @ByRef Queue q);

    public native @Cast("bool") boolean create(@Const @ByRef(nullValue = "cv::ocl::Context()") Context c, @Const @ByRef(nullValue = "cv::ocl::Device()") Device d);
    public native @Cast("bool") boolean create();
    public native void finish();
    public native Pointer ptr();
    public static native @ByRef Queue getDefault();

    /** \brief Returns OpenCL command queue with enable profiling mode support */
    public native @Const @ByRef Queue getProfilingQueue();
    public native @Cast("cv::ocl::Queue::Impl*") Pointer getImpl();
    public native @Cast("bool") boolean empty();
}
