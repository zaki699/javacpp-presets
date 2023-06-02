// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_superres;

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
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;

import static org.bytedeco.opencv.global.opencv_superres.*;



        @Name("cv::superres::FarnebackOpticalFlow") @Properties(inherit = org.bytedeco.opencv.presets.opencv_superres.class)
public class SuperResFarnebackOpticalFlow extends DenseOpticalFlowExt {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SuperResFarnebackOpticalFlow(Pointer p) { super(p); }
        
            /** @see setPyrScale */
            public native double getPyrScale();
            /** \copybrief getPyrScale @see getPyrScale */
            public native void setPyrScale(double val);
            /** @see setLevelsNumber */
            public native int getLevelsNumber();
            /** \copybrief getLevelsNumber @see getLevelsNumber */
            public native void setLevelsNumber(int val);
            /** @see setWindowSize */
            public native int getWindowSize();
            /** \copybrief getWindowSize @see getWindowSize */
            public native void setWindowSize(int val);
            /** @see setIterations */
            public native int getIterations();
            /** \copybrief getIterations @see getIterations */
            public native void setIterations(int val);
            /** @see setPolyN */
            public native int getPolyN();
            /** \copybrief getPolyN @see getPolyN */
            public native void setPolyN(int val);
            /** @see setPolySigma */
            public native double getPolySigma();
            /** \copybrief getPolySigma @see getPolySigma */
            public native void setPolySigma(double val);
            /** @see setFlags */
            public native int getFlags();
            /** \copybrief getFlags @see getFlags */
            public native void setFlags(int val);
        }
