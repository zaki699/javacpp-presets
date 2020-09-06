// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_binary
 <p>
 *  \addtogroup dnnl_api_matmul Matrix Multiplication
 * 
 *  A primitive to perform matrix-matrix multiplication. The batched mode
 *  is supported with 3D tensors.
 * 
 *  @see \ref dev_guide_matmul in developer guide
 * 
 * 
 *  \{
 <p>
 *  Matrix multiplication (matmul) primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class matmul extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public matmul(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public matmul(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public matmul position(long position) {
        return (matmul)super.position(position);
    }
    @Override public matmul getPointer(long i) {
        return new matmul(this).position(position + i);
    }

    /** Descriptor for a matmul primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_matmul_desc_t data(); public native desc data(dnnl_matmul_desc_t setter);

        /** Constructs a descriptor for a matmul primitive.
         * 
         *  @param src_desc Memory descriptor for source (matrix A).
         *  @param weights_desc Memory descriptor for weights (matrix B).
         *  @param dst_desc Memory descriptor for destination (matrix C). */
        
        ///
        public desc(@Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(src_desc, weights_desc, dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc);

        /** Constructs a descriptor for a matmul primitive.
         * 
         *  @param src_desc Memory descriptor for source (matrix A).
         *  @param weights_desc Memory descriptor for weights (matrix B).
         *  @param dst_desc Memory descriptor for destination (matrix C).
         *  @param bias_desc Memory descriptor for bias. */
        public desc(@Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc, @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc, @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc, @Const @ByRef memory.desc dst_desc);
    }

    /** Primitive descriptor for a matmul primitive. */
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

        /** Constructs a primitive descriptor for a matmul primitive.
         * 
         *  @param adesc Descriptor for a matmul primitive.
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

        /** Constructs a primitive descriptor for a matmul primitive.
         * 
         *  @param adesc Descriptor for a matmul primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
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

        /** Constructs a primitive descriptor for a matmul primitive from a C
         *  API primitive descriptor that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a matmul primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal memory.desc weights_desc();

        /** \copydoc dnnl::convolution_forward::primitive_desc::bias_desc()const */
        public native @ByVal memory.desc bias_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public matmul() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a matmul primitive.
     *  @param pd Primitive descriptor for a matmul primitive. */
    public matmul(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
