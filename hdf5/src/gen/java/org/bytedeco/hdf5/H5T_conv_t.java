// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * All datatype conversion functions are...
 */
/** <!-- [H5T_conv_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5T_conv_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5T_conv_t(Pointer p) { super(p); }
    protected H5T_conv_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long src_id, @Cast("hid_t") long dst_id, H5T_cdata_t cdata, @Cast("size_t") long nelmts, @Cast("size_t") long buf_stride,
                             @Cast("size_t") long bkg_stride, Pointer buf, Pointer bkg, @Cast("hid_t") long dset_xfer_plist);
}
