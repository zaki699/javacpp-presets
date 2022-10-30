// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* These typedefs are currently used for VL datatype allocation/freeing */
/** <!-- [H5MM_allocate_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5MM_allocate_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5MM_allocate_t(Pointer p) { super(p); }
    protected H5MM_allocate_t() { allocate(); }
    private native void allocate();
    public native Pointer call(@Cast("size_t") long size, Pointer alloc_info);
}
