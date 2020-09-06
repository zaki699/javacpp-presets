// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_memory
 <p>
 *  \addtogroup dnnl_api_primitives
 *  \{
 *  \addtogroup dnnl_api_primitives_common
 *  \{
 <p>
 *  A pointer to any of the operation descriptors. */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_op_desc_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_op_desc_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_op_desc_t(Pointer p) { super(p); }
}
