// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** PReLU backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class prelu_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public prelu_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public prelu_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public prelu_backward position(long position) {
        return (prelu_backward)super.position(position);
    }
    @Override public prelu_backward getPointer(long i) {
        return new prelu_backward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for a PReLU backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_prelu_desc_t data(); public native desc data(dnnl_prelu_desc_t setter);

        /** Constructs a descriptor for a PReLU backward propagation
         *  primitive.
         * 
         *  @param data_desc Source and destination memory descriptors.
         *  @param weight_desc Alpha parameters memory descriptor.
         *  @param diff_data_desc Diff source and destination memory
         *      descriptors.
         *  @param diff_weights_desc Diff alpha parameters memory descriptor. */
        public desc(@Const @ByRef memory.desc data_desc, @Const @ByRef memory.desc weight_desc,
                        @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc diff_weights_desc) { super((Pointer)null); allocate(data_desc, weight_desc, diff_data_desc, diff_weights_desc); }
        private native void allocate(@Const @ByRef memory.desc data_desc, @Const @ByRef memory.desc weight_desc,
                        @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc diff_weights_desc);
    }

    /** Primitive descriptor for prelu backward propagation. */
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

        /** Constructs a primitive descriptor for a PReLU backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a PReLU backward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a PReLU forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a PReLU backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a PReLU backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a PReLU forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef prelu_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a prelu backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a prelu backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public prelu_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a prelu backward propagation primitive.
     *  @param pd Primitive descriptor for a prelu backward propagation
     *      primitive. */
    public prelu_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
