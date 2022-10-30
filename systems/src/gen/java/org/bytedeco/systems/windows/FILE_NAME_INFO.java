// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_NAME_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_NAME_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_NAME_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_NAME_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_NAME_INFO position(long position) {
        return (FILE_NAME_INFO)super.position(position);
    }
    @Override public FILE_NAME_INFO getPointer(long i) {
        return new FILE_NAME_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int FileNameLength(); public native FILE_NAME_INFO FileNameLength(int setter);
    public native @Cast("WCHAR") char FileName(int i); public native FILE_NAME_INFO FileName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer FileName();
}
