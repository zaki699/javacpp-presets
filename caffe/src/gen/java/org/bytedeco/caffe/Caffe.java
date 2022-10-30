// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


// A singleton class to hold common caffe stuff, such as the handler that
// caffe is going to use for cublas, curand, etc.
@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class Caffe extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Caffe(Pointer p) { super(p); }


  // Thread local context for Caffe. Moved to common.cpp instead of
  // including boost/thread.hpp to avoid a boost/NVCC issues (#1009, #1010)
  // on OSX. Also fails on Linux with CUDA 7.0.18.
  public static native @ByRef Caffe Get();

  /** enum caffe::Caffe::Brew */
  public static final int CPU = 0, GPU = 1;

  // This random number generator facade hides boost and CUDA rng
  // implementation from one another (for cross-platform compatibility).
  @NoOffset public static class RNG extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public RNG(Pointer p) { super(p); }
  
    public RNG() { super((Pointer)null); allocate(); }
    private native void allocate();
    public RNG(@Cast("unsigned int") int seed) { super((Pointer)null); allocate(seed); }
    private native void allocate(@Cast("unsigned int") int seed);
    public RNG(@Const @ByRef RNG arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef RNG arg0);
    public native @ByRef @Name("operator =") RNG put(@Const @ByRef RNG arg0);
    public native Pointer generator();
  }

  // Getters for boost rng, curand, and cublas handles
  public static native @ByRef RNG rng_stream();
// #ifndef CPU_ONLY
// #endif

  // Returns the mode: running on CPU or GPU.
  public static native @Cast("caffe::Caffe::Brew") int mode();
  // The setters for the variables
  // Sets the mode. It is recommended that you don't change the mode halfway
  // into the program since that may cause allocation of pinned memory being
  // freed in a non-pinned way, which may cause problems - I haven't verified
  // it personally but better to note it here in the header file.
  public static native void set_mode(@Cast("caffe::Caffe::Brew") int mode);
  // Sets the random seed of both boost and curand
  public static native void set_random_seed(@Cast("const unsigned int") int seed);
  // Sets the device. Since we have cublas and curand stuff, set device also
  // requires us to reset those values.
  public static native void SetDevice(int device_id);
  // Prints the current GPU status.
  public static native void DeviceQuery();
  // Check if specified device is available
  public static native @Cast("bool") boolean CheckDevice(int device_id);
  // Search from start_id to the highest possible device ordinal,
  // return the ordinal of the first available device.
  public static native int FindDevice(int start_id/*=0*/);
  public static native int FindDevice();
  // Parallel training
  public static native int solver_count();
  public static native void set_solver_count(int val);
  public static native int solver_rank();
  public static native void set_solver_rank(int val);
  public static native @Cast("bool") boolean multiprocess();
  public static native void set_multiprocess(@Cast("bool") boolean val);
  public static native @Cast("bool") boolean root_solver();
}
