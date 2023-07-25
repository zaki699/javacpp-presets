// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// This is not a SimpleValue so it can not pass through the code paths that
// expect a SimpleValue as a sugared value.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExceptionMessageValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExceptionMessageValue(Pointer p) { super(p); }

  public ExceptionMessageValue(
        Value value,
        Value qualified_class_name/*=nullptr*/) { super((Pointer)null); allocate(value, qualified_class_name); }
  private native void allocate(
        Value value,
        Value qualified_class_name/*=nullptr*/);
  public ExceptionMessageValue(
        Value value) { super((Pointer)null); allocate(value); }
  private native void allocate(
        Value value);

  public native @StdString BytePointer kind();

  public native Value getValue();

  // qualified python class name
  public native Value getQualifiedClassName();
}
