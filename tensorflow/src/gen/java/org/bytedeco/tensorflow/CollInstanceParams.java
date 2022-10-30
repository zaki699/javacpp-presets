// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Data common to all members of a collective instance.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollInstanceParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CollInstanceParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollInstanceParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollInstanceParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CollInstanceParams position(long position) {
        return (CollInstanceParams)super.position(position);
    }
    @Override public CollInstanceParams getPointer(long i) {
        return new CollInstanceParams((Pointer)this).offsetAddress(i);
    }

  // Identifies all participating graph nodes.
  public native int instance_key(); public native CollInstanceParams instance_key(int setter);
  public native @Cast("tensorflow::CollectiveType") int type(); public native CollInstanceParams type(int setter);
  public native @Cast("tensorflow::DataType") int data_type(); public native CollInstanceParams data_type(int setter);
  public native @ByRef TensorShape shape(); public native CollInstanceParams shape(TensorShape setter);
  // Fully qualified name of device for each member, in default rank order.
  public native @ByRef StringVector device_names(); public native CollInstanceParams device_names(StringVector setter);
  // Task name prefix of corresponding device name.
  public native @ByRef StringVector task_names(); public native CollInstanceParams task_names(StringVector setter);
  // True if every task has the same number of devices.
  public native @Cast("bool") boolean same_num_devices_per_task(); public native CollInstanceParams same_num_devices_per_task(boolean setter);
  // Task -> number of devices on that task.
  public native @ByRef StringIntUnorderedMap num_devices_per_task(); public native CollInstanceParams num_devices_per_task(StringIntUnorderedMap setter);
  // If passed in to GPUOptions in ConfigProto, defines a good ring order for
  // GPUs.  Assumes same GPU configuration at each worker.
  public native @StdString BytePointer gpu_ring_order(); public native CollInstanceParams gpu_ring_order(BytePointer setter);
  public native @ByRef CollImplDetails impl_details(); public native CollInstanceParams impl_details(CollImplDetails setter);
  public native @StdString BytePointer ToString();
  public native @ByRef @Name("operator =") CollInstanceParams put(@Const @ByRef CollInstanceParams other);
}
