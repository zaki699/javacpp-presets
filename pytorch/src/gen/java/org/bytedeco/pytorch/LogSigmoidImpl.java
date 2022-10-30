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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LogSigmoid ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the LogSigmoid function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.LogSigmoid to learn
 *  about the exact behavior of this module. */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LogSigmoidImpl extends LogSigmoidImplCloneable {
    static { Loader.load(); }
    /** Default native constructor. */
    public LogSigmoidImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LogSigmoidImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogSigmoidImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LogSigmoidImpl position(long position) {
        return (LogSigmoidImpl)super.position(position);
    }
    @Override public LogSigmoidImpl getPointer(long i) {
        return new LogSigmoidImpl((Pointer)this).offsetAddress(i);
    }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code LogSigmoid} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
