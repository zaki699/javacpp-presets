// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// #endif

@Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_DimensionHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_DimensionHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_DimensionHandle(Pointer p) { super(p); }
}
