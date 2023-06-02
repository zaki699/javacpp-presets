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

// This type represents a Python float number
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ComplexType extends NumberType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ComplexType(Pointer p) { super(p); }

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);
  public native @StdString BytePointer str();
  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);
  @MemberGetter public static native TypeKind Kind();
  // global singleton
  
}
