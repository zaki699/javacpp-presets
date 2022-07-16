// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


// specializations of PackedFuncValueConverter
@Name("tvm::runtime::PackedFuncValueConverter<tvm::runtime::String>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class PackedFuncValueConverter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PackedFuncValueConverter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PackedFuncValueConverter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedFuncValueConverter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PackedFuncValueConverter position(long position) {
        return (PackedFuncValueConverter)super.position(position);
    }
    @Override public PackedFuncValueConverter getPointer(long i) {
        return new PackedFuncValueConverter((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal TVMString From(@Const @ByRef TVMArgValue val);

  public static native @ByVal TVMString From(@Const @ByRef TVMRetValue val);
}
