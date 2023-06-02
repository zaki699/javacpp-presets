// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::version_conversion") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class GenericAdapter extends Adapter {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GenericAdapter(Pointer p) { super(p); }


  public native Node adapt(@SharedPtr Graph graph, Node node);
}
