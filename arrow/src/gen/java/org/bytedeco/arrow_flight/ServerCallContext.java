// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Call state/contextual data. */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class ServerCallContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServerCallContext(Pointer p) { super(p); }

  /** \brief The name of the authenticated peer (may be the empty string) */
  public native @StdString String peer_identity();
  /** \brief The peer address (not validated) */
  public native @StdString String peer();
  /** \brief Look up a middleware by key. Do not maintain a reference
   *  to the object beyond the request body.
   *  @return The middleware, or nullptr if not found. */
  public native ServerMiddleware GetMiddleware(@StdString String key);
  public native ServerMiddleware GetMiddleware(@StdString BytePointer key);
  /** \brief Check if the current RPC has been cancelled (by the client, by
   *  a network error, etc.). */
  public native @Cast("bool") boolean is_cancelled();
}
