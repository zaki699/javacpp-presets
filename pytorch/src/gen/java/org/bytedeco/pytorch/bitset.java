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


/**
 * This is a simple bitset class with sizeof(long long int) bits.
 * You can set bits, unset bits, query bits by index,
 * and query for the first set bit.
 * Before using this class, please also take a look at std::bitset,
 * which has more functionality and is more generic. It is probably
 * a better fit for your use case. The sole reason for c10::utils::bitset
 * to exist is that std::bitset misses a find_first_set() method.
 */
@Namespace("c10::utils") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class bitset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public bitset(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public bitset(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public bitset position(long position) {
        return (bitset)super.position(position);
    }
    @Override public bitset getPointer(long i) {
        return new bitset((Pointer)this).offsetAddress(i);
    }

  public static native @Cast("const size_t") long NUM_BITS();

  public bitset() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();
  public bitset(@Const @ByRef bitset arg0) { super((Pointer)null); allocate(arg0); }
  @NoException(true) private native void allocate(@Const @ByRef bitset arg0);
  // there is an issure for gcc 5.3.0 when define default function as constexpr
  // see https://gcc.gnu.org/bugzilla/show_bug.cgi?id=68754.
  public native @ByRef @Name("operator =") @NoException(true) bitset put(@Const @ByRef bitset arg0);

  public native @NoException(true) void set(@Cast("size_t") long index);

  public native @NoException(true) void unset(@Cast("size_t") long index);

  public native @Cast("const bool") @NoException(true) boolean get(@Cast("size_t") long index);

  public native @Cast("const bool") @NoException(true) boolean is_entirely_unset();

  // Call the given functor with the index of each bit that is set
  // Return the index of the first set bit. The returned index is one-indexed
  // (i.e. if the very first bit is set, this function returns '1'), and a
  // return of '0' means that there was no bit set.

  private static native @Namespace @Cast("bool") @Name("operator ==") @NoException(true) boolean equals(@ByVal bitset lhs, @ByVal bitset rhs);
  public boolean equals(bitset rhs) { return equals(this, rhs); }
}
