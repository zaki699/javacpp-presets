// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

/** \addtogroup dnn
 *  \{
<p>
/** \defgroup dnnLayerList Partial List of Implemented Layers
  \{
  This subsection of dnn module contains information about built-in layers and their descriptions.
  <p>
  Classes listed here, in fact, provides C++ API for creating instances of built-in layers.
  In addition to this way of layers instantiation, there is a more common factory API (see \ref dnnLayerFactory), it allows to create layers dynamically (by name) and register new ones.
  You can use both API, but factory API is less convenient for native C++ programming and basically designed for use inside importers (see \ref readNetFromCaffe(), \ref readNetFromTorch(), \ref readNetFromTensorflow()).
  <p>
  Built-in layers partially reproduce functionality of corresponding Caffe and Torch7 layers.
  In particular, the following layers and Caffe importer were tested to reproduce <a href="http://caffe.berkeleyvision.org/tutorial/layers.html">Caffe</a> functionality:
  - Convolution
  - Deconvolution
  - Pooling
  - InnerProduct
  - TanH, ReLU, Sigmoid, BNLL, Power, AbsVal
  - Softmax
  - Reshape, Flatten, Slice, Split
  - LRN
  - MVN
  - Dropout (since it does nothing on forward pass -))
*/

    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class BlankLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BlankLayer(Pointer p) { super(p); }
    
        public static native @Ptr Layer create(@Const @ByRef LayerParams params);
    }
