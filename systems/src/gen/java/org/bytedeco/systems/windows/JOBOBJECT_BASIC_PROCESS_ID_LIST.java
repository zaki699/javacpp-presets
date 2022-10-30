// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_BASIC_PROCESS_ID_LIST extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_BASIC_PROCESS_ID_LIST() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_BASIC_PROCESS_ID_LIST(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_BASIC_PROCESS_ID_LIST(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_BASIC_PROCESS_ID_LIST position(long position) {
        return (JOBOBJECT_BASIC_PROCESS_ID_LIST)super.position(position);
    }
    @Override public JOBOBJECT_BASIC_PROCESS_ID_LIST getPointer(long i) {
        return new JOBOBJECT_BASIC_PROCESS_ID_LIST((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int NumberOfAssignedProcesses(); public native JOBOBJECT_BASIC_PROCESS_ID_LIST NumberOfAssignedProcesses(int setter);
    public native @Cast("DWORD") int NumberOfProcessIdsInList(); public native JOBOBJECT_BASIC_PROCESS_ID_LIST NumberOfProcessIdsInList(int setter);
    public native @Cast("ULONG_PTR") long ProcessIdList(int i); public native JOBOBJECT_BASIC_PROCESS_ID_LIST ProcessIdList(int i, long setter);
    @MemberGetter public native @Cast("ULONG_PTR*") SizeTPointer ProcessIdList();
}
