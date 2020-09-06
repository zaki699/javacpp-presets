// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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
 * This structure contains the parameters describing the frames that will be
 * passed to this filter.
 *
 * It should be allocated with av_buffersrc_parameters_alloc() and freed with
 * av_free(). All the allocated fields in it remain owned by the caller.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVBufferSrcParameters extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBufferSrcParameters() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBufferSrcParameters(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBufferSrcParameters(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBufferSrcParameters position(long position) {
        return (AVBufferSrcParameters)super.position(position);
    }
    @Override public AVBufferSrcParameters getPointer(long i) {
        return new AVBufferSrcParameters(this).position(position + i);
    }

    /**
     * video: the pixel format, value corresponds to enum AVPixelFormat
     * audio: the sample format, value corresponds to enum AVSampleFormat
     */
    public native int format(); public native AVBufferSrcParameters format(int setter);
    /**
     * The timebase to be used for the timestamps on the input frames.
     */
    public native @ByRef AVRational time_base(); public native AVBufferSrcParameters time_base(AVRational setter);

    /**
     * Video only, the display dimensions of the input frames.
     */
    public native int width(); public native AVBufferSrcParameters width(int setter);
    public native int height(); public native AVBufferSrcParameters height(int setter);

    /**
     * Video only, the sample (pixel) aspect ratio.
     */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVBufferSrcParameters sample_aspect_ratio(AVRational setter);

    /**
     * Video only, the frame rate of the input video. This field must only be
     * set to a non-zero value if input stream has a known constant framerate
     * and should be left at its initial value if the framerate is variable or
     * unknown.
     */
    public native @ByRef AVRational frame_rate(); public native AVBufferSrcParameters frame_rate(AVRational setter);

    /**
     * Video with a hwaccel pixel format only. This should be a reference to an
     * AVHWFramesContext instance describing the input frames.
     */
    public native AVBufferRef hw_frames_ctx(); public native AVBufferSrcParameters hw_frames_ctx(AVBufferRef setter);

    /**
     * Audio only, the audio sampling rate in samples per second.
     */
    public native int sample_rate(); public native AVBufferSrcParameters sample_rate(int setter);

    /**
     * Audio only, the audio channel layout
     */
    public native @Cast("uint64_t") long channel_layout(); public native AVBufferSrcParameters channel_layout(long setter);
}
