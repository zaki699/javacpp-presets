// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


@Opaque @Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_scratch extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public hs_scratch() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_scratch(Pointer p) { super(p); }
}
