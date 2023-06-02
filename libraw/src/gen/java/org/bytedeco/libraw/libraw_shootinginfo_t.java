// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_shootinginfo_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_shootinginfo_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_shootinginfo_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_shootinginfo_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_shootinginfo_t position(long position) {
          return (libraw_shootinginfo_t)super.position(position);
      }
      @Override public libraw_shootinginfo_t getPointer(long i) {
          return new libraw_shootinginfo_t((Pointer)this).offsetAddress(i);
      }
  
    public native short DriveMode(); public native libraw_shootinginfo_t DriveMode(short setter);
    public native short FocusMode(); public native libraw_shootinginfo_t FocusMode(short setter);
    public native short MeteringMode(); public native libraw_shootinginfo_t MeteringMode(short setter);
    public native short AFPoint(); public native libraw_shootinginfo_t AFPoint(short setter);
    public native short ExposureMode(); public native libraw_shootinginfo_t ExposureMode(short setter);
    public native short ExposureProgram(); public native libraw_shootinginfo_t ExposureProgram(short setter);
    public native short ImageStabilization(); public native libraw_shootinginfo_t ImageStabilization(short setter);
    public native @Cast("char") byte BodySerial(int i); public native libraw_shootinginfo_t BodySerial(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer BodySerial();
    public native @Cast("char") byte InternalBodySerial(int i); public native libraw_shootinginfo_t InternalBodySerial(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer InternalBodySerial(); /* this may be PCB or sensor serial, depends on
                                    make/model */
  }
