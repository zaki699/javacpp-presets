// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_USER_PRESENCE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_USER_PRESENCE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_USER_PRESENCE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_USER_PRESENCE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_USER_PRESENCE position(long position) {
        return (POWER_USER_PRESENCE)super.position(position);
    }
    @Override public POWER_USER_PRESENCE getPointer(long i) {
        return new POWER_USER_PRESENCE((Pointer)this).offsetAddress(i);
    }

	public native @Cast("POWER_USER_PRESENCE_TYPE") int UserPresence(); public native POWER_USER_PRESENCE UserPresence(int setter);
}
