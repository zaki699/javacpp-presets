// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.libffi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libffi.global.ffi.*;


// #if FFI_SIZEOF_JAVA_RAW == 4 && FFI_SIZEOF_ARG == 8
/* This is a special case for mips64/n32 ABI (and perhaps others) where
   sizeof(void *) is 4 and FFI_SIZEOF_ARG is 8.  */
@Properties(inherit = org.bytedeco.libffi.presets.ffi.class)
public class ffi_java_raw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ffi_java_raw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ffi_java_raw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ffi_java_raw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ffi_java_raw position(long position) {
        return (ffi_java_raw)super.position(position);
    }
    @Override public ffi_java_raw getPointer(long i) {
        return new ffi_java_raw((Pointer)this).offsetAddress(i);
    }

  public native int sint(); public native ffi_java_raw sint(int setter);
  public native @Cast("unsigned int") int uint(); public native ffi_java_raw uint(int setter);
  public native float flt(); public native ffi_java_raw flt(float setter);
  public native @Cast("char") byte data(int i); public native ffi_java_raw data(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer data();
  public native Pointer ptr(); public native ffi_java_raw ptr(Pointer setter);
}
