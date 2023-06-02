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


@Name("torch::jit::Maybe<torch::jit::Expr>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExprMaybe extends TreeView {
    static { Loader.load(); }

  public ExprMaybe(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  /* implicit */ public ExprMaybe(@Const @ByRef Expr tree) { super((Pointer)null); allocate(tree); }
private native void allocate(@Const @ByRef Expr tree);
  public native @Cast("bool") boolean present();
  public native @ByVal Expr get();
  
  public static native @ByVal ExprMaybe create(@Const @ByRef SourceRange range);
  public static native @ByVal ExprMaybe create(@Const @ByRef SourceRange range, @Const @ByRef Expr value);
}
