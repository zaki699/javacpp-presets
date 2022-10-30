// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // namespace thread
@Namespace("tensorflow") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RendezvousMgrInterface extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RendezvousMgrInterface() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RendezvousMgrInterface(Pointer p) { super(p); }
}
