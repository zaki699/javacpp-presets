// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_lattice_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_lattice_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_lattice_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_lattice_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_lattice_t position(long position) {
        return (sk_lattice_t)super.position(position);
    }

    @MemberGetter public native @Const IntPointer fXDivs();
    @MemberGetter public native @Const IntPointer fYDivs();
    @MemberGetter public native @Cast("const sk_lattice_recttype_t*") IntPointer fRectTypes();
    public native int fXCount(); public native sk_lattice_t fXCount(int fXCount);
    public native int fYCount(); public native sk_lattice_t fYCount(int fYCount);
    @MemberGetter public native @Const sk_irect_t fBounds();
    @MemberGetter public native @Cast("const sk_color_t*") IntPointer fColors();
}
