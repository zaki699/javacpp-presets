// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxWaitEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxWaitEventFunction(Pointer p) { super(p); }
    protected onnxWaitEventFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(onnxEvent event);
}
