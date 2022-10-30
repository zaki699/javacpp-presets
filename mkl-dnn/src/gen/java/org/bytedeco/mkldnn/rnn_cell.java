// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_rnn RNN
 *  A primitive to compute common recurrent layer.
 * 
 *  @see \ref c_api_rnn in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class rnn_cell extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rnn_cell() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rnn_cell(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rnn_cell(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rnn_cell position(long position) {
        return (rnn_cell)super.position(position);
    }
    @Override public rnn_cell getPointer(long i) {
        return new rnn_cell((Pointer)this).offsetAddress(i);
    }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_rnn_cell_desc_t c_rnn_cell_(); public native desc c_rnn_cell_(mkldnn_rnn_cell_desc_t setter);

        public desc(@Cast("mkldnn::algorithm") int kind, @Cast("mkldnn::algorithm") int activation_f) { super((Pointer)null); allocate(kind, activation_f); }
        private native void allocate(@Cast("mkldnn::algorithm") int kind, @Cast("mkldnn::algorithm") int activation_f);
        public desc(@Cast("mkldnn::algorithm") int kind) { super((Pointer)null); allocate(kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int kind);

        public native @Name("operator const mkldnn_rnn_cell_desc_t*") @Const mkldnn_rnn_cell_desc_t as_mkldnn_rnn_cell_desc_t();

        public native @Cast("mkldnn::algorithm") int get_cell_kind();
        public native @Cast("mkldnn::algorithm") int get_activation();

        public native float get_alpha();
        public native void set_alpha(float alpha);

        public native float get_clipping();
        public native void set_clipping(float clipping);

        public native int get_gates_count();
        public native int get_state_count();
    }
}
