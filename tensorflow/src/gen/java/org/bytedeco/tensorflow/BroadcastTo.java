// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Broadcast an array for a compatible shape.
 * 
 *  Broadcasting is the process of making arrays to have compatible shapes
 *  for arithmetic operations. Two shapes are compatible if for each
 *  dimension pair they are either equal or one of them is one. When trying
 *  to broadcast a Tensor to a shape, it starts with the trailing dimensions,
 *  and works its way forward.
 * 
 *  For example,
 * 
 *  <pre>{@code python
 *  >>> x = tf.constant([1, 2, 3])
 *  >>> y = tf.broadcast_to(x, [3, 3])
 *  >>> sess.run(y)
 *  array([[1, 2, 3],
 *         [1, 2, 3],
 *         [1, 2, 3]], dtype=int32)
 *  }</pre>
 * 
 *  In the above example, the input Tensor with the shape of {@code [1, 3]}
 *  is broadcasted to output Tensor with shape of {@code [3, 3]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A Tensor to broadcast.
 *  * shape: An 1-D {@code int} Tensor. The shape of the desired output.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BroadcastTo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BroadcastTo(Pointer p) { super(p); }

  public BroadcastTo(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input shape) { super((Pointer)null); allocate(scope, input, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native BroadcastTo operation(Operation setter);
  public native @ByRef Output output(); public native BroadcastTo output(Output setter);
}
