// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * List of AVOptionRange structs.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVOptionRanges extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOptionRanges() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVOptionRanges(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOptionRanges(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVOptionRanges position(long position) {
        return (AVOptionRanges)super.position(position);
    }
    @Override public AVOptionRanges getPointer(long i) {
        return new AVOptionRanges((Pointer)this).offsetAddress(i);
    }

    /**
     * Array of option ranges.
     *
     * Most of option types use just one component.
     * Following describes multi-component option types:
     *
     * AV_OPT_TYPE_IMAGE_SIZE:
     * component index 0: range of pixel count (width * height).
     * component index 1: range of width.
     * component index 2: range of height.
     *
     * \note To obtain multi-component version of this structure, user must
     *       provide AV_OPT_MULTI_COMPONENT_RANGE to av_opt_query_ranges or
     *       av_opt_query_ranges_default function.
     *
     * Multi-component range can be read as in following example:
     *
     * <pre>{@code
     * int range_index, component_index;
     * AVOptionRanges *ranges;
     * AVOptionRange *range[3]; //may require more than 3 in the future.
     * av_opt_query_ranges(&ranges, obj, key, AV_OPT_MULTI_COMPONENT_RANGE);
     * for (range_index = 0; range_index < ranges->nb_ranges; range_index++) {
     *     for (component_index = 0; component_index < ranges->nb_components; component_index++)
     *         range[component_index] = ranges->range[ranges->nb_ranges * component_index + range_index];
     *     //do something with range here.
     * }
     * av_opt_freep_ranges(&ranges);
     * }</pre>
     */
    public native AVOptionRange range(int i); public native AVOptionRanges range(int i, AVOptionRange setter);
    public native @Cast("AVOptionRange**") PointerPointer range(); public native AVOptionRanges range(PointerPointer setter);
    /**
     * Number of ranges per component.
     */
    public native int nb_ranges(); public native AVOptionRanges nb_ranges(int setter);
    /**
     * Number of componentes.
     */
    public native int nb_components(); public native AVOptionRanges nb_components(int setter);
}
