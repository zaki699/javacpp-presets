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


// Non-owning view of an OperatorName.  Unlike OperatorName, most of
// its functions are constexpr, so it can be used for compile time
// computations
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OperatorNameView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorNameView(Pointer p) { super(p); }

  public native @ByRef @Cast("c10::string_view*") Pointer name(); public native OperatorNameView name(Pointer setter);
  public native @ByRef @Cast("c10::string_view*") Pointer overload_name(); public native OperatorNameView overload_name(Pointer setter);
  // Parses strings like "foo.overload" and also "foo"
  public static native @Const @ByVal OperatorNameView parse(@ByVal @Cast("c10::string_view*") Pointer full_name);
}
