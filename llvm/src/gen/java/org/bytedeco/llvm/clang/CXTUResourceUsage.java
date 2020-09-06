// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
  * The memory usage of a CXTranslationUnit, broken into categories.
  */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXTUResourceUsage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXTUResourceUsage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXTUResourceUsage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTUResourceUsage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXTUResourceUsage position(long position) {
        return (CXTUResourceUsage)super.position(position);
    }
    @Override public CXTUResourceUsage getPointer(long i) {
        return new CXTUResourceUsage(this).position(position + i);
    }

  /* Private data member, used for queries. */
  public native Pointer data(); public native CXTUResourceUsage data(Pointer setter);

  /* The number of entries in the 'entries' array. */
  public native @Cast("unsigned") int numEntries(); public native CXTUResourceUsage numEntries(int setter);

  /* An array of key-value pairs, representing the breakdown of memory
            usage. */
  public native CXTUResourceUsageEntry entries(); public native CXTUResourceUsage entries(CXTUResourceUsageEntry setter);

}
