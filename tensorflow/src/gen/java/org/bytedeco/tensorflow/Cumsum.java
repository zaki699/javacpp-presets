// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the cumulative sum of the tensor {@code x} along {@code axis}.
 * 
 *  By default, this op performs an inclusive cumsum, which means that the first
 *  element of the input is identical to the first element of the output:
 * 
 *  <pre>{@code python
 *  tf.cumsum([a, b, c])  # => [a, a + b, a + b + c]
 *  }</pre>
 * 
 *  By setting the {@code exclusive} kwarg to {@code True}, an exclusive cumsum is
 *  performed instead:
 * 
 *  <pre>{@code python
 *  tf.cumsum([a, b, c], exclusive=True)  # => [0, a, a + b]
 *  }</pre>
 * 
 *  By setting the {@code reverse} kwarg to {@code True}, the cumsum is performed in the
 *  opposite direction:
 * 
 *  <pre>{@code python
 *  tf.cumsum([a, b, c], reverse=True)  # => [a + b + c, b + c, c]
 *  }</pre>
 * 
 *  This is more efficient than using separate {@code tf.reverse} ops.
 * 
 *  The {@code reverse} and {@code exclusive} kwargs can also be combined:
 * 
 *  <pre>{@code python
 *  tf.cumsum([a, b, c], exclusive=True, reverse=True)  # => [b + c, c, 0]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A {@code Tensor}. Must be one of the following types: {@code float32}, {@code float64},
 *  {@code int64}, {@code int32}, {@code uint8}, {@code uint16}, {@code int16}, {@code int8}, {@code complex64},
 *  {@code complex128}, {@code qint8}, {@code quint8}, {@code qint32}, {@code half}.
 *  * axis: A {@code Tensor} of type {@code int32} (default: 0). Must be in the range
 *  {@code [-rank(x), rank(x))}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * exclusive: If {@code True}, perform exclusive cumsum.
 *  * reverse: A {@code bool} (default: False).
 * 
 *  Returns:
 *  * {@code Output}: The out tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Cumsum extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cumsum(Pointer p) { super(p); }

  /** Optional attribute setters for Cumsum */
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
  
    /** If {@code True}, perform exclusive cumsum.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Exclusive(@Cast("bool") boolean x);

    /** A {@code bool} (default: False).
     * 
     *  Defaults to false */
    public native @ByVal Attrs Reverse(@Cast("bool") boolean x);

    public native @Cast("bool") boolean exclusive_(); public native Attrs exclusive_(boolean setter);
    public native @Cast("bool") boolean reverse_(); public native Attrs reverse_(boolean setter);
  }
  public Cumsum(@Const @ByRef Scope scope, @ByVal Input x,
         @ByVal Input axis) { super((Pointer)null); allocate(scope, x, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
         @ByVal Input axis);
  public Cumsum(@Const @ByRef Scope scope, @ByVal Input x,
         @ByVal Input axis, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, axis, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
         @ByVal Input axis, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Exclusive(@Cast("bool") boolean x);
  public static native @ByVal Attrs Reverse(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Cumsum operation(Operation setter);
  public native @ByRef Output out(); public native Cumsum out(Output setter);
}
