// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxReleaseEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxReleaseEventFunction(Pointer p) { super(p); }
    protected onnxReleaseEventFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxEvent event);
}
