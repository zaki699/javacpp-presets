// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

@NoOffset @Name("std::pair<op::ProducerType,op::String>") @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class ProducerOpStringPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProducerOpStringPair(Pointer p) { super(p); }
    public ProducerOpStringPair(ProducerType firstValue, OpString secondValue) { this(); put(firstValue, secondValue); }
    public ProducerOpStringPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ProducerOpStringPair put(@ByRef ProducerOpStringPair x);


    @MemberGetter public native @ByRef ProducerType first(); public native ProducerOpStringPair first(ProducerType first);
    @MemberGetter public native @ByRef OpString second();  public native ProducerOpStringPair second(OpString second);

    public ProducerOpStringPair put(ProducerType firstValue, OpString secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

