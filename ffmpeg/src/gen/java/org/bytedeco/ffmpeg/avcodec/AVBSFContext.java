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
 * \defgroup lavc_bsf Bitstream filters
 * \ingroup libavc
 *
 * Bitstream filters transform encoded media data without decoding it. This
 * allows e.g. manipulating various header values. Bitstream filters operate on
 * \ref AVPacket "AVPackets".
 *
 * The bitstream filtering API is centered around two structures:
 * AVBitStreamFilter and AVBSFContext. The former represents a bitstream filter
 * in abstract, the latter a specific filtering process. Obtain an
 * AVBitStreamFilter using av_bsf_get_by_name() or av_bsf_iterate(), then pass
 * it to av_bsf_alloc() to create an AVBSFContext. Fill in the user-settable
 * AVBSFContext fields, as described in its documentation, then call
 * av_bsf_init() to prepare the filter context for use.
 *
 * Submit packets for filtering using av_bsf_send_packet(), obtain filtered
 * results with av_bsf_receive_packet(). When no more input packets will be
 * sent, submit a NULL AVPacket to signal the end of the stream to the filter.
 * av_bsf_receive_packet() will then return trailing packets, if any are
 * produced by the filter.
 *
 * Finally, free the filter context with av_bsf_free().
 * \{
 */

/**
 * The bitstream filter state.
 *
 * This struct must be allocated with av_bsf_alloc() and freed with
 * av_bsf_free().
 *
 * The fields in the struct will only be changed (by the caller or by the
 * filter) as described in their documentation, and are to be considered
 * immutable otherwise.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVBSFContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBSFContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBSFContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBSFContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBSFContext position(long position) {
        return (AVBSFContext)super.position(position);
    }
    @Override public AVBSFContext getPointer(long i) {
        return new AVBSFContext((Pointer)this).offsetAddress(i);
    }

    /**
     * A class for logging and AVOptions
     */
    public native @Const AVClass av_class(); public native AVBSFContext av_class(AVClass setter);

    /**
     * The bitstream filter this context is an instance of.
     */
    public native @Const AVBitStreamFilter filter(); public native AVBSFContext filter(AVBitStreamFilter setter);

    /**
     * Opaque filter-specific private data. If filter->priv_class is non-NULL,
     * this is an AVOptions-enabled struct.
     */
    public native Pointer priv_data(); public native AVBSFContext priv_data(Pointer setter);

    /**
     * Parameters of the input stream. This field is allocated in
     * av_bsf_alloc(), it needs to be filled by the caller before
     * av_bsf_init().
     */
    public native AVCodecParameters par_in(); public native AVBSFContext par_in(AVCodecParameters setter);

    /**
     * Parameters of the output stream. This field is allocated in
     * av_bsf_alloc(), it is set by the filter in av_bsf_init().
     */
    public native AVCodecParameters par_out(); public native AVBSFContext par_out(AVCodecParameters setter);

    /**
     * The timebase used for the timestamps of the input packets. Set by the
     * caller before av_bsf_init().
     */
    public native @ByRef AVRational time_base_in(); public native AVBSFContext time_base_in(AVRational setter);

    /**
     * The timebase used for the timestamps of the output packets. Set by the
     * filter in av_bsf_init().
     */
    public native @ByRef AVRational time_base_out(); public native AVBSFContext time_base_out(AVRational setter);
}
