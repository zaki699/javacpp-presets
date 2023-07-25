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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SourceRangeHasher extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SourceRangeHasher() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SourceRangeHasher(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceRangeHasher(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SourceRangeHasher position(long position) {
        return (SourceRangeHasher)super.position(position);
    }
    @Override public SourceRangeHasher getPointer(long i) {
        return new SourceRangeHasher((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef SourceRange key);
}
