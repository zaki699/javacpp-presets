// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVComplexDouble extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVComplexDouble() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVComplexDouble(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVComplexDouble(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVComplexDouble position(long position) {
        return (AVComplexDouble)super.position(position);
    }
    @Override public AVComplexDouble getPointer(long i) {
        return new AVComplexDouble((Pointer)this).offsetAddress(i);
    }

    public native double re(); public native AVComplexDouble re(double setter);
    public native double im(); public native AVComplexDouble im(double setter);
}
