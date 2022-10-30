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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softsign ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies Softsign over a given input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Softsign to learn
 *  about the exact behavior of this module. */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftsignImpl extends SoftsignImplCloneable {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftsignImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftsignImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftsignImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftsignImpl position(long position) {
        return (SoftsignImpl)super.position(position);
    }
    @Override public SoftsignImpl getPointer(long i) {
        return new SoftsignImpl((Pointer)this).offsetAddress(i);
    }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softsign} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
