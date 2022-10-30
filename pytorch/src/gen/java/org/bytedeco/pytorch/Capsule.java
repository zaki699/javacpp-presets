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


// Capsule is an internal implementation detail of custom C++ classes. We
// define it as an owning wrapper for
// c10::intrusive_ptr<torch::CustomClassHolder> This wrapper is here to serve as
// an abstraction of the type erased custom class object pointer. It also allow
// pybind11 to treat this as a standalone class to register as a separate type
// caster, instead of a custom pointer holder which the pointer holder type
// caster try to "unwrap" it automatically.
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Capsule extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Capsule(Pointer p) { super(p); }

}
