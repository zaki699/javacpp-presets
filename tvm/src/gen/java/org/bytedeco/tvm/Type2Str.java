// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// handle case of function ptr.
@Name("tvm::runtime::detail::type2str::Type2Str<int>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Type2Str extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Type2Str() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Type2Str(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Type2Str(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Type2Str position(long position) {
        return (Type2Str)super.position(position);
    }
    @Override public Type2Str getPointer(long i) {
        return new Type2Str((Pointer)this).offsetAddress(i);
    }

  public static native @StdString BytePointer v();
}
