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


// InterpreterContinuation propagates dist_autograd_context_id
// through (and only through) the forward pass manually, other
// thread local settings are propagated with ThreadLocalState
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InterpreterContinuation extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpreterContinuation(Pointer p) { super(p); }

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public InterpreterContinuation(
        @Const @ByRef InterpreterState state_,
        @ByVal IValueVector stack_,
        @Cast("int64_t") long dist_autograd_context_id/*=0*/,
        @ByVal(nullValue = "c10::optional<at::ThreadLocalState>(c10::nullopt)") ThreadLocalStateOptional tls_state) { super((Pointer)null); allocate(state_, stack_, dist_autograd_context_id, tls_state); }
  private native void allocate(
        @Const @ByRef InterpreterState state_,
        @ByVal IValueVector stack_,
        @Cast("int64_t") long dist_autograd_context_id/*=0*/,
        @ByVal(nullValue = "c10::optional<at::ThreadLocalState>(c10::nullopt)") ThreadLocalStateOptional tls_state);
  public InterpreterContinuation(
        @Const @ByRef InterpreterState state_,
        @ByVal IValueVector stack_) { super((Pointer)null); allocate(state_, stack_); }
  private native void allocate(
        @Const @ByRef InterpreterState state_,
        @ByVal IValueVector stack_);

  
}
