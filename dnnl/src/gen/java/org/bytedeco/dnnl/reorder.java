// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_primitives_common
 <p>
 *  \addtogroup dnnl_api_reorder Reorder
 * 
 *  A primitive to copy data between two memory objects. This primitive is
 *  typically used to change the way the data is laid out in memory.
 * 
 *  @see \ref dev_guide_reorder in developer guide
 * 
 *  \{
 <p>
 *  Reorder primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class reorder extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public reorder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public reorder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public reorder position(long position) {
        return (reorder)super.position(position);
    }
    @Override public reorder getPointer(long i) {
        return new reorder((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a reorder primitive. */
    public static class primitive_desc extends primitive_desc_base {
        static { Loader.load(); }
    
            
                
                    public primitive_desc() { super((Pointer)null); allocate(); }
                    private native void allocate();
                    public primitive_desc(@Const @ByRef primitive_desc arg0) { super((Pointer)null); allocate(arg0); }
                    private native void allocate(@Const @ByRef primitive_desc arg0);
                    
                    ///
                    public primitive_desc(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
                    private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
                    public primitive_desc(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
                    private native void allocate(dnnl_primitive_desc t);
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    

        /** Default constructor. Produces an empty object. */

        /** Constructs a primitive descriptor for reorder primitive.
         * 
         *  \note
         *      If \p allow_empty is true, the constructor does not throw if a
         *      primitive descriptor cannot be created.
         * 
         *  @param src_engine Engine on which the source memory object will be
         *      located.
         *  @param src_md Source memory descriptor.
         *  @param dst_engine Engine on which the destination memory object
         *      will be located.
         *  @param dst_md Destination memory descriptor.
         *  @param attr Primitive attributes to use (optional).
         *  @param allow_empty A flag signifying whether construction is allowed
         *      to fail without throwing an exception. In this case an empty
         *      object will be produced. This flag is optional and defaults to
         *      false. */
        
        ///
        public primitive_desc(@Const @ByRef engine src_engine, @Const @ByRef memory.desc src_md,
                        @Const @ByRef engine dst_engine, @Const @ByRef memory.desc dst_md,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(src_engine, src_md, dst_engine, dst_md, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine src_engine, @Const @ByRef memory.desc src_md,
                        @Const @ByRef engine dst_engine, @Const @ByRef memory.desc dst_md,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine src_engine, @Const @ByRef memory.desc src_md,
                        @Const @ByRef engine dst_engine, @Const @ByRef memory.desc dst_md) { super((Pointer)null); allocate(src_engine, src_md, dst_engine, dst_md); }
        private native void allocate(@Const @ByRef engine src_engine, @Const @ByRef memory.desc src_md,
                        @Const @ByRef engine dst_engine, @Const @ByRef memory.desc dst_md);

        /** Constructs a primitive descriptor for reorder primitive.
         * 
         *  @param src Source memory object. It is used to obtain the source
         *      memory descriptor and engine.
         *  @param dst Destination memory object. It is used to obtain the
         *      destination memory descriptor and engine.
         *  @param attr Primitive attributes to use (optional).
         *  @param allow_empty A flag signifying whether construction is allowed
         *      to fail without throwing an exception. In this case an empty
         *      object will be produced. This flag is optional and defaults to
         *      false. */
        
        ///
        public primitive_desc(@Const @ByRef memory src, @Const @ByRef memory dst,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(src, dst, attr, allow_empty); }
        private native void allocate(@Const @ByRef memory src, @Const @ByRef memory dst,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef memory src, @Const @ByRef memory dst) { super((Pointer)null); allocate(src, dst); }
        private native void allocate(@Const @ByRef memory src, @Const @ByRef memory dst);

        /** Constructs a primitive descriptor for reorder primitive from a C
         *  API primitive descriptor which must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for reorder primitive. */
        

        /** Returns the engine on which the source memory is allocated.
         *  @return The engine on which the source memory is allocated. */
        public native @ByVal engine get_src_engine();

        /** Returns the engine on which the destination memory is allocated.
         *  @return The engine on which the destination memory is allocated. */
        public native @ByVal engine get_dst_engine();

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public reorder() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a reorder primitive.
     *  @param pd Primitive descriptor for reorder primitive. */
    public reorder(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a reorder primitive from a cache blob.
     *  @param pd Primitive descriptor for reorder primitive.
     *  @param cache_blob Cache blob. */
    
    ///
    public reorder(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public reorder(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public reorder(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);

    /** Constructs a reorder primitive that would reorder data between memory
     *  objects having the same memory descriptors as memory objects \p src and
     *  \p dst.
     * 
     *  @param src Source memory object.
     *  @param dst Destination memory object.
     *  @param attr Primitive attributes to use (optional). */
    public reorder(@Const @ByRef memory src, @Const @ByRef memory dst,
                @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr) { super((Pointer)null); allocate(src, dst, attr); }
    private native void allocate(@Const @ByRef memory src, @Const @ByRef memory dst,
                @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr);
    public reorder(@Const @ByRef memory src, @Const @ByRef memory dst) { super((Pointer)null); allocate(src, dst); }
    private native void allocate(@Const @ByRef memory src, @Const @ByRef memory dst);

    
    ///

    /** Executes the reorder primitive.
     * 
     *  @param astream Stream object. The stream must belong to the same engine
     *      as the primitive.
     *  @param src Source memory object.
     *  @param dst Destination memory object. */
    public native void execute(@Const @ByRef stream astream, @ByRef memory src, @ByRef memory dst);
}
