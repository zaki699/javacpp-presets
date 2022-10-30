// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class NT_TIB extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NT_TIB() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NT_TIB(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NT_TIB(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NT_TIB position(long position) {
        return (NT_TIB)super.position(position);
    }
    @Override public NT_TIB getPointer(long i) {
        return new NT_TIB((Pointer)this).offsetAddress(i);
    }

    public native EXCEPTION_REGISTRATION_RECORD ExceptionList(); public native NT_TIB ExceptionList(EXCEPTION_REGISTRATION_RECORD setter);
    public native @Cast("PVOID") Pointer StackBase(); public native NT_TIB StackBase(Pointer setter);
    public native @Cast("PVOID") Pointer StackLimit(); public native NT_TIB StackLimit(Pointer setter);
    public native @Cast("PVOID") Pointer SubSystemTib(); public native NT_TIB SubSystemTib(Pointer setter);
// #if defined(_MSC_EXTENSIONS)
        public native @Cast("PVOID") Pointer FiberData(); public native NT_TIB FiberData(Pointer setter);
        public native @Cast("DWORD") int Version(); public native NT_TIB Version(int setter);
// #else
// #endif
    public native @Cast("PVOID") Pointer ArbitraryUserPointer(); public native NT_TIB ArbitraryUserPointer(Pointer setter);
    public native NT_TIB Self(); public native NT_TIB Self(NT_TIB setter);
}
