// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class gr_mtl_textureinfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gr_mtl_textureinfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gr_mtl_textureinfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gr_mtl_textureinfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gr_mtl_textureinfo_t position(long position) {
        return (gr_mtl_textureinfo_t)super.position(position);
    }
    @Override public gr_mtl_textureinfo_t getPointer(long i) {
        return new gr_mtl_textureinfo_t((Pointer)this).offsetAddress(i);
    }

    public native @Const Pointer fTexture(); public native gr_mtl_textureinfo_t fTexture(Pointer setter);
}
