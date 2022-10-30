// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Converts a sparse representation into a dense tensor.
 * 
 *  Builds an array {@code dense} with shape {@code output_shape} such that
 * 
 *  <pre>{@code
 *  # If sparse_indices is scalar
 *  dense[i] = (i == sparse_indices ? sparse_values : default_value)
 * 
 *  # If sparse_indices is a vector, then for each i
 *  dense[sparse_indices[i]] = sparse_values[i]
 * 
 *  # If sparse_indices is an n by d matrix, then for each i in [0, n)
 *  dense[sparse_indices[i][0], ..., sparse_indices[i][d-1]] = sparse_values[i]
 *  }</pre>
 * 
 *  All other values in {@code dense} are set to {@code default_value}.  If {@code sparse_values} is a
 *  scalar, all sparse indices are set to this single value.
 * 
 *  Indices should be sorted in lexicographic order, and indices must not
 *  contain any repeats. If {@code validate_indices} is true, these properties
 *  are checked during execution.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sparse_indices: 0-D, 1-D, or 2-D.  {@code sparse_indices[i]} contains the complete
 *  index where {@code sparse_values[i]} will be placed.
 *  * output_shape: 1-D.  Shape of the dense output tensor.
 *  * sparse_values: 1-D.  Values corresponding to each row of {@code sparse_indices},
 *  or a scalar value to be used for all sparse indices.
 *  * default_value: Scalar value to set for indices not specified in
 *  {@code sparse_indices}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * validate_indices: If true, indices are checked to make sure they are sorted in
 *  lexicographic order and that there are no repeats.
 * 
 *  Returns:
 *  * {@code Output}: Dense output tensor of shape {@code output_shape}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseToDense extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseToDense(Pointer p) { super(p); }

  /** Optional attribute setters for SparseToDense */
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
  
    /** If true, indices are checked to make sure they are sorted in
     *  lexicographic order and that there are no repeats.
     * 
     *  Defaults to true */
    public native @ByVal Attrs ValidateIndices(@Cast("bool") boolean x);

    public native @Cast("bool") boolean validate_indices_(); public native Attrs validate_indices_(boolean setter);
  }
  public SparseToDense(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input output_shape,
                @ByVal Input sparse_values, @ByVal Input default_value) { super((Pointer)null); allocate(scope, sparse_indices, output_shape, sparse_values, default_value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input output_shape,
                @ByVal Input sparse_values, @ByVal Input default_value);
  public SparseToDense(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input output_shape,
                @ByVal Input sparse_values, @ByVal Input default_value, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, sparse_indices, output_shape, sparse_values, default_value, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input output_shape,
                @ByVal Input sparse_values, @ByVal Input default_value, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs ValidateIndices(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SparseToDense operation(Operation setter);
  public native @ByRef Output dense(); public native SparseToDense dense(Output setter);
}
