// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtIoBinding>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseIoBinding extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseIoBinding(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseIoBinding(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseIoBinding position(long position) {
        return (BaseIoBinding)super.position(position);
    }
    @Override public BaseIoBinding getPointer(long i) {
        return new BaseIoBinding((Pointer)this).offsetAddress(i);
    }


  public BaseIoBinding() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseIoBinding(OrtIoBinding p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtIoBinding p);

  public native @Name("operator OrtIoBinding*") OrtIoBinding asOrtIoBinding();

  public native OrtIoBinding release();
}
