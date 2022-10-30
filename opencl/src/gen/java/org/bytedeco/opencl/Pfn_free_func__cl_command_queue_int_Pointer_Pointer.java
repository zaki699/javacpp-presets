// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class Pfn_free_func__cl_command_queue_int_Pointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pfn_free_func__cl_command_queue_int_Pointer_Pointer(Pointer p) { super(p); }
    protected Pfn_free_func__cl_command_queue_int_Pointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(_cl_command_queue queue,
                                                    @Cast("cl_uint") int num_svm_pointers,
                                                    @Cast("void**") @ByPtrPtr Pointer svm_pointers,
                                                    Pointer user_data);
}
