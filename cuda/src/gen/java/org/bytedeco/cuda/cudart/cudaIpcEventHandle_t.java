// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA IPC event handle
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaIpcEventHandle_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaIpcEventHandle_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaIpcEventHandle_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaIpcEventHandle_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaIpcEventHandle_t position(long position) {
        return (cudaIpcEventHandle_t)super.position(position);
    }
    @Override public cudaIpcEventHandle_t getPointer(long i) {
        return new cudaIpcEventHandle_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte reserved(int i); public native cudaIpcEventHandle_t reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
