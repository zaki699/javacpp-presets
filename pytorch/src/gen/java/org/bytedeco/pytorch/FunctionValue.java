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
public class FunctionValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionValue(Pointer p) { super(p); }

  public FunctionValue(Function callee) { super((Pointer)null); allocate(callee); }
  private native void allocate(Function callee);
  public FunctionValue(@Const @ByRef StrongFunctionPtr p) { super((Pointer)null); allocate(p); }
  private native void allocate(@Const @ByRef StrongFunctionPtr p);

  public native @StdString BytePointer kind();

  public native @SharedPtr @ByVal SugaredValue call(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction f,
        @ByVal NamedValueArrayRef args,
        @ByVal NamedValueArrayRef kwargs,
        @Cast("size_t") long n_binders);

  public native @Const @ByRef FunctionVector callees();
}
