// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;



/* Message catalog descriptor type.  */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class nl_catd extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nl_catd() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nl_catd(Pointer p) { super(p); }
}
