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
public class BuiltinModule extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BuiltinModule(Pointer p) { super(p); }

  public BuiltinModule(@StdString BytePointer name, @ByVal(nullValue = "c10::optional<int64_t>(at::nullopt)") LongOptional version) { super((Pointer)null); allocate(name, version); }
  private native void allocate(@StdString BytePointer name, @ByVal(nullValue = "c10::optional<int64_t>(at::nullopt)") LongOptional version);
  public BuiltinModule(@StdString BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString BytePointer name);
  public BuiltinModule(@StdString String name, @ByVal(nullValue = "c10::optional<int64_t>(at::nullopt)") LongOptional version) { super((Pointer)null); allocate(name, version); }
  private native void allocate(@StdString String name, @ByVal(nullValue = "c10::optional<int64_t>(at::nullopt)") LongOptional version);
  public BuiltinModule(@StdString String name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString String name);

  public native @StdString BytePointer kind();
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field);
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field);
}
