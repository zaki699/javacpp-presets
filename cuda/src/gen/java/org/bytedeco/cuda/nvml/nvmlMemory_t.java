// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Memory allocation information for a device (v1).
 * The total amount is equal to the sum of the amounts of free and used memory.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlMemory_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlMemory_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlMemory_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlMemory_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlMemory_t position(long position) {
        return (nvmlMemory_t)super.position(position);
    }
    @Override public nvmlMemory_t getPointer(long i) {
        return new nvmlMemory_t((Pointer)this).offsetAddress(i);
    }

    /** Total physical device memory (in bytes) */
    public native @Cast("unsigned long long") long total(); public native nvmlMemory_t total(long setter);
    /** Unallocated device memory (in bytes) */
    public native @Cast("unsigned long long") @Name("free") long _free(); public native nvmlMemory_t _free(long setter);
    /** Sum of Reserved and Allocated device memory (in bytes).
     *  Note that the driver/GPU always sets aside a small amount of memory for bookkeeping */
    public native @Cast("unsigned long long") long used(); public native nvmlMemory_t used(long setter);
}
