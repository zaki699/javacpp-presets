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

@NoOffset @Name("c10::optional<std::vector<c10::ShapeSymbol> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ShapeSymbolVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeSymbolVectorOptional(Pointer p) { super(p); }
    public ShapeSymbolVectorOptional(ShapeSymbolVector value) { this(); put(value); }
    public ShapeSymbolVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ShapeSymbolVectorOptional put(@ByRef ShapeSymbolVectorOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef ShapeSymbolVector get();
    @ValueSetter public native ShapeSymbolVectorOptional put(@ByRef ShapeSymbolVector value);
}

