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


// ============================================================================

/** Base class for all (dimension-specialized) ConstantPad modules. */
@Name("torch::nn::ConstantPadImpl<1,torch::nn::ConstantPad1dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad1dImplBase extends ConstantPad1dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad1dImplBase(Pointer p) { super(p); }

  public ConstantPad1dImplBase(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
  @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value);
  public ConstantPad1dImplBase(@Const @ByRef ConstantPad1dOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef ConstantPad1dOptions options_);

  public native void reset();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code ConstantPad{1,2}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef ConstantPad1dOptions options(); public native ConstantPad1dImplBase options(ConstantPad1dOptions setter);
}
