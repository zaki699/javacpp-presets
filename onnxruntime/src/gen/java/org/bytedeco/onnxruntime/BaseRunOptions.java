// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtRunOptions>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseRunOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseRunOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseRunOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseRunOptions position(long position) {
        return (BaseRunOptions)super.position(position);
    }
    @Override public BaseRunOptions getPointer(long i) {
        return new BaseRunOptions(this).position(position + i);
    }

  public BaseRunOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseRunOptions(OrtRunOptions p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtRunOptions p);

  public native @Name("operator OrtRunOptions*") OrtRunOptions asOrtRunOptions();

  public native OrtRunOptions release();
}
