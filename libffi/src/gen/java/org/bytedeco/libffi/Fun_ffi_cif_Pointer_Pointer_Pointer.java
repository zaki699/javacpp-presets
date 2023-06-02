// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libffi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libffi.global.ffi.*;

@Properties(inherit = org.bytedeco.libffi.presets.ffi.class)
public class Fun_ffi_cif_Pointer_Pointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Fun_ffi_cif_Pointer_Pointer_Pointer(Pointer p) { super(p); }
    protected Fun_ffi_cif_Pointer_Pointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(ffi_cif arg0,Pointer arg1,@Cast("void**") @ByPtrPtr Pointer arg2,Pointer arg3);
}
