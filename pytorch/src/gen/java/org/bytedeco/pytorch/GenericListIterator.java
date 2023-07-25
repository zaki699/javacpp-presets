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

@Name("c10::impl::ListIterator<c10::IValue,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GenericListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GenericListIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GenericListIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GenericListIterator position(long position) {
        return (GenericListIterator)super.position(position);
    }
    @Override public GenericListIterator getPointer(long i) {
        return new GenericListIterator((Pointer)this).offsetAddress(i);
    }

   // C++17 friendly std::iterator implementation

  public GenericListIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GenericListIterator(@Const @ByRef GenericListIterator arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef GenericListIterator arg0);
  public native @ByRef @Name("operator =") GenericListIterator put(@Const @ByRef GenericListIterator arg0);

  public native @ByRef @Name("operator ++") GenericListIterator increment();

  public native @ByVal @Name("operator ++") GenericListIterator increment(int arg0);

  public native @ByRef @Name("operator --") GenericListIterator decrement();

  public native @ByVal @Name("operator --") GenericListIterator decrement(int arg0);

  public native @ByRef @Name("operator +=") GenericListIterator addPut(long offset);

  public native @ByRef @Name("operator -=") GenericListIterator subtractPut(long offset);

  public native @ByVal @Name("operator +") GenericListIterator add(long offset);

  public native @ByVal @Name("operator -") GenericListIterator subtract(long offset);

  private static native @Namespace @Cast("c10::impl::ListIterator<c10::IValue,c10::detail::ListImpl::list_type::iterator>::difference_type") @Name("operator -") long subtract(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public long subtract(GenericListIterator rhs) { return subtract(this, rhs); }

  

  

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean equals(GenericListIterator rhs) { return equals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean notEquals(GenericListIterator rhs) { return notEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean lessThan(GenericListIterator rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean lessThanEquals(GenericListIterator rhs) { return lessThanEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean greaterThan(GenericListIterator rhs) { return greaterThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef GenericListIterator lhs, @Const @ByRef GenericListIterator rhs);
  public boolean greaterThanEquals(GenericListIterator rhs) { return greaterThanEquals(this, rhs); }
}
