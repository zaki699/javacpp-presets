// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Winlogon notifications
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_SESSION_WINLOGON extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_SESSION_WINLOGON() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_SESSION_WINLOGON(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_SESSION_WINLOGON(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_SESSION_WINLOGON position(long position) {
        return (POWER_SESSION_WINLOGON)super.position(position);
    }
    @Override public POWER_SESSION_WINLOGON getPointer(long i) {
        return new POWER_SESSION_WINLOGON((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int SessionId(); public native POWER_SESSION_WINLOGON SessionId(int setter); // the Win32k session identifier
    public native @Cast("BOOLEAN") boolean Console(); public native POWER_SESSION_WINLOGON Console(boolean setter); // TRUE - for console session, FALSE - for remote session
    public native @Cast("BOOLEAN") boolean Locked(); public native POWER_SESSION_WINLOGON Locked(boolean setter); // TRUE - lock, FALSE - unlock
}
