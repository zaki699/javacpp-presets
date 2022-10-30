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
 * \brief Object container class that backs PackedFunc.
 * \note Do not use this function directly, use PackedFunc.
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class PackedFuncObj extends TVMObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedFuncObj(Pointer p) { super(p); }

  /**
   * \brief Call the function in packed format.
   * @param args The arguments
   * @param rv The return value.
   */
  public native void CallPacked(@ByVal TVMArgs args, TVMRetValue rv);

  @MemberGetter public static native @Cast("const uint32_t") int _type_index();
  public static final int _type_index = _type_index();
  @MemberGetter public static native @Cast("const char*") BytePointer _type_key();
  @MemberGetter public static native @Cast("const bool") boolean _type_final();
  public static final boolean _type_final = _type_final();
  @MemberGetter public static native int _type_child_slots();
  public static final int _type_child_slots = _type_child_slots();
  public static native @Cast("uint32_t") int RuntimeTypeIndex();
  public static native @Cast("uint32_t") int _GetOrAllocRuntimeTypeIndex();
}
