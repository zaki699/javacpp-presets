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


/** Options for the {@code Linear} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Linear model(LinearOptions(5, 2).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LinearOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LinearOptions(Pointer p) { super(p); }

  public LinearOptions(@Cast("int64_t") long in_features, @Cast("int64_t") long out_features) { super((Pointer)null); allocate(in_features, out_features); }
  private native void allocate(@Cast("int64_t") long in_features, @Cast("int64_t") long out_features);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer in_features();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer out_features();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
}
