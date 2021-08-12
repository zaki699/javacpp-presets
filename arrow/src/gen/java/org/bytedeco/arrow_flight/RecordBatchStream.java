// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A basic implementation of FlightDataStream that will provide
 *  a sequence of FlightData messages to be written to a gRPC stream */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class RecordBatchStream extends FlightDataStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchStream(Pointer p) { super(p); }

  /** @param reader [in] produces a sequence of record batches
   *  @param options [in] IPC options for writing */
  public RecordBatchStream(
        @SharedPtr RecordBatchReader reader,
        @Const @ByRef(nullValue = "arrow::ipc::IpcWriteOptions::Defaults()") IpcWriteOptions options) { super((Pointer)null); allocate(reader, options); }
  private native void allocate(
        @SharedPtr RecordBatchReader reader,
        @Const @ByRef(nullValue = "arrow::ipc::IpcWriteOptions::Defaults()") IpcWriteOptions options);
  public RecordBatchStream(
        @SharedPtr RecordBatchReader reader) { super((Pointer)null); allocate(reader); }
  private native void allocate(
        @SharedPtr RecordBatchReader reader);

  public native @SharedPtr @ByVal Schema schema();
  public native @ByVal Status GetSchemaPayload(FlightPayload payload);
  public native @ByVal Status Next(FlightPayload payload);
}
