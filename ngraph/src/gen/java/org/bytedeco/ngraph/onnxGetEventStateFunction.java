// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxGetEventStateFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxGetEventStateFunction(Pointer p) { super(p); }
    protected onnxGetEventStateFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxEvent event,
    @Cast("onnxEventState*") IntPointer state);
}
