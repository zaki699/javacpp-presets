// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * This struct represents dynamic metadata for color volume transform -
 * application 4 of SMPTE 2094-40:2016 standard.
 *
 * To be used as payload of a AVFrameSideData or AVPacketSideData with the
 * appropriate type.
 *
 * \note The struct should be allocated with
 * av_dynamic_hdr_plus_alloc() and its size is not a part of
 * the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVDynamicHDRPlus extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDynamicHDRPlus() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDynamicHDRPlus(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDynamicHDRPlus(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDynamicHDRPlus position(long position) {
        return (AVDynamicHDRPlus)super.position(position);
    }
    @Override public AVDynamicHDRPlus getPointer(long i) {
        return new AVDynamicHDRPlus((Pointer)this).offsetAddress(i);
    }

    /**
     * Country code by Rec. ITU-T T.35 Annex A. The value shall be 0xB5.
     */
    public native @Cast("uint8_t") byte itu_t_t35_country_code(); public native AVDynamicHDRPlus itu_t_t35_country_code(byte setter);

    /**
     * Application version in the application defining document in ST-2094
     * suite. The value shall be set to 0.
     */
    public native @Cast("uint8_t") byte application_version(); public native AVDynamicHDRPlus application_version(byte setter);

    /**
     * The number of processing windows. The value shall be in the range
     * of 1 to 3, inclusive.
     */
    public native @Cast("uint8_t") byte num_windows(); public native AVDynamicHDRPlus num_windows(byte setter);

    /**
     * The color transform parameters for every processing window.
     */
    public native @ByRef AVHDRPlusColorTransformParams params(int i); public native AVDynamicHDRPlus params(int i, AVHDRPlusColorTransformParams setter);
    @MemberGetter public native AVHDRPlusColorTransformParams params();

    /**
     * The nominal maximum display luminance of the targeted system display,
     * in units of 0.0001 candelas per square metre. The value shall be in
     * the range of 0 to 10000, inclusive.
     */
    public native @ByRef AVRational targeted_system_display_maximum_luminance(); public native AVDynamicHDRPlus targeted_system_display_maximum_luminance(AVRational setter);

    /**
     * This flag shall be equal to 0 in bit streams conforming to this version
     * of this Specification. The value 1 is reserved for future use.
     */
    public native @Cast("uint8_t") byte targeted_system_display_actual_peak_luminance_flag(); public native AVDynamicHDRPlus targeted_system_display_actual_peak_luminance_flag(byte setter);

    /**
     * The number of rows in the targeted system_display_actual_peak_luminance
     * array. The value shall be in the range of 2 to 25, inclusive.
     */
    public native @Cast("uint8_t") byte num_rows_targeted_system_display_actual_peak_luminance(); public native AVDynamicHDRPlus num_rows_targeted_system_display_actual_peak_luminance(byte setter);

    /**
     * The number of columns in the
     * targeted_system_display_actual_peak_luminance array. The value shall be
     * in the range of 2 to 25, inclusive.
     */
    public native @Cast("uint8_t") byte num_cols_targeted_system_display_actual_peak_luminance(); public native AVDynamicHDRPlus num_cols_targeted_system_display_actual_peak_luminance(byte setter);

    /**
     * The normalized actual peak luminance of the targeted system display. The
     * values should be in the range of 0 to 1, inclusive and in multiples of
     * 1/15.
     */
    public native @ByRef AVRational targeted_system_display_actual_peak_luminance(int i, int j); public native AVDynamicHDRPlus targeted_system_display_actual_peak_luminance(int i, int j, AVRational setter);
    @MemberGetter public native @Cast("AVRational(* /*[25]*/ )[25]") AVRational targeted_system_display_actual_peak_luminance();

    /**
     * This flag shall be equal to 0 in bitstreams conforming to this version of
     * this Specification. The value 1 is reserved for future use.
     */
    public native @Cast("uint8_t") byte mastering_display_actual_peak_luminance_flag(); public native AVDynamicHDRPlus mastering_display_actual_peak_luminance_flag(byte setter);

    /**
     * The number of rows in the mastering_display_actual_peak_luminance array.
     * The value shall be in the range of 2 to 25, inclusive.
     */
    public native @Cast("uint8_t") byte num_rows_mastering_display_actual_peak_luminance(); public native AVDynamicHDRPlus num_rows_mastering_display_actual_peak_luminance(byte setter);

    /**
     * The number of columns in the mastering_display_actual_peak_luminance
     * array. The value shall be in the range of 2 to 25, inclusive.
     */
    public native @Cast("uint8_t") byte num_cols_mastering_display_actual_peak_luminance(); public native AVDynamicHDRPlus num_cols_mastering_display_actual_peak_luminance(byte setter);

    /**
     * The normalized actual peak luminance of the mastering display used for
     * mastering the image essence. The values should be in the range of 0 to 1,
     * inclusive and in multiples of 1/15.
     */
    public native @ByRef AVRational mastering_display_actual_peak_luminance(int i, int j); public native AVDynamicHDRPlus mastering_display_actual_peak_luminance(int i, int j, AVRational setter);
    @MemberGetter public native @Cast("AVRational(* /*[25]*/ )[25]") AVRational mastering_display_actual_peak_luminance();
}
