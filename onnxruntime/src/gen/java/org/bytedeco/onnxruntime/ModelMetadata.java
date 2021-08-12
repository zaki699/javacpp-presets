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


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ModelMetadata extends BaseModelMetadata {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModelMetadata(Pointer p) { super(p); }

  public ModelMetadata(OrtModelMetadata p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtModelMetadata p);

  public native @Cast("char*") BytePointer GetProducerName(OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetGraphName(OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetDomain(OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetDescription(OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetGraphDescription(OrtAllocator allocator);
  public native @Cast("char**") PointerPointer GetCustomMetadataMapKeys(OrtAllocator allocator, @Cast("int64_t*") @ByRef LongPointer num_keys);
  public native @Cast("char**") @ByPtrPtr ByteBuffer GetCustomMetadataMapKeys(OrtAllocator allocator, @Cast("int64_t*") @ByRef LongBuffer num_keys);
  public native @Cast("char**") @ByPtrPtr byte[] GetCustomMetadataMapKeys(OrtAllocator allocator, @Cast("int64_t*") @ByRef long[] num_keys);
  public native @Cast("char*") BytePointer LookupCustomMetadataMap(@Cast("const char*") BytePointer key, OrtAllocator allocator);
  public native @Cast("char*") ByteBuffer LookupCustomMetadataMap(String key, OrtAllocator allocator);
  public native @Cast("int64_t") long GetVersion();
}
