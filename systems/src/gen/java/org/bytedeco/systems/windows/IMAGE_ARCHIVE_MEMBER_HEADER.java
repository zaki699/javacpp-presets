// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ARCHIVE_MEMBER_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ARCHIVE_MEMBER_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ARCHIVE_MEMBER_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ARCHIVE_MEMBER_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ARCHIVE_MEMBER_HEADER position(long position) {
        return (IMAGE_ARCHIVE_MEMBER_HEADER)super.position(position);
    }
    @Override public IMAGE_ARCHIVE_MEMBER_HEADER getPointer(long i) {
        return new IMAGE_ARCHIVE_MEMBER_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BYTE") byte Name(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER Name(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Name();                          // File member name - `/' terminated.
    public native @Cast("BYTE") byte Date(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER Date(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Date();                          // File member date - decimal.
    public native @Cast("BYTE") byte UserID(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER UserID(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer UserID();                         // File member user id - decimal.
    public native @Cast("BYTE") byte GroupID(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER GroupID(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer GroupID();                        // File member group id - decimal.
    public native @Cast("BYTE") byte Mode(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER Mode(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Mode();                           // File member mode - octal.
    public native @Cast("BYTE") byte Size(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER Size(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Size();                          // File member size - decimal.
    public native @Cast("BYTE") byte EndHeader(int i); public native IMAGE_ARCHIVE_MEMBER_HEADER EndHeader(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer EndHeader();                      // String to end header.
}
