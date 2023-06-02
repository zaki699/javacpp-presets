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
public class HardSigmoidLayer extends ActivationLayer {
        static { Loader.load(); }
        /** Default native constructor. */
        public HardSigmoidLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public HardSigmoidLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public HardSigmoidLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public HardSigmoidLayer position(long position) {
            return (HardSigmoidLayer)super.position(position);
        }
        @Override public HardSigmoidLayer getPointer(long i) {
            return new HardSigmoidLayer((Pointer)this).offsetAddress(i);
        }
    
        public native float alpha(); public native HardSigmoidLayer alpha(float setter);
        public native float beta(); public native HardSigmoidLayer beta(float setter);

        public static native @Ptr HardSigmoidLayer create(@Const @ByRef LayerParams params);
    }
