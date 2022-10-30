// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/** opaque reference to a code generator */
@Name("LLVMOpaqueLTOCodeGenerator") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class lto_code_gen_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public lto_code_gen_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lto_code_gen_t(Pointer p) { super(p); }
}
