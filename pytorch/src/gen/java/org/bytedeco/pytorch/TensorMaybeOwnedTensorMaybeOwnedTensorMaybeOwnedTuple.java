// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

@NoOffset @Name("std::tuple<c10::MaybeOwned<at::Tensor>,c10::MaybeOwned<at::Tensor>,c10::MaybeOwned<at::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple(Pointer p) { super(p); }
    public TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple(@Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value0, @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value1, @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value2) { allocate(value0, value1, value2); }
    private native void allocate(@Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value0, @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value1, @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned value2);
    public TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple put(@ByRef TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple x);

    public @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get0(@ByRef TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple container);
    public @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get1(@ByRef TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple container);
    public @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned get2(@ByRef TensorMaybeOwnedTensorMaybeOwnedTensorMaybeOwnedTuple container);
}

