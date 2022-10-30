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

@Name("torch::jit::detail::NamedPolicy<torch::jit::detail::ParameterPolicy>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NamedParameterPolicy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NamedParameterPolicy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NamedParameterPolicy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NamedParameterPolicy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NamedParameterPolicy position(long position) {
        return (NamedParameterPolicy)super.position(position);
    }
    @Override public NamedParameterPolicy getPointer(long i) {
        return new NamedParameterPolicy((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal @Cast("torch::jit::detail::NamedPolicy<torch::jit::detail::ParameterPolicy>::value_type*") NamedJitModule create(
        @StdVector SlotCursor cursors,
        @ByVal IValue v);
  public static native @Cast("bool") boolean valid(@Const @SharedPtr @ByRef ClassType t, @Cast("size_t") long i, @Const @ByRef IValue v);
  @MemberGetter public static native @Cast("const bool") boolean all_slots();
  public static final boolean all_slots = all_slots();
}
