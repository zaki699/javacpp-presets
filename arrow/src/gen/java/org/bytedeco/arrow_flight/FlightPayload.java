// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Staging data structure for messages about to be put on the wire
 * 
 *  This structure corresponds to FlightData in the protocol. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightPayload extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FlightPayload() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlightPayload(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightPayload(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FlightPayload position(long position) {
        return (FlightPayload)super.position(position);
    }
    @Override public FlightPayload getPointer(long i) {
        return new FlightPayload((Pointer)this).offsetAddress(i);
    }

  public native @SharedPtr ArrowBuffer descriptor(); public native FlightPayload descriptor(ArrowBuffer setter);
  public native @SharedPtr ArrowBuffer app_metadata(); public native FlightPayload app_metadata(ArrowBuffer setter);
  public native @ByRef IpcPayload ipc_message(); public native FlightPayload ipc_message(IpcPayload setter);

  /** \brief Check that the payload can be written to the wire. */
  public native @ByVal Status Validate();
}
