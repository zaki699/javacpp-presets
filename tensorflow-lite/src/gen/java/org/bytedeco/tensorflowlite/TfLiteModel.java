// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

// #endif  // __cplusplus

// --------------------------------------------------------------------------
// Opaque types used by the C API.

// TfLiteModel wraps a loaded TensorFlow Lite model.
@Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteModel extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TfLiteModel() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteModel(Pointer p) { super(p); }
}
