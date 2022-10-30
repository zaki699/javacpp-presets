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

@Name("torch::nn::Cloneable<torch::nn::HingeEmbeddingLossImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HingeEmbeddingLossImplCloneable extends Module {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HingeEmbeddingLossImplCloneable(Pointer p) { super(p); }


  /** {@code reset()} must perform initialization of all members with reference
   *  semantics, most importantly parameters, buffers and submodules. */
  public native void reset();
  @Override public Module asModule() { return asModule(this); }
  @Namespace public static native @Name("static_cast<torch::nn::Module*>") Module asModule(HingeEmbeddingLossImplCloneable module);

  /** Performs a recursive "deep copy" of the {@code Module}, such that all parameters
   *  and submodules in the cloned module are different from those in the
   *  original module. */
  public native @SharedPtr Module clone(
        @Const @ByRef(nullValue = "c10::optional<c10::Device>(c10::nullopt)") DeviceOptional device);
  public native @SharedPtr Module clone();
}
