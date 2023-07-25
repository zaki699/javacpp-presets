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


// Named type instead of a pair/tuple so that we can be sure to
// construct the vectors in place and get NRVO.
@Name("at::InferExpandGeometryResult<at::DimVector>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DimVectorInferExpandGeometryResult extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimVectorInferExpandGeometryResult(Pointer p) { super(p); }

  public native @ByRef DimVector sizes(); public native DimVectorInferExpandGeometryResult sizes(DimVector setter);
  public native @ByRef DimVector strides(); public native DimVectorInferExpandGeometryResult strides(DimVector setter);
  public DimVectorInferExpandGeometryResult(@Cast("size_t") long ndim) { super((Pointer)null); allocate(ndim); }
  private native void allocate(@Cast("size_t") long ndim);
  public DimVectorInferExpandGeometryResult(@ByVal LongArrayRef sizes_, @Cast("size_t") long ndim) { super((Pointer)null); allocate(sizes_, ndim); }
  private native void allocate(@ByVal LongArrayRef sizes_, @Cast("size_t") long ndim);
  public DimVectorInferExpandGeometryResult(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes_, @Cast("size_t") long ndim) { super((Pointer)null); allocate(sizes_, ndim); }
  private native void allocate(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes_, @Cast("size_t") long ndim);
}
