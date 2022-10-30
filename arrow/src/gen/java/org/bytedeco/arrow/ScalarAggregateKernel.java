// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Kernel data structure for implementations of
 *  ScalarAggregateFunction. The four necessary components of an aggregation
 *  kernel are the init, consume, merge, and finalize functions.
 * 
 *  * init: creates a new KernelState for a kernel.
 *  * consume: processes an ExecBatch and updates the KernelState found in the
 *    KernelContext.
 *  * merge: combines one KernelState with another.
 *  * finalize: produces the end result of the aggregation using the
 *    KernelState in the KernelContext. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ScalarAggregateKernel extends Kernel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScalarAggregateKernel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScalarAggregateKernel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScalarAggregateKernel position(long position) {
        return (ScalarAggregateKernel)super.position(position);
    }
    @Override public ScalarAggregateKernel getPointer(long i) {
        return new ScalarAggregateKernel((Pointer)this).offsetAddress(i);
    }

  public ScalarAggregateKernel() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ScalarAggregateKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::KernelInit*") Pointer init,
                          @ByVal @Cast("arrow::compute::ScalarAggregateConsume*") Pointer consume, @ByVal @Cast("arrow::compute::ScalarAggregateMerge*") Pointer merge,
                          @ByVal @Cast("arrow::compute::ScalarAggregateFinalize*") Pointer _finalize) { super((Pointer)null); allocate(sig, init, consume, merge, _finalize); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::KernelInit*") Pointer init,
                          @ByVal @Cast("arrow::compute::ScalarAggregateConsume*") Pointer consume, @ByVal @Cast("arrow::compute::ScalarAggregateMerge*") Pointer merge,
                          @ByVal @Cast("arrow::compute::ScalarAggregateFinalize*") Pointer _finalize);

  public ScalarAggregateKernel(@StdVector InputType in_types, @ByVal OutputType out_type,
                          @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal @Cast("arrow::compute::ScalarAggregateConsume*") Pointer consume,
                          @ByVal @Cast("arrow::compute::ScalarAggregateMerge*") Pointer merge, @ByVal @Cast("arrow::compute::ScalarAggregateFinalize*") Pointer _finalize) { super((Pointer)null); allocate(in_types, out_type, init, consume, merge, _finalize); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type,
                          @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal @Cast("arrow::compute::ScalarAggregateConsume*") Pointer consume,
                          @ByVal @Cast("arrow::compute::ScalarAggregateMerge*") Pointer merge, @ByVal @Cast("arrow::compute::ScalarAggregateFinalize*") Pointer _finalize);

  /** \brief Merge a vector of KernelStates into a single KernelState.
   *  The merged state will be returned and will be set on the KernelContext. */
  

  public native @ByRef @Cast("arrow::compute::ScalarAggregateConsume*") Pointer consume(); public native ScalarAggregateKernel consume(Pointer setter);
  public native @ByRef @Cast("arrow::compute::ScalarAggregateMerge*") Pointer merge(); public native ScalarAggregateKernel merge(Pointer setter);
  public native @ByRef @Cast("arrow::compute::ScalarAggregateFinalize*") @Name("finalize") Pointer _finalize(); public native ScalarAggregateKernel _finalize(Pointer setter);
}
