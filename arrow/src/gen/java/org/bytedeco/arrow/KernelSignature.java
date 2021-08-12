// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Holds the input types and output type of the kernel.
 * 
 *  VarArgs functions with minimum N arguments should pass up to N input types to be
 *  used to validate the input types of a function invocation. The first N-1 types
 *  will be matched against the first N-1 arguments, and the last type will be
 *  matched against the remaining arguments. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class KernelSignature extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelSignature(Pointer p) { super(p); }

  public KernelSignature(@StdVector InputType in_types, @ByVal OutputType out_type,
                    @Cast("bool") boolean is_varargs/*=false*/) { super((Pointer)null); allocate(in_types, out_type, is_varargs); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type,
                    @Cast("bool") boolean is_varargs/*=false*/);
  public KernelSignature(@StdVector InputType in_types, @ByVal OutputType out_type) { super((Pointer)null); allocate(in_types, out_type); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type);

  /** \brief Convenience ctor since make_shared can be awkward */
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature Make(@StdVector InputType in_types,
                                                 @ByVal OutputType out_type,
                                                 @Cast("bool") boolean is_varargs/*=false*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature Make(@StdVector InputType in_types,
                                                 @ByVal OutputType out_type);

  /** \brief Return true if the signature if compatible with the list of input
   *  value descriptors. */
  public native @Cast("bool") boolean MatchesInputs(@Const @ByRef ValueDescrVector descriptors);

  /** \brief Returns true if the input types of each signature are
   *  equal. Well-formed functions should have a deterministic output type
   *  given input types, but currently it is the responsibility of the
   *  developer to ensure this. */
  public native @Cast("bool") boolean Equals(@Const @ByRef KernelSignature other);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef KernelSignature other);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef KernelSignature other);

  /** \brief Compute a hash code for the signature */
  public native @Cast("size_t") long Hash();

  /** \brief The input types for the kernel. For VarArgs functions, this should
   *  generally contain a single validator to use for validating all of the
   *  function arguments. */
  public native @StdVector InputType in_types();

  /** \brief The output type for the kernel. Use Resolve to return the exact
   *  output given input argument ValueDescrs, since many kernels' output types
   *  depend on their input types (or their type metadata). */
  public native @Const @ByRef OutputType out_type();

  /** \brief Render a human-readable string representation */
  public native @StdString String ToString();

  public native @Cast("bool") boolean is_varargs();
}
