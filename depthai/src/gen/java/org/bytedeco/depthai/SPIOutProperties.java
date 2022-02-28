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


/**
 * Specify properties for SPIOut node
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SPIOutProperties extends SPIOutPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public SPIOutProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SPIOutProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SPIOutProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SPIOutProperties position(long position) {
        return (SPIOutProperties)super.position(position);
    }
    @Override public SPIOutProperties getPointer(long i) {
        return new SPIOutProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Name of stream
     */
    public native @StdString BytePointer streamName(); public native SPIOutProperties streamName(BytePointer setter);

    /**
     * SPI bus to use
     */
    public native int busId(); public native SPIOutProperties busId(int setter);
}
