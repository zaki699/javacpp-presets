// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5D_vds_view_t_snip] -->
 <p>
 *  <!-- [H5D_append_cb_t_snip] -->
/**
 * \brief Callback for H5Pset_append_flush()
 *
 * \dset_id{dataset_id}
 * @param cur_dims [in] The current extent of the dataset's dimensions
 * @param op_data [in,out] User context
 *
 * @return \herr_t
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_append_cb_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_append_cb_t(Pointer p) { super(p); }
    protected H5D_append_cb_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("hid_t") long dataset_id, @Cast("hsize_t*") LongPointer cur_dims, Pointer op_data);
}
