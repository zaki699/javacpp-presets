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

@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptionalTensorRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalTensorRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptionalTensorRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OptionalTensorRef position(long position) {
        return (OptionalTensorRef)super.position(position);
    }
    @Override public OptionalTensorRef getPointer(long i) {
        return new OptionalTensorRef((Pointer)this).offsetAddress(i);
    }

  public OptionalTensorRef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OptionalTensorRef(@Const @ByRef TensorBase src) { super((Pointer)null); allocate(src); }
  private native void allocate(@Const @ByRef TensorBase src);

  public OptionalTensorRef(@Const @ByRef OptionalTensorRef rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Const @ByRef OptionalTensorRef rhs);

  public native @ByRef @Name("operator =") OptionalTensorRef put(@ByVal OptionalTensorRef rhs);

  public native @Cast("bool") boolean has_value();

  public native @Const @ByRef Tensor getTensorRef();

  public native @Const @ByRef @Name("operator *") Tensor multiply();

  public native @Const @Name("operator ->") Tensor access();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
}
