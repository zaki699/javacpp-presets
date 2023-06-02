// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ConvolutionLayerInt8 extends BaseConvolutionLayer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ConvolutionLayerInt8() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ConvolutionLayerInt8(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ConvolutionLayerInt8(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ConvolutionLayerInt8 position(long position) {
            return (ConvolutionLayerInt8)super.position(position);
        }
        @Override public ConvolutionLayerInt8 getPointer(long i) {
            return new ConvolutionLayerInt8((Pointer)this).offsetAddress(i);
        }
    
        public native int input_zp(); public native ConvolutionLayerInt8 input_zp(int setter);
        public native int output_zp(); public native ConvolutionLayerInt8 output_zp(int setter);
        public native float input_sc(); public native ConvolutionLayerInt8 input_sc(float setter);
        public native float output_sc(); public native ConvolutionLayerInt8 output_sc(float setter);

        // quantization type flag. The perChannel default is true, that means it contains the parameters
        // of per-Channel quantization. Otherwise, that means this layer contains per-Tensor quantized parameters.
        public native @Cast("bool") boolean per_channel(); public native ConvolutionLayerInt8 per_channel(boolean setter);
        public native @Cast("bool") boolean useWinograd(); public native ConvolutionLayerInt8 useWinograd(boolean setter); // Flag whether to use Winograd to speed up 3x3 convolution.
        public static native @Ptr BaseConvolutionLayer create(@Const @ByRef LayerParams params);
    }
