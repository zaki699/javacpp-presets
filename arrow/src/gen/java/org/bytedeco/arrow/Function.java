// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base class for compute functions. Function implementations contain a
 *  collection of "kernels" which are implementations of the function for
 *  specific argument types. Selecting a viable kernel for executing a function
 *  is referred to as "dispatching". */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Function extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Function(Pointer p) { super(p); }

  /** \brief The kind of function, which indicates in what contexts it is
   *  valid for use. */
  public enum Kind {
    /** A function that performs scalar data operations on whole arrays of
     *  data. Can generally process Array or Scalar values. The size of the
     *  output will be the same as the size (or broadcasted size, in the case
     *  of mixing Array and Scalar inputs) of the input. */
    SCALAR(0),

    /** A function with array input and output whose behavior depends on the
     *  values of the entire arrays passed, rather than the value of each scalar
     *  value. */
    VECTOR(1),

    /** A function that computes scalar summary statistics from array input. */
    SCALAR_AGGREGATE(2),

    /** A function that computes grouped summary statistics from array input
     *  and an array of group identifiers. */
    HASH_AGGREGATE(3),

    /** A function that dispatches to other functions and does not contain its
     *  own kernels. */
    META(4);

      public final int value;
      private Kind(int v) { this.value = v; }
      private Kind(Kind e) { this.value = e.value; }
      public Kind intern() { for (Kind e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** \brief The name of the kernel. The registry enforces uniqueness of names. */
  public native @StdString String name();

  /** \brief The kind of kernel, which indicates in what contexts it is valid
   *  for use. */
  public native Kind kind();

  /** \brief Contains the number of arguments the function requires, or if the
   *  function accepts variable numbers of arguments. */
  public native @Const @ByRef Arity arity();

  /** \brief Return the function documentation */
  public native @Const @ByRef FunctionDoc doc();

  /** \brief Returns the number of registered kernels for this function. */
  
  ///
  public native int num_kernels();

  /** \brief Return a kernel that can execute the function given the exact
   *  argument types (without implicit type casts or scalar->array promotions).
   * 
   *  NB: This function is overridden in CastFunction. */
  
  ///
  public native @ByVal @Cast("arrow::Result<const arrow::compute::Kernel*>*") KernelResult DispatchExact(
        @Const @ByRef ValueDescrVector values);

  /** \brief Return a best-match kernel that can execute the function given the argument
   *  types, after implicit casts are applied.
   * 
   *  @param values [in,out] Argument types. An element may be modified to indicate that
   *  the returned kernel only approximately matches the input value descriptors; callers
   *  are responsible for casting inputs to the type and shape required by the kernel. */
  
  ///
  ///
  public native @ByVal @Cast("arrow::Result<const arrow::compute::Kernel*>*") KernelResult DispatchBest(ValueDescrVector values);

  /** \brief Execute the function eagerly with the passed input arguments with
   *  kernel dispatch, batch iteration, and memory allocation details taken
   *  care of.
   * 
   *  If the {@code options} pointer is null, then {@code default_options()} will be used.
   * 
   *  This function can be overridden in subclasses. */
  
  ///
  public native @ByVal DatumResult Execute(@Const @ByRef DatumVector args,
                                  @Const FunctionOptions options, ExecContext ctx);

  /** \brief Returns the default options for this function.
   * 
   *  Whatever option semantics a Function has, implementations must guarantee
   *  that default_options() is valid to pass to Execute as options. */
  public native @Const FunctionOptions default_options();

  public native @ByVal Status Validate();
}
