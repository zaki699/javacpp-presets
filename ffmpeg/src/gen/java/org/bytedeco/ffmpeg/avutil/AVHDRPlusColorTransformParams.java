// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Color transform parameters at a processing window in a dynamic metadata for
 * SMPTE 2094-40.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVHDRPlusColorTransformParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHDRPlusColorTransformParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHDRPlusColorTransformParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHDRPlusColorTransformParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHDRPlusColorTransformParams position(long position) {
        return (AVHDRPlusColorTransformParams)super.position(position);
    }
    @Override public AVHDRPlusColorTransformParams getPointer(long i) {
        return new AVHDRPlusColorTransformParams((Pointer)this).offsetAddress(i);
    }

    /**
     * The relative x coordinate of the top left pixel of the processing
     * window. The value shall be in the range of 0 and 1, inclusive and
     * in multiples of 1/(width of Picture - 1). The value 1 corresponds
     * to the absolute coordinate of width of Picture - 1. The value for
     * first processing window shall be 0.
     */
    public native @ByRef AVRational window_upper_left_corner_x(); public native AVHDRPlusColorTransformParams window_upper_left_corner_x(AVRational setter);

    /**
     * The relative y coordinate of the top left pixel of the processing
     * window. The value shall be in the range of 0 and 1, inclusive and
     * in multiples of 1/(height of Picture - 1). The value 1 corresponds
     * to the absolute coordinate of height of Picture - 1. The value for
     * first processing window shall be 0.
     */
    public native @ByRef AVRational window_upper_left_corner_y(); public native AVHDRPlusColorTransformParams window_upper_left_corner_y(AVRational setter);

    /**
     * The relative x coordinate of the bottom right pixel of the processing
     * window. The value shall be in the range of 0 and 1, inclusive and
     * in multiples of 1/(width of Picture - 1). The value 1 corresponds
     * to the absolute coordinate of width of Picture - 1. The value for
     * first processing window shall be 1.
     */
    public native @ByRef AVRational window_lower_right_corner_x(); public native AVHDRPlusColorTransformParams window_lower_right_corner_x(AVRational setter);

    /**
     * The relative y coordinate of the bottom right pixel of the processing
     * window. The value shall be in the range of 0 and 1, inclusive and
     * in multiples of 1/(height of Picture - 1). The value 1 corresponds
     * to the absolute coordinate of height of Picture - 1. The value for
     * first processing window shall be 1.
     */
    public native @ByRef AVRational window_lower_right_corner_y(); public native AVHDRPlusColorTransformParams window_lower_right_corner_y(AVRational setter);

    /**
     * The x coordinate of the center position of the concentric internal and
     * external ellipses of the elliptical pixel selector in the processing
     * window. The value shall be in the range of 0 to (width of Picture - 1),
     * inclusive and in multiples of 1 pixel.
     */
    public native @Cast("uint16_t") short center_of_ellipse_x(); public native AVHDRPlusColorTransformParams center_of_ellipse_x(short setter);

    /**
     * The y coordinate of the center position of the concentric internal and
     * external ellipses of the elliptical pixel selector in the processing
     * window. The value shall be in the range of 0 to (height of Picture - 1),
     * inclusive and in multiples of 1 pixel.
     */
    public native @Cast("uint16_t") short center_of_ellipse_y(); public native AVHDRPlusColorTransformParams center_of_ellipse_y(short setter);

    /**
     * The clockwise rotation angle in degree of arc with respect to the
     * positive direction of the x-axis of the concentric internal and external
     * ellipses of the elliptical pixel selector in the processing window. The
     * value shall be in the range of 0 to 180, inclusive and in multiples of 1.
     */
    public native @Cast("uint8_t") byte rotation_angle(); public native AVHDRPlusColorTransformParams rotation_angle(byte setter);

    /**
     * The semi-major axis value of the internal ellipse of the elliptical pixel
     * selector in amount of pixels in the processing window. The value shall be
     * in the range of 1 to 65535, inclusive and in multiples of 1 pixel.
     */
    public native @Cast("uint16_t") short semimajor_axis_internal_ellipse(); public native AVHDRPlusColorTransformParams semimajor_axis_internal_ellipse(short setter);

    /**
     * The semi-major axis value of the external ellipse of the elliptical pixel
     * selector in amount of pixels in the processing window. The value
     * shall not be less than semimajor_axis_internal_ellipse of the current
     * processing window. The value shall be in the range of 1 to 65535,
     * inclusive and in multiples of 1 pixel.
     */
    public native @Cast("uint16_t") short semimajor_axis_external_ellipse(); public native AVHDRPlusColorTransformParams semimajor_axis_external_ellipse(short setter);

    /**
     * The semi-minor axis value of the external ellipse of the elliptical pixel
     * selector in amount of pixels in the processing window. The value shall be
     * in the range of 1 to 65535, inclusive and in multiples of 1 pixel.
     */
    public native @Cast("uint16_t") short semiminor_axis_external_ellipse(); public native AVHDRPlusColorTransformParams semiminor_axis_external_ellipse(short setter);

    /**
     * Overlap process option indicates one of the two methods of combining
     * rendered pixels in the processing window in an image with at least one
     * elliptical pixel selector. For overlapping elliptical pixel selectors
     * in an image, overlap_process_option shall have the same value.
     */
    public native @Cast("AVHDRPlusOverlapProcessOption") int overlap_process_option(); public native AVHDRPlusColorTransformParams overlap_process_option(int setter);

    /**
     * The maximum of the color components of linearized RGB values in the
     * processing window in the scene. The values should be in the range of 0 to
     * 1, inclusive and in multiples of 0.00001. maxscl[ 0 ], maxscl[ 1 ], and
     * maxscl[ 2 ] are corresponding to R, G, B color components respectively.
     */
    public native @ByRef AVRational maxscl(int i); public native AVHDRPlusColorTransformParams maxscl(int i, AVRational setter);
    @MemberGetter public native AVRational maxscl();

    /**
     * The average of linearized maxRGB values in the processing window in the
     * scene. The value should be in the range of 0 to 1, inclusive and in
     * multiples of 0.00001.
     */
    public native @ByRef AVRational average_maxrgb(); public native AVHDRPlusColorTransformParams average_maxrgb(AVRational setter);

    /**
     * The number of linearized maxRGB values at given percentiles in the
     * processing window in the scene. The maximum value shall be 15.
     */
    public native @Cast("uint8_t") byte num_distribution_maxrgb_percentiles(); public native AVHDRPlusColorTransformParams num_distribution_maxrgb_percentiles(byte setter);

    /**
     * The linearized maxRGB values at given percentiles in the
     * processing window in the scene.
     */
    public native @ByRef AVHDRPlusPercentile distribution_maxrgb(int i); public native AVHDRPlusColorTransformParams distribution_maxrgb(int i, AVHDRPlusPercentile setter);
    @MemberGetter public native AVHDRPlusPercentile distribution_maxrgb();

    /**
     * The fraction of selected pixels in the image that contains the brightest
     * pixel in the scene. The value shall be in the range of 0 to 1, inclusive
     * and in multiples of 0.001.
     */
    public native @ByRef AVRational fraction_bright_pixels(); public native AVHDRPlusColorTransformParams fraction_bright_pixels(AVRational setter);

    /**
     * This flag indicates that the metadata for the tone mapping function in
     * the processing window is present (for value of 1).
     */
    public native @Cast("uint8_t") byte tone_mapping_flag(); public native AVHDRPlusColorTransformParams tone_mapping_flag(byte setter);

    /**
     * The x coordinate of the separation point between the linear part and the
     * curved part of the tone mapping function. The value shall be in the range
     * of 0 to 1, excluding 0 and in multiples of 1/4095.
     */
    public native @ByRef AVRational knee_point_x(); public native AVHDRPlusColorTransformParams knee_point_x(AVRational setter);

    /**
     * The y coordinate of the separation point between the linear part and the
     * curved part of the tone mapping function. The value shall be in the range
     * of 0 to 1, excluding 0 and in multiples of 1/4095.
     */
    public native @ByRef AVRational knee_point_y(); public native AVHDRPlusColorTransformParams knee_point_y(AVRational setter);

    /**
     * The number of the intermediate anchor parameters of the tone mapping
     * function in the processing window. The maximum value shall be 15.
     */
    public native @Cast("uint8_t") byte num_bezier_curve_anchors(); public native AVHDRPlusColorTransformParams num_bezier_curve_anchors(byte setter);

    /**
     * The intermediate anchor parameters of the tone mapping function in the
     * processing window in the scene. The values should be in the range of 0
     * to 1, inclusive and in multiples of 1/1023.
     */
    public native @ByRef AVRational bezier_curve_anchors(int i); public native AVHDRPlusColorTransformParams bezier_curve_anchors(int i, AVRational setter);
    @MemberGetter public native AVRational bezier_curve_anchors();

    /**
     * This flag shall be equal to 0 in bitstreams conforming to this version of
     * this Specification. Other values are reserved for future use.
     */
    public native @Cast("uint8_t") byte color_saturation_mapping_flag(); public native AVHDRPlusColorTransformParams color_saturation_mapping_flag(byte setter);

    /**
     * The color saturation gain in the processing window in the scene. The
     * value shall be in the range of 0 to 63/8, inclusive and in multiples of
     * 1/8. The default value shall be 1.
     */
    public native @ByRef AVRational color_saturation_weight(); public native AVHDRPlusColorTransformParams color_saturation_weight(AVRational setter);
}
