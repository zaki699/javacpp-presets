// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradient of the FractionalAvgPool function.
 * 
 *  Unlike FractionalMaxPoolGrad, we don't need to find arg_max for
 *  FractionalAvgPoolGrad, we just need to evenly back-propagate each element of
 *  out_backprop to those indices that form the same pooling cell. Therefore, we
 *  just need to know the shape of original input tensor, instead of the whole
 *  tensor.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * orig_input_tensor_shape: Original input tensor shape for {@code fractional_avg_pool}
 *  * out_backprop: 4-D with shape {@code [batch, height, width, channels]}.  Gradients
 *  w.r.t. the output of {@code fractional_avg_pool}.
 *  * row_pooling_sequence: row pooling sequence, form pooling region with
 *  col_pooling_sequence.
 *  * col_pooling_sequence: column pooling sequence, form pooling region with
 *  row_pooling sequence.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * overlapping: When set to True, it means when pooling, the values at the boundary
 *  of adjacent pooling cells are used by both cells. For example:
 * 
 *  {@code index  0  1  2  3  4}
 * 
 *  {@code value  20 5  16 3  7}
 * 
 *  If the pooling sequence is [0, 2, 4], then 16, at index 2 will be used twice.
 *  The result would be [41/3, 26/3] for fractional avg pooling.
 * 
 *  Returns:
 *  * {@code Output}: 4-D.  Gradients w.r.t. the input of {@code fractional_avg_pool}. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FractionalAvgPoolGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FractionalAvgPoolGrad(Pointer p) { super(p); }

  /** Optional attribute setters for FractionalAvgPoolGrad */
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
          return new Attrs(this).position(position + i);
      }
  
    /** When set to True, it means when pooling, the values at the boundary
     *  of adjacent pooling cells are used by both cells. For example:
     * 
     *  {@code index  0  1  2  3  4}
     * 
     *  {@code value  20 5  16 3  7}
     * 
     *  If the pooling sequence is [0, 2, 4], then 16, at index 2 will be used twice.
     *  The result would be [41/3, 26/3] for fractional avg pooling.
     * 
     *  Defaults to false */
    public native @ByVal Attrs Overlapping(@Cast("bool") boolean x);

    public native @Cast("bool") boolean overlapping_(); public native Attrs overlapping_(boolean setter);
  }
  public FractionalAvgPoolGrad(@Const @ByRef Scope scope, @ByVal Input orig_input_tensor_shape, @ByVal Input out_backprop, @ByVal Input row_pooling_sequence,
                        @ByVal Input col_pooling_sequence) { super((Pointer)null); allocate(scope, orig_input_tensor_shape, out_backprop, row_pooling_sequence, col_pooling_sequence); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input_tensor_shape, @ByVal Input out_backprop, @ByVal Input row_pooling_sequence,
                        @ByVal Input col_pooling_sequence);
  public FractionalAvgPoolGrad(@Const @ByRef Scope scope, @ByVal Input orig_input_tensor_shape, @ByVal Input out_backprop, @ByVal Input row_pooling_sequence,
                        @ByVal Input col_pooling_sequence, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input_tensor_shape, out_backprop, row_pooling_sequence, col_pooling_sequence, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input_tensor_shape, @ByVal Input out_backprop, @ByVal Input row_pooling_sequence,
                        @ByVal Input col_pooling_sequence, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Overlapping(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native FractionalAvgPoolGrad operation(Operation setter);
  public native @ByRef Output output(); public native FractionalAvgPoolGrad output(Output setter);
}
