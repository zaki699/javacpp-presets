// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_rawdata_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_rawdata_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_rawdata_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_rawdata_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_rawdata_t position(long position) {
          return (libraw_rawdata_t)super.position(position);
      }
      @Override public libraw_rawdata_t getPointer(long i) {
          return new libraw_rawdata_t((Pointer)this).offsetAddress(i);
      }
  
    /* really allocated bitmap */
    public native Pointer raw_alloc(); public native libraw_rawdata_t raw_alloc(Pointer setter);
    /* alias to single_channel variant */
    public native @Cast("ushort*") ShortPointer raw_image(); public native libraw_rawdata_t raw_image(ShortPointer setter);
    /* alias to 4-channel variant */
    public native @Cast("ushort") short color4_image(int i, int j); public native libraw_rawdata_t color4_image(int i, int j, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer color4_image();
    /* alias to 3-color variand decoded by RawSpeed */
    public native @Cast("ushort") short color3_image(int i, int j); public native libraw_rawdata_t color3_image(int i, int j, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer color3_image();
    /* float bayer */
    public native FloatPointer float_image(); public native libraw_rawdata_t float_image(FloatPointer setter);
    /* float 3-component */
    public native float float3_image(int i, int j); public native libraw_rawdata_t float3_image(int i, int j, float setter);
    @MemberGetter public native @Cast("float*") FloatPointer float3_image();
    /* float 4-component */
    public native float float4_image(int i, int j); public native libraw_rawdata_t float4_image(int i, int j, float setter);
    @MemberGetter public native @Cast("float*") FloatPointer float4_image();

    /* Phase One black level data; */
    public native short ph1_cblack(int i, int j); public native libraw_rawdata_t ph1_cblack(int i, int j, short setter);
    @MemberGetter public native @Cast("short*") ShortPointer ph1_cblack();
    public native short ph1_rblack(int i, int j); public native libraw_rawdata_t ph1_rblack(int i, int j, short setter);
    @MemberGetter public native @Cast("short*") ShortPointer ph1_rblack();
    /* save color and sizes here, too.... */
    public native @ByRef libraw_iparams_t iparams(); public native libraw_rawdata_t iparams(libraw_iparams_t setter);
    public native @ByRef libraw_image_sizes_t sizes(); public native libraw_rawdata_t sizes(libraw_image_sizes_t setter);
    public native @ByRef libraw_internal_output_params_t ioparams(); public native libraw_rawdata_t ioparams(libraw_internal_output_params_t setter);
    public native @ByRef libraw_colordata_t color(); public native libraw_rawdata_t color(libraw_colordata_t setter);
  }
