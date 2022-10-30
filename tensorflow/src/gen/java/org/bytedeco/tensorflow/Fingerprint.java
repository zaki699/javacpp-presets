// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Generates fingerprint values.
 * 
 *  Generates fingerprint values of {@code data}.
 * 
 *  Fingerprint op considers the first dimension of {@code data} as the batch dimension,
 *  and {@code output[i]} contains the fingerprint value generated from contents in
 *  {@code data[i, ...]} for all {@code i}.
 * 
 *  Fingerprint op writes fingerprint values as byte arrays. For example, the
 *  default method {@code farmhash64} generates a 64-bit fingerprint value at a time.
 *  This 8-byte value is written out as an {@code uint8} array of size 8, in little-endian
 *  order.
 * 
 *  For example, suppose that {@code data} has data type {@code DT_INT32} and shape (2, 3, 4),
 *  and that the fingerprint method is {@code farmhash64}. In this case, the output shape
 *  is (2, 8), where 2 is the batch dimension size of {@code data}, and 8 is the size of
 *  each fingerprint value in bytes. {@code output[0, :]} is generated from 12 integers in
 *  {@code data[0, :, :]} and similarly {@code output[1, :]} is generated from other 12 integers
 *  in {@code data[1, :, :]}.
 * 
 *  Note that this op fingerprints the raw underlying buffer, and it does not
 *  fingerprint Tensor's metadata such as data type and/or shape. For example, the
 *  fingerprint values are invariant under reshapes and bitcasts as long as the
 *  batch dimension remain the same:
 * 
 *  <pre>{@code
 *  Fingerprint(data) == Fingerprint(Reshape(data, ...))
 *  Fingerprint(data) == Fingerprint(Bitcast(data, ...))
 *  }</pre>
 * 
 *  For string data, one should expect {@code Fingerprint(data) !=
 *  Fingerprint(ReduceJoin(data))} in general.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * data: Must have rank 1 or higher.
 *  * method: Fingerprint method used by this op. Currently available method is
 *  {@code farmhash::fingerprint64}.
 * 
 *  Returns:
 *  * {@code Output}: A two-dimensional {@code Tensor} of type {@code tf.uint8}. The first dimension equals to
 *  {@code data}'s first dimension, and the second dimension size depends on the
 *  fingerprint algorithm. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Fingerprint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fingerprint(Pointer p) { super(p); }

  public Fingerprint(@Const @ByRef Scope scope, @ByVal Input data,
              @ByVal Input method) { super((Pointer)null); allocate(scope, data, method); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
              @ByVal Input method);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Fingerprint operation(Operation setter);
  public native @ByRef Output fingerprint(); public native Fingerprint fingerprint(Output setter);
}
