// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** A placeholder op that passes through {@code input} when its output is not fed.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The default value to produce when {@code output} is not fed.
 *  * shape: The (possibly partial) shape of the tensor.
 * 
 *  Returns:
 *  * {@code Output}: A placeholder tensor that defaults to {@code input} if it is not fed. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PlaceholderWithDefault extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlaceholderWithDefault(Pointer p) { super(p); }

  public PlaceholderWithDefault(@Const @ByRef Scope scope, @ByVal Input input, @ByVal PartialTensorShape shape) { super((Pointer)null); allocate(scope, input, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal PartialTensorShape shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native PlaceholderWithDefault operation(Operation setter);
  public native @ByRef Output output(); public native PlaceholderWithDefault output(Output setter);
}
