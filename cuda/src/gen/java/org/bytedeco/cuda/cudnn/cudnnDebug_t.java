// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;


/* struct containing useful informaiton for each API call */
@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnDebug_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnDebug_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnDebug_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnDebug_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnDebug_t position(long position) {
        return (cudnnDebug_t)super.position(position);
    }
    @Override public cudnnDebug_t getPointer(long i) {
        return new cudnnDebug_t(this).position(position + i);
    }

    public native @Cast("unsigned") int cudnn_version(); public native cudnnDebug_t cudnn_version(int setter);
    public native @Cast("cudnnStatus_t") int cudnnStatus(); public native cudnnDebug_t cudnnStatus(int setter);
    public native @Cast("unsigned") int time_sec(); public native cudnnDebug_t time_sec(int setter);      /* epoch time in seconds */
    public native @Cast("unsigned") int time_usec(); public native cudnnDebug_t time_usec(int setter);     /* microseconds part of epoch time */
    public native @Cast("unsigned") int time_delta(); public native cudnnDebug_t time_delta(int setter);    /* time since start in seconds */
    public native cudnnContext handle(); public native cudnnDebug_t handle(cudnnContext setter);   /* cudnn handle */
    public native CUstream_st stream(); public native cudnnDebug_t stream(CUstream_st setter);    /* cuda stream ID */
    public native @Cast("unsigned long long") long pid(); public native cudnnDebug_t pid(long setter); /* process ID */
    public native @Cast("unsigned long long") long tid(); public native cudnnDebug_t tid(long setter); /* thread ID */
    public native int cudaDeviceId(); public native cudnnDebug_t cudaDeviceId(int setter);       /* CUDA device ID */
    public native int reserved(int i); public native cudnnDebug_t reserved(int i, int setter);
    @MemberGetter public native IntPointer reserved();       /* reserved for future use */
}
