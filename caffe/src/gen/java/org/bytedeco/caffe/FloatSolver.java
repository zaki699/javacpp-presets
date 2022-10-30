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


/**
 * \brief An interface for classes that perform optimization on Net%s.
 *
 * Requires implementation of ApplyUpdate to compute a parameter update
 * given the current state of the Net parameters.
 */
@Name("caffe::Solver<float>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatSolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatSolver(Pointer p) { super(p); }

  public FloatSolver(@Const @ByRef SolverParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef SolverParameter param);
  public FloatSolver(@Const @StdString @ByRef BytePointer param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef BytePointer param_file);
  public FloatSolver(@Const @StdString @ByRef String param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef String param_file);
  public native void Init(@Const @ByRef SolverParameter param);
  public native void InitTrainNet();
  public native void InitTestNets();

  // Client of the Solver optionally may call this in order to set the function
  // that the solver uses to see what action it should take (e.g. snapshot or
  // exit training early).
  public native void SetActionFunction(@ByVal ActionCallback func);
  public native @Cast("caffe::SolverAction::Enum") int GetRequestedAction();
  // The main entry of the solver function. In default, iter will be zero. Pass
  // in a non-zero iter number to resume training for a pre-trained net.
  @Virtual public native void Solve(@Cast("const char*") BytePointer resume_file/*=NULL*/);
  public void Solve(String resume_file) { Solve(new BytePointer(resume_file)); }
  public void Solve() { Solve((BytePointer)null); }
  public native void Step(int iters);
  // The Restore method simply dispatches to one of the
  // RestoreSolverStateFrom___ protected methods. You should implement these
  // methods to restore the state from the appropriate snapshot type.
  public native void Restore(@Cast("const char*") BytePointer resume_file);
  public native void Restore(String resume_file);
  // The Solver::Snapshot function implements the basic snapshotting utility
  // that stores the learned net. You should implement the SnapshotSolverState()
  // function that produces a SolverState protocol buffer that needs to be
  // written to disk together with the learned net.
  public native void Snapshot();
  public native @Const @ByRef SolverParameter param();
  public native @SharedPtr @ByVal FloatNet net();
  public native @Const @ByRef FloatNetSharedVector test_nets();
  public native int iter();

  // Invoked at specific points during an iteration
  public static class Callback extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Callback() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Callback(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Callback(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Callback position(long position) {
          return (Callback)super.position(position);
      }
      @Override public Callback getPointer(long i) {
          return new Callback((Pointer)this).offsetAddress(i);
      }
  
    @Virtual(true) protected native void on_start();
    @Virtual(true) protected native void on_gradients_ready();
  }
  public native @Const @ByRef FloatCallbackVector callbacks();
  public native void add_callback(Callback value);

  public native void CheckSnapshotWritePermissions();
  /**
   * \brief Returns the solver type.
   */
  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual(true) protected native void ApplyUpdate();
  @Virtual(true) protected native void SnapshotSolverState(@Const @StdString @ByRef BytePointer model_filename);
  @Virtual(true) protected native void RestoreSolverStateFromHDF5(@Const @StdString @ByRef BytePointer state_file);
  @Virtual(true) protected native void RestoreSolverStateFromBinaryProto(@Const @StdString @ByRef BytePointer state_file);
}
