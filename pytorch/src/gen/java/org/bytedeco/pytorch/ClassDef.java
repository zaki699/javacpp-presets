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
public class ClassDef extends TreeView {
    static { Loader.load(); }

  public ClassDef(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  public native @ByVal ClassDef withName(@StdString BytePointer new_name);
  public native @ByVal ClassDef withName(@StdString String new_name);
  public native @ByVal Ident name();
  public native @ByVal ExprMaybe superclass();
  public native @ByVal @Cast("torch::jit::Maybe<c10::List<torch::jit::Property> >*") Pointer properties();
  public native @ByVal @Cast("torch::jit::Maybe<c10::List<torch::jit::Assign> >*") Pointer assigns();
}
