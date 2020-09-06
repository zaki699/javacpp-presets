// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Local response normalization (LRN) backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class lrn_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lrn_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lrn_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lrn_backward position(long position) {
        return (lrn_backward)super.position(position);
    }
    @Override public lrn_backward getPointer(long i) {
        return new lrn_backward(this).position(position + i);
    }

    /** Descriptor for an LRN backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_lrn_desc_t data(); public native desc data(dnnl_lrn_desc_t setter);

        /** Constructs a descriptor for an LRN backward propagation primitive.
         * 
         *  @param aalgorithm LRN algorithm kind: either
         *      #dnnl::algorithm::lrn_across_channels, or
         *      #dnnl::algorithm::lrn_within_channel.
         *  @param diff_data_desc Diff source and diff destination memory
         *      descriptor.
         *  @param data_desc Source memory descriptor.
         *  @param local_size Regularization local size.
         *  @param alpha The alpha regularization parameter.
         *  @param beta The beta regularization parameter.
         *  @param k The k regularization parameter. */
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta, k); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta, k); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
    }

    /** Primitive descriptor for an LRN backward propagation primitive. */
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
            return new primitive_desc(this).position(position + i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an LRN backward propagation
         *  primitive.
         * 
         *  @param adesc Descriptor for an LRN backward propagation primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an LRN forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an LRN backward propagation
         *  primitive.
         * 
         *  @param adesc Descriptor for an LRN backward propagation primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an LRN forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an LRN backward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for an LRN backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();

        /** \copydoc dnnl::primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();
    }

    /** Default constructor. Produces an empty object. */
    public lrn_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an LRN backward propagation primitive.
     *  @param pd Primitive descriptor for an LRN backward propagation
     *      primitive. */
    public lrn_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
