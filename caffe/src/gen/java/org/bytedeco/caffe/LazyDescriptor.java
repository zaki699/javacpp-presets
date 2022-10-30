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


// A class to handle the simplest cases of a lazily linked descriptor
// for a message type that isn't built at the time of cross linking,
// which is needed when a pool has lazily_build_dependencies_ set.
// Must be instantiated as mutable in a descriptor.
@Namespace("google::protobuf::internal") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class LazyDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LazyDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LazyDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LazyDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LazyDescriptor position(long position) {
        return (LazyDescriptor)super.position(position);
    }
    @Override public LazyDescriptor getPointer(long i) {
        return new LazyDescriptor((Pointer)this).offsetAddress(i);
    }

  // Init function to be called at init time of a descriptor containing
  // a LazyDescriptor.
  public native void Init();

  // Sets the value of the descriptor if it is known during the descriptor
  // building process. Not thread safe, should only be called during the
  // descriptor build process. Should not be called after SetLazy has been
  // called.
  public native void Set(@Const Descriptor descriptor);

  // Sets the information needed to lazily cross link the descriptor at a later
  // time, SetLazy is not thread safe, should be called only once at descriptor
  // build time if the symbol wasn't found and building of the file containing
  // that type is delayed because lazily_build_dependencies_ is set on the pool.
  // Should not be called after Set() has been called.
  public native void SetLazy(@StdString BytePointer name, @Const FileDescriptor file);
  public native void SetLazy(@StdString String name, @Const FileDescriptor file);

  // Returns the current value of the descriptor, thread-safe. If SetLazy(...)
  // has been called, will do a one-time cross link of the type specified,
  // building the descriptor file that contains the type if necessary.
  public native @Const Descriptor Get();
}
