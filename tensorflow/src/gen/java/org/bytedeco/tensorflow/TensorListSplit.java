// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Splits a tensor into a list.
 * 
 *  list[i] corresponds to lengths[i] tensors from the input tensor.
 *  The tensor must have rank at least 1 and contain exactly sum(lengths) elements.
 * 
 *  tensor: The input tensor.
 *  element_shape: A shape compatible with that of elements in the tensor.
 *  lengths: Vector of sizes of the 0th dimension of tensors in the list.
 *  output_handle: The list.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output_handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListSplit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListSplit(Pointer p) { super(p); }

  public TensorListSplit(@Const @ByRef Scope scope, @ByVal Input tensor,
                  @ByVal Input element_shape, @ByVal Input lengths) { super((Pointer)null); allocate(scope, tensor, element_shape, lengths); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
                  @ByVal Input element_shape, @ByVal Input lengths);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListSplit operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListSplit output_handle(Output setter);
}
