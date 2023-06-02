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


// Shape of a Tensor represented with ShapeSymbol's. Unranked, ranked unknown
// dims, partially known and fully known shapes are all supported.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymbolicShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolicShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymbolicShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SymbolicShape position(long position) {
        return (SymbolicShape)super.position(position);
    }
    @Override public SymbolicShape getPointer(long i) {
        return new SymbolicShape((Pointer)this).offsetAddress(i);
    }

  // Unranked shape constructor.
  public SymbolicShape() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Known rank but unknown dimentions.
  public SymbolicShape(@ByVal SizeTOptional rank) { super((Pointer)null); allocate(rank); }
  private native void allocate(@ByVal SizeTOptional rank);

  // Mix of known and unknown ranks
  public SymbolicShape(@Const @ByRef LongOptionalVector dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@Const @ByRef LongOptionalVector dims);

  public native void dump();

  public SymbolicShape(@ByVal ShapeSymbolVector dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@ByVal ShapeSymbolVector dims);

  public SymbolicShape(@ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef dims);
  public SymbolicShape(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... dims);

  public native @ByVal @Name("operator []") ShapeSymbol get(@Cast("size_t") long i);

  public native @ByVal ShapeSymbol at(@Cast("size_t") long i);

  // Returns rank or nullopt in case of unranked shape.
  public native @ByVal SizeTOptional rank();

  public native @ByVal ShapeSymbolVectorOptional sizes();

  public native @ByVal BoolVectorOptional symbolicDims();

  // Checks whether the shape is fully defined/complete, ie. rank and sizes
  // of every dimension are known.
  public native @Cast("bool") boolean isComplete();

  // Create new SymbolicShape that is result of merging self and another
  // SymbolicShape. Only dimensions that are static and equal will be
  // preserved.
  // If either of two shapes are of unknown rank or they have unmatching rank,
  // result will be unranked.
  public native @ByVal SymbolicShape merge(@Const @ByRef SymbolicShape other);

  

  
}
