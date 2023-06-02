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
public class SugaredEnumClass extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SugaredEnumClass(Pointer p) { super(p); }

  public SugaredEnumClass(@SharedPtr @ByVal EnumType enum_type) { super((Pointer)null); allocate(enum_type); }
  private native void allocate(@SharedPtr @ByVal EnumType enum_type);

  public native @StdString BytePointer kind();

  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field);
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field);

  public native @SharedPtr @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);
}
