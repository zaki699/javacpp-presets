// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_image_sizes_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_image_sizes_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_image_sizes_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_image_sizes_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_image_sizes_t position(long position) {
          return (libraw_image_sizes_t)super.position(position);
      }
      @Override public libraw_image_sizes_t getPointer(long i) {
          return new libraw_image_sizes_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("ushort") short raw_height(); public native libraw_image_sizes_t raw_height(short setter);
    public native @Cast("ushort") short raw_width(); public native libraw_image_sizes_t raw_width(short setter);
    public native @Cast("ushort") short height(); public native libraw_image_sizes_t height(short setter);
    public native @Cast("ushort") short width(); public native libraw_image_sizes_t width(short setter);
    public native @Cast("ushort") short top_margin(); public native libraw_image_sizes_t top_margin(short setter);
    public native @Cast("ushort") short left_margin(); public native libraw_image_sizes_t left_margin(short setter);
    public native @Cast("ushort") short iheight(); public native libraw_image_sizes_t iheight(short setter);
    public native @Cast("ushort") short iwidth(); public native libraw_image_sizes_t iwidth(short setter);
    public native @Cast("unsigned") int raw_pitch(); public native libraw_image_sizes_t raw_pitch(int setter);
    public native double pixel_aspect(); public native libraw_image_sizes_t pixel_aspect(double setter);
    public native int flip(); public native libraw_image_sizes_t flip(int setter);
    public native int mask(int i, int j); public native libraw_image_sizes_t mask(int i, int j, int setter);
    @MemberGetter public native @Cast("int(* /*[8]*/ )[4]") IntPointer mask();
    public native @Cast("ushort") short raw_aspect(); public native libraw_image_sizes_t raw_aspect(short setter);
    public native @ByRef libraw_raw_inset_crop_t raw_inset_crops(int i); public native libraw_image_sizes_t raw_inset_crops(int i, libraw_raw_inset_crop_t setter);
    @MemberGetter public native libraw_raw_inset_crop_t raw_inset_crops();
  }
