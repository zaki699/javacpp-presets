// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Kernel data structure for implementations of ScalarFunction. In
 *  addition to the members found in ArrayKernel, contains the null handling
 *  and memory pre-allocation preferences. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ScalarKernel extends ArrayKernel {
    static { Loader.load(); }

  
    public ScalarKernel() { super((Pointer)null); allocate(); }
    private native void allocate();
  
    public ScalarKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                  @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init) { super((Pointer)null); allocate(sig, exec, init); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                  @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init);
    public ScalarKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec) { super((Pointer)null); allocate(sig, exec); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec);
  
    public ScalarKernel(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                  @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init) { super((Pointer)null); allocate(in_types, out_type, exec, init); }
    private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                  @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init);
    public ScalarKernel(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec) { super((Pointer)null); allocate(in_types, out_type, exec); }
    private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScalarKernel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScalarKernel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScalarKernel position(long position) {
        return (ScalarKernel)super.position(position);
    }
    @Override public ScalarKernel getPointer(long i) {
        return new ScalarKernel(this).position(position + i);
    }


  // For scalar functions preallocated data and intersecting arg validity
  // bitmaps is a reasonable default
  public native NullHandling.type null_handling(); public native ScalarKernel null_handling(NullHandling.type setter);
  public native MemAllocation.type mem_allocation(); public native ScalarKernel mem_allocation(MemAllocation.type setter);
}
