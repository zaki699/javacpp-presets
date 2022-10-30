// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_LOGICAL_PROCESSOR_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_LOGICAL_PROCESSOR_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_LOGICAL_PROCESSOR_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_LOGICAL_PROCESSOR_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_LOGICAL_PROCESSOR_INFORMATION position(long position) {
        return (SYSTEM_LOGICAL_PROCESSOR_INFORMATION)super.position(position);
    }
    @Override public SYSTEM_LOGICAL_PROCESSOR_INFORMATION getPointer(long i) {
        return new SYSTEM_LOGICAL_PROCESSOR_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONG_PTR") long ProcessorMask(); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION ProcessorMask(long setter);
    public native @Cast("LOGICAL_PROCESSOR_RELATIONSHIP") int Relationship(); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION Relationship(int setter);
            @Name("ProcessorCore.Flags") public native @Cast("BYTE") byte ProcessorCore_Flags(); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION ProcessorCore_Flags(byte setter);
            @Name("NumaNode.NodeNumber") public native @Cast("DWORD") int NumaNode_NodeNumber(); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION NumaNode_NodeNumber(int setter);
        public native @ByRef CACHE_DESCRIPTOR Cache(); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION Cache(CACHE_DESCRIPTOR setter);
        public native @Cast("ULONGLONG") long Reserved(int i); public native SYSTEM_LOGICAL_PROCESSOR_INFORMATION Reserved(int i, long setter);
        @MemberGetter public native @Cast("ULONGLONG*") LongPointer Reserved(); 
}
