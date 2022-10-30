// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_ml.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

public class opencv_ml extends org.bytedeco.opencv.presets.opencv_ml {
    static { Loader.load(); }

// Parsed from <opencv2/ml.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000, Intel Corporation, all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Copyright (C) 2014, Itseez Inc, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_ML_HPP
// #define OPENCV_ML_HPP

// #ifdef __cplusplus
// #  include "opencv2/core.hpp"
// #endif

// #ifdef __cplusplus

// #include <float.h>
// #include <map>
// #include <iostream>

/**
  \defgroup ml Machine Learning
  <p>
  The Machine Learning Library (MLL) is a set of classes and functions for statistical
  classification, regression, and clustering of data.
  <p>
  Most of the classification and regression algorithms are implemented as C++ classes. As the
  algorithms have different sets of features (like an ability to handle missing measurements or
  categorical input variables), there is a little common ground between the classes. This common
  ground is defined by the class cv::ml::StatModel that all the other ML classes are derived from.
  <p>
  See detailed overview here: \ref ml_intro.
 */

/** \addtogroup ml
 *  \{
<p>
/** \brief Variable types */
/** enum cv::ml::VariableTypes */
public static final int
    /** same as VAR_ORDERED */
    VAR_NUMERICAL    = 0,
    /** ordered variables */
    VAR_ORDERED      = 0,
    /** categorical variables */
    VAR_CATEGORICAL  = 1;

/** \brief %Error types */
/** enum cv::ml::ErrorTypes */
public static final int
    TEST_ERROR = 0,
    TRAIN_ERROR = 1;

/** \brief Sample types */
/** enum cv::ml::SampleTypes */
public static final int
    /** each training sample is a row of samples */
    ROW_SAMPLE = 0,
    /** each training sample occupies a column of samples */
    COL_SAMPLE = 1;
// Targeting ../opencv_ml/ParamGrid.java


// Targeting ../opencv_ml/TrainData.java


// Targeting ../opencv_ml/StatModel.java


// Targeting ../opencv_ml/NormalBayesClassifier.java


// Targeting ../opencv_ml/KNearest.java


// Targeting ../opencv_ml/SVM.java


// Targeting ../opencv_ml/EM.java


// Targeting ../opencv_ml/DTrees.java


// Targeting ../opencv_ml/RTrees.java


// Targeting ../opencv_ml/Boost.java


// Targeting ../opencv_ml/ANN_MLP.java



// #ifndef DISABLE_OPENCV_3_COMPATIBILITY
// Targeting ../opencv_ml/LogisticRegression.java


// Targeting ../opencv_ml/SVMSGD.java




/****************************************************************************************\
*                           Auxiliary functions declarations                              *
\****************************************************************************************/

/** \brief Generates _sample_ from multivariate normal distribution
<p>
@param mean an average row vector
@param cov symmetric covariation matrix
@param nsamples returned samples count
@param samples returned samples array
*/
@Namespace("cv::ml") public static native void randMVNormal( @ByVal Mat mean, @ByVal Mat cov, int nsamples, @ByVal Mat samples);
@Namespace("cv::ml") public static native void randMVNormal( @ByVal UMat mean, @ByVal UMat cov, int nsamples, @ByVal UMat samples);
@Namespace("cv::ml") public static native void randMVNormal( @ByVal GpuMat mean, @ByVal GpuMat cov, int nsamples, @ByVal GpuMat samples);

/** \brief Creates test set */
@Namespace("cv::ml") public static native void createConcentricSpheresTestSet( int nsamples, int nfeatures, int nclasses,
                                                @ByVal Mat samples, @ByVal Mat responses);
@Namespace("cv::ml") public static native void createConcentricSpheresTestSet( int nsamples, int nfeatures, int nclasses,
                                                @ByVal UMat samples, @ByVal UMat responses);
@Namespace("cv::ml") public static native void createConcentricSpheresTestSet( int nsamples, int nfeatures, int nclasses,
                                                @ByVal GpuMat samples, @ByVal GpuMat responses);


/****************************************************************************************\
*                                   Simulated annealing solver                             *
\****************************************************************************************/

// #ifdef CV_DOXYGEN
// #endif // CV_DOXYGEN

/** \brief The class implements simulated annealing for optimization.
<p>
\cite Kirkpatrick83 for details
<p>
@param solverSystem optimization system (see SimulatedAnnealingSolverSystem)
@param initialTemperature initial temperature
@param finalTemperature final temperature
@param coolingRatio temperature step multiplies
@param iterationsPerStep number of iterations per temperature changing step
@param lastTemperature optional output for last used temperature
@param rngEnergy specify custom random numbers generator (cv::theRNG() by default)
*/

/** \} ml */




// #include <opencv2/ml/ml.inl.hpp>

// #endif // __cplusplus
// #endif // OPENCV_ML_HPP

/* End of file. */


}
