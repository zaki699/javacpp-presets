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


// If we see `a + b + c`  and know that a, b, and c are the same size and have
// two dimensions (WxH), then we can generate a fused kernel for them. That
// fused kernel would likely have indexing math to handling both the W and H
// dimensions. However, if we knew the WxH dimensions were contiguous, we can
// pretend like we only have a single dimension, simplifying the indexing logic.
// This can be performed even if the dimensions are transposed,
// as long as a, b, and c are transposed in the same way.
// We'd like to have the compiler be able to do this dimensionality reduction,
// but simply knowing sizes is not enough.
// We can extend profiling to also record stride information.
// Rather than recording specific strides,
// we can simply order the strides from smallest to largest with
// `stride_indices` A contiguity marker on the smallest stride (c0) indicates
// the stride is precisely 1, otherwise a contiguity marker means that $stride_n
// = size_{n-1}*stride_{n-1}$
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Stride extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stride(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Stride(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Stride position(long position) {
        return (Stride)super.position(position);
    }
    @Override public Stride getPointer(long i) {
        return new Stride((Pointer)this).offsetAddress(i);
    }

  public Stride() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Stride(
        @Const @ByRef SizeTOptional stride_index,
        @ByVal BoolOptional contiguous,
        @Const @ByRef SizeTOptional stride) { super((Pointer)null); allocate(stride_index, contiguous, stride); }
  private native void allocate(
        @Const @ByRef SizeTOptional stride_index,
        @ByVal BoolOptional contiguous,
        @Const @ByRef SizeTOptional stride);

  

  public native @Cast("bool") boolean isComplete();

  public native @ByRef SizeTOptional stride_index_(); public native Stride stride_index_(SizeTOptional setter);
  public native @ByRef BoolOptional contiguous_(); public native Stride contiguous_(BoolOptional setter);
  public native @ByRef SizeTOptional stride_(); public native Stride stride_(SizeTOptional setter);
}
