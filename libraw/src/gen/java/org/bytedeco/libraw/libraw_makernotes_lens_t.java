// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_makernotes_lens_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_makernotes_lens_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_makernotes_lens_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_makernotes_lens_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_makernotes_lens_t position(long position) {
          return (libraw_makernotes_lens_t)super.position(position);
      }
      @Override public libraw_makernotes_lens_t getPointer(long i) {
          return new libraw_makernotes_lens_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("unsigned long long") long LensID(); public native libraw_makernotes_lens_t LensID(long setter);
    public native @Cast("char") byte Lens(int i); public native libraw_makernotes_lens_t Lens(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer Lens();
    public native @Cast("ushort") short LensFormat(); public native libraw_makernotes_lens_t LensFormat(short setter); /* to characterize the image circle the lens covers */
    public native @Cast("ushort") short LensMount(); public native libraw_makernotes_lens_t LensMount(short setter);  /* 'male', lens itself */
    public native @Cast("unsigned long long") long CamID(); public native libraw_makernotes_lens_t CamID(long setter);
    public native @Cast("ushort") short CameraFormat(); public native libraw_makernotes_lens_t CameraFormat(short setter); /* some of the sensor formats */
    public native @Cast("ushort") short CameraMount(); public native libraw_makernotes_lens_t CameraMount(short setter);  /* 'female', body throat */
    public native @Cast("char") byte body(int i); public native libraw_makernotes_lens_t body(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer body();
    public native short FocalType(); public native libraw_makernotes_lens_t FocalType(short setter); /* -1/0 is unknown; 1 is fixed focal; 2 is zoom */
    public native @Cast("char") byte LensFeatures_pre(int i); public native libraw_makernotes_lens_t LensFeatures_pre(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer LensFeatures_pre();
    public native @Cast("char") byte LensFeatures_suf(int i); public native libraw_makernotes_lens_t LensFeatures_suf(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer LensFeatures_suf();
    public native float MinFocal(); public native libraw_makernotes_lens_t MinFocal(float setter);
    public native float MaxFocal(); public native libraw_makernotes_lens_t MaxFocal(float setter);
    public native float MaxAp4MinFocal(); public native libraw_makernotes_lens_t MaxAp4MinFocal(float setter);
    public native float MaxAp4MaxFocal(); public native libraw_makernotes_lens_t MaxAp4MaxFocal(float setter);
    public native float MinAp4MinFocal(); public native libraw_makernotes_lens_t MinAp4MinFocal(float setter);
    public native float MinAp4MaxFocal(); public native libraw_makernotes_lens_t MinAp4MaxFocal(float setter);
    public native float MaxAp(); public native libraw_makernotes_lens_t MaxAp(float setter);
    public native float MinAp(); public native libraw_makernotes_lens_t MinAp(float setter);
    public native float CurFocal(); public native libraw_makernotes_lens_t CurFocal(float setter);
    public native float CurAp(); public native libraw_makernotes_lens_t CurAp(float setter);
    public native float MaxAp4CurFocal(); public native libraw_makernotes_lens_t MaxAp4CurFocal(float setter);
    public native float MinAp4CurFocal(); public native libraw_makernotes_lens_t MinAp4CurFocal(float setter);
    public native float MinFocusDistance(); public native libraw_makernotes_lens_t MinFocusDistance(float setter);
    public native float FocusRangeIndex(); public native libraw_makernotes_lens_t FocusRangeIndex(float setter);
    public native float LensFStops(); public native libraw_makernotes_lens_t LensFStops(float setter);
    public native @Cast("unsigned long long") long TeleconverterID(); public native libraw_makernotes_lens_t TeleconverterID(long setter);
    public native @Cast("char") byte Teleconverter(int i); public native libraw_makernotes_lens_t Teleconverter(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer Teleconverter();
    public native @Cast("unsigned long long") long AdapterID(); public native libraw_makernotes_lens_t AdapterID(long setter);
    public native @Cast("char") byte Adapter(int i); public native libraw_makernotes_lens_t Adapter(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer Adapter();
    public native @Cast("unsigned long long") long AttachmentID(); public native libraw_makernotes_lens_t AttachmentID(long setter);
    public native @Cast("char") byte Attachment(int i); public native libraw_makernotes_lens_t Attachment(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer Attachment();
    public native @Cast("ushort") short FocalUnits(); public native libraw_makernotes_lens_t FocalUnits(short setter);
    public native float FocalLengthIn35mmFormat(); public native libraw_makernotes_lens_t FocalLengthIn35mmFormat(float setter);
  }
