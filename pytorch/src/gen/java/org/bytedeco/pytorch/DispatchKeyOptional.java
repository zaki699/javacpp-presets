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

@NoOffset @Name("c10::optional<c10::DispatchKey>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DispatchKeyOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DispatchKeyOptional(Pointer p) { super(p); }
    public DispatchKeyOptional(DispatchKey value) { this(); put(value); }
    public DispatchKeyOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DispatchKeyOptional put(@ByRef DispatchKeyOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef DispatchKey get();
    @ValueSetter public native DispatchKeyOptional put(@ByRef DispatchKey value);
}

