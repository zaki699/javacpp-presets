// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reshapes a tensor.
 * 
 *  Given {@code tensor}, this operation returns a tensor that has the same values
 *  as {@code tensor} with shape {@code shape}.
 * 
 *  If one component of {@code shape} is the special value -1, the size of that dimension
 *  is computed so that the total size remains constant.  In particular, a {@code shape}
 *  of {@code [-1]} flattens into 1-D.  At most one component of {@code shape} can be -1.
 * 
 *  If {@code shape} is 1-D or higher, then the operation returns a tensor with shape
 *  {@code shape} filled with the values of {@code tensor}. In this case, the number of elements
 *  implied by {@code shape} must be the same as the number of elements in {@code tensor}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 't' is [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *  # tensor 't' has shape [9]
 *  reshape(t, [3, 3]) ==> [[1, 2, 3],
 *                          [4, 5, 6],
 *                          [7, 8, 9]]
 * 
 *  # tensor 't' is [[[1, 1], [2, 2]],
 *  #                [[3, 3], [4, 4]]]
 *  # tensor 't' has shape [2, 2, 2]
 *  reshape(t, [2, 4]) ==> [[1, 1, 2, 2],
 *                          [3, 3, 4, 4]]
 * 
 *  # tensor 't' is [[[1, 1, 1],
 *  #                 [2, 2, 2]],
 *  #                [[3, 3, 3],
 *  #                 [4, 4, 4]],
 *  #                [[5, 5, 5],
 *  #                 [6, 6, 6]]]
 *  # tensor 't' has shape [3, 2, 3]
 *  # pass '[-1]' to flatten 't'
 *  reshape(t, [-1]) ==> [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6]
 * 
 *  # -1 can also be used to infer the shape
 * 
 *  # -1 is inferred to be 9:
 *  reshape(t, [2, -1]) ==> [[1, 1, 1, 2, 2, 2, 3, 3, 3],
 *                           [4, 4, 4, 5, 5, 5, 6, 6, 6]]
 *  # -1 is inferred to be 2:
 *  reshape(t, [-1, 9]) ==> [[1, 1, 1, 2, 2, 2, 3, 3, 3],
 *                           [4, 4, 4, 5, 5, 5, 6, 6, 6]]
 *  # -1 is inferred to be 3:
 *  reshape(t, [ 2, -1, 3]) ==> [[[1, 1, 1],
 *                                [2, 2, 2],
 *                                [3, 3, 3]],
 *                               [[4, 4, 4],
 *                                [5, 5, 5],
 *                                [6, 6, 6]]]
 * 
 *  # tensor 't' is [7]
 *  # shape `[]` reshapes to a scalar
 *  reshape(t, []) ==> 7
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: Defines the shape of the output tensor.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Reshape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Reshape(Pointer p) { super(p); }

  public Reshape(@Const @ByRef Scope scope, @ByVal Input tensor,
          @ByVal Input shape) { super((Pointer)null); allocate(scope, tensor, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
          @ByVal Input shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Reshape operation(Operation setter);
  public native @ByRef Output output(); public native Reshape output(Output setter);
}
