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
 // namespace impl

@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SavedTensorDefaultHooks extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SavedTensorDefaultHooks() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedTensorDefaultHooks(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedTensorDefaultHooks(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SavedTensorDefaultHooks position(long position) {
        return (SavedTensorDefaultHooks)super.position(position);
    }
    @Override public SavedTensorDefaultHooks getPointer(long i) {
        return new SavedTensorDefaultHooks((Pointer)this).offsetAddress(i);
    }

  public static native void push_hooks(@Cast("PyObject*") Pointer pack_hook, @Cast("PyObject*") Pointer unpack_hook);
  public static native void pop_hooks();
  public static native @ByVal @Cast("std::pair<PyObject*,PyObject*>*") Pointer get_hooks();
  public static native void lazy_initialize();
  public static native @ByVal @Cast("std::stack<std::pair<PyObject*,PyObject*> >*") Pointer get_stack();
  public static native void set_stack(@ByVal @Cast("std::stack<std::pair<PyObject*,PyObject*> >*") Pointer arg0);

  public static native @Const @ByRef SavedTensorDefaultHooksTLS get_tls_state();
  public static native void set_tls_state(@Const @ByRef SavedTensorDefaultHooksTLS tls);

  // NOTE: [Disabling SavedTensorDefaultHooks]
  // A developer of a PyTorch feature may choose to disable SavedTensorDefault
  // hooks, especially if their feature does not work with it. If they are
  // disabled, then the following will raise an error:
  // - Attempting to push_hooks
  // - calling disable(message) with a non-zero stack (from get_stack) size
  public static native void disable(@StdString BytePointer error_message);
  public static native void disable(@StdString String error_message);
  public static native void enable();
  public static native @Cast("bool") boolean is_enabled();
  public static native @Const @ByRef StringOptional get_disabled_error_message();
}
