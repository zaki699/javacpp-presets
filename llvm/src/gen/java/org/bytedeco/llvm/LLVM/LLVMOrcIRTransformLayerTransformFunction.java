// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A function for applying transformations as part of an transform layer.
 *
 * Implementations of this type are responsible for managing the lifetime
 * of the Module pointed to by ModInOut: If the LLVMModuleRef value is
 * overwritten then the function is responsible for disposing of the incoming
 * module. If the module is simply accessed/mutated in-place then ownership
 * returns to the caller and the function does not need to do any lifetime
 * management.
 *
 * Clients can call LLVMOrcLLJITGetIRTransformLayer to obtain the transform
 * layer of a LLJIT instance, and use LLVMOrcIRTransformLayerSetTransform
 * to set the function. This can be used to override the default transform
 * layer.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcIRTransformLayerTransformFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcIRTransformLayerTransformFunction(Pointer p) { super(p); }
    protected LLVMOrcIRTransformLayerTransformFunction() { allocate(); }
    private native void allocate();
    public native LLVMErrorRef call(
    Pointer Ctx, @ByPtrPtr LLVMOrcThreadSafeModuleRef ModInOut,
    LLVMOrcMaterializationResponsibilityRef MR);
}
