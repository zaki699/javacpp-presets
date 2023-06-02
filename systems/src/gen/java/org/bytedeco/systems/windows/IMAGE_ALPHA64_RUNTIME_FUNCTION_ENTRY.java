// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY position(long position) {
        return (IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY)super.position(position);
    }
    @Override public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY getPointer(long i) {
        return new IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONGLONG") long BeginAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY BeginAddress(long setter);
    public native @Cast("ULONGLONG") long EndAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY EndAddress(long setter);
    public native @Cast("ULONGLONG") long ExceptionHandler(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY ExceptionHandler(long setter);
    public native @Cast("ULONGLONG") long HandlerData(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY HandlerData(long setter);
    public native @Cast("ULONGLONG") long PrologEndAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY PrologEndAddress(long setter);
}
