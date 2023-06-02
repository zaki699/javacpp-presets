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
public class ErrorReport extends Pointer {
    static { Loader.load(); }

  public ErrorReport(@Const @ByRef ErrorReport e) { super((Pointer)null); allocate(e); }
  private native void allocate(@Const @ByRef ErrorReport e);

  public ErrorReport(@ByVal SourceRange r) { super((Pointer)null); allocate(r); }
  private native void allocate(@ByVal SourceRange r);
  public ErrorReport(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  public ErrorReport(@Const @ByRef Token tok) { super((Pointer)null); allocate(tok); }
  private native void allocate(@Const @ByRef Token tok);

  public native @NoException(true) @Cast("const char*") BytePointer what();

  public static class CallStack extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public CallStack(Pointer p) { super(p); }
  
    // These functions are used to report why a function was being compiled
    // (i.e. what was the call stack of user functions at compilation time that
    // led to this error)
    public CallStack(@StdString BytePointer name, @Const @ByRef SourceRange range) { super((Pointer)null); allocate(name, range); }
    private native void allocate(@StdString BytePointer name, @Const @ByRef SourceRange range);
    public CallStack(@StdString String name, @Const @ByRef SourceRange range) { super((Pointer)null); allocate(name, range); }
    private native void allocate(@StdString String name, @Const @ByRef SourceRange range);

    // Change the range that is relevant for the current function (i.e. after
    // each successful expression compilation, change it to the next expression)
    public static native void update_pending_range(@Const @ByRef SourceRange range);
  }

  public static native @StdString BytePointer current_call_stack();
}
