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


@Namespace("at::indexing") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Slice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Slice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Slice(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Slice position(long position) {
        return (Slice)super.position(position);
    }
    @Override public Slice getPointer(long i) {
        return new Slice((Pointer)this).offsetAddress(i);
    }

  public Slice(
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional start_index,
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional stop_index,
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional step_index) { super((Pointer)null); allocate(start_index, stop_index, step_index); }
  private native void allocate(
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional start_index,
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional stop_index,
        @ByVal(nullValue = "c10::optional<c10::SymInt>(c10::nullopt)") SymIntOptional step_index);
  public Slice() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal SymInt start();

  public native @ByVal SymInt stop();

  public native @ByVal SymInt step();
}
