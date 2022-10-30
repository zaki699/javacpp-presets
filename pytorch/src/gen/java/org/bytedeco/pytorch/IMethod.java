// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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


@Namespace("torch") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IMethod extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMethod(Pointer p) { super(p); }


  public native @ByVal @Name("operator ()") IValue apply(
        @ByVal IValueVector args,
        @Cast("const torch::IMethod::IValueMap*") @ByRef(nullValue = "torch::IMethod::IValueMap()") StringIValueMap kwargs);
  public native @ByVal @Name("operator ()") IValue apply(
        @ByVal IValueVector args);

  public native @StdString BytePointer name();

  // Returns an ordered list of argument names, possible in both
  // script and python methods.  This is a more portable dependency
  // than a ScriptMethod FunctionSchema, which has more information
  // than can be generally expected from a python method.
  public native @Const @ByRef StringVector getArgumentNames();
}
