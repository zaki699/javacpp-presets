// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACCESS_DENIED_ACE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACCESS_DENIED_ACE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACCESS_DENIED_ACE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACCESS_DENIED_ACE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACCESS_DENIED_ACE position(long position) {
        return (ACCESS_DENIED_ACE)super.position(position);
    }
    @Override public ACCESS_DENIED_ACE getPointer(long i) {
        return new ACCESS_DENIED_ACE((Pointer)this).offsetAddress(i);
    }

    public native @ByRef ACE_HEADER Header(); public native ACCESS_DENIED_ACE Header(ACE_HEADER setter);
    public native @Cast("ACCESS_MASK") int Mask(); public native ACCESS_DENIED_ACE Mask(int setter);
    public native @Cast("DWORD") int SidStart(); public native ACCESS_DENIED_ACE SidStart(int setter);
}
