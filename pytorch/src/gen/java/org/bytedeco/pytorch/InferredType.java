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


// Used as a return type when inferring the IValue type of a Python object.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InferredType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InferredType(Pointer p) { super(p); }

  /* implicit */ public InferredType(@ByVal Type.TypePtr type) { super((Pointer)null); allocate(type); }
private native void allocate(@ByVal Type.TypePtr type);
  /* implicit */ public InferredType(@StdString BytePointer reason) { super((Pointer)null); allocate(reason); }
private native void allocate(@StdString BytePointer reason);
public InferredType(@StdString String reason) { super((Pointer)null); allocate(reason); }
private native void allocate(@StdString String reason);
  public native @ByVal Type.TypePtr type();
  public native @Cast("bool") boolean success();
  public native @StdString BytePointer reason();
}
