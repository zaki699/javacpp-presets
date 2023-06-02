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


// ============================================================================

/** Options for the {@code ZeroPad2d} module.
 * 
 *  Example:
 *  <pre>{@code
 *  ZeroPad2d model(ZeroPad2dOptions({1, 1, 2, 0}));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ZeroPad2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ZeroPad2dOptions(Pointer p) { super(p); }

  public ZeroPad2dOptions(@ByVal @Cast("torch::ExpandingArray<4>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<4>*") LongPointer padding);
  public native @Cast("torch::ExpandingArray<4>*") @ByRef @NoException(true) LongPointer padding();
}
