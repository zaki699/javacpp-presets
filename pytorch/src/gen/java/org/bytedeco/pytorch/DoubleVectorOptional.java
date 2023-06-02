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

@NoOffset @Name("c10::optional<std::vector<double> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleVectorOptional(Pointer p) { super(p); }
    public DoubleVectorOptional(DoubleVector value) { this(); put(value); }
    public DoubleVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DoubleVectorOptional put(@ByRef DoubleVectorOptional x);

    public native boolean has_value();
    public native @Name("value") @Cast("std::vector<double>*") @ByRef DoubleVector get();
    @ValueSetter public native DoubleVectorOptional put(@Cast("std::vector<double>*") @ByRef DoubleVector value);
}

