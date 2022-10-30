// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/** Deallocator function type */
@Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class dealloc_fn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    dealloc_fn(Pointer p) { super(p); }
    protected dealloc_fn() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0);
}
