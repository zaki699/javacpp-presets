// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;



@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class LBPHFaceRecognizer extends FaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBPHFaceRecognizer(Pointer p) { super(p); }

    /** @see setGridX */
    public native int getGridX();
    /** \copybrief getGridX @see getGridX */
    public native void setGridX(int val);
    /** @see setGridY */
    public native int getGridY();
    /** \copybrief getGridY @see getGridY */
    public native void setGridY(int val);
    /** @see setRadius */
    public native int getRadius();
    /** \copybrief getRadius @see getRadius */
    public native void setRadius(int val);
    /** @see setNeighbors */
    public native int getNeighbors();
    /** \copybrief getNeighbors @see getNeighbors */
    public native void setNeighbors(int val);
    /** @see setThreshold */
    public native @Override double getThreshold();
    /** \copybrief getThreshold @see getThreshold */
    public native @Override void setThreshold(double val);
    public native @ByVal MatVector getHistograms();
    public native @ByVal Mat getLabels();

    /**
    @param radius The radius used for building the Circular Local Binary Pattern. The greater the
    radius, the smoother the image but more spatial information you can get.
    @param neighbors The number of sample points to build a Circular Local Binary Pattern from. An
    appropriate value is to use {@code 8} sample points. Keep in mind: the more sample points you include,
    the higher the computational cost.
    @param grid_x The number of cells in the horizontal direction, 8 is a common value used in
    publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
    feature vector.
    @param grid_y The number of cells in the vertical direction, 8 is a common value used in
    publications. The more cells, the finer the grid, the higher the dimensionality of the resulting
    feature vector.
    @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
    is larger than the threshold, this method returns -1.
    <p>
    ### Notes:
    <p>
    -   The Circular Local Binary Patterns (used in training and prediction) expect the data given as
        grayscale images, use cvtColor to convert between the color spaces.
    -   This model supports updating.
    <p>
    ### Model internal data:
    <p>
    -   radius see LBPHFaceRecognizer::create.
    -   neighbors see LBPHFaceRecognizer::create.
    -   grid_x see LLBPHFaceRecognizer::create.
    -   grid_y see LBPHFaceRecognizer::create.
    -   threshold see LBPHFaceRecognizer::create.
    -   histograms Local Binary Patterns Histograms calculated from the given training data (empty if
        none was given).
    -   labels Labels corresponding to the calculated Local Binary Patterns Histograms.
     */
    public static native @Ptr LBPHFaceRecognizer create(int radius/*=1*/, int neighbors/*=8*/, int grid_x/*=8*/, int grid_y/*=8*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr LBPHFaceRecognizer create();
}
