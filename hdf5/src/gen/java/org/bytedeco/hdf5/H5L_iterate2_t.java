// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Prototype for H5Literate2/H5Literate_by_name2() operator
 * H5O_token_t version used in VOL layer and future public API calls
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5L_iterate2_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5L_iterate2_t(Pointer p) { super(p); }
    protected H5L_iterate2_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long group, @Cast("const char*") BytePointer name, @Const H5L_info2_t info,
    Pointer op_data);
}
