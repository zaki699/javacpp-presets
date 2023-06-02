// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PENUM_PAGE_FILE_CALLBACKW extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PENUM_PAGE_FILE_CALLBACKW(Pointer p) { super(p); }
    protected PENUM_PAGE_FILE_CALLBACKW() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(@Cast("LPVOID") Pointer pContext, @Cast("PENUM_PAGE_FILE_INFORMATION") ENUM_PAGE_FILE_INFORMATION pPageFileInfo, @Cast("LPCWSTR") CharPointer lpFilename);
}
