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

@NoOffset @Name("c10::optional<c10::MemoryFormat>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MemoryFormatOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryFormatOptional(Pointer p) { super(p); }
    public MemoryFormatOptional(MemoryFormat value) { this(); put(value); }
    public MemoryFormatOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef MemoryFormatOptional put(@ByRef MemoryFormatOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef MemoryFormat get();
    @ValueSetter public native MemoryFormatOptional put(@ByRef MemoryFormat value);
}

