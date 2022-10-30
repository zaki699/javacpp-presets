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


@Namespace("torch::jit::tracer") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TracingState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TracingState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TracingState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TracingState position(long position) {
        return (TracingState)super.position(position);
    }
    @Override public TracingState getPointer(long i) {
        return new TracingState((Pointer)this).offsetAddress(i);
    }

  public TracingState() { super((Pointer)null); allocate(); }
  private native void allocate();

  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @SharedPtr @ByRef Graph graph(); public native TracingState graph(Graph setter);
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @Cast("bool") boolean warn(); public native TracingState warn(boolean setter);
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @Cast("bool") boolean strict(); public native TracingState strict(boolean setter);
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @Cast("bool") boolean force_outplace(); public native TracingState force_outplace(boolean setter);
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  

  public native void enterFrame();

  public native void leaveFrame();

  public native void setValue(@Const @ByRef IValue v, Value value);
  public native void delValue(@Const @ByRef IValue var);
  public native Value getValue(@Const @ByRef IValue var);
  public native Value getOutput(@Const @ByRef IValue var, @Cast("size_t") long i);
  public native @Cast("bool") boolean hasValue(@Const @ByRef IValue var);

  public native JitNode createNode(@ByVal Symbol op_name, @Cast("size_t") long num_outputs);
  public native void insertNode(JitNode node);
}
