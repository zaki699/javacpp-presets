// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Namespace("arrow") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UInt32Type extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public UInt32Type() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UInt32Type(Pointer p) { super(p); }
}
