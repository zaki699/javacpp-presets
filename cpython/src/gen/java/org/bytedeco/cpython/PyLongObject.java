// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyLongObject extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PyLongObject() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyLongObject(Pointer p) { super(p); }
}
