// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;



    /** Array of generic pointer arrays */
@Name("L_Ptraa") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_PTRAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_PTRAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_PTRAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_PTRAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_PTRAA position(long position) {
        return (L_PTRAA)super.position(position);
    }
    @Override public L_PTRAA getPointer(long i) {
        return new L_PTRAA((Pointer)this).offsetAddress(i);
    }

    /** size of allocated ptr array         */
    public native @Cast("l_int32") int nalloc(); public native L_PTRAA nalloc(int setter);
    /** array of ptra                       */
    public native L_PTRA ptra(int i); public native L_PTRAA ptra(int i, L_PTRA setter);
    public native @Cast("L_Ptra**") PointerPointer ptra(); public native L_PTRAA ptra(PointerPointer setter);
}
