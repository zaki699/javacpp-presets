// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

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


/**
 * AVCodec.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVCodec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVCodec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVCodec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVCodec position(long position) {
        return (AVCodec)super.position(position);
    }
    @Override public AVCodec getPointer(long i) {
        return new AVCodec((Pointer)this).offsetAddress(i);
    }

    /**
     * Name of the codec implementation.
     * The name is globally unique among encoders and among decoders (but an
     * encoder and a decoder can share the same name).
     * This is the primary way to find a codec from the user perspective.
     */
    public native @Cast("const char*") BytePointer name(); public native AVCodec name(BytePointer setter);
    /**
     * Descriptive name for the codec, meant to be more human readable than name.
     * You should use the NULL_IF_CONFIG_SMALL() macro to define it.
     */
    public native @Cast("const char*") BytePointer long_name(); public native AVCodec long_name(BytePointer setter);
    public native @Cast("AVMediaType") int type(); public native AVCodec type(int setter);
    public native @Cast("AVCodecID") int id(); public native AVCodec id(int setter);
    /**
     * Codec capabilities.
     * see AV_CODEC_CAP_*
     */
    public native int capabilities(); public native AVCodec capabilities(int setter);
    /** maximum value for lowres supported by the decoder */
    public native @Cast("uint8_t") byte max_lowres(); public native AVCodec max_lowres(byte setter);
    /** array of supported framerates, or NULL if any, array is terminated by {0,0} */
    public native @Const AVRational supported_framerates(); public native AVCodec supported_framerates(AVRational setter);
    /** array of supported pixel formats, or NULL if unknown, array is terminated by -1 */
    public native @Cast("const AVPixelFormat*") IntPointer pix_fmts(); public native AVCodec pix_fmts(IntPointer setter);
    /** array of supported audio samplerates, or NULL if unknown, array is terminated by 0 */
    public native @Const IntPointer supported_samplerates(); public native AVCodec supported_samplerates(IntPointer setter);
    /** array of supported sample formats, or NULL if unknown, array is terminated by -1 */
    public native @Cast("const AVSampleFormat*") IntPointer sample_fmts(); public native AVCodec sample_fmts(IntPointer setter);
    /** AVClass for the private context */
    public native @Const AVClass priv_class(); public native AVCodec priv_class(AVClass setter);
    /** array of recognized profiles, or NULL if unknown, array is terminated by {AV_PROFILE_UNKNOWN} */
    public native @Const AVProfile profiles(); public native AVCodec profiles(AVProfile setter);

    /**
     * Group name of the codec implementation.
     * This is a short symbolic name of the wrapper backing this codec. A
     * wrapper uses some kind of external implementation for the codec, such
     * as an external library, or a codec implementation provided by the OS or
     * the hardware.
     * If this field is NULL, this is a builtin, libavcodec native codec.
     * If non-NULL, this will be the suffix in AVCodec.name in most cases
     * (usually AVCodec.name will be of the form "<codec_name>_<wrapper_name>").
     */
    public native @Cast("const char*") BytePointer wrapper_name(); public native AVCodec wrapper_name(BytePointer setter);

    /**
     * Array of supported channel layouts, terminated with a zeroed layout.
     */
    public native @Const AVChannelLayout ch_layouts(); public native AVCodec ch_layouts(AVChannelLayout setter);
}
