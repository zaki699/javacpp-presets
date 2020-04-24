// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_eltwise
 <p>
 *  \addtogroup dnnl_api_softmax Softmax
 * 
 *  A primitive to perform softmax.
 * 
 *  @see \ref dev_guide_softmax in developer guide
 * 
 *  \{
 <p>
 *  Softmax forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class softmax_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public softmax_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public softmax_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public softmax_forward position(long position) {
        return (softmax_forward)super.position(position);
    }

    /** Descriptor for a softmax forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public desc position(long position) {
            return (desc)super.position(position);
        }
    
        public native @ByRef dnnl_softmax_desc_t data(); public native desc data(dnnl_softmax_desc_t setter);

        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        ///
        public desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a descriptor for a softmax forward propagation
         *  primitive.
         * 
         *  Inputs:
         *   - {@code src} (#dnnl::primitive_desc_base::src_desc({@code 0}))
         * 
         *  Outputs:
         *   - {@code dst} (#dnnl::primitive_desc_base::dst_desc({@code 0}))
         * 
         *  @param prop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param data_desc Source and destination memory descriptor.
         *  @param softmax_axis Axis over which softmax is computed. */
        public desc(prop_kind prop_kind, @Const @ByRef memory.desc data_desc,
                        int softmax_axis) { super((Pointer)null); allocate(prop_kind, data_desc, softmax_axis); }
        private native void allocate(prop_kind prop_kind, @Const @ByRef memory.desc data_desc,
                        int softmax_axis);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc data_desc,
                        int softmax_axis) { super((Pointer)null); allocate(prop_kind, data_desc, softmax_axis); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Const @ByRef memory.desc data_desc,
                        int softmax_axis);
    }

    /** Primitive descriptor for a softmax forward propagation primitive. */
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
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a softmax forward
         *  propagation primitive.
         * 
         *  @param desc descriptor for a softmax forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for a softmax forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for a softmax forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, attr, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for a softmax forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a softmax forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public softmax_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a softmax forward propagation primitive.
     *  @param pd Primitive descriptor for a softmax forward propagation
     *      primitive. */
    public softmax_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
