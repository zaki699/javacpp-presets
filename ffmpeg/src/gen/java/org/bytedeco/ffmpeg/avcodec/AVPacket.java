// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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
 * This structure stores compressed data. It is typically exported by demuxers
 * and then passed as input to decoders, or received as output from encoders and
 * then passed to muxers.
 *
 * For video, it should typically contain one compressed frame. For audio it may
 * contain several compressed frames. Encoders are allowed to output empty
 * packets, with no compressed data, containing only side data
 * (e.g. to update some stream parameters at the end of encoding).
 *
 * AVPacket is one of the few structs in FFmpeg, whose size is a part of public
 * ABI. Thus it may be allocated on stack and no new fields can be added to it
 * without libavcodec and libavformat major bump.
 *
 * The semantics of data ownership depends on the buf field.
 * If it is set, the packet data is dynamically allocated and is
 * valid indefinitely until a call to av_packet_unref() reduces the
 * reference count to 0.
 *
 * If the buf field is not set av_packet_ref() would make a copy instead
 * of increasing the reference count.
 *
 * The side data is always allocated with av_malloc(), copied by
 * av_packet_ref() and freed by av_packet_unref().
 *
 * @see av_packet_ref
 * @see av_packet_unref
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVPacket extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacket() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPacket(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacket(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPacket position(long position) {
        return (AVPacket)super.position(position);
    }
    @Override public AVPacket getPointer(long i) {
        return new AVPacket(this).position(position + i);
    }

    /**
     * A reference to the reference-counted buffer where the packet data is
     * stored.
     * May be NULL, then the packet data is not reference-counted.
     */
    public native AVBufferRef buf(); public native AVPacket buf(AVBufferRef setter);
    /**
     * Presentation timestamp in AVStream->time_base units; the time at which
     * the decompressed packet will be presented to the user.
     * Can be AV_NOPTS_VALUE if it is not stored in the file.
     * pts MUST be larger or equal to dts as presentation cannot happen before
     * decompression, unless one wants to view hex dumps. Some formats misuse
     * the terms dts and pts/cts to mean something different. Such timestamps
     * must be converted to true pts/dts before they are stored in AVPacket.
     */
    public native @Cast("int64_t") long pts(); public native AVPacket pts(long setter);
    /**
     * Decompression timestamp in AVStream->time_base units; the time at which
     * the packet is decompressed.
     * Can be AV_NOPTS_VALUE if it is not stored in the file.
     */
    public native @Cast("int64_t") long dts(); public native AVPacket dts(long setter);
    public native @Cast("uint8_t*") BytePointer data(); public native AVPacket data(BytePointer setter);
    public native int size(); public native AVPacket size(int setter);
    public native int stream_index(); public native AVPacket stream_index(int setter);
    /**
     * A combination of AV_PKT_FLAG values
     */
    public native int flags(); public native AVPacket flags(int setter);
    /**
     * Additional packet data that can be provided by the container.
     * Packet can contain several types of side information.
     */
    public native AVPacketSideData side_data(); public native AVPacket side_data(AVPacketSideData setter);
    public native int side_data_elems(); public native AVPacket side_data_elems(int setter);

    /**
     * Duration of this packet in AVStream->time_base units, 0 if unknown.
     * Equals next_pts - this_pts in presentation order.
     */
    public native @Cast("int64_t") long duration(); public native AVPacket duration(long setter);

    /** byte position in stream, -1 if unknown */
    public native @Cast("int64_t") long pos(); public native AVPacket pos(long setter);

// #if FF_API_CONVERGENCE_DURATION
    /**
     * @deprecated Same as the duration field, but as int64_t. This was required
     * for Matroska subtitles, whose duration values could overflow when the
     * duration field was still an int.
     */
    public native @Cast("int64_t") @Deprecated long convergence_duration(); public native AVPacket convergence_duration(long setter);
// #endif
}
