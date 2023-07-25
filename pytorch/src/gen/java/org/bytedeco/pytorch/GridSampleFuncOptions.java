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


/** Options for {@code torch::nn::functional::grid_sample}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::grid_sample(input, grid,
 *  F::GridSampleFuncOptions().mode(torch::kBilinear).padding_mode(torch::kZeros).align_corners(true));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GridSampleFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GridSampleFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GridSampleFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GridSampleFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GridSampleFuncOptions position(long position) {
        return (GridSampleFuncOptions)super.position(position);
    }
    @Override public GridSampleFuncOptions getPointer(long i) {
        return new GridSampleFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) GridSampleMode mode();
  public native @ByRef @NoException(true) GridSamplePaddingMode padding_mode();
  public native @ByRef @NoException(true) BoolOptional align_corners();
}
