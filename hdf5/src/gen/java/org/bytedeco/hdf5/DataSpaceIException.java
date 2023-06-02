// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class DataSpaceIException extends Exception {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataSpaceIException(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DataSpaceIException(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DataSpaceIException position(long position) {
        return (DataSpaceIException)super.position(position);
    }
    @Override public DataSpaceIException getPointer(long i) {
        return new DataSpaceIException((Pointer)this).offsetAddress(i);
    }

    public DataSpaceIException(@StdString BytePointer func_name, @StdString BytePointer message/*=DEFAULT_MSG*/) { super((Pointer)null); allocate(func_name, message); }
    private native void allocate(@StdString BytePointer func_name, @StdString BytePointer message/*=DEFAULT_MSG*/);
    public DataSpaceIException(@StdString BytePointer func_name) { super((Pointer)null); allocate(func_name); }
    private native void allocate(@StdString BytePointer func_name);
    public DataSpaceIException(@StdString String func_name, @StdString String message/*=DEFAULT_MSG*/) { super((Pointer)null); allocate(func_name, message); }
    private native void allocate(@StdString String func_name, @StdString String message/*=DEFAULT_MSG*/);
    public DataSpaceIException(@StdString String func_name) { super((Pointer)null); allocate(func_name); }
    private native void allocate(@StdString String func_name);
    public DataSpaceIException() { super((Pointer)null); allocate(); }
    private native void allocate();
}
