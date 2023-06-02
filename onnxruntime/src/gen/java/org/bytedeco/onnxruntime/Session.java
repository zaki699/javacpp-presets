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


/** \brief Wrapper around ::OrtSession
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Session extends SessionImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Session(Pointer p) { super(p); }

  /** Wraps OrtApi::CreateSession */
  public Session(@Const @ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_path, options); }
  private native void allocate(@Const @ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options);
  /** Wraps OrtApi::CreateSessionWithPrepackedWeightsContainer */
  public Session(@Const @ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container) { super((Pointer)null); allocate(env, model_path, options, prepacked_weights_container); }
  private native void allocate(@Const @ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container);
  /** Wraps OrtApi::CreateSessionFromArray */
  public Session(@Const @ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_data, model_data_length, options); }
  private native void allocate(@Const @ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options);
  /** Wraps OrtApi::CreateSessionFromArrayWithPrepackedWeightsContainer */
  public Session(@Const @ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container) { super((Pointer)null); allocate(env, model_data, model_data_length, options, prepacked_weights_container); }
  private native void allocate(@Const @ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options,
            OrtPrepackedWeightsContainer prepacked_weights_container);

  public native @ByVal ConstSession GetConst();
  public native @ByVal @Cast("Ort::UnownedSession*") SessionImpl GetUnowned();
}
