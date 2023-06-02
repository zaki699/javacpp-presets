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

@NoOffset @Name("torch::optional<std::tuple<at::Tensor,at::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorTensorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTensorOptional(Pointer p) { super(p); }
    public TensorTensorOptional(TensorTensorTuple value) { this(); put(value); }
    public TensorTensorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorTensorOptional put(@ByRef TensorTensorOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef TensorTensorTuple get();
    @ValueSetter public native TensorTensorOptional put(@ByRef TensorTensorTuple value);
}

