// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WIN32_FIND_DATAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WIN32_FIND_DATAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WIN32_FIND_DATAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WIN32_FIND_DATAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WIN32_FIND_DATAA position(long position) {
        return (WIN32_FIND_DATAA)super.position(position);
    }
    @Override public WIN32_FIND_DATAA getPointer(long i) {
        return new WIN32_FIND_DATAA((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwFileAttributes(); public native WIN32_FIND_DATAA dwFileAttributes(int setter);
    public native @ByRef FILETIME ftCreationTime(); public native WIN32_FIND_DATAA ftCreationTime(FILETIME setter);
    public native @ByRef FILETIME ftLastAccessTime(); public native WIN32_FIND_DATAA ftLastAccessTime(FILETIME setter);
    public native @ByRef FILETIME ftLastWriteTime(); public native WIN32_FIND_DATAA ftLastWriteTime(FILETIME setter);
    public native @Cast("DWORD") int nFileSizeHigh(); public native WIN32_FIND_DATAA nFileSizeHigh(int setter);
    public native @Cast("DWORD") int nFileSizeLow(); public native WIN32_FIND_DATAA nFileSizeLow(int setter);
    public native @Cast("DWORD") int dwReserved0(); public native WIN32_FIND_DATAA dwReserved0(int setter);
    public native @Cast("DWORD") int dwReserved1(); public native WIN32_FIND_DATAA dwReserved1(int setter);
    public native @Cast("CHAR") byte cFileName(int i); public native WIN32_FIND_DATAA cFileName(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer cFileName();
    public native @Cast("CHAR") byte cAlternateFileName(int i); public native WIN32_FIND_DATAA cAlternateFileName(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer cAlternateFileName();
// #ifdef _MAC
// #endif
}
