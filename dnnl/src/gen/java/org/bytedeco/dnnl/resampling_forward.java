// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_matmul
 <p>
 *  \addtogroup dnnl_api_resampling Resampling
 * 
 *  A primitive to compute resampling operation on 1D, 2D or 3D data tensor
 *  using Nearest Neighbor, or Linear (Bilinear, Trilinear) interpolation
 *  method.
 * 
 *  @see \ref dev_guide_resampling in developer guide
 * 
 *  \{
 <p>
 *  Resampling forward propagation. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class resampling_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public resampling_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public resampling_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public resampling_forward position(long position) {
        return (resampling_forward)super.position(position);
    }
    @Override public resampling_forward getPointer(long i) {
        return new resampling_forward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for resampling forward propagation. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        public native @ByRef dnnl_resampling_desc_t data(); public native desc data(dnnl_resampling_desc_t setter);

        /** Constructs a descriptor for a resampling forward propagation
         *  primitive using source and destination memory descriptors.
         * 
         *  \note
         *      Destination memory descriptor may be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param aalgorithm resampling algorithm kind: either
         *      #dnnl::algorithm::resampling_nearest, or
         *      #dnnl::algorithm::resampling_linear
         *  @param src_desc Source memory descriptor.
         *  @param dst_desc Destination memory descriptor. */
        
        ///
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, dst_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc dst_desc);

        /** Constructs a descriptor for a resampling forward propagation
         *  primitive using source memory descriptor and factors.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param aalgorithm resampling algorithm kind: either
         *      #dnnl::algorithm::resampling_nearest, or
         *      #dnnl::algorithm::resampling_linear
         *  @param factors Vector of scaling factors for spatial dimension.
         *  @param src_desc Source memory descriptor. */
        
        ///
        ///
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc src_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc src_desc);
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector float[] factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector float[] factors,
                        @Const @ByRef memory.desc src_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc src_desc);
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc src_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector float[] factors,
                        @Const @ByRef memory.desc src_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector float[] factors,
                        @Const @ByRef memory.desc src_desc);

        /** Constructs a descriptor for a resampling forward propagation
         *  primitive.
         * 
         *  \note
         *      The destination memory descriptor may be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param aalgorithm resampling algorithm kind: either
         *      #dnnl::algorithm::resampling_nearest, or
         *      #dnnl::algorithm::resampling_linear
         *  @param factors Vector of scaling factors for spatial dimension.
         *  @param src_desc Source memory descriptor.
         *  @param dst_desc Destination memory descriptor. */
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatPointer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatPointer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatBuffer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatBuffer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector float[] factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector float[] factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatPointer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector FloatPointer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatBuffer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm aalgorithm,
                        @StdVector FloatBuffer factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector float[] factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, aalgorithm, factors, src_desc, dst_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int aalgorithm,
                        @StdVector float[] factors, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc);
    }

    /** Primitive descriptor for a resampling forward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
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
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a resampling forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a resampling forward propagation
         *  primitive.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a resampling forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a resampling forward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, attr, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a resampling forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a resampling forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public resampling_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a resampling forward propagation primitive.
     *  @param pd Primitive descriptor for a resampling forward propagation
     *      primitive. */
    public resampling_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
