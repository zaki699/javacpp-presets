// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CM_POWER_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CM_POWER_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CM_POWER_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CM_POWER_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CM_POWER_DATA position(long position) {
        return (CM_POWER_DATA)super.position(position);
    }
    @Override public CM_POWER_DATA getPointer(long i) {
        return new CM_POWER_DATA(this).position(position + i);
    }

    public native @Cast("DWORD") int PD_Size(); public native CM_POWER_DATA PD_Size(int setter);
    public native @Cast("DEVICE_POWER_STATE") int PD_MostRecentPowerState(); public native CM_POWER_DATA PD_MostRecentPowerState(int setter);
    public native @Cast("DWORD") int PD_Capabilities(); public native CM_POWER_DATA PD_Capabilities(int setter);
    public native @Cast("DWORD") int PD_D1Latency(); public native CM_POWER_DATA PD_D1Latency(int setter);
    public native @Cast("DWORD") int PD_D2Latency(); public native CM_POWER_DATA PD_D2Latency(int setter);
    public native @Cast("DWORD") int PD_D3Latency(); public native CM_POWER_DATA PD_D3Latency(int setter);
    public native @Cast("DEVICE_POWER_STATE") int PD_PowerStateMapping(int i); public native CM_POWER_DATA PD_PowerStateMapping(int i, int setter);
    @MemberGetter public native @Cast("DEVICE_POWER_STATE*") IntPointer PD_PowerStateMapping();
    public native @Cast("SYSTEM_POWER_STATE") int PD_DeepestSystemWake(); public native CM_POWER_DATA PD_DeepestSystemWake(int setter);
}
