// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A unit of work for kernel execution. It contains a collection of
 *  Array and Scalar values and an optional SelectionVector indicating that
 *  there is an unmaterialized filter that either must be materialized, or (if
 *  the kernel supports it) pushed down into the kernel implementation.
 * 
 *  ExecBatch is semantically similar to RecordBatch in that in a SQL context
 *  it represents a collection of records, but constant "columns" are
 *  represented by Scalar values rather than having to be converted into arrays
 *  with repeated values.
 * 
 *  TODO: Datum uses arrow/util/variant.h which may be a bit heavier-weight
 *  than is desirable for this class. Microbenchmarks would help determine for
 *  sure. See ARROW-8928. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ExecBatch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExecBatch(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExecBatch(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExecBatch position(long position) {
        return (ExecBatch)super.position(position);
    }
    @Override public ExecBatch getPointer(long i) {
        return new ExecBatch(this).position(position + i);
    }

  public ExecBatch() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ExecBatch(@ByVal DatumVector values, @Cast("int64_t") long length) { super((Pointer)null); allocate(values, length); }
  private native void allocate(@ByVal DatumVector values, @Cast("int64_t") long length);

  /** The values representing positional arguments to be passed to a kernel's
   *  exec function for processing. */
  
  ///
  public native @ByRef DatumVector values(); public native ExecBatch values(DatumVector setter);

  /** A deferred filter represented as an array of indices into the values.
   * 
   *  For example, the filter [true, true, false, true] would be represented as
   *  the selection vector [0, 1, 3]. When the selection vector is set,
   *  ExecBatch::length is equal to the length of this array. */
  
  ///
  public native @SharedPtr @ByRef SelectionVector selection_vector(); public native ExecBatch selection_vector(SelectionVector setter);

  /** The semantic length of the ExecBatch. When the values are all scalars,
   *  the length should be set to 1, otherwise the length is taken from the
   *  array values, except when there is a selection vector. When there is a
   *  selection vector set, the length of the batch is the length of the
   *  selection.
   * 
   *  If the array values are of length 0 then the length is 0 regardless of
   *  whether any values are Scalar. In general ExecBatch objects are produced
   *  by ExecBatchIterator which by design does not yield length-0 batches. */
  public native @Cast("int64_t") long length(); public native ExecBatch length(long setter);

  /** \brief Return the value at the i-th index */

  /** \brief A convenience for the number of values / arguments. */
  public native int num_values();

  /** \brief A convenience for returning the ValueDescr objects (types and
   *  shapes) from the batch. */
  public native @ByVal ValueDescrVector GetDescriptors();
}
