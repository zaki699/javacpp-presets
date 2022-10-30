// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Gather slices from {@code params} according to {@code indices}.
 * 
 *  {@code indices} must be an integer tensor of any dimension (usually 0-D or 1-D).
 *  Produces an output tensor with shape {@code indices.shape + params.shape[1:]} where:
 * 
 *  <pre>{@code python
 *      # Scalar indices
 *      output[:, ..., :] = params[indices, :, ... :]
 * 
 *      # Vector indices
 *      output[i, :, ..., :] = params[indices[i], :, ... :]
 * 
 *      # Higher rank indices
 *      output[i, ..., j, :, ... :] = params[indices[i, ..., j], :, ..., :]
 *  }</pre>
 * 
 *  If {@code indices} is a permutation and {@code len(indices) == params.shape[0]} then
 *  this operation will permute {@code params} accordingly.
 * 
 *  {@code validate_indices}: DEPRECATED. If this operation is assigned to CPU, values in
 *  {@code indices} are always validated to be within range. If assigned to GPU,
 *  out-of-bound indices result in safe but unspecified behavior, which may include
 *  raising an error.
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/Gather.png" alt>
 *  </div>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Gather extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Gather(Pointer p) { super(p); }

  /** Optional attribute setters for Gather */
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
    public native @ByVal Attrs ValidateIndices(@Cast("bool") boolean x);

    public native @Cast("bool") boolean validate_indices_(); public native Attrs validate_indices_(boolean setter);
  }
  public Gather(@Const @ByRef Scope scope, @ByVal Input params,
         @ByVal Input indices) { super((Pointer)null); allocate(scope, params, indices); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input params,
         @ByVal Input indices);
  public Gather(@Const @ByRef Scope scope, @ByVal Input params,
         @ByVal Input indices, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, params, indices, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input params,
         @ByVal Input indices, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs ValidateIndices(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Gather operation(Operation setter);
  public native @ByRef Output output(); public native Gather output(Output setter);
}
