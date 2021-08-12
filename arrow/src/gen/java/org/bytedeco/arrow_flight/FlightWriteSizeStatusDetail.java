// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Indicate that the client attempted to write a message
 *      larger than the soft limit set via write_size_limit_bytes. */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightWriteSizeStatusDetail extends StatusDetail {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightWriteSizeStatusDetail(Pointer p) { super(p); }

  public FlightWriteSizeStatusDetail(@Cast("int64_t") long _limit, @Cast("int64_t") long actual) { super((Pointer)null); allocate(_limit, actual); }
  private native void allocate(@Cast("int64_t") long _limit, @Cast("int64_t") long actual);
  public native String type_id();
  public native @StdString String ToString();
  public native @Cast("int64_t") @Name("limit") long _limit();
  public native @Cast("int64_t") long actual();

  /** \brief Extract this status detail from a status, or return
   *      nullptr if the status doesn't contain this status detail. */
  public static native @SharedPtr FlightWriteSizeStatusDetail UnwrapStatus(
        @Const @ByRef Status status);
}
