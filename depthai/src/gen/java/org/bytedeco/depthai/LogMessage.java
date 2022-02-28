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


@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class LogMessage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LogMessage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LogMessage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogMessage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LogMessage position(long position) {
        return (LogMessage)super.position(position);
    }
    @Override public LogMessage getPointer(long i) {
        return new LogMessage((Pointer)this).offsetAddress(i);
    }

    public native @StdString BytePointer nodeIdName(); public native LogMessage nodeIdName(BytePointer setter);
    public native LogLevel level(); public native LogMessage level(LogLevel setter);
    public native @ByRef Timestamp time(); public native LogMessage time(Timestamp setter);
    public native @Cast("size_t") long colorRangeStart(); public native LogMessage colorRangeStart(long setter);
    public native @Cast("size_t") long colorRangeEnd(); public native LogMessage colorRangeEnd(long setter);
    public native @StdString BytePointer payload(); public native LogMessage payload(BytePointer setter);
}
