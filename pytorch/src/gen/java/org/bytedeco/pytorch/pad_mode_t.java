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

@NoOffset @Name("c10::variant<torch::enumtype::kConstant,torch::enumtype::kReflect,torch::enumtype::kReplicate,torch::enumtype::kCircular>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class pad_mode_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public pad_mode_t(Pointer p) { super(p); }
    public pad_mode_t(kConstant value) { this(); put(value); }
    public pad_mode_t(kReflect value) { this(); put(value); }
    public pad_mode_t(kReplicate value) { this(); put(value); }
    public pad_mode_t(kCircular value) { this(); put(value); }
    public pad_mode_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef pad_mode_t put(@ByRef pad_mode_t x);

    public @ByRef kConstant get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kConstant get0(@ByRef pad_mode_t container);
    @ValueSetter public native pad_mode_t put(@ByRef kConstant value);
    public @ByRef kReflect get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kReflect get1(@ByRef pad_mode_t container);
    @ValueSetter public native pad_mode_t put(@ByRef kReflect value);
    public @ByRef kReplicate get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kReplicate get2(@ByRef pad_mode_t container);
    @ValueSetter public native pad_mode_t put(@ByRef kReplicate value);
    public @ByRef kCircular get3() { return get3(this); }
    @Namespace @Name("c10::get<3>") public static native @ByRef kCircular get3(@ByRef pad_mode_t container);
    @ValueSetter public native pad_mode_t put(@ByRef kCircular value);
}

