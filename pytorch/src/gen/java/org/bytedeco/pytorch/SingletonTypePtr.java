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


// Compatibility wrapper around a raw pointer so that existing code
// written to deal with a shared_ptr can keep working.
@Name("c10::SingletonTypePtr<c10::Type>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SingletonTypePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SingletonTypePtr(Pointer p) { super(p); }

  /* implicit */ public SingletonTypePtr(Type p) { super((Pointer)null); allocate(p); }
private native void allocate(Type p);

  // We need this to satisfy Pybind11, but it shouldn't be hit.

  public native Type get();

  public native @Name("operator ->") Type access();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
}
