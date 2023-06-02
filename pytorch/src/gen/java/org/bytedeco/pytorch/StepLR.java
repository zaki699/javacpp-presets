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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StepLR extends LRScheduler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StepLR(Pointer p) { super(p); }

  public StepLR(
        @ByRef Optimizer optimizer,
        @Cast("const unsigned") int step_size,
        double gamma/*=0.1*/) { super((Pointer)null); allocate(optimizer, step_size, gamma); }
  private native void allocate(
        @ByRef Optimizer optimizer,
        @Cast("const unsigned") int step_size,
        double gamma/*=0.1*/);
  public StepLR(
        @ByRef Optimizer optimizer,
        @Cast("const unsigned") int step_size) { super((Pointer)null); allocate(optimizer, step_size); }
  private native void allocate(
        @ByRef Optimizer optimizer,
        @Cast("const unsigned") int step_size);
}
