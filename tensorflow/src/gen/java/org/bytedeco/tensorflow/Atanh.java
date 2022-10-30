// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes inverse hyperbolic tangent of x element-wise.
 * 
 *    Given an input tensor, this function computes inverse hyperbolic tangent
 *    for every element in the tensor. Input range is {@code [-1,1]} and output range is
 *    {@code [-inf, inf]}. If input is {@code -1}, output will be {@code -inf} and if the
 *    input is {@code 1}, output will be {@code inf}. Values outside the range will have
 *    {@code nan} as output.
 * 
 *    <pre>{@code python
 *    x = tf.constant([-float("inf"), -1, -0.5, 1, 0, 0.5, 10, float("inf")])
 *    tf.math.atanh(x) ==> [nan -inf -0.54930615 inf  0. 0.54930615 nan nan]
 *    }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Atanh extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Atanh(Pointer p) { super(p); }

  public Atanh(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Atanh operation(Operation setter);
  public native @ByRef Output y(); public native Atanh y(Output setter);
}
