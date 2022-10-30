// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libpostal.global.postal.*;


/*
Address parser
*/

@Properties(inherit = org.bytedeco.libpostal.presets.postal.class)
public class libpostal_address_parser_response_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_address_parser_response_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_address_parser_response_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_address_parser_response_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_address_parser_response_t position(long position) {
        return (libpostal_address_parser_response_t)super.position(position);
    }
    @Override public libpostal_address_parser_response_t getPointer(long i) {
        return new libpostal_address_parser_response_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("size_t") long num_components(); public native libpostal_address_parser_response_t num_components(long setter);
    public native @Cast("char*") BytePointer components(int i); public native libpostal_address_parser_response_t components(int i, BytePointer setter);
    public native @Cast("char**") PointerPointer components(); public native libpostal_address_parser_response_t components(PointerPointer setter);
    public native @Cast("char*") BytePointer labels(int i); public native libpostal_address_parser_response_t labels(int i, BytePointer setter);
    public native @Cast("char**") PointerPointer labels(); public native libpostal_address_parser_response_t labels(PointerPointer setter);
}
