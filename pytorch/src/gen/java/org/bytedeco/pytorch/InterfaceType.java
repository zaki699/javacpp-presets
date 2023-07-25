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


// Interfaces are a list of abstract methods that a class might meet.
// If a class provides those methods, it implicitly meets the interface.

// Subtype relations for Interface with ClassType:
// lhs (ClassType or InterfaceType) is a subtype of rhs if:
// 1. lhs methods are a superset of rhs methods
// 2. if rhs is module interface, the lhs must be module interface or module itself
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InterfaceType extends NamedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterfaceType(Pointer p) { super(p); }

  public static native @SharedPtr InterfaceType create(
        @ByVal QualifiedName qualifiedName, @Cast("bool") boolean is_module/*=false*/);
  public static native @SharedPtr InterfaceType create(
        @ByVal QualifiedName qualifiedName);

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @StdString BytePointer str();

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  // try to find a method of this interface,
  // returns nullptr if not found.
  public native @Const FunctionSchema getMethod(@StdString BytePointer name);
  public native @Const FunctionSchema getMethod(@StdString String name);
  public native void addMethod(@ByVal FunctionSchema schema);
  public native @StdVector FunctionSchema methods();

  public native @Cast("bool") boolean is_module();
  @MemberGetter public static native TypeKind Kind();
}
