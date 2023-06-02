// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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

@Name("torch::nn::ConvNdImpl<2,torch::nn::ConvTranspose2dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose2dImplBaseBase extends ConvTranspose2dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose2dImplBaseBase(Pointer p) { super(p); }

  public ConvTranspose2dImplBaseBase(@ByVal DetailConv2dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@ByVal DetailConv2dOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code Conv{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef DetailConv2dOptions options(); public native ConvTranspose2dImplBaseBase options(DetailConv2dOptions setter);

  /** The learned kernel (or "weight"). */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor weight(); public native ConvTranspose2dImplBaseBase weight(Tensor setter);

  /** The learned bias. Only defined if the {@code bias} option was true. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor bias(); public native ConvTranspose2dImplBaseBase bias(Tensor setter);
}
