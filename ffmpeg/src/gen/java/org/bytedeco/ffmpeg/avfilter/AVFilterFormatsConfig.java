// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

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
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * Lists of formats / etc. supported by an end of a link.
 *
 * This structure is directly part of AVFilterLink, in two copies:
 * one for the source filter, one for the destination filter.
 <p>
 * These lists are used for negotiating the format to actually be used,
 * which will be loaded into the format and channel_layout members of
 * AVFilterLink, when chosen.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterFormatsConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterFormatsConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterFormatsConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterFormatsConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterFormatsConfig position(long position) {
        return (AVFilterFormatsConfig)super.position(position);
    }
    @Override public AVFilterFormatsConfig getPointer(long i) {
        return new AVFilterFormatsConfig((Pointer)this).offsetAddress(i);
    }


    /**
     * List of supported formats (pixel or sample).
     */
    public native AVFilterFormats formats(); public native AVFilterFormatsConfig formats(AVFilterFormats setter);

    /**
     * Lists of supported sample rates, only for audio.
     */
    public native AVFilterFormats samplerates(); public native AVFilterFormatsConfig samplerates(AVFilterFormats setter);

    /**
     * Lists of supported channel layouts, only for audio.
     */
    public native @Cast("AVFilterChannelLayouts*") Pointer channel_layouts(); public native AVFilterFormatsConfig channel_layouts(Pointer setter);

    /**
     * Lists of supported YUV color metadata, only for YUV video.
     */
    /** AVColorSpace */
    public native AVFilterFormats color_spaces(); public native AVFilterFormatsConfig color_spaces(AVFilterFormats setter);
    /** AVColorRange */
    public native AVFilterFormats color_ranges(); public native AVFilterFormatsConfig color_ranges(AVFilterFormats setter);

}
