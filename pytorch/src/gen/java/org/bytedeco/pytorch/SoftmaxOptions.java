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

/** Options for the {@code Softmax} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Softmax model(SoftmaxOptions(1));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftmaxOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftmaxOptions(Pointer p) { super(p); }

  public SoftmaxOptions(@Cast("int64_t") long dim) { super((Pointer)null); allocate(dim); }
  private native void allocate(@Cast("int64_t") long dim);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer dim();
}
