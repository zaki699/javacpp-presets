// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief C type of packed function.
 *
 * @param args The arguments
 * @param type_codes The type codes of the arguments
 * @param num_args Number of arguments.
 * @param ret The return value handle.
 * @param resource_handle The handle additional resouce handle from front-end.
 * @return 0 if success, -1 if failure happens, set error via TVMAPISetLastError.
 * @see TVMCFuncSetReturn
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMPackedCFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TVMPackedCFunc(Pointer p) { super(p); }
    protected TVMPackedCFunc() { allocate(); }
    private native void allocate();
    public native int call(TVMValue args, IntPointer type_codes, int num_args, TVMRetValueHandle ret,
                              Pointer resource_handle);
}
