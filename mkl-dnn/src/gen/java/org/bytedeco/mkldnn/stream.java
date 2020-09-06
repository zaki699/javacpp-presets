// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \} Primitives
 <p>
 *  \addtogroup cpp_api_stream Stream
 *  Execution stream operations.
 * 
 *  @see \ref c_api_stream in \ref c_api
 *  \{ */

// #ifndef DOXYGEN_SHOULD_SKIP_THIS
// #endif

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class stream extends mkldnn_stream_handle {
    static { Loader.load(); }

    
        public stream(mkldnn_stream t/*=0*/, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
        private native void allocate(mkldnn_stream t/*=0*/, @Cast("bool") boolean weak/*=false*/);
        public stream() { super((Pointer)null); allocate(); }
        private native void allocate();
    
        public stream(@Const @ByRef stream other) { super((Pointer)null); allocate(other); }
        private native void allocate(@Const @ByRef stream other);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public stream(Pointer p) { super(p); }


    /** enum mkldnn::stream::kind */
    public static final int any = mkldnn_any_stream,
        eager = mkldnn_eager,
        lazy = mkldnn_lazy,
        eager_nostore = mkldnn_eager_nostore;

    public static native @Cast("mkldnn_stream_kind_t") int convert_to_c(@Cast("mkldnn::stream::kind") int akind);
    /** Constructs a stream. */
    
    ///
    public stream(@Cast("mkldnn::stream::kind") int akind) { super((Pointer)null); allocate(akind); }
    private native void allocate(@Cast("mkldnn::stream::kind") int akind);

    /** Submits a vector of primitives to a stream for computations.
     * 
     *  @param primitives The vector of primitives to submit.
     *  @return The stream. */
    
    ///
    public native @ByRef stream submit(@ByVal primitive_vector primitives);

    /** Waits for all computations submitted to the stream to complete.
     * 
     *  @param block Specifies whether the operation should wait indefinitely or
     *               return immediately.
     *  @return \c true if all computations completed.
     *  @return \c false if not all computations completed. */
    public native @Cast("bool") @Name("wait") boolean _wait(@Cast("bool") boolean block/*=true*/);
    public native @Cast("bool") @Name("wait") boolean _wait();

    public native @ByRef stream rerun();
}
