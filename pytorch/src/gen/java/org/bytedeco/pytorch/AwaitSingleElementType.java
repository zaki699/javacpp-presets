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


// common base for all types that have a single sub element
// e.g. Future[T], Optional[T], List[T]
@Name("c10::SingleElementType<c10::TypeKind::AwaitType,c10::AwaitType>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AwaitSingleElementType extends SharedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AwaitSingleElementType(Pointer p) { super(p); }

  @MemberGetter public static native TypeKind Kind();

  public native @Const @ByRef Type.TypePtr getElementType();

  public native @Cast("bool") boolean hasFreeVariables();

  public native @ByVal TypeArrayRef containedTypes();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);
}
