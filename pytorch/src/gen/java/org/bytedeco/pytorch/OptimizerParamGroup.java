// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Stores parameters in the param_group and stores a pointer to the OptimizerOptions */
@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerParamGroup extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerParamGroup(Pointer p) { super(p); }

  // NOTE: In order to store `OptimizerParamGroup` in a `std::vector`, it has to be copy-constructible.
  public OptimizerParamGroup(@Const @ByRef OptimizerParamGroup param_group) { super((Pointer)null); allocate(param_group); }
  private native void allocate(@Const @ByRef OptimizerParamGroup param_group);
  public OptimizerParamGroup(@Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params) { super((Pointer)null); allocate(params); }
  private native void allocate(@Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params);
  public OptimizerParamGroup(@Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params, @UniquePtr OptimizerOptions options) { super((Pointer)null); allocate(params, options); }
  private native void allocate(@Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params, @UniquePtr OptimizerOptions options);

  public native @Cast("bool") boolean has_options();
  public native @ByRef OptimizerOptions options();
  public native void set_options(@UniquePtr OptimizerOptions options);
  public native @ByRef TensorVector params();
}
