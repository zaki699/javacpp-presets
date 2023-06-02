// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// begin_ntoshvp

//
// Handle to an Object
//

// #ifdef STRICT
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class HANDLE extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public HANDLE() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HANDLE(Pointer p) { super(p); }
}
