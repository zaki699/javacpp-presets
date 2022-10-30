// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;

/** Holds device information. */
@Opaque @Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_device extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public freenect_device() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_device(Pointer p) { super(p); }
}
