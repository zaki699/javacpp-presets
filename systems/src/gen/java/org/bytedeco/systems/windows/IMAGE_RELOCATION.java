// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Relocation format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_RELOCATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_RELOCATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_RELOCATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_RELOCATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_RELOCATION position(long position) {
        return (IMAGE_RELOCATION)super.position(position);
    }
    @Override public IMAGE_RELOCATION getPointer(long i) {
        return new IMAGE_RELOCATION((Pointer)this).offsetAddress(i);
    }

        public native @Cast("DWORD") int VirtualAddress(); public native IMAGE_RELOCATION VirtualAddress(int setter);
        public native @Cast("DWORD") int RelocCount(); public native IMAGE_RELOCATION RelocCount(int setter);             // Set to the real count when IMAGE_SCN_LNK_NRELOC_OVFL is set 
    public native @Cast("DWORD") int SymbolTableIndex(); public native IMAGE_RELOCATION SymbolTableIndex(int setter);
    public native @Cast("WORD") short Type(); public native IMAGE_RELOCATION Type(short setter);
}
