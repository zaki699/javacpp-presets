// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes a 2D convolution given quantized 4D input and filter tensors.
 * 
 *  The inputs are quantized tensors where the lowest value represents the real
 *  number of the associated minimum, and the highest represents the maximum.
 *  This means that you can only interpret the quantized output in the same way, by
 *  taking the returned minimum and maximum values into account.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * filter: filter's input_depth dimension must match input's depth dimensions.
 *  * min_input: The float value that the lowest quantized input value represents.
 *  * max_input: The float value that the highest quantized input value represents.
 *  * min_filter: The float value that the lowest quantized filter value represents.
 *  * max_filter: The float value that the highest quantized filter value represents.
 *  * strides: The stride of the sliding window for each dimension of the input
 *  tensor.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * dilations: 1-D tensor of length 4.  The dilation factor for each dimension of
 *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each
 *  filter element on that dimension. The dimension order is determined by the
 *  value of {@code data_format}, see above for details. Dilations in the batch and
 *  depth dimensions must be 1.
 * 
 *  Returns:
 *  * {@code Output} output
 *  * {@code Output} min_output: The float value that the lowest quantized output value represents.
 *  * {@code Output} max_output: The float value that the highest quantized output value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedConv2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedConv2D(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedConv2D */
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
  
    /** Defaults to DT_QINT32 */
    
    ///
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    /** 1-D tensor of length 4.  The dilation factor for each dimension of
     *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each
     *  filter element on that dimension. The dimension order is determined by the
     *  value of {@code data_format}, see above for details. Dilations in the batch and
     *  depth dimensions must be 1.
     * 
     *  Defaults to [1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input filter, @ByVal Input min_input,
                  @ByVal Input max_input, @ByVal Input min_filter,
                  @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native QuantizedConv2D operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedConv2D output(Output setter);
  public native @ByRef Output min_output(); public native QuantizedConv2D min_output(Output setter);
  public native @ByRef Output max_output(); public native QuantizedConv2D max_output(Output setter);
}
