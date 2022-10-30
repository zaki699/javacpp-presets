// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MEMORY_BASIC_INFORMATION32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MEMORY_BASIC_INFORMATION32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MEMORY_BASIC_INFORMATION32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MEMORY_BASIC_INFORMATION32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MEMORY_BASIC_INFORMATION32 position(long position) {
        return (MEMORY_BASIC_INFORMATION32)super.position(position);
    }
    @Override public MEMORY_BASIC_INFORMATION32 getPointer(long i) {
        return new MEMORY_BASIC_INFORMATION32((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int BaseAddress(); public native MEMORY_BASIC_INFORMATION32 BaseAddress(int setter);
    public native @Cast("DWORD") int AllocationBase(); public native MEMORY_BASIC_INFORMATION32 AllocationBase(int setter);
    public native @Cast("DWORD") int AllocationProtect(); public native MEMORY_BASIC_INFORMATION32 AllocationProtect(int setter);
    public native @Cast("DWORD") int RegionSize(); public native MEMORY_BASIC_INFORMATION32 RegionSize(int setter);
    public native @Cast("DWORD") int State(); public native MEMORY_BASIC_INFORMATION32 State(int setter);
    public native @Cast("DWORD") int Protect(); public native MEMORY_BASIC_INFORMATION32 Protect(int setter);
    public native @Cast("DWORD") int Type(); public native MEMORY_BASIC_INFORMATION32 Type(int setter);
}
