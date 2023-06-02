// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_colordata_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_colordata_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_colordata_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_colordata_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_colordata_t position(long position) {
          return (libraw_colordata_t)super.position(position);
      }
      @Override public libraw_colordata_t getPointer(long i) {
          return new libraw_colordata_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("ushort") short curve(int i); public native libraw_colordata_t curve(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer curve();
    public native @Cast("unsigned") int cblack(int i); public native libraw_colordata_t cblack(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer cblack();
    public native @Cast("unsigned") int black(); public native libraw_colordata_t black(int setter);
    public native @Cast("unsigned") int data_maximum(); public native libraw_colordata_t data_maximum(int setter);
    public native @Cast("unsigned") int maximum(); public native libraw_colordata_t maximum(int setter);

// Canon (SpecularWhiteLevel)
// Kodak (14N, 14nx, SLR/c/n, DCS720X, DCS760C, DCS760M, ProBack, ProBack645, P712, P880, P850)
// Olympus, except:
//	C5050Z, C5060WZ, C7070WZ, C8080WZ
//	SP350, SP500UZ, SP510UZ, SP565UZ
//	E-10, E-20
//	E-300, E-330, E-400, E-410, E-420, E-450, E-500, E-510, E-520
//	E-1, E-3
//	XZ-1
// Panasonic
// Pentax
// Sony
// and aliases of the above
// DNG
    public native long linear_max(int i); public native libraw_colordata_t linear_max(int i, long setter);
    @MemberGetter public native CLongPointer linear_max();

    public native float fmaximum(); public native libraw_colordata_t fmaximum(float setter);
    public native float fnorm(); public native libraw_colordata_t fnorm(float setter);
    public native @Cast("ushort") short white(int i, int j); public native libraw_colordata_t white(int i, int j, short setter);
    @MemberGetter public native @Cast("ushort(* /*[8]*/ )[8]") ShortPointer white();
    public native float cam_mul(int i); public native libraw_colordata_t cam_mul(int i, float setter);
    @MemberGetter public native FloatPointer cam_mul();
    public native float pre_mul(int i); public native libraw_colordata_t pre_mul(int i, float setter);
    @MemberGetter public native FloatPointer pre_mul();
    public native float cmatrix(int i, int j); public native libraw_colordata_t cmatrix(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[3]*/ )[4]") FloatPointer cmatrix();
    public native float ccm(int i, int j); public native libraw_colordata_t ccm(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[3]*/ )[4]") FloatPointer ccm();
    public native float rgb_cam(int i, int j); public native libraw_colordata_t rgb_cam(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[3]*/ )[4]") FloatPointer rgb_cam();
    public native float cam_xyz(int i, int j); public native libraw_colordata_t cam_xyz(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[4]*/ )[3]") FloatPointer cam_xyz();
    public native @ByRef ph1_t phase_one_data(); public native libraw_colordata_t phase_one_data(ph1_t setter);
    public native float flash_used(); public native libraw_colordata_t flash_used(float setter);
    public native float canon_ev(); public native libraw_colordata_t canon_ev(float setter);
    public native @Cast("char") byte model2(int i); public native libraw_colordata_t model2(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer model2();
    public native @Cast("char") byte UniqueCameraModel(int i); public native libraw_colordata_t UniqueCameraModel(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer UniqueCameraModel();
    public native @Cast("char") byte LocalizedCameraModel(int i); public native libraw_colordata_t LocalizedCameraModel(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer LocalizedCameraModel();
    public native @Cast("char") byte ImageUniqueID(int i); public native libraw_colordata_t ImageUniqueID(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer ImageUniqueID();
    public native @Cast("char") byte RawDataUniqueID(int i); public native libraw_colordata_t RawDataUniqueID(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer RawDataUniqueID();
    public native @Cast("char") byte OriginalRawFileName(int i); public native libraw_colordata_t OriginalRawFileName(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer OriginalRawFileName();
    public native Pointer profile(); public native libraw_colordata_t profile(Pointer setter);
    public native @Cast("unsigned") int profile_length(); public native libraw_colordata_t profile_length(int setter);
    public native @Cast("unsigned") int black_stat(int i); public native libraw_colordata_t black_stat(int i, int setter);
    @MemberGetter public native @Cast("unsigned*") IntPointer black_stat();
    public native @ByRef libraw_dng_color_t dng_color(int i); public native libraw_colordata_t dng_color(int i, libraw_dng_color_t setter);
    @MemberGetter public native libraw_dng_color_t dng_color();
    public native @ByRef libraw_dng_levels_t dng_levels(); public native libraw_colordata_t dng_levels(libraw_dng_levels_t setter);
    public native int WB_Coeffs(int i, int j); public native libraw_colordata_t WB_Coeffs(int i, int j, int setter);
    @MemberGetter public native @Cast("int(* /*[256]*/ )[4]") IntPointer WB_Coeffs();    /* R, G1, B, G2 coeffs */
    public native float WBCT_Coeffs(int i, int j); public native libraw_colordata_t WBCT_Coeffs(int i, int j, float setter);
    @MemberGetter public native @Cast("float(* /*[64]*/ )[5]") FloatPointer WBCT_Coeffs(); /* CCT, than R, G1, B, G2 coeffs */
    public native int as_shot_wb_applied(); public native libraw_colordata_t as_shot_wb_applied(int setter);
    public native @ByRef libraw_P1_color_t P1_color(int i); public native libraw_colordata_t P1_color(int i, libraw_P1_color_t setter);
    @MemberGetter public native libraw_P1_color_t P1_color();
    public native @Cast("unsigned") int raw_bps(); public native libraw_colordata_t raw_bps(int setter); /* for Phase One: raw format; For other cameras: bits per pixel (copy of tiff_bps in most cases) */
                      /* Phase One raw format values, makernotes tag 0x010e:
                      0    Name unknown
                      1    "RAW 1"
                      2    "RAW 2"
                      3    "IIQ L" (IIQ L14)
                      4    Never seen
                      5    "IIQ S"
                      6    "IIQ Sv2" (S14 / S14+)
                      7    Never seen
                      8    "IIQ L16" (IIQ L16EX / IIQ L16)
                      */
	public native int ExifColorSpace(); public native libraw_colordata_t ExifColorSpace(int setter);
  }
