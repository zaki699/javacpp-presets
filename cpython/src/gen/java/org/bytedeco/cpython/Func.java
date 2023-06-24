// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



/* Py_PyAtExit is for the atexit module, Py_AtExit is for low-level
 * exit functions.
 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class Func extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func(Pointer p) { super(p); }
    protected Func() { allocate(); }
    private native void allocate();
    public native void call();
}
