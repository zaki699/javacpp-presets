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


@Namespace("at::namedinference") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorNames extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorNames(Pointer p) { super(p); }

  public TensorNames(@ByVal DimnameArrayRef names) { super((Pointer)null); allocate(names); }
  private native void allocate(@ByVal DimnameArrayRef names);

  // Create TensorNames from names[start:end]. Each individual TensorName stores
  // `names`, NOT names[start:end], because the original tensor's names are
  // `names`.
  public TensorNames(@ByVal DimnameArrayRef names, @Cast("int64_t") long start, @Cast("int64_t") long end) { super((Pointer)null); allocate(names, start, end); }
  private native void allocate(@ByVal DimnameArrayRef names, @Cast("int64_t") long start, @Cast("int64_t") long end);

  // op_name is only used for error reporting.
  public native @ByRef TensorNames unifyFromRightInplace(
        @Const @ByRef TensorNames other,
        @Cast("const char*") BytePointer op_name/*="unify"*/);
  public native @ByRef TensorNames unifyFromRightInplace(
        @Const @ByRef TensorNames other);
  public native @ByRef TensorNames unifyFromRightInplace(
        @Const @ByRef TensorNames other,
        String op_name/*="unify"*/);
  public native void checkUnique(@Cast("const char*") BytePointer op_name);
  public native void checkUnique(String op_name);

  public native void append(@Cast({"", "at::namedinference::TensorName&&"}) @StdMove TensorName name);
  public native @StdMove DimnameVector toDimnameVec();
}
