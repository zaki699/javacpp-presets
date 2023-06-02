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

@NoOffset @Name("std::tuple<torch::nn::utils::rnn::PackedSequence,std::tuple<at::Tensor,at::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PackedSequenceTensorTensorTupleTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedSequenceTensorTensorTupleTuple(Pointer p) { super(p); }
    public @ByRef PackedSequence get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef PackedSequence get0(@ByRef PackedSequenceTensorTensorTupleTuple container);
    public @ByRef TensorTensorTuple get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef TensorTensorTuple get1(@ByRef PackedSequenceTensorTensorTupleTuple container);
}

