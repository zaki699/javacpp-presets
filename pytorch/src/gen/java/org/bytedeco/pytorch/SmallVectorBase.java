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


/** SmallVectorTemplateBase<TriviallyCopyable = false> - This is where we put
 *  method implementations that are designed to work with non-trivial T's.
 * 
 *  We approximate is_trivially_copyable with trivial move/copy construction and
 *  trivial destruction. While the standard doesn't specify that you're allowed
 *  copy these types with memcpy, there is no way for the type to observe this.
 *  This catches the important case of std::pair<POD, POD>, which is not
 *  trivially assignable.
 * 
 *  XXX: if build fails here fall back to C10_IS_TRIVIALLY_COPYABLE and make a
 *  note */
@Name("c10::SmallVectorTemplateBase<int64_t>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SmallVectorBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SmallVectorBase(Pointer p) { super(p); }

  public native void push_back(@Cast("const int64_t") long Elt);

  public native void pop_back();
}
