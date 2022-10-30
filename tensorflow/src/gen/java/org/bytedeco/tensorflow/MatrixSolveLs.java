// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Solves one or more linear least-squares problems.
 * 
 *  {@code matrix} is a tensor of shape {@code [..., M, N]} whose inner-most 2 dimensions
 *  form real or complex matrices of size {@code [M, N]}. {@code Rhs} is a tensor of the same
 *  type as {@code matrix} and shape {@code [..., M, K]}.
 *  The output is a tensor shape {@code [..., N, K]} where each output matrix solves
 *  each of the equations
 *  {@code matrix[..., :, :]} * {@code output[..., :, :]} = {@code rhs[..., :, :]}
 *  in the least squares sense.
 * 
 *  We use the following notation for (complex) matrix and right-hand sides
 *  in the batch:
 * 
 *  {@code matrix}=\(A \in \mathbb{C}^{m \times n}\),
 *  {@code rhs}=\(B  \in \mathbb{C}^{m \times k}\),
 *  {@code output}=\(X  \in \mathbb{C}^{n \times k}\),
 *  {@code l2_regularizer}=\(\lambda \in \mathbb{R}\).
 * 
 *  If {@code fast} is {@code True}, then the solution is computed by solving the normal
 *  equations using Cholesky decomposition. Specifically, if \(m \ge n\) then
 *  \(X = (A^H A + \lambda I)^{-1} A^H B\), which solves the least-squares
 *  problem \(X = \mathrm{argmin}_{Z \in \Re^{n \times k} } ||A Z - B||_F^2 + \lambda ||Z||_F^2\).
 *  If \(m \lt n\) then {@code output} is computed as
 *  \(X = A^H (A A^H + \lambda I)^{-1} B\), which (for \(\lambda = 0\)) is the
 *  minimum-norm solution to the under-determined linear system, i.e.
 *  \(X = \mathrm{argmin}_{Z \in \mathbb{C}^{n \times k} } ||Z||_F^2 \),
 *  subject to \(A Z = B\). Notice that the fast path is only numerically stable
 *  when \(A\) is numerically full rank and has a condition number
 *  \(\mathrm{cond}(A) \lt \frac{1}{\sqrt{\epsilon_{mach} } }\) or \(\lambda\) is
 *  sufficiently large.
 * 
 *  If {@code fast} is {@code False} an algorithm based on the numerically robust complete
 *  orthogonal decomposition is used. This computes the minimum-norm
 *  least-squares solution, even when \(A\) is rank deficient. This path is
 *  typically 6-7 times slower than the fast path. If {@code fast} is {@code False} then
 *  {@code l2_regularizer} is ignored.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * matrix: Shape is {@code [..., M, N]}.
 *  * rhs: Shape is {@code [..., M, K]}.
 *  * l2_regularizer: Scalar tensor.
 * 
 *  \compatibility(numpy)
 *  Equivalent to np.linalg.lstsq
 *  \end_compatibility
 * 
 *  Returns:
 *  * {@code Output}: Shape is {@code [..., N, K]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixSolveLs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixSolveLs(Pointer p) { super(p); }

  /** Optional attribute setters for MatrixSolveLs */
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
  
    /** Defaults to true */
    public native @ByVal Attrs Fast(@Cast("bool") boolean x);

    public native @Cast("bool") boolean fast_(); public native Attrs fast_(boolean setter);
  }
  public MatrixSolveLs(@Const @ByRef Scope scope, @ByVal Input matrix,
                @ByVal Input rhs, @ByVal Input l2_regularizer) { super((Pointer)null); allocate(scope, matrix, rhs, l2_regularizer); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input matrix,
                @ByVal Input rhs, @ByVal Input l2_regularizer);
  public MatrixSolveLs(@Const @ByRef Scope scope, @ByVal Input matrix,
                @ByVal Input rhs, @ByVal Input l2_regularizer,
                @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, matrix, rhs, l2_regularizer, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input matrix,
                @ByVal Input rhs, @ByVal Input l2_regularizer,
                @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Fast(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native MatrixSolveLs operation(Operation setter);
  public native @ByRef Output output(); public native MatrixSolveLs output(Output setter);
}
