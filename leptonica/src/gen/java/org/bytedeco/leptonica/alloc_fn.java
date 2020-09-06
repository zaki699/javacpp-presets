// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/*-------------------------------------------------------------------------*
 *               Pix allocator and deallocator function types              *
 *-------------------------------------------------------------------------*/
/** Allocator function type */
@Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class alloc_fn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    alloc_fn(Pointer p) { super(p); }
    protected alloc_fn() { allocate(); }
    private native void allocate();
    public native Pointer call(@Cast("size_t") long arg0);
}
