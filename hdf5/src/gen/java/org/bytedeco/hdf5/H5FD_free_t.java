// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* A free list is a singly-linked list of address/size pairs. */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5FD_free_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5FD_free_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5FD_free_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5FD_free_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5FD_free_t position(long position) {
        return (H5FD_free_t)super.position(position);
    }
    @Override public H5FD_free_t getPointer(long i) {
        return new H5FD_free_t(this).position(position + i);
    }

    public native @Cast("haddr_t") long addr(); public native H5FD_free_t addr(long setter);
    public native @Cast("hsize_t") long size(); public native H5FD_free_t size(long setter);
    public native H5FD_free_t next(); public native H5FD_free_t next(H5FD_free_t setter);
}
