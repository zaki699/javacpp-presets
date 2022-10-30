// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVCodecHWConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVCodecHWConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVCodecHWConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecHWConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVCodecHWConfig position(long position) {
        return (AVCodecHWConfig)super.position(position);
    }
    @Override public AVCodecHWConfig getPointer(long i) {
        return new AVCodecHWConfig((Pointer)this).offsetAddress(i);
    }

    /**
     * For decoders, a hardware pixel format which that decoder may be
     * able to decode to if suitable hardware is available.
     *
     * For encoders, a pixel format which the encoder may be able to
     * accept.  If set to AV_PIX_FMT_NONE, this applies to all pixel
     * formats supported by the codec.
     */
    public native @Cast("AVPixelFormat") int pix_fmt(); public native AVCodecHWConfig pix_fmt(int setter);
    /**
     * Bit set of AV_CODEC_HW_CONFIG_METHOD_* flags, describing the possible
     * setup methods which can be used with this configuration.
     */
    public native int methods(); public native AVCodecHWConfig methods(int setter);
    /**
     * The device type associated with the configuration.
     *
     * Must be set for AV_CODEC_HW_CONFIG_METHOD_HW_DEVICE_CTX and
     * AV_CODEC_HW_CONFIG_METHOD_HW_FRAMES_CTX, otherwise unused.
     */
    public native @Cast("AVHWDeviceType") int device_type(); public native AVCodecHWConfig device_type(int setter);
}
