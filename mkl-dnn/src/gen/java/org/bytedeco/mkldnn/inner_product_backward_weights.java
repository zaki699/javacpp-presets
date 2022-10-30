// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class inner_product_backward_weights extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_weights(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_inner_product_desc_t data(); public native desc data(mkldnn_inner_product_desc_t setter);
        public desc(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(src_desc, diff_weights_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_weights_primitive_desc();
        public native @ByVal memory.primitive_desc diff_bias_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
    }

    public inner_product_backward_weights(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at diff_dst,
                @Const @ByRef memory diff_weights) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_weights); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at diff_dst,
                @Const @ByRef memory diff_weights);

    public inner_product_backward_weights(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at diff_dst,
                @Const @ByRef memory diff_weights, @Const @ByRef memory diff_bias) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_weights, diff_bias); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByVal primitive.at diff_dst,
                @Const @ByRef memory diff_weights, @Const @ByRef memory diff_bias);
}
