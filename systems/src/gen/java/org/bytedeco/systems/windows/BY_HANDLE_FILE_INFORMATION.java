// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_DESKTOP)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class BY_HANDLE_FILE_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BY_HANDLE_FILE_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BY_HANDLE_FILE_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BY_HANDLE_FILE_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BY_HANDLE_FILE_INFORMATION position(long position) {
        return (BY_HANDLE_FILE_INFORMATION)super.position(position);
    }
    @Override public BY_HANDLE_FILE_INFORMATION getPointer(long i) {
        return new BY_HANDLE_FILE_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwFileAttributes(); public native BY_HANDLE_FILE_INFORMATION dwFileAttributes(int setter);
    public native @ByRef FILETIME ftCreationTime(); public native BY_HANDLE_FILE_INFORMATION ftCreationTime(FILETIME setter);
    public native @ByRef FILETIME ftLastAccessTime(); public native BY_HANDLE_FILE_INFORMATION ftLastAccessTime(FILETIME setter);
    public native @ByRef FILETIME ftLastWriteTime(); public native BY_HANDLE_FILE_INFORMATION ftLastWriteTime(FILETIME setter);
    public native @Cast("DWORD") int dwVolumeSerialNumber(); public native BY_HANDLE_FILE_INFORMATION dwVolumeSerialNumber(int setter);
    public native @Cast("DWORD") int nFileSizeHigh(); public native BY_HANDLE_FILE_INFORMATION nFileSizeHigh(int setter);
    public native @Cast("DWORD") int nFileSizeLow(); public native BY_HANDLE_FILE_INFORMATION nFileSizeLow(int setter);
    public native @Cast("DWORD") int nNumberOfLinks(); public native BY_HANDLE_FILE_INFORMATION nNumberOfLinks(int setter);
    public native @Cast("DWORD") int nFileIndexHigh(); public native BY_HANDLE_FILE_INFORMATION nFileIndexHigh(int setter);
    public native @Cast("DWORD") int nFileIndexLow(); public native BY_HANDLE_FILE_INFORMATION nFileIndexLow(int setter);
}
