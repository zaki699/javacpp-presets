// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Dequeues {@code n} tuples of one or more tensors from the given queue.
 * 
 *  If the queue is closed and there are fewer than {@code n} elements, then an
 *  OutOfRange error is returned.
 * 
 *  This operation concatenates queue-element component tensors along the
 *  0th dimension to make a single component tensor.  All of the components
 *  in the dequeued tuple will have size {@code n} in the 0th dimension.
 * 
 *  This operation has {@code k} outputs, where {@code k} is the number of components in
 *  the tuples stored in the given queue, and output {@code i} is the ith
 *  component of the dequeued tuple.
 * 
 *  N.B. If the queue is empty, this operation will block until {@code n} elements
 *  have been dequeued (or 'timeout_ms' elapses, if specified).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a queue.
 *  * n: The number of tuples to dequeue.
 *  * component_types: The type of each component in a tuple.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * timeout_ms: If the queue has fewer than n elements, this operation
 *  will block for up to timeout_ms milliseconds.
 *  Note: This option is not supported yet.
 * 
 *  Returns:
 *  * {@code OutputList}: One or more tensors that were dequeued as a tuple. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QueueDequeueMany extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QueueDequeueMany(Pointer p) { super(p); }

  /** Optional attribute setters for QueueDequeueMany */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If the queue has fewer than n elements, this operation
     *  will block for up to timeout_ms milliseconds.
     *  Note: This option is not supported yet.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long timeout_ms_(); public native Attrs timeout_ms_(long setter);
  }
  public QueueDequeueMany(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input n, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types) { super((Pointer)null); allocate(scope, handle, n, component_types); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input n, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types);
  public QueueDequeueMany(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input n, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types,
                   @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, handle, n, component_types, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input n, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types,
                   @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public static native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native QueueDequeueMany operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector components(); public native QueueDequeueMany components(OutputVector setter);
}
