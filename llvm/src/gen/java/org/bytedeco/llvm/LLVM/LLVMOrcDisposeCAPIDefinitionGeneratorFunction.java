// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Disposer for a custom generator.
 *
 * Will be called by ORC when the JITDylib that the generator is attached to
 * is destroyed.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcDisposeCAPIDefinitionGeneratorFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcDisposeCAPIDefinitionGeneratorFunction(Pointer p) { super(p); }
    protected LLVMOrcDisposeCAPIDefinitionGeneratorFunction() { allocate(); }
    private native void allocate();
    public native void call(Pointer Ctx);
}
