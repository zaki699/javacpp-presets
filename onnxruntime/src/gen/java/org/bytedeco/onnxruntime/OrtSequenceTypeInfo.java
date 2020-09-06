// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Opaque @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtSequenceTypeInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OrtSequenceTypeInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtSequenceTypeInfo(Pointer p) { super(p); }
}
