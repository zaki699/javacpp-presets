// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Decode and Crop a JPEG-encoded image to a uint8 tensor.
 * 
 *  The attr {@code channels} indicates the desired number of color channels for the
 *  decoded image.
 * 
 *  Accepted values are:
 * 
 *  *   0: Use the number of channels in the JPEG-encoded image.
 *  *   1: output a grayscale image.
 *  *   3: output an RGB image.
 * 
 *  If needed, the JPEG-encoded image is transformed to match the requested number
 *  of color channels.
 * 
 *  The attr {@code ratio} allows downscaling the image by an integer factor during
 *  decoding.  Allowed values are: 1, 2, 4, and 8.  This is much faster than
 *  downscaling the image later.
 * 
 * 
 *  It is equivalent to a combination of decode and crop, but much faster by only
 *  decoding partial jpeg image.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * contents: 0-D.  The JPEG-encoded image.
 *  * crop_window: 1-D.  The crop window: [crop_y, crop_x, crop_height, crop_width].
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * channels: Number of color channels for the decoded image.
 *  * ratio: Downscaling ratio.
 *  * fancy_upscaling: If true use a slower but nicer upscaling of the
 *  chroma planes (yuv420/422 only).
 *  * try_recover_truncated: If true try to recover an image from truncated input.
 *  * acceptable_fraction: The minimum required fraction of lines before a truncated
 *  input is accepted.
 *  * dct_method: string specifying a hint about the algorithm used for
 *  decompression.  Defaults to "" which maps to a system-specific
 *  default.  Currently valid values are ["INTEGER_FAST",
 *  "INTEGER_ACCURATE"].  The hint may be ignored (e.g., the internal
 *  jpeg library changes to a version that does not have that specific
 *  option.)
 * 
 *  Returns:
 *  * {@code Output}: 3-D with shape {@code [height, width, channels]}.. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DecodeAndCropJpeg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecodeAndCropJpeg(Pointer p) { super(p); }

  /** Optional attribute setters for DecodeAndCropJpeg */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs(this).position(position + i);
      }
  
    /** Number of color channels for the decoded image.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Channels(@Cast("tensorflow::int64") long x);

    /** Downscaling ratio.
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs Ratio(@Cast("tensorflow::int64") long x);

    /** If true use a slower but nicer upscaling of the
     *  chroma planes (yuv420/422 only).
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs FancyUpscaling(@Cast("bool") boolean x);

    /** If true try to recover an image from truncated input.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TryRecoverTruncated(@Cast("bool") boolean x);

    /** The minimum required fraction of lines before a truncated
     *  input is accepted.
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs AcceptableFraction(float x);

    /** string specifying a hint about the algorithm used for
     *  decompression.  Defaults to "" which maps to a system-specific
     *  default.  Currently valid values are ["INTEGER_FAST",
     *  "INTEGER_ACCURATE"].  The hint may be ignored (e.g., the internal
     *  jpeg library changes to a version that does not have that specific
     *  option.)
     * 
     *  Defaults to "" */
    public native @ByVal Attrs DctMethod(@StringPiece BytePointer x);
    public native @ByVal Attrs DctMethod(@StringPiece String x);

    public native @Cast("tensorflow::int64") long channels_(); public native Attrs channels_(long setter);
    public native @Cast("tensorflow::int64") long ratio_(); public native Attrs ratio_(long setter);
    public native @Cast("bool") boolean fancy_upscaling_(); public native Attrs fancy_upscaling_(boolean setter);
    public native @Cast("bool") boolean try_recover_truncated_(); public native Attrs try_recover_truncated_(boolean setter);
    public native float acceptable_fraction_(); public native Attrs acceptable_fraction_(float setter);
    public native @StringPiece BytePointer dct_method_(); public native Attrs dct_method_(BytePointer setter);
  }
  public DecodeAndCropJpeg(@Const @ByRef Scope scope, @ByVal Input contents, @ByVal Input crop_window) { super((Pointer)null); allocate(scope, contents, crop_window); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input contents, @ByVal Input crop_window);
  public DecodeAndCropJpeg(@Const @ByRef Scope scope, @ByVal Input contents, @ByVal Input crop_window, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, contents, crop_window, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input contents, @ByVal Input crop_window, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Channels(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Ratio(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs FancyUpscaling(@Cast("bool") boolean x);
  public static native @ByVal Attrs TryRecoverTruncated(@Cast("bool") boolean x);
  public static native @ByVal Attrs AcceptableFraction(float x);
  public static native @ByVal Attrs DctMethod(@StringPiece BytePointer x);
  public static native @ByVal Attrs DctMethod(@StringPiece String x);

  public native @ByRef Operation operation(); public native DecodeAndCropJpeg operation(Operation setter);
  public native @ByRef Output image(); public native DecodeAndCropJpeg image(Output setter);
}
