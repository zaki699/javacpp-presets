// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update relevant entries in '*var' and '*accum' according to the momentum scheme.
 * 
 *  Set use_nesterov = True if you want to use Nesterov momentum.
 * 
 *  That is for rows we have grad for, we update var and accum as follows:
 * 
 *  $$accum = accum * momentum + grad$$
 *  $$var -= lr * accum$$
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * accum: Should be from a Variable().
 *  * lr: Learning rate. Must be a scalar.
 *  * grad: The gradient.
 *  * indices: A vector of indices into the first dimension of var and accum.
 *  * momentum: Momentum. Must be a scalar.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var and accum tensors will be protected
 *  by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 *  * use_nesterov: If {@code True}, the tensor passed to compute grad will be
 *  var - lr * momentum * accum, so in the end, the var you get is actually
 *  var - lr * momentum * accum.
 * 
 *  Returns:
 *  * {@code Output}: Same as "var". */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseApplyMomentum extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseApplyMomentum(Pointer p) { super(p); }

  /** Optional attribute setters for SparseApplyMomentum */
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
  
    /** If {@code True}, updating of the var and accum tensors will be protected
     *  by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    /** If {@code True}, the tensor passed to compute grad will be
     *  var - lr * momentum * accum, so in the end, the var you get is actually
     *  var - lr * momentum * accum.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseNesterov(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
    public native @Cast("bool") boolean use_nesterov_(); public native Attrs use_nesterov_(boolean setter);
  }
  public SparseApplyMomentum(@Const @ByRef Scope scope, @ByVal Input var,
                      @ByVal Input accum, @ByVal Input lr,
                      @ByVal Input grad, @ByVal Input indices,
                      @ByVal Input momentum) { super((Pointer)null); allocate(scope, var, accum, lr, grad, indices, momentum); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                      @ByVal Input accum, @ByVal Input lr,
                      @ByVal Input grad, @ByVal Input indices,
                      @ByVal Input momentum);
  public SparseApplyMomentum(@Const @ByRef Scope scope, @ByVal Input var,
                      @ByVal Input accum, @ByVal Input lr,
                      @ByVal Input grad, @ByVal Input indices,
                      @ByVal Input momentum, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, accum, lr, grad, indices, momentum, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                      @ByVal Input accum, @ByVal Input lr,
                      @ByVal Input grad, @ByVal Input indices,
                      @ByVal Input momentum, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);
  public static native @ByVal Attrs UseNesterov(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SparseApplyMomentum operation(Operation setter);
  public native @ByRef Output out(); public native SparseApplyMomentum out(Output setter);
}
