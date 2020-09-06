// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_COFF_SYMBOLS_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_COFF_SYMBOLS_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_COFF_SYMBOLS_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_COFF_SYMBOLS_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_COFF_SYMBOLS_HEADER position(long position) {
        return (IMAGE_COFF_SYMBOLS_HEADER)super.position(position);
    }
    @Override public IMAGE_COFF_SYMBOLS_HEADER getPointer(long i) {
        return new IMAGE_COFF_SYMBOLS_HEADER(this).position(position + i);
    }

    public native @Cast("DWORD") int NumberOfSymbols(); public native IMAGE_COFF_SYMBOLS_HEADER NumberOfSymbols(int setter);
    public native @Cast("DWORD") int LvaToFirstSymbol(); public native IMAGE_COFF_SYMBOLS_HEADER LvaToFirstSymbol(int setter);
    public native @Cast("DWORD") int NumberOfLinenumbers(); public native IMAGE_COFF_SYMBOLS_HEADER NumberOfLinenumbers(int setter);
    public native @Cast("DWORD") int LvaToFirstLinenumber(); public native IMAGE_COFF_SYMBOLS_HEADER LvaToFirstLinenumber(int setter);
    public native @Cast("DWORD") int RvaToFirstByteOfCode(); public native IMAGE_COFF_SYMBOLS_HEADER RvaToFirstByteOfCode(int setter);
    public native @Cast("DWORD") int RvaToLastByteOfCode(); public native IMAGE_COFF_SYMBOLS_HEADER RvaToLastByteOfCode(int setter);
    public native @Cast("DWORD") int RvaToFirstByteOfData(); public native IMAGE_COFF_SYMBOLS_HEADER RvaToFirstByteOfData(int setter);
    public native @Cast("DWORD") int RvaToLastByteOfData(); public native IMAGE_COFF_SYMBOLS_HEADER RvaToLastByteOfData(int setter);
}
