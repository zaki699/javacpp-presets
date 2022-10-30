// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PVECTORED_EXCEPTION_HANDLER extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PVECTORED_EXCEPTION_HANDLER(Pointer p) { super(p); }
    protected PVECTORED_EXCEPTION_HANDLER() { allocate(); }
    private native void allocate();
    public native @Cast("LONG") int call(
    EXCEPTION_POINTERS ExceptionInfo
    );
}
