// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENUMRESLANGPROCW extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ENUMRESLANGPROCW(Pointer p) { super(p); }
    protected ENUMRESLANGPROCW() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("HMODULE") Pointer hModule,
    @Cast("LPCWSTR") CharPointer lpType,
    @Cast("LPCWSTR") CharPointer lpName,
    @Cast("WORD") short wLanguage,
    @Cast("LONG_PTR") long lParam);
}
