// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the singular value decompositions of one or more matrices.
 * 
 *  Computes the SVD of each inner matrix in {@code input} such that
 *  {@code input[..., :, :] = u[..., :, :] * diag(s[..., :, :]) * transpose(v[..., :, :])}
 * 
 *  <pre>{@code python
 *  # a is a tensor containing a batch of matrices.
 *  # s is a tensor of singular values for each matrix.
 *  # u is the tensor containing the left singular vectors for each matrix.
 *  # v is the tensor containing the right singular vectors for each matrix.
 *  s, u, v = svd(a)
 *  s, _, _ = svd(a, compute_uv=False)
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A tensor of shape {@code [..., M, N]} whose inner-most 2 dimensions
 *  form matrices of size {@code [M, N]}. Let {@code P} be the minimum of {@code M} and {@code N}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * compute_uv: If true, left and right singular vectors will be
 *  computed and returned in {@code u} and {@code v}, respectively.
 *  If false, {@code u} and {@code v} are not set and should never referenced.
 *  * full_matrices: If true, compute full-sized {@code u} and {@code v}. If false
 *  (the default), compute only the leading {@code P} singular vectors.
 *  Ignored if {@code compute_uv} is {@code False}.
 * 
 *  Returns:
 *  * {@code Output} s: Singular values. Shape is {@code [..., P]}.
 *  * {@code Output} u: Left singular vectors. If {@code full_matrices} is {@code False} then shape is
 *  {@code [..., M, P]}; if {@code full_matrices} is {@code True} then shape is
 *  {@code [..., M, M]}. Undefined if {@code compute_uv} is {@code False}.
 *  * {@code Output} v: Left singular vectors. If {@code full_matrices} is {@code False} then shape is
 *  {@code [..., N, P]}. If {@code full_matrices} is {@code True} then shape is {@code [..., N, N]}.
 *  Undefined if {@code compute_uv} is false. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Svd extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Svd(Pointer p) { super(p); }

  /** Optional attribute setters for Svd */
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
  
    /** If true, left and right singular vectors will be
     *  computed and returned in {@code u} and {@code v}, respectively.
     *  If false, {@code u} and {@code v} are not set and should never referenced.
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs ComputeUv(@Cast("bool") boolean x);

    /** If true, compute full-sized {@code u} and {@code v}. If false
     *  (the default), compute only the leading {@code P} singular vectors.
     *  Ignored if {@code compute_uv} is {@code False}.
     * 
     *  Defaults to false */
    public native @ByVal Attrs FullMatrices(@Cast("bool") boolean x);

    public native @Cast("bool") boolean compute_uv_(); public native Attrs compute_uv_(boolean setter);
    public native @Cast("bool") boolean full_matrices_(); public native Attrs full_matrices_(boolean setter);
  }
  public Svd(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public Svd(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs ComputeUv(@Cast("bool") boolean x);
  public static native @ByVal Attrs FullMatrices(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Svd operation(Operation setter);
  public native @ByRef Output s(); public native Svd s(Output setter);
  public native @ByRef Output u(); public native Svd u(Output setter);
  public native @ByRef Output v(); public native Svd v(Output setter);
}
