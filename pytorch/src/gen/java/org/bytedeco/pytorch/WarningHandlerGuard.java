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


@Namespace("c10::WarningUtils") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WarningHandlerGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WarningHandlerGuard(Pointer p) { super(p); }

  public WarningHandlerGuard(WarningHandler new_handler) { super((Pointer)null); allocate(new_handler); }
  private native void allocate(WarningHandler new_handler);
}
