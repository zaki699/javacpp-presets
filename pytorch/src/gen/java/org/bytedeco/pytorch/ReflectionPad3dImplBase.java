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

@Name("torch::nn::ReflectionPadImpl<3,torch::nn::ReflectionPad3dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReflectionPad3dImplBase extends ReflectionPad3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReflectionPad3dImplBase(Pointer p) { super(p); }

  public ReflectionPad3dImplBase(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
  @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding);
  public ReflectionPad3dImplBase(@Const @ByRef ReflectionPad3dOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef ReflectionPad3dOptions options_);

  public native void reset();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code ReflectionPad{1,2}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef ReflectionPad3dOptions options(); public native ReflectionPad3dImplBase options(ReflectionPad3dOptions setter);
}
