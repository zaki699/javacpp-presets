// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STAFactor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STAFactor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STAFactor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STAFactor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STAFactor position(long position) {
        return (STAFactor)super.position(position);
    }
    @Override public STAFactor getPointer(long i) {
        return new STAFactor((Pointer)this).offsetAddress(i);
    }

    public native float amplitude(); public native STAFactor amplitude(float setter);
}
