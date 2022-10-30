// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


///////////////////////////////////////////////////////////////////////
// Helper tracking memory statistics

@Namespace("arrow::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MemoryPoolStats extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryPoolStats(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemoryPoolStats(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MemoryPoolStats position(long position) {
        return (MemoryPoolStats)super.position(position);
    }
    @Override public MemoryPoolStats getPointer(long i) {
        return new MemoryPoolStats((Pointer)this).offsetAddress(i);
    }

  public MemoryPoolStats() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("int64_t") long max_memory();

  public native @Cast("int64_t") long bytes_allocated();

  public native void UpdateAllocatedBytes(@Cast("int64_t") long diff);
}
