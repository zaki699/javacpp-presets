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
 // namespace functional

// ============================================================================

/** Options for the {@code LeakyReLU} module.
 * 
 *  Example:
 *  <pre>{@code
 *  LeakyReLU model(LeakyReLUOptions().negative_slope(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LeakyReLUOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LeakyReLUOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LeakyReLUOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LeakyReLUOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LeakyReLUOptions position(long position) {
        return (LeakyReLUOptions)super.position(position);
    }
    @Override public LeakyReLUOptions getPointer(long i) {
        return new LeakyReLUOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer negative_slope();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
