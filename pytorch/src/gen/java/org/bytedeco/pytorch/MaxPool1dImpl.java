// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MaxPool1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies maxpool over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MaxPool1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MaxPool1dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MaxPool1d model(MaxPool1dOptions(3).stride(2));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MaxPool1dImpl extends MaxPool1dImplBase {
    static { Loader.load(); }

  
    public MaxPool1dImpl(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
    public MaxPool1dImpl(@Const @ByRef MaxPool1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef MaxPool1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPool1dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the outputs and the indices of the max values.
   *  Useful for {@code torch::nn::MaxUnpool1d} later. */
  public native @ByVal T_TensorTensor_T forward_with_indices(@Const @ByRef Tensor input);
}
