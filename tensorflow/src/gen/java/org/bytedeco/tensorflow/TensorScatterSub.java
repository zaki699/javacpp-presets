// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Subtracts sparse {@code updates} from an existing tensor according to {@code indices}.
 * 
 *  This operation creates a new tensor by subtracting sparse {@code updates} from the
 *  passed in {@code tensor}.
 *  This operation is very similar to {@code tf.scatter_nd_sub}, except that the updates
 *  are subtracted from an existing tensor (as opposed to a variable). If the memory
 *  for the existing tensor cannot be re-used, a copy is made and updated.
 * 
 *  {@code indices} is an integer tensor containing indices into a new tensor of shape
 *  {@code shape}.  The last dimension of {@code indices} can be at most the rank of {@code shape}:
 * 
 *      indices.shape[-1] <= shape.rank
 * 
 *  The last dimension of {@code indices} corresponds to indices into elements
 *  (if {@code indices.shape[-1] = shape.rank}) or slices
 *  (if {@code indices.shape[-1] < shape.rank}) along dimension {@code indices.shape[-1]} of
 *  {@code shape}.  {@code updates} is a tensor with shape
 * 
 *      indices.shape[:-1] + shape[indices.shape[-1]:]
 * 
 *  The simplest form of tensor_scatter_sub is to subtract individual elements
 *  from a tensor by index. For example, say we want to insert 4 scattered elements
 *  in a rank-1 tensor with 8 elements.
 * 
 *  In Python, this scatter subtract operation would look like this:
 * 
 *  <pre>{@code python
 *      indices = tf.constant([[4], [3], [1], [7]])
 *      updates = tf.constant([9, 10, 11, 12])
 *      tensor = tf.ones([8], dtype=tf.int32)
 *      updated = tf.tensor_scatter_sub(tensor, indices, updates)
 *      with tf.Session() as sess:
 *        print(sess.run(scatter))
 *  }</pre>
 * 
 *  The resulting tensor would look like this:
 * 
 *      [1, -10, 1, -9, -8, 1, 1, -11]
 * 
 *  We can also, insert entire slices of a higher rank tensor all at once. For
 *  example, if we wanted to insert two slices in the first dimension of a
 *  rank-3 tensor with two matrices of new values.
 * 
 *  In Python, this scatter add operation would look like this:
 * 
 *  <pre>{@code python
 *      indices = tf.constant([[0], [2]])
 *      updates = tf.constant([[[5, 5, 5, 5], [6, 6, 6, 6],
 *                              [7, 7, 7, 7], [8, 8, 8, 8]],
 *                             [[5, 5, 5, 5], [6, 6, 6, 6],
 *                              [7, 7, 7, 7], [8, 8, 8, 8]]])
 *      tensor = tf.ones([4, 4, 4])
 *      updated = tf.tensor_scatter_sub(tensor, indices, updates)
 *      with tf.Session() as sess:
 *        print(sess.run(scatter))
 *  }</pre>
 * 
 *  The resulting tensor would look like this:
 * 
 *      [[[-4, -4, -4, -4], [-5, -5, -5, -5], [-6, -6, -6, -6], [-7, -7, -7, -7]],
 *       [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]],
 *       [[-4, -4, -4, -4], [-5, -5, -5, -5], [-6, -6, -6, -6], [-7, -7, -7, -7]],
 *       [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]]
 * 
 *  Note that on CPU, if an out of bound index is found, an error is returned.
 *  On GPU, if an out of bound index is found, the index is ignored.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tensor: Tensor to copy/update.
 *  * indices: Index tensor.
 *  * updates: Updates to scatter into output.
 * 
 *  Returns:
 *  * {@code Output}: A new tensor copied from tensor and updates subtracted according to the indices. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorScatterSub extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorScatterSub(Pointer p) { super(p); }

  public TensorScatterSub(@Const @ByRef Scope scope, @ByVal Input tensor,
                   @ByVal Input indices, @ByVal Input updates) { super((Pointer)null); allocate(scope, tensor, indices, updates); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
                   @ByVal Input indices, @ByVal Input updates);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorScatterSub operation(Operation setter);
  public native @ByRef Output output(); public native TensorScatterSub output(Output setter);
}
