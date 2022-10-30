// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.swscale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;

import static org.bytedeco.ffmpeg.global.swscale.*;


// vectors can be shared
@Properties(inherit = org.bytedeco.ffmpeg.presets.swscale.class)
public class SwsFilter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SwsFilter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SwsFilter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SwsFilter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SwsFilter position(long position) {
        return (SwsFilter)super.position(position);
    }
    @Override public SwsFilter getPointer(long i) {
        return new SwsFilter((Pointer)this).offsetAddress(i);
    }

    public native SwsVector lumH(); public native SwsFilter lumH(SwsVector setter);
    public native SwsVector lumV(); public native SwsFilter lumV(SwsVector setter);
    public native SwsVector chrH(); public native SwsFilter chrH(SwsVector setter);
    public native SwsVector chrV(); public native SwsFilter chrV(SwsVector setter);
}
