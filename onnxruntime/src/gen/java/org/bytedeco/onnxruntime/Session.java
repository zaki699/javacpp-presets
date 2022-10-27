// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \brief Wrapper around ::OrtSession
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Session extends BaseSession {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Session(Pointer p) { super(p); }

  /** Wraps OrtApi::CreateSession */
  public Session(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_path, options); }
  private native void allocate(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options);
  /** Wraps OrtApi::CreateSessionWithPrepackedWeightsContainer */
  public Session(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options, OrtPrepackedWeightsContainer prepacked_weights_container) { super((Pointer)null); allocate(env, model_path, options, prepacked_weights_container); }
  private native void allocate(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options, OrtPrepackedWeightsContainer prepacked_weights_container);
  /** Wraps OrtApi::CreateSessionFromArray */
  public Session(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_data, model_data_length, options); }
  private native void allocate(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options);
  /** Wraps OrtApi::CreateSessionFromArrayWithPrepackedWeightsContainer */
  public Session(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container) { super((Pointer)null); allocate(env, model_data, model_data_length, options, prepacked_weights_container); }
  private native void allocate(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container);

  /** \brief Run the model returning results in an Ort allocated vector.
   *
   * Wraps OrtApi::Run
   *
   * The caller provides a list of inputs and a list of the desired outputs to return.
   *
   * See the output logs for more information on warnings/errors that occur while processing the model.
   * Common errors are.. (TODO)
   *
   * @param run_options [in]
   * @param input_names [in] Array of null terminated strings of length input_count that is the list of input names
   * @param input_values [in] Array of Value objects of length input_count that is the list of input values
   * @param input_count [in] Number of inputs (the size of the input_names & input_values arrays)
   * @param output_names [in] Array of C style strings of length output_count that is the list of output names
   * @param output_count [in] Number of outputs (the size of the output_names array)
   * @return A std::vector of Value objects that directly maps to the output_count (eg. output_name[0] is the first entry of the returned vector)
   */
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") PointerPointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") PointerPointer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr BytePointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr BytePointer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr ByteBuffer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr byte[] input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr byte[] output_names, @Cast("size_t") long output_count);

  /** \brief Run the model returning results in user provided outputs
   * Same as Run(const RunOptions&, const char* const*, const Value*, size_t,const char* const*, size_t)
   */
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") PointerPointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") PointerPointer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr BytePointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr BytePointer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr ByteBuffer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr ByteBuffer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr byte[] input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr byte[] output_names, Value output_values, @Cast("size_t") long output_count);

  /** Wraps OrtApi::RunWithBinding */
  public native void Run(@Const @ByRef RunOptions run_options, @Const @ByRef IoBinding arg1);

  /** Returns the number of model inputs */
  public native @Cast("size_t") long GetInputCount();
  /** Returns the number of model outputs */
  public native @Cast("size_t") long GetOutputCount();
  /** Returns the number of inputs that have defaults that can be overridden */
  public native @Cast("size_t") long GetOverridableInitializerCount();

  /** \brief Returns a copy of input name at the specified index.
   *
   * @param index must less than the value returned by GetInputCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetInputNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** \brief Returns a copy of output name at then specified index.
   *
   * @param index must less than the value returned by GetOutputCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetOutputNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** \brief Returns a copy of the overridable initializer name at then specified index.
   *
   * @param index must less than the value returned by GetOverridableInitializerCount()
   * @param allocator to allocate memory for the copy of the name returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::SessionGetOverridableInitializerName */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer GetOverridableInitializerNameAllocated(@Cast("size_t") long index, OrtAllocator allocator);

  /** \brief Returns a copy of the profiling file name.
   *
   * @param allocator to allocate memory for the copy of the string returned
   * @return a instance of smart pointer that would deallocate the buffer when out of scope.
   *  The OrtAllocator instances must be valid at the point of memory release.
   */
  /** Wraps OrtApi::SessionEndProfiling */
  public native @UniquePtr("char, Ort::detail::AllocatedFree") @Cast("char*") BytePointer EndProfilingAllocated(OrtAllocator allocator);
  /** Wraps OrtApi::SessionGetProfilingStartTimeNs */
  public native @Cast("uint64_t") long GetProfilingStartTimeNs();
  /** Wraps OrtApi::SessionGetModelMetadata */
  public native @ByVal ModelMetadata GetModelMetadata();

  /** Wraps OrtApi::SessionGetInputTypeInfo */
  public native @ByVal TypeInfo GetInputTypeInfo(@Cast("size_t") long index);
  /** Wraps OrtApi::SessionGetOutputTypeInfo */
  public native @ByVal TypeInfo GetOutputTypeInfo(@Cast("size_t") long index);
  /** Wraps OrtApi::SessionGetOverridableInitializerTypeInfo */
  public native @ByVal TypeInfo GetOverridableInitializerTypeInfo(@Cast("size_t") long index);
}
