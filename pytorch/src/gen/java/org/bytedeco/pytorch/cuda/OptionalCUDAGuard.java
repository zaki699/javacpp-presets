// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


/** A variant of OptionalDeviceGuard that is specialized for CUDA.  See
 *  CUDAGuard for when you can use this. */
@Namespace("c10::cuda") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class OptionalCUDAGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalCUDAGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptionalCUDAGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OptionalCUDAGuard position(long position) {
        return (OptionalCUDAGuard)super.position(position);
    }
    @Override public OptionalCUDAGuard getPointer(long i) {
        return new OptionalCUDAGuard((Pointer)this).offsetAddress(i);
    }

  /** Create an uninitialized OptionalCUDAGuard. */
  public OptionalCUDAGuard() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Set the current CUDA device to the passed Device, if it is not nullopt. */
  public OptionalCUDAGuard(@ByVal DeviceOptional device_opt) { super((Pointer)null); allocate(device_opt); }
  private native void allocate(@ByVal DeviceOptional device_opt);

  /** Set the current CUDA device to the passed device index, if it is not
   *  nullopt */
  public OptionalCUDAGuard(@ByVal ByteOptional device_index_opt) { super((Pointer)null); allocate(device_index_opt); }
  private native void allocate(@ByVal ByteOptional device_index_opt);

  // Copy is not allowed
  
  

  // See Note [Move construction for RAII guards is tricky]
  

  // See Note [Move assignment for RAII guards is tricky]
  

  /** Sets the CUDA device to the given device, initializing the guard if it
   *  is not already initialized.  Errors if the given device is not a CUDA
   *  device. */
  public native void set_device(@ByVal Device device);

  /** Sets the CUDA device to the given device, initializing the guard if it is
   *  not already initialized.  Errors if the given device is not a CUDA device.
   *  (This method is provided for uniformity with OptionalDeviceGuard). */
  public native void reset_device(@ByVal Device device);

  /** Sets the CUDA device to the given device index, initializing the guard if
   *  it is not already initialized. */
  public native void set_index(byte device_index);

  /** Returns the device that was set immediately prior to initialization of the
   *  guard, or nullopt if the guard is uninitialized. */
  public native @ByVal DeviceOptional original_device();

  /** Returns the most recent device that was set using this device guard,
   *  either from construction, or via set_device, if the guard is initialized,
   *  or nullopt if the guard is uninitialized. */
  public native @ByVal DeviceOptional current_device();

  /** Restore the original CUDA device, resetting this guard to uninitialized
   *  state. */
  public native void reset();
}
