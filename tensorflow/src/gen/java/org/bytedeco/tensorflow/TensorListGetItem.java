// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** TODO: add doc.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The item tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListGetItem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListGetItem(Pointer p) { super(p); }

  public TensorListGetItem(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input index, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, input_handle, index, element_shape, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input index, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListGetItem operation(Operation setter);
  public native @ByRef Output item(); public native TensorListGetItem item(Output setter);
}
