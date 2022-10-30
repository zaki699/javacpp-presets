// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Options for saving MJPG videos. Used in saving MJPG videos
 * with a call to spinAVIRecorderOpenMJPG().
 */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinMJPGOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinMJPGOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinMJPGOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinMJPGOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinMJPGOption position(long position) {
        return (spinMJPGOption)super.position(position);
    }
    @Override public spinMJPGOption getPointer(long i) {
        return new spinMJPGOption((Pointer)this).offsetAddress(i);
    }

    /** Frame rate of the stream */
    public native float frameRate(); public native spinMJPGOption frameRate(float setter);

    /** Image quality (1-100) */
    public native @Cast("unsigned int") int quality(); public native spinMJPGOption quality(int setter);

    public native @Cast("unsigned int") int reserved(int i); public native spinMJPGOption reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /*
    _spinMJPGOption()
    {
        frameRate = 15.0;
        quality = 75;
        memset(reserved, 0, sizeof(reserved));
    }*/
}
