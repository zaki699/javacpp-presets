// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
                    // Back to 4 byte packing
// #endif

//
// File header format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_FILE_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_FILE_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_FILE_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_FILE_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_FILE_HEADER position(long position) {
        return (IMAGE_FILE_HEADER)super.position(position);
    }
    @Override public IMAGE_FILE_HEADER getPointer(long i) {
        return new IMAGE_FILE_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Machine(); public native IMAGE_FILE_HEADER Machine(short setter);
    public native @Cast("WORD") short NumberOfSections(); public native IMAGE_FILE_HEADER NumberOfSections(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_FILE_HEADER TimeDateStamp(int setter);
    public native @Cast("DWORD") int PointerToSymbolTable(); public native IMAGE_FILE_HEADER PointerToSymbolTable(int setter);
    public native @Cast("DWORD") int NumberOfSymbols(); public native IMAGE_FILE_HEADER NumberOfSymbols(int setter);
    public native @Cast("WORD") short SizeOfOptionalHeader(); public native IMAGE_FILE_HEADER SizeOfOptionalHeader(short setter);
    public native @Cast("WORD") short Characteristics(); public native IMAGE_FILE_HEADER Characteristics(short setter);
}
