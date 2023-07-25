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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SGD extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SGD(Pointer p) { super(p); }

  public SGD(
        @ByVal OptimizerParamGroupVector param_groups,
        @ByVal SGDOptions defaults) { super((Pointer)null); allocate(param_groups, defaults); }
  private native void allocate(
        @ByVal OptimizerParamGroupVector param_groups,
        @ByVal SGDOptions defaults);

  public SGD(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector params, @ByVal SGDOptions defaults) { super((Pointer)null); allocate(params, defaults); }
  private native void allocate(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector params, @ByVal SGDOptions defaults);

  public native @ByVal Tensor step(@ByVal(nullValue = "torch::optim::Optimizer::LossClosure(nullptr)") LossClosure closure);
  public native @ByVal Tensor step();

  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}
