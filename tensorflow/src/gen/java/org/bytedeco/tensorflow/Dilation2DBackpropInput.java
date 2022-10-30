// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the gradient of morphological 2-D dilation with respect to the input.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D with shape {@code [batch, in_height, in_width, depth]}.
 *  * filter: 3-D with shape {@code [filter_height, filter_width, depth]}.
 *  * out_backprop: 4-D with shape {@code [batch, out_height, out_width, depth]}.
 *  * strides: 1-D of length 4. The stride of the sliding window for each dimension of
 *  the input tensor. Must be: {@code [1, stride_height, stride_width, 1]}.
 *  * rates: 1-D of length 4. The input stride for atrous morphological dilation.
 *  Must be: {@code [1, rate_height, rate_width, 1]}.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape {@code [batch, in_height, in_width, depth]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Dilation2DBackpropInput extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dilation2DBackpropInput(Pointer p) { super(p); }

  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntPointer strides,
                          @ArraySlice IntPointer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntPointer strides,
                          @ArraySlice IntPointer rates, @StringPiece BytePointer padding);
  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntBuffer strides,
                          @ArraySlice IntBuffer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntBuffer strides,
                          @ArraySlice IntBuffer rates, @StringPiece String padding);
  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice int[] strides,
                          @ArraySlice int[] rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice int[] strides,
                          @ArraySlice int[] rates, @StringPiece BytePointer padding);
  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntPointer strides,
                          @ArraySlice IntPointer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntPointer strides,
                          @ArraySlice IntPointer rates, @StringPiece String padding);
  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntBuffer strides,
                          @ArraySlice IntBuffer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice IntBuffer strides,
                          @ArraySlice IntBuffer rates, @StringPiece BytePointer padding);
  public Dilation2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice int[] strides,
                          @ArraySlice int[] rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, out_backprop, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter, @ByVal Input out_backprop, @ArraySlice int[] strides,
                          @ArraySlice int[] rates, @StringPiece String padding);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Dilation2DBackpropInput operation(Operation setter);
  public native @ByRef Output in_backprop(); public native Dilation2DBackpropInput in_backprop(Output setter);
}
