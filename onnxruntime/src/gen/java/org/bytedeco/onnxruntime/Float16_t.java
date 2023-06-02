// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/** \brief IEEE 754 half-precision floating point data type
 * \details It is necessary for type dispatching to make use of C++ API
 * The type is implicitly convertible to/from uint16_t.
 * The size of the structure should align with uint16_t and one can freely cast
 * uint16_t buffers to/from Ort::Float16_t to feed and retrieve data.
 *
 * Generally, you can feed any of your types as float16/blfoat16 data to create a tensor
 * on top of it, providing it can form a continuous buffer with 16-bit elements with no padding.
 * And you can also feed a array of uint16_t elements directly. For example,
 *
 * <pre>{@code {.unparsed}
 * uint16_t values[] = { 15360, 16384, 16896, 17408, 17664};
 * constexpr size_t values_length = sizeof(values) / sizeof(values[0]);
 * std::vector<int64_t> dims = {values_length};  // one dimensional example
 * Ort::MemoryInfo info("Cpu", OrtDeviceAllocator, 0, OrtMemTypeDefault);
 * // Note we are passing bytes count in this api, not number of elements -> sizeof(values)
 * auto float16_tensor = Ort::Value::CreateTensor(info, values, sizeof(values),
 *                                                dims.data(), dims.size(), ONNX_TENSOR_ELEMENT_DATA_TYPE_FLOAT16);
 * }</pre>
 *
 * Here is another example, a little bit more elaborate. Let's assume that you use your own float16 type and you want to use
 * a templated version of the API above so the type is automatically set based on your type. You will need to supply an extra
 * template specialization.
 *
 * <pre>{@code {.unparsed}
 * namespace yours { struct half {}; } // assume this is your type, define this:
 * namespace Ort {
 * template<>
 * struct TypeToTensorType<yours::half> { static constexpr ONNXTensorElementDataType type = ONNX_TENSOR_ELEMENT_DATA_TYPE_FLOAT16; };
 * } //namespace Ort
 *
 * std::vector<yours::half> values;
 * std::vector<int64_t> dims = {values.size()}; // one dimensional example
 * Ort::MemoryInfo info("Cpu", OrtDeviceAllocator, 0, OrtMemTypeDefault);
 * // Here we are passing element count -> values.size()
 * auto float16_tensor = Ort::Value::CreateTensor<yours::half>(info, values.data(), values.size(), dims.data(), dims.size());
 *
 *  }</pre>
 */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Float16_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Float16_t(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Float16_t(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Float16_t position(long position) {
        return (Float16_t)super.position(position);
    }
    @Override public Float16_t getPointer(long i) {
        return new Float16_t((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short value(); public native Float16_t value(short setter);
  public Float16_t() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();
  public Float16_t(@Cast("uint16_t") short v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@Cast("uint16_t") short v);
  public native @Cast("uint16_t") @Name("operator uint16_t") @NoException(true) short asShort();
  public native @Cast("const bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef Float16_t rhs);
  public native @Cast("const bool") @Name("operator !=") @NoException(true) boolean notEquals(@Const @ByRef Float16_t rhs);
}
