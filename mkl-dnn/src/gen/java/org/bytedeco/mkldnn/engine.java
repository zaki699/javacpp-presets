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
 *  \addtogroup cpp_api_engine Engine
 *  Engine operations.
 * 
 *  @see \ref c_api_engine in \ref c_api
 *  \{ */

// #ifndef DOXYGEN_SHOULD_SKIP_THIS
// #endif

/** An execution engine. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class engine extends mkldnn_engine_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public engine(Pointer p) { super(p); }

    // gcc bug??? using handle::handle;

    /** Kinds of engines. */
    /** enum mkldnn::engine::kind */
    public static final int
        /** An unspecified engine */
        any = mkldnn_any_engine,
        /** CPU engine */
        cpu = mkldnn_cpu;

    /** Returns the number of engines of a certain kind.
     * 
     *  @param akind The kind of engines to count. */

    
    ///
    public static native @Cast("size_t") long get_count(@Cast("mkldnn::engine::kind") int akind);

    /** Constructs an engine.
     * 
     *  @param akind The kind of engine to construct.
     *  @param index The index of the engine. Must be less than the value
     *               returned by #get_count() for this particular kind of engine. */

    public engine(@Cast("mkldnn::engine::kind") int akind, @Cast("size_t") long index) { super((Pointer)null); allocate(akind, index); }
    private native void allocate(@Cast("mkldnn::engine::kind") int akind, @Cast("size_t") long index);

    public engine(mkldnn_engine aengine) { super((Pointer)null); allocate(aengine); }
    private native void allocate(mkldnn_engine aengine);

    public engine(@Const @ByRef mkldnn_primitive_desc_handle pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef mkldnn_primitive_desc_handle pd);
}
