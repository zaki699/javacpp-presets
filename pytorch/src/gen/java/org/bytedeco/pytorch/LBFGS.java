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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LBFGS extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBFGS(Pointer p) { super(p); }

   public LBFGS(@ByVal OptimizerParamGroupVector param_groups,
          @ByVal(nullValue = "torch::optim::LBFGSOptions{}") LBFGSOptions defaults) { super((Pointer)null); allocate(param_groups, defaults); }
   private native void allocate(@ByVal OptimizerParamGroupVector param_groups,
          @ByVal(nullValue = "torch::optim::LBFGSOptions{}") LBFGSOptions defaults);
   public LBFGS(@ByVal OptimizerParamGroupVector param_groups) { super((Pointer)null); allocate(param_groups); }
   private native void allocate(@ByVal OptimizerParamGroupVector param_groups);
   public LBFGS(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params,
          @ByVal(nullValue = "torch::optim::LBFGSOptions{}") LBFGSOptions defaults) { super((Pointer)null); allocate(params, defaults); }
   private native void allocate(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params,
          @ByVal(nullValue = "torch::optim::LBFGSOptions{}") LBFGSOptions defaults);
   public LBFGS(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params) { super((Pointer)null); allocate(params); }
   private native void allocate(
          @Cast({"", "std::vector<at::Tensor>"}) @StdMove TensorVector params);

  public native @ByVal Tensor step(@ByVal LossClosure closure);
  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}
