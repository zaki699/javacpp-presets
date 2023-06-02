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


/** Options for the {@code PixelShuffle} module.
 * 
 *  Example:
 *  <pre>{@code
 *  PixelShuffle model(PixelShuffleOptions(5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PixelShuffleOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PixelShuffleOptions(Pointer p) { super(p); }

  public PixelShuffleOptions(@Cast("int64_t") long upscale_factor) { super((Pointer)null); allocate(upscale_factor); }
  private native void allocate(@Cast("int64_t") long upscale_factor);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer upscale_factor();
}
