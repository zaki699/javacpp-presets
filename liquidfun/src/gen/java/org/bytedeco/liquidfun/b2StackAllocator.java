// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;

@Opaque @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2StackAllocator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public b2StackAllocator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2StackAllocator(Pointer p) { super(p); }
}
