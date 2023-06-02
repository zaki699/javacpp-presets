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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TernaryIf extends Expr {
    static { Loader.load(); }

  public TernaryIf(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  public native @ByVal Expr cond();
  public native @ByVal Expr true_expr();
  public native @ByVal Expr false_expr();
  public static native @ByVal TernaryIf create(
        @Const @ByRef SourceRange range,
        @Const @ByRef Expr cond,
        @Const @ByRef Expr true_expr,
        @Const @ByRef Expr false_expr);
}
