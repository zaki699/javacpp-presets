// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/** RawImgFrame structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawImgFrame extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawImgFrame() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawImgFrame(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawImgFrame(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawImgFrame position(long position) {
        return (RawImgFrame)super.position(position);
    }
    @Override public RawImgFrame getPointer(long i) {
        return new RawImgFrame((Pointer)this).offsetAddress(i);
    }

    public enum Type {
        YUV422i(0),        // interleaved 8 bit
        YUV444p(1),        // planar 4:4:4 format
        YUV420p(2),        // planar 4:2:0 format
        YUV422p(3),        // planar 8 bit
        YUV400p(4),        // 8-bit greyscale
        RGBA8888(5),       // RGBA interleaved stored in 32 bit word
        RGB161616(6),      // Planar 16 bit RGB data
        RGB888p(7),        // Planar 8 bit RGB data
        BGR888p(8),        // Planar 8 bit BGR data
        RGB888i(9),        // Interleaved 8 bit RGB data
        BGR888i(10),        // Interleaved 8 bit BGR data
        RGBF16F16F16p(11),  // Planar FP16 RGB data
        BGRF16F16F16p(12),  // Planar FP16 BGR data
        RGBF16F16F16i(13),  // Interleaved FP16 RGB data
        BGRF16F16F16i(14),  // Interleaved FP16 BGR data
        GRAY8(15),          // 8 bit grayscale (1 plane)
        GRAYF16(16),        // FP16 grayscale (normalized)
        LUT2(17),           // 1 bit  per pixel, Lookup table
        LUT4(18),           // 2 bits per pixel, Lookup table
        LUT16(19),          // 4 bits per pixel, Lookup table
        RAW16(20),          // save any raw type (8, 10, 12bit) on 16 bits
        RAW14(21),          // 14bit value in 16bit storage
        RAW12(22),          // 12bit value in 16bit storage
        RAW10(23),          // 10bit value in 16bit storage
        RAW8(24),
        PACK10(25),  // 10bit packed format
        PACK12(26),  // 12bit packed format
        YUV444i(27),
        NV12(28),
        NV21(29),
        BITSTREAM(30),  // used for video encoder bitstream
        HDR(31),
        NONE(32);

        public final int value;
        private Type(int v) { this.value = v; }
        private Type(Type e) { this.value = e.value; }
        public Type intern() { for (Type e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    public static class Specs extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Specs() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Specs(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Specs(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Specs position(long position) {
            return (Specs)super.position(position);
        }
        @Override public Specs getPointer(long i) {
            return new Specs((Pointer)this).offsetAddress(i);
        }
    
        public native Type type(); public native Specs type(Type setter);
        public native @Cast("unsigned int") int width(); public native Specs width(int setter);     // width in pixels
        public native @Cast("unsigned int") int height(); public native Specs height(int setter);    // height in pixels
        public native @Cast("unsigned int") int stride(); public native Specs stride(int setter);    // defined as distance in bytes from pix(y,x) to pix(y+1,x)
        public native @Cast("unsigned int") int bytesPP(); public native Specs bytesPP(int setter);   // bytes per pixel (for LUT types 1)
        public native @Cast("unsigned int") int p1Offset(); public native Specs p1Offset(int setter);  // Offset to first plane
        public native @Cast("unsigned int") int p2Offset(); public native Specs p2Offset(int setter);  // Offset to second plane
        public native @Cast("unsigned int") int p3Offset(); public native Specs p3Offset(int setter);  // Offset to third plane
    }

    public native @ByRef Specs fb(); public native RawImgFrame fb(Specs setter);
    public native @Cast("uint32_t") int category(); public native RawImgFrame category(int setter);     //
    public native @Cast("uint32_t") int instanceNum(); public native RawImgFrame instanceNum(int setter);  // Which source created this frame (color, mono, ...)
    public native int sequenceNum(); public native RawImgFrame sequenceNum(int setter);       // increments for each frame
    public native @ByRef Timestamp ts(); public native RawImgFrame ts(Timestamp setter);          // generation timestamp

    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
