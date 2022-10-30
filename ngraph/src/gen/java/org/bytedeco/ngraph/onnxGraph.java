// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

/** Opaque ONNXIFI graph handle. */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxGraph extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public onnxGraph() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxGraph(Pointer p) { super(p); }
}
