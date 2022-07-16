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


// Detail implementations after this
//
// The current design allows swapping the
// allocator pattern when necessary.
//
// Possible future allocator optimizations:
// - Arena allocator that gives ownership of memory to arena (deleter_= nullptr)
// - Thread-local object pools: one pool per size and alignment requirement.
// - Can specialize by type of object to give the specific allocator to each object.

/**
 * \brief Base class of object allocators that implements make.
 *  Use curiously recurring template pattern.
 *
 * \tparam Derived The derived class.
 */
@Name("tvm::runtime::ObjAllocatorBase<tvm::runtime::SimpleObjAllocator>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class SimpleObjAllocatorBase extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SimpleObjAllocatorBase() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SimpleObjAllocatorBase(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleObjAllocatorBase(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SimpleObjAllocatorBase position(long position) {
        return (SimpleObjAllocatorBase)super.position(position);
    }
    @Override public SimpleObjAllocatorBase getPointer(long i) {
        return new SimpleObjAllocatorBase((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Make a new object using the allocator.
   * \tparam T The type to be allocated.
   * \tparam Args The constructor signature.
   * @param args The arguments.
   */
  

  /**
   * \tparam ArrayType The type to be allocated.
   * \tparam ElemType The type of array element.
   * \tparam Args The constructor signature.
   * @param num_elems The number of array elements.
   * @param args The arguments.
   */
}
