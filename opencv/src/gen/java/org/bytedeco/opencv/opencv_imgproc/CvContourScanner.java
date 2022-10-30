// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/*
Internal structure that is used for sequential retrieving contours from the image.
It supports both hierarchical and plane variants of Suzuki algorithm.
*/
@Name("_CvContourScanner") @Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvContourScanner extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvContourScanner() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvContourScanner(Pointer p) { super(p); }
}
