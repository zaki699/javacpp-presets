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

@Name("torch::jit::slot_list_impl<torch::jit::detail::NamedPolicy<torch::jit::detail::ModulePolicy> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class named_module_list extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public named_module_list(Pointer p) { super(p); }

  public native @ByVal named_module_iterator begin();
  public native @ByVal named_module_iterator end();
  public native @Cast("size_t") long size();

  public named_module_list(@ByVal JitModule module, @Cast("bool") boolean recurse, @Cast("bool") boolean return_module) { super((Pointer)null); allocate(module, recurse, return_module); }
  private native void allocate(@ByVal JitModule module, @Cast("bool") boolean recurse, @Cast("bool") boolean return_module);
}
