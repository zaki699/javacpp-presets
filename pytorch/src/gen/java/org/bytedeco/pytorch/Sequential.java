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


/** A {@code ModuleHolder} subclass for {@code SequentialImpl}.
 *  See the documentation for {@code SequentialImpl} class to learn what methods it
 *  provides, or the documentation for {@code ModuleHolder} to learn about PyTorch's
 *  module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Sequential extends SequentialImplModuleHolder {
    static { Loader.load(); }

  
    public Sequential() { super((Pointer)null); allocate(); }
    private native void allocate(); public Sequential(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public Sequential(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::SequentialImpl>"}) SequentialImpl module) { super((Pointer)null); allocate(module); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::SequentialImpl>"}) SequentialImpl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Sequential(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Sequential(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Sequential position(long position) {
        return (Sequential)super.position(position);
    }
    @Override public Sequential getPointer(long i) {
        return new Sequential((Pointer)this).offsetAddress(i);
    }


  /** Constructs the {@code Sequential} from a braced-init-list of named {@code AnyModule}s.
   *  It enables the following use case:
   *  {@code Sequential sequential({{"m1", M(1)}, {"m2", M(2)}})} */
  // NOLINTNEXTLINE(performance-move-const-arg)
}
