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

@NoOffset @Name("c10::optional<c10::TypePtr>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TypePtrOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypePtrOptional(Pointer p) { super(p); }
    public TypePtrOptional(Type.TypePtr value) { this(); put(value); }
    public TypePtrOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TypePtrOptional put(@ByRef TypePtrOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef Type.TypePtr get();
    @ValueSetter public native TypePtrOptional put(@ByRef Type.TypePtr value);
}

