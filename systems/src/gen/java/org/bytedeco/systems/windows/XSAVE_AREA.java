// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class XSAVE_AREA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XSAVE_AREA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XSAVE_AREA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XSAVE_AREA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XSAVE_AREA position(long position) {
        return (XSAVE_AREA)super.position(position);
    }
    @Override public XSAVE_AREA getPointer(long i) {
        return new XSAVE_AREA((Pointer)this).offsetAddress(i);
    }

    public native @ByRef XSAVE_FORMAT LegacyState(); public native XSAVE_AREA LegacyState(XSAVE_FORMAT setter);
    public native @ByRef XSAVE_AREA_HEADER Header(); public native XSAVE_AREA Header(XSAVE_AREA_HEADER setter);
}
