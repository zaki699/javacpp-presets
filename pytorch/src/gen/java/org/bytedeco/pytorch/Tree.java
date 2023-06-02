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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Tree extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tree(Pointer p) { super(p); }

  public Tree(int kind_) { super((Pointer)null); allocate(kind_); }
  private native void allocate(int kind_);
  public native int kind();
  public native @Cast("bool") boolean isAtom();
  public native @Const @ByRef SourceRange range();
  public native @StdString BytePointer stringValue();
  public native @Cast("const torch::jit::TreeList*") @ByRef Pointer trees();
  public native @Cast("const torch::jit::TreeRef*") @ByRef Pointer tree(@Cast("size_t") long i);
  
  public native void matchNumSubtrees(int k, @Cast("size_t") long expected_subtrees);
  public native void matchNumSubtreesD(
        int k,
        @Cast("const char*") BytePointer filename,
        int lineno,
        @Cast("size_t") long expected_subtrees,
        @Cast("bool") boolean allow_more);
  public native void matchNumSubtreesD(
        int k,
        String filename,
        int lineno,
        @Cast("size_t") long expected_subtrees,
        @Cast("bool") boolean allow_more);
}
