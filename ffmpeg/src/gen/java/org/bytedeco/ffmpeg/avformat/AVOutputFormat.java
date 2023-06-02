// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * \addtogroup lavf_encoding
 * \{
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVOutputFormat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOutputFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVOutputFormat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOutputFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVOutputFormat position(long position) {
        return (AVOutputFormat)super.position(position);
    }
    @Override public AVOutputFormat getPointer(long i) {
        return new AVOutputFormat((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native AVOutputFormat name(BytePointer setter);
    /**
     * Descriptive name for the format, meant to be more human-readable
     * than name. You should use the NULL_IF_CONFIG_SMALL() macro
     * to define it.
     */
    public native @Cast("const char*") BytePointer long_name(); public native AVOutputFormat long_name(BytePointer setter);
    public native @Cast("const char*") BytePointer mime_type(); public native AVOutputFormat mime_type(BytePointer setter);
    /** comma-separated filename extensions */
    public native @Cast("const char*") BytePointer extensions(); public native AVOutputFormat extensions(BytePointer setter);
    /* output support */
    /** default audio codec */
    public native @Cast("AVCodecID") int audio_codec(); public native AVOutputFormat audio_codec(int setter);
    /** default video codec */
    public native @Cast("AVCodecID") int video_codec(); public native AVOutputFormat video_codec(int setter);
    /** default subtitle codec */
    public native @Cast("AVCodecID") int subtitle_codec(); public native AVOutputFormat subtitle_codec(int setter);
    /**
     * can use flags: AVFMT_NOFILE, AVFMT_NEEDNUMBER,
     * AVFMT_GLOBALHEADER, AVFMT_NOTIMESTAMPS, AVFMT_VARIABLE_FPS,
     * AVFMT_NODIMENSIONS, AVFMT_NOSTREAMS, AVFMT_ALLOW_FLUSH,
     * AVFMT_TS_NONSTRICT, AVFMT_TS_NEGATIVE
     */
    public native int flags(); public native AVOutputFormat flags(int setter);

    /**
     * List of supported codec_id-codec_tag pairs, ordered by "better
     * choice first". The arrays are all terminated by AV_CODEC_ID_NONE.
     */
    @MemberGetter public native @Const AVCodecTag codec_tag(int i);
    @MemberGetter public native @Cast("const AVCodecTag*const*") PointerPointer codec_tag();


    /** AVClass for the private context */
    public native @Const AVClass priv_class(); public native AVOutputFormat priv_class(AVClass setter);
}
