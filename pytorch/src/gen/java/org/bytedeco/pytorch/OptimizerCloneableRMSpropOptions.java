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


@Name("torch::optim::OptimizerCloneableOptions<torch::optim::RMSpropOptions>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableRMSpropOptions extends OptimizerOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableRMSpropOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableRMSpropOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableRMSpropOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableRMSpropOptions position(long position) {
        return (OptimizerCloneableRMSpropOptions)super.position(position);
    }
    @Override public OptimizerCloneableRMSpropOptions getPointer(long i) {
        return new OptimizerCloneableRMSpropOptions((Pointer)this).offsetAddress(i);
    }

}
