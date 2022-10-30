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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LBFGSOptions extends OptimizerCloneableLBFGSOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBFGSOptions(Pointer p) { super(p); }

  public LBFGSOptions(double lr/*=1*/) { super((Pointer)null); allocate(lr); }
  private native void allocate(double lr/*=1*/);
  public LBFGSOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByRef @NoException(true) DoublePointer lr();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer max_iter();
  public native @ByRef @NoException(true) LongOptional max_eval();
  public native @ByRef @NoException(true) DoublePointer tolerance_grad();
  public native @ByRef @NoException(true) DoublePointer tolerance_change();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer history_size();
  public native @ByRef @NoException(true) StringOptional line_search_fn();
  
  
  
  public native double get_lr();
  public native void set_lr(double lr);
}
