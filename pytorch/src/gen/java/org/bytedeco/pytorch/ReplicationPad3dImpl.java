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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ReplicationPad3d
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ReplicationPad over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ReplicationPad3d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ReplicationPad3dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ReplicationPad3d model(ReplicationPad3dOptions({1, 2, 1, 2, 1, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReplicationPad3dImpl extends ReplicationPad3dImplBase {
    static { Loader.load(); }

  
    public ReplicationPad3dImpl(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding);
    public ReplicationPad3dImpl(@Const @ByRef ReplicationPad3dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef ReplicationPad3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReplicationPad3dImpl(Pointer p) { super(p); }

}
