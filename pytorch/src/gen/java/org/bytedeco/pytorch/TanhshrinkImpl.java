// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Tanhshrink ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies Tanhshrink over a given input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Tanhshrink to learn
 *  about the exact behavior of this module. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TanhshrinkImpl extends TanhshrinkImplCloneable {
    static { Loader.load(); }
    /** Default native constructor. */
    public TanhshrinkImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TanhshrinkImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TanhshrinkImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TanhshrinkImpl position(long position) {
        return (TanhshrinkImpl)super.position(position);
    }
    @Override public TanhshrinkImpl getPointer(long i) {
        return new TanhshrinkImpl((Pointer)this).offsetAddress(i);
    }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Tanhshrink} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
