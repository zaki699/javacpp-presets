// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Arguments to pass to a KernelInit function. A struct is used to help
 *  avoid API breakage should the arguments passed need to be expanded. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class KernelInitArgs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelInitArgs(Pointer p) { super(p); }

  /** \brief A pointer to the kernel being initialized. The init function may
   *  depend on the kernel's KernelSignature or other data contained there. */
  
  ///
  public native @Const Kernel kernel(); public native KernelInitArgs kernel(Kernel setter);

  /** \brief The types and shapes of the input arguments that the kernel is
   *  about to be executed against.
   * 
   *  TODO: should this be const std::vector<ValueDescr>*? const-ref is being
   *  used to avoid the cost of copying the struct into the args struct. */
  @MemberGetter public native @Const @ByRef ValueDescrVector inputs();

  /** \brief Opaque options specific to this kernel. May be nullptr for functions
   *  that do not require options. */
  public native @Const FunctionOptions options(); public native KernelInitArgs options(FunctionOptions setter);
}
