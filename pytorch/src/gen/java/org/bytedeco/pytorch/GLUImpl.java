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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GLU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies glu over a given input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.GLU to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::GLUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  GLU model(GLUOptions(1));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GLUImpl extends GLUImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GLUImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GLUImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GLUImpl position(long position) {
        return (GLUImpl)super.position(position);
    }
    @Override public GLUImpl getPointer(long i) {
        return new GLUImpl((Pointer)this).offsetAddress(i);
    }

  public GLUImpl(@Const @ByRef(nullValue = "torch::nn::GLUOptions{}") GLUOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::GLUOptions{}") GLUOptions options_);
  public GLUImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code GLU} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef GLUOptions options(); public native GLUImpl options(GLUOptions setter);
}
