// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;
 //DEPRECATED

@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVPacketSideData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacketSideData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPacketSideData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacketSideData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPacketSideData position(long position) {
        return (AVPacketSideData)super.position(position);
    }
    @Override public AVPacketSideData getPointer(long i) {
        return new AVPacketSideData((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint8_t*") BytePointer data(); public native AVPacketSideData data(BytePointer setter);
    public native @Cast("size_t") long size(); public native AVPacketSideData size(long setter);
    public native @Cast("AVPacketSideDataType") int type(); public native AVPacketSideData type(int setter);
}
