// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_BASIC_UI_RESTRICTIONS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_BASIC_UI_RESTRICTIONS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_BASIC_UI_RESTRICTIONS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_BASIC_UI_RESTRICTIONS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_BASIC_UI_RESTRICTIONS position(long position) {
        return (JOBOBJECT_BASIC_UI_RESTRICTIONS)super.position(position);
    }
    @Override public JOBOBJECT_BASIC_UI_RESTRICTIONS getPointer(long i) {
        return new JOBOBJECT_BASIC_UI_RESTRICTIONS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int UIRestrictionsClass(); public native JOBOBJECT_BASIC_UI_RESTRICTIONS UIRestrictionsClass(int setter);
}
