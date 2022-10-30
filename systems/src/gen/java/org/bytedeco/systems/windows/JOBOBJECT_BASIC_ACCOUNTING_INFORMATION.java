// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_BASIC_ACCOUNTING_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_BASIC_ACCOUNTING_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_BASIC_ACCOUNTING_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_BASIC_ACCOUNTING_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_BASIC_ACCOUNTING_INFORMATION position(long position) {
        return (JOBOBJECT_BASIC_ACCOUNTING_INFORMATION)super.position(position);
    }
    @Override public JOBOBJECT_BASIC_ACCOUNTING_INFORMATION getPointer(long i) {
        return new JOBOBJECT_BASIC_ACCOUNTING_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @ByRef LARGE_INTEGER TotalUserTime(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION TotalUserTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER TotalKernelTime(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION TotalKernelTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER ThisPeriodTotalUserTime(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION ThisPeriodTotalUserTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER ThisPeriodTotalKernelTime(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION ThisPeriodTotalKernelTime(LARGE_INTEGER setter);
    public native @Cast("DWORD") int TotalPageFaultCount(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION TotalPageFaultCount(int setter);
    public native @Cast("DWORD") int TotalProcesses(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION TotalProcesses(int setter);
    public native @Cast("DWORD") int ActiveProcesses(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION ActiveProcesses(int setter);
    public native @Cast("DWORD") int TotalTerminatedProcesses(); public native JOBOBJECT_BASIC_ACCOUNTING_INFORMATION TotalTerminatedProcesses(int setter);
}
