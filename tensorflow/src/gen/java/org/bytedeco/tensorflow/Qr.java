// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the QR decompositions of one or more matrices.
 * 
 *  Computes the QR decomposition of each inner matrix in {@code tensor} such that
 *  {@code tensor[..., :, :] = q[..., :, :] * r[..., :,:])}
 * 
 *  <pre>{@code python
 *  # a is a tensor.
 *  # q is a tensor of orthonormal matrices.
 *  # r is a tensor of upper triangular matrices.
 *  q, r = qr(a)
 *  q_full, r_full = qr(a, full_matrices=True)
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A tensor of shape {@code [..., M, N]} whose inner-most 2 dimensions
 *  form matrices of size {@code [M, N]}. Let {@code P} be the minimum of {@code M} and {@code N}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * full_matrices: If true, compute full-sized {@code q} and {@code r}. If false
 *  (the default), compute only the leading {@code P} columns of {@code q}.
 * 
 *  Returns:
 *  * {@code Output} q: Orthonormal basis for range of {@code a}. If {@code full_matrices} is {@code False} then
 *  shape is {@code [..., M, P]}; if {@code full_matrices} is {@code True} then shape is
 *  {@code [..., M, M]}.
 *  * {@code Output} r: Triangular factor. If {@code full_matrices} is {@code False} then shape is
 *  {@code [..., P, N]}. If {@code full_matrices} is {@code True} then shape is {@code [..., M, N]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Qr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Qr(Pointer p) { super(p); }

  /** Optional attribute setters for Qr */
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
  
    /** If true, compute full-sized {@code q} and {@code r}. If false
     *  (the default), compute only the leading {@code P} columns of {@code q}.
     * 
     *  Defaults to false */
    public native @ByVal Attrs FullMatrices(@Cast("bool") boolean x);

    public native @Cast("bool") boolean full_matrices_(); public native Attrs full_matrices_(boolean setter);
  }
  public Qr(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public Qr(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs FullMatrices(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Qr operation(Operation setter);
  public native @ByRef Output q(); public native Qr q(Output setter);
  public native @ByRef Output r(); public native Qr r(Output setter);
}
