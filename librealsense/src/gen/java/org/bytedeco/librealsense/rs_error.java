// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;

@Opaque @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_error extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public rs_error() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_error(Pointer p) { super(p); }
}
