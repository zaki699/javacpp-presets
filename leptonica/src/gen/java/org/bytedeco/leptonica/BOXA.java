// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/** Array of Box */
@Name("Boxa") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class BOXA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BOXA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BOXA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOXA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BOXA position(long position) {
        return (BOXA)super.position(position);
    }
    @Override public BOXA getPointer(long i) {
        return new BOXA((Pointer)this).offsetAddress(i);
    }

    /** number of box in ptr array        */
    public native @Cast("l_int32") int n(); public native BOXA n(int setter);
    /** number of box ptrs allocated      */
    public native @Cast("l_int32") int nalloc(); public native BOXA nalloc(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native BOXA refcount(int setter);
    /** box ptr array                     */
    public native BOX box(int i); public native BOXA box(int i, BOX setter);
    public native @Cast("Box**") PointerPointer box(); public native BOXA box(PointerPointer setter);
}
