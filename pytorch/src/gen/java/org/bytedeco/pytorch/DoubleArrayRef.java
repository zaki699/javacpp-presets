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

@Name("c10::ArrayRef<double>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DoubleArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DoubleArrayRef position(long position) {
        return (DoubleArrayRef)super.position(position);
    }
    @Override public DoubleArrayRef getPointer(long i) {
        return new DoubleArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public DoubleArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  

  /** Construct an ArrayRef from a pointer and length. */
  public DoubleArrayRef(@Const DoublePointer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const DoublePointer data, @Cast("size_t") long length);
  public DoubleArrayRef(@Const DoubleBuffer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const DoubleBuffer data, @Cast("size_t") long length);
  public DoubleArrayRef(@Const double[] data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const double[] data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public DoubleArrayRef(@Const DoublePointer begin, @Const DoublePointer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const DoublePointer begin, @Const DoublePointer end);
  public DoubleArrayRef(@Const DoubleBuffer begin, @Const DoubleBuffer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const DoubleBuffer begin, @Const DoubleBuffer end);
  public DoubleArrayRef(@Const double[] begin, @Const double[] end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const double[] begin, @Const double[] end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.
  public DoubleArrayRef(@ByRef DoubleVector vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByRef DoubleVector vec);

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @Const DoublePointer begin();
  public native @Const DoublePointer end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Const DoublePointer cbegin();
  public native @Const DoublePointer cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const DoublePointer data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native double front();

  /** back - Get the last element. */
  public native double back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal DoubleArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal DoubleArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal DoubleArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Name("operator []") double get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native double at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @ByVal @Cast("std::vector<double>*") DoubleVector vec();

  /** \} */
}
