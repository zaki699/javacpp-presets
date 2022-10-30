// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \addtogroup dnnl_api_utils Utilities
 *  Utility types and definitions.
 *  \{
 <p>
 *  oneDNN exception class.
 * 
 *  This class captures the status returned by a failed C API function and
 *  the error message from the call site. */
@Namespace("dnnl") @NoOffset @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class error extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public error(Pointer p) { super(p); }

    public native @Cast("dnnl_status_t") int status(); public native error status(int setter);
    
    ///
    public native @Cast("const char*") BytePointer message(); public native error message(BytePointer setter);

    /** Constructs an instance of an exception class.
     * 
     *  @param status The error status returned by a C API function.
     *  @param message The error message. */
    public error(@Cast("dnnl_status_t") int status, @Cast("const char*") BytePointer message) { super((Pointer)null); allocate(status, message); }
    private native void allocate(@Cast("dnnl_status_t") int status, @Cast("const char*") BytePointer message);
    public error(@Cast("dnnl_status_t") int status, String message) { super((Pointer)null); allocate(status, message); }
    private native void allocate(@Cast("dnnl_status_t") int status, String message);

    /** Returns the explanatory string. */
    
    ///
    public native @NoException(true) @Cast("const char*") BytePointer what();

    /** A convenience function for wrapping calls to C API functions. Checks
     *  the return status and throws an dnnl::error in case of failure.
     * 
     *  @param status The error status returned by a C API function.
     *  @param message The error message. */
    public static native void wrap_c_api(@Cast("dnnl_status_t") int status, @Cast("const char*") BytePointer message);
    public static native void wrap_c_api(@Cast("dnnl_status_t") int status, String message);

    public native @StdString BytePointer toStdString();
}
