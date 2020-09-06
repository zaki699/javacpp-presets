// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WorkerCacheInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WorkerCacheInterface(Pointer p) { super(p); }


  // Updates *workers with strings naming the remote worker tasks to
  // which open channels have been established.
  public native void ListWorkers(StringVector workers);
  public native void ListWorkersInJob(@StdString BytePointer job_name,
                                  StringVector workers);
  public native void ListWorkersInJob(@StdString String job_name,
                                  StringVector workers);

  // If "target" names a remote task for which an RPC channel exists
  // or can be constructed, returns a pointer to a WorkerInterface object
  // wrapping that channel. The returned value must be destroyed by
  // calling `this->ReleaseWorker(target, ret)`
  public native WorkerInterface GetOrCreateWorker(@StdString BytePointer target);
  public native WorkerInterface GetOrCreateWorker(@StdString String target);

  // Release a worker previously returned by this->GetOrCreateWorker(target).
  //
  // TODO(jeff,sanjay): Consider moving target into WorkerInterface.
  // TODO(jeff,sanjay): Unify all worker-cache impls and factor out a
  //                    per-rpc-subsystem WorkerInterface creator.
  public native void ReleaseWorker(@StdString BytePointer target, WorkerInterface worker);
  public native void ReleaseWorker(@StdString String target, WorkerInterface worker);

  // Set *locality with the DeviceLocality of the specified remote device
  // within its local environment.  Returns true if *locality
  // was set, using only locally cached data.  Returns false
  // if status data for that device was not available.  Never blocks.
  public native @Cast("bool") boolean GetDeviceLocalityNonBlocking(@StdString BytePointer device,
                                              DeviceLocality locality);
  public native @Cast("bool") boolean GetDeviceLocalityNonBlocking(@StdString String device,
                                              DeviceLocality locality);

  // Set *locality with the DeviceLocality of the specified remote device
  // within its local environment.  Callback gets Status::OK if *locality
  // was set.
  public native void GetDeviceLocalityAsync(@StdString BytePointer device,
                                        DeviceLocality locality,
                                        @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
  public native void GetDeviceLocalityAsync(@StdString String device,
                                        DeviceLocality locality,
                                        @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  // Build and return a EagerClientCache object wrapping that channel.
  public native @ByVal Status GetEagerClientCache(
        @UniquePtr EagerClientCache eager_client_cache);

  // Start/stop logging activity.
  public native void SetLogging(@Cast("bool") boolean active);

  // Discard any saved log data.
  public native void ClearLogs();

  // Return logs for the identified step in *ss.  Any returned data will no
  // longer be stored.
  public native @Cast("bool") boolean RetrieveLogs(@Cast("tensorflow::int64") long step_id, StepStats ss);
}
