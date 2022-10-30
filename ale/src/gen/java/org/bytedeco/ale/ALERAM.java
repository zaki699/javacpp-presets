// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;


/** A simple wrapper around the Atari RAM. */
@Namespace("ale") @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class ALERAM extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ALERAM() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALERAM(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALERAM(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ALERAM position(long position) {
        return (ALERAM)super.position(position);
    }
    @Override public ALERAM getPointer(long i) {
        return new ALERAM((Pointer)this).offsetAddress(i);
    }

  /** Byte accessors: x is wrapped to [0, 128). */
  public native @Cast("ale::byte_t") byte get(@Cast("unsigned int") int x);
  public native @Cast("ale::byte_t*") @Name("byte") BytePointer _byte(@Cast("unsigned int") int x);

  /** Returns a pointer to the first element of the entire
      array (equivalent to &byte[0]). */
  public native @Cast("const ale::byte_t*") BytePointer array();

  public native @Cast("std::size_t") long size();

  /** Returns whether two copies of the RAM are equal */
  public native @Cast("bool") boolean equals(@Const @ByRef ALERAM rhs);
}
