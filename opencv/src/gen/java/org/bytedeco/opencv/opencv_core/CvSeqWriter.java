// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSeqWriter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSeqWriter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSeqWriter position(long position) {
        return (CvSeqWriter)super.position(position);
    }
    @Override public CvSeqWriter getPointer(long i) {
        return new CvSeqWriter((Pointer)this).offsetAddress(i);
    }

    public native int header_size(); public native CvSeqWriter header_size(int setter);
    /** the sequence written */
    public native CvSeq seq(); public native CvSeqWriter seq(CvSeq setter);
    /** current block */
    public native CvSeqBlock block(); public native CvSeqWriter block(CvSeqBlock setter);
    /** pointer to free space */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeqWriter ptr(BytePointer setter);
    /** pointer to the beginning of block*/
    public native @Cast("schar*") BytePointer block_min(); public native CvSeqWriter block_min(BytePointer setter);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeqWriter block_max(BytePointer setter);
}
