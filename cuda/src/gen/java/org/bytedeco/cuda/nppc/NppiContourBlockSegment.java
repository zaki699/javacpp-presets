// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;



/**
 * Provides details of contour pixel grid map location and association 
 */

@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiContourBlockSegment extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiContourBlockSegment() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiContourBlockSegment(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiContourBlockSegment(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiContourBlockSegment position(long position) {
        return (NppiContourBlockSegment)super.position(position);
    }
    @Override public NppiContourBlockSegment getPointer(long i) {
        return new NppiContourBlockSegment((Pointer)this).offsetAddress(i);
    }

    /** this connected pixel region contour ID */
    public native @Cast("Npp32u") int nMarkerLabelID(); public native NppiContourBlockSegment nMarkerLabelID(int setter);
    /** total number of pixels in this connected pixel region contour */
    public native @Cast("Npp32u") int nContourPixelCount(); public native NppiContourBlockSegment nContourPixelCount(int setter);
    /** base offset of starting pixel in the overall contour pixel list */
    public native @Cast("Npp32u") int nContourStartingPixelOffset(); public native NppiContourBlockSegment nContourStartingPixelOffset(int setter);
    /** relative block segment number within this particular contour ID */
    public native @Cast("Npp32u") int nSegmentNum(); public native NppiContourBlockSegment nSegmentNum(int setter);
}
