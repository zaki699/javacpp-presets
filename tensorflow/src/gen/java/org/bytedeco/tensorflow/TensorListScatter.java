// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a TensorList by indexing into a Tensor.
 * 
 *  Each member of the TensorList corresponds to one row of the input tensor,
 *  specified by the given index (see {@code tf.gather}).
 * 
 *  tensor: The input tensor.
 *  indices: The indices used to index into the list.
 *  element_shape: The shape of the elements in the list (can be less specified than
 *    the shape of the tensor).
 *  output_handle: The TensorList.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output_handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListScatter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListScatter(Pointer p) { super(p); }

  public TensorListScatter(@Const @ByRef Scope scope, @ByVal Input tensor,
                    @ByVal Input indices, @ByVal Input element_shape) { super((Pointer)null); allocate(scope, tensor, indices, element_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
                    @ByVal Input indices, @ByVal Input element_shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListScatter operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListScatter output_handle(Output setter);
}
