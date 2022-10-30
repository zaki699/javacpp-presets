// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ISchemaRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISchemaRegistry(Pointer p) { super(p); }


  public native @Const OpSchema GetSchema(@StdString BytePointer key, int maxInclusiveVersion, @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(@StdString BytePointer key, int maxInclusiveVersion);
  public native @Const OpSchema GetSchema(@StdString String key, int maxInclusiveVersion, @StdString String domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(@StdString String key, int maxInclusiveVersion);
}
