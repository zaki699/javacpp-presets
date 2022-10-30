// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_IDLE_STATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_IDLE_STATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_IDLE_STATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_IDLE_STATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_IDLE_STATE position(long position) {
        return (PPM_WMI_IDLE_STATE)super.position(position);
    }
    @Override public PPM_WMI_IDLE_STATE getPointer(long i) {
        return new PPM_WMI_IDLE_STATE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Latency(); public native PPM_WMI_IDLE_STATE Latency(int setter);
    public native @Cast("DWORD") int Power(); public native PPM_WMI_IDLE_STATE Power(int setter);
    public native @Cast("DWORD") int TimeCheck(); public native PPM_WMI_IDLE_STATE TimeCheck(int setter);
    public native @Cast("BYTE") byte PromotePercent(); public native PPM_WMI_IDLE_STATE PromotePercent(byte setter);
    public native @Cast("BYTE") byte DemotePercent(); public native PPM_WMI_IDLE_STATE DemotePercent(byte setter);
    public native @Cast("BYTE") byte StateType(); public native PPM_WMI_IDLE_STATE StateType(byte setter);
    public native @Cast("BYTE") byte Reserved(); public native PPM_WMI_IDLE_STATE Reserved(byte setter);
    public native @Cast("DWORD") int StateFlags(); public native PPM_WMI_IDLE_STATE StateFlags(int setter);
    public native @Cast("DWORD") int Context(); public native PPM_WMI_IDLE_STATE Context(int setter);
    public native @Cast("DWORD") int IdleHandler(); public native PPM_WMI_IDLE_STATE IdleHandler(int setter);
    public native @Cast("DWORD") int Reserved1(); public native PPM_WMI_IDLE_STATE Reserved1(int setter);            // reserved for future use
}
