// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawIMUData extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawIMUData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawIMUData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawIMUData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawIMUData position(long position) {
        return (RawIMUData)super.position(position);
    }
    @Override public RawIMUData getPointer(long i) {
        return new RawIMUData((Pointer)this).offsetAddress(i);
    }

    public native @StdVector IMUPacket packets(); public native RawIMUData packets(IMUPacket setter);

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
