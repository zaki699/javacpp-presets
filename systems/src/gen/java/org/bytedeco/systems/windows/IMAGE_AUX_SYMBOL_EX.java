// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_AUX_SYMBOL_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_AUX_SYMBOL_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_AUX_SYMBOL_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_AUX_SYMBOL_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_AUX_SYMBOL_EX position(long position) {
        return (IMAGE_AUX_SYMBOL_EX)super.position(position);
    }
    @Override public IMAGE_AUX_SYMBOL_EX getPointer(long i) {
        return new IMAGE_AUX_SYMBOL_EX((Pointer)this).offsetAddress(i);
    }

        @Name("Sym.WeakDefaultSymIndex") public native @Cast("DWORD") int Sym_WeakDefaultSymIndex(); public native IMAGE_AUX_SYMBOL_EX Sym_WeakDefaultSymIndex(int setter);                       // the weak extern default symbol index
        @Name("Sym.WeakSearchType") public native @Cast("DWORD") int Sym_WeakSearchType(); public native IMAGE_AUX_SYMBOL_EX Sym_WeakSearchType(int setter);
        @Name("Sym.rgbReserved") public native @Cast("BYTE") byte Sym_rgbReserved(int i); public native IMAGE_AUX_SYMBOL_EX Sym_rgbReserved(int i, byte setter);
        @Name("Sym.rgbReserved") @MemberGetter public native @Cast("BYTE*") BytePointer Sym_rgbReserved();
        @Name("File.Name") public native @Cast("BYTE") byte File_Name(int i); public native IMAGE_AUX_SYMBOL_EX File_Name(int i, byte setter);
        @Name("File.Name") @MemberGetter public native @Cast("BYTE*") BytePointer File_Name();
        @Name("Section.Length") public native @Cast("DWORD") int Section_Length(); public native IMAGE_AUX_SYMBOL_EX Section_Length(int setter);                         // section length
        @Name("Section.NumberOfRelocations") public native @Cast("WORD") short Section_NumberOfRelocations(); public native IMAGE_AUX_SYMBOL_EX Section_NumberOfRelocations(short setter);            // number of relocation entries
        @Name("Section.NumberOfLinenumbers") public native @Cast("WORD") short Section_NumberOfLinenumbers(); public native IMAGE_AUX_SYMBOL_EX Section_NumberOfLinenumbers(short setter);            // number of line numbers
        @Name("Section.CheckSum") public native @Cast("DWORD") int Section_CheckSum(); public native IMAGE_AUX_SYMBOL_EX Section_CheckSum(int setter);                       // checksum for communal
        @Name("Section.Number") public native @Cast("SHORT") short Section_Number(); public native IMAGE_AUX_SYMBOL_EX Section_Number(short setter);                         // section number to associate with
        @Name("Section.Selection") public native @Cast("BYTE") byte Section_Selection(); public native IMAGE_AUX_SYMBOL_EX Section_Selection(byte setter);                      // communal selection type
        @Name("Section.bReserved") public native @Cast("BYTE") byte Section_bReserved(); public native IMAGE_AUX_SYMBOL_EX Section_bReserved(byte setter);
        @Name("Section.HighNumber") public native @Cast("SHORT") short Section_HighNumber(); public native IMAGE_AUX_SYMBOL_EX Section_HighNumber(short setter);                     // high bits of the section number
        @Name("Section.rgbReserved") public native @Cast("BYTE") byte Section_rgbReserved(int i); public native IMAGE_AUX_SYMBOL_EX Section_rgbReserved(int i, byte setter);
        @Name("Section.rgbReserved") @MemberGetter public native @Cast("BYTE*") BytePointer Section_rgbReserved();
        public native @ByRef IMAGE_AUX_SYMBOL_TOKEN_DEF TokenDef(); public native IMAGE_AUX_SYMBOL_EX TokenDef(IMAGE_AUX_SYMBOL_TOKEN_DEF setter);
        public native @Cast("BYTE") byte rgbReserved(int i); public native IMAGE_AUX_SYMBOL_EX rgbReserved(int i, byte setter);
        @MemberGetter public native @Cast("BYTE*") BytePointer rgbReserved();
        @Name("CRC.crc") public native @Cast("DWORD") int CRC_crc(); public native IMAGE_AUX_SYMBOL_EX CRC_crc(int setter);
        @Name("CRC.rgbReserved") public native @Cast("BYTE") byte CRC_rgbReserved(int i); public native IMAGE_AUX_SYMBOL_EX CRC_rgbReserved(int i, byte setter);
        @Name("CRC.rgbReserved") @MemberGetter public native @Cast("BYTE*") BytePointer CRC_rgbReserved();
}
