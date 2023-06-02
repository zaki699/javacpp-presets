// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_face.*;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

public class opencv_face extends org.bytedeco.opencv.presets.opencv_face {
    static { Loader.load(); }

// Parsed from <opencv2/face/predict_collector.hpp>

/*
By downloading, copying, installing or using the software you agree to this license.
If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2000-2015, Intel Corporation, all rights reserved.
Copyright (C) 2009-2011, Willow Garage Inc., all rights reserved.
Copyright (C) 2009-2015, NVIDIA Corporation, all rights reserved.
Copyright (C) 2010-2013, Advanced Micro Devices, Inc., all rights reserved.
Copyright (C) 2015, OpenCV Foundation, all rights reserved.
Copyright (C) 2015, Itseez Inc., all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are disclaimed.
In no event shall copyright holders or contributors be liable for any direct,
indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_PREDICT_COLLECTOR_HPP__
// #define __OPENCV_PREDICT_COLLECTOR_HPP__

// #include <vector>
// #include <map>
// #include <utility>
// #include <cfloat>

// #include "opencv2/core/base.hpp"
// Targeting ../opencv_face/PredictCollector.java


// Targeting ../opencv_face/StandardCollector.java



/** \} */



// #endif


// Parsed from <opencv2/face.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.

                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_FACE_HPP__
// #define __OPENCV_FACE_HPP__

/**
\defgroup face Face Analysis
<p>
- \ref face_changelog
- \ref tutorial_face_main
<p>
*/

// #include "opencv2/core.hpp"
// #include "face/predict_collector.hpp"
// #include <map>
// Targeting ../opencv_face/FaceRecognizer.java



/** \} */



// #include "opencv2/face/facerec.hpp"
// #include "opencv2/face/facemark.hpp"
// #include "opencv2/face/facemark_train.hpp"
// #include "opencv2/face/facemarkLBF.hpp"
// #include "opencv2/face/facemarkAAM.hpp"
// #include "opencv2/face/face_alignment.hpp"
// #include "opencv2/face/mace.hpp"

// #endif // __OPENCV_FACE_HPP__


// Parsed from <opencv2/face/facerec.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// Copyright (c) 2011,2012. Philipp Wagner <bytefish[at]gmx[dot]de>.
// Third party copyrights are property of their respective owners.

// #ifndef __OPENCV_FACEREC_HPP__
// #define __OPENCV_FACEREC_HPP__

// #include "opencv2/face.hpp"
// #include "opencv2/core.hpp"
// Targeting ../opencv_face/BasicFaceRecognizer.java


// Targeting ../opencv_face/EigenFaceRecognizer.java


// Targeting ../opencv_face/FisherFaceRecognizer.java


// Targeting ../opencv_face/LBPHFaceRecognizer.java



/** \} */

 //namespace cv::face

// #endif //__OPENCV_FACEREC_HPP__


// Parsed from <opencv2/face/facemark.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
This file was part of GSoC Project: Facemark API for OpenCV
Final report: https://gist.github.com/kurnianggoro/74de9121e122ad0bd825176751d47ecc
Student: Laksono Kurnianggoro
Mentor: Delia Passalacqua
*/

// #ifndef __OPENCV_FACELANDMARK_HPP__
// #define __OPENCV_FACELANDMARK_HPP__

/**
\defgroup face Face Analysis
- \ref tutorial_table_of_content_facemark
- The Facemark API
*/

// #include "opencv2/core.hpp"
// #include <vector>
// Targeting ../opencv_face/Facemark.java

 /* Facemark*/


/** construct an AAM facemark detector */
@Namespace("cv::face") public static native @Ptr Facemark createFacemarkAAM();

/** construct an LBF facemark detector */
@Namespace("cv::face") public static native @Ptr Facemark createFacemarkLBF();

/** construct a Kazemi facemark detector */
@Namespace("cv::face") public static native @Ptr Facemark createFacemarkKazemi();


 // face
 // cv

// #endif //__OPENCV_FACELANDMARK_HPP__


// Parsed from <opencv2/face/facemark_train.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
This file was part of GSoC Project: Facemark API for OpenCV
Final report: https://gist.github.com/kurnianggoro/74de9121e122ad0bd825176751d47ecc
Student: Laksono Kurnianggoro
Mentor: Delia Passalacqua
*/

// #ifndef __OPENCV_FACELANDMARKTRAIN_HPP__
// #define __OPENCV_FACELANDMARKTRAIN_HPP__

/**
\defgroup face Face Analysis
- \ref tutorial_table_of_content_facemark
- The Facemark API
*/

// #include "opencv2/face/facemark.hpp"
// #include "opencv2/objdetect.hpp"
// #include <vector>
// #include <string>

/** \addtogroup face
 *  \{ */
// Targeting ../opencv_face/CParams.java



/** \brief Default face detector
This function is mainly utilized by the implementation of a Facemark Algorithm.
End users are advised to use function Facemark::getFaces which can be manually defined
and circumvented to the algorithm by Facemark::setFaceDetector.
<p>
@param image The input image to be processed.
@param faces Output of the function which represent region of interest of the detected faces.
Each face is stored in cv::Rect container.
@param params detector parameters
<p>
<B>Example of usage</B>
<pre>{@code
std::vector<cv::Rect> faces;
CParams params("haarcascade_frontalface_alt.xml");
cv::face::getFaces(frame, faces, &params);
for(int j=0;j<faces.size();j++){
    cv::rectangle(frame, faces[j], cv::Scalar(255,0,255));
}
cv::imshow("detection", frame);
}</pre>
*/
@Namespace("cv::face") public static native @Cast("bool") boolean getFaces(@ByVal Mat image, @ByRef RectVector faces, CParams params);

@Namespace("cv::face") public static native @Cast("bool") boolean getFacesHAAR(@ByVal Mat image, @ByRef RectVector faces, @Str String face_cascade_name);

/** \brief A utility to load list of paths to training image and annotation file.
@param imageList The specified file contains paths to the training images.
@param annotationList The specified file contains paths to the training annotations.
@param images The loaded paths of training images.
@param annotations The loaded paths of annotation files.
<p>
Example of usage:
<pre>{@code
String imageFiles = "images_path.txt";
String ptsFiles = "annotations_path.txt";
std::vector<String> images_train;
std::vector<String> landmarks_train;
loadDatasetList(imageFiles,ptsFiles,images_train,landmarks_train);
}</pre>
*/
@Namespace("cv::face") public static native @Cast("bool") boolean loadDatasetList(@Str BytePointer imageList,
                                  @Str BytePointer annotationList,
                                  @ByRef StringVector images,
                                  @ByRef StringVector annotations);
@Namespace("cv::face") public static native @Cast("bool") boolean loadDatasetList(@Str String imageList,
                                  @Str String annotationList,
                                  @ByRef StringVector images,
                                  @ByRef StringVector annotations);

/** \brief A utility to load facial landmark dataset from a single file.
<p>
@param filename The filename of a file that contains the dataset information.
Each line contains the filename of an image followed by
pairs of x and y values of facial landmarks points separated by a space.
Example
<pre>{@code
/home/user/ibug/image_003_1.jpg 336.820955 240.864510 334.238298 260.922709 335.266918 ...
/home/user/ibug/image_005_1.jpg 376.158428 230.845712 376.736984 254.924635 383.265403 ...
}</pre>
@param images A vector where each element represent the filename of image in the dataset.
Images are not loaded by default to save the memory.
@param facePoints The loaded landmark points for all training data.
@param delim Delimiter between each element, the default value is a whitespace.
@param offset An offset value to adjust the loaded points.
<p>
<B>Example of usage</B>
<pre>{@code
cv::String imageFiles = "../data/images_train.txt";
cv::String ptsFiles = "../data/points_train.txt";
std::vector<String> images;
std::vector<std::vector<Point2f> > facePoints;
loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
}</pre>
*/
@Namespace("cv::face") public static native @Cast("bool") boolean loadTrainingData( @Str String filename, @ByRef StringVector images,
                                    @ByRef Point2fVectorVector facePoints,
                                    @Cast("char") byte delim/*=' '*/, float offset/*=0.0f*/);

/** \brief A utility to load facial landmark information from the dataset.
<p>
@param imageList A file contains the list of image filenames in the training dataset.
@param groundTruth A file contains the list of filenames
where the landmarks points information are stored.
The content in each file should follow the standard format (see face::loadFacePoints).
@param images A vector where each element represent the filename of image in the dataset.
Images are not loaded by default to save the memory.
@param facePoints The loaded landmark points for all training data.
@param offset An offset value to adjust the loaded points.
<p>
<B>Example of usage</B>
<pre>{@code
cv::String imageFiles = "../data/images_train.txt";
cv::String ptsFiles = "../data/points_train.txt";
std::vector<String> images;
std::vector<std::vector<Point2f> > facePoints;
loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
}</pre>
<p>
example of content in the images_train.txt
<pre>{@code
/home/user/ibug/image_003_1.jpg
/home/user/ibug/image_004_1.jpg
/home/user/ibug/image_005_1.jpg
/home/user/ibug/image_006.jpg
}</pre>
<p>
example of content in the points_train.txt
<pre>{@code
/home/user/ibug/image_003_1.pts
/home/user/ibug/image_004_1.pts
/home/user/ibug/image_005_1.pts
/home/user/ibug/image_006.pts
}</pre>
*/
@Namespace("cv::face") public static native @Cast("bool") boolean loadTrainingData( @Str String imageList, @Str String groundTruth,
                                    @ByRef StringVector images,
                                    @ByRef Point2fVectorVector facePoints,
                                    float offset/*=0.0f*/);

/** \brief This function extracts the data for training from .txt files which contains the corresponding image name and landmarks.
*The first file in each file should give the path of the image whose
*landmarks are being described in the file. Then in the subsequent
*lines there should be coordinates of the landmarks in the image
*i.e each line should be of the form x,y
*where x represents the x coordinate of the landmark and y represents
*the y coordinate of the landmark.
*
*For reference you can see the files as provided in the
*<a href="http://www.ifp.illinois.edu/~vuongle2/helen/">HELEN dataset</a>
*
* @param filename A vector of type cv::String containing name of the .txt files.
* @param trainlandmarks A vector of type cv::Point2f that would store shape or landmarks of all images.
* @param trainimages A vector of type cv::String which stores the name of images whose landmarks are tracked
* @return A boolean value. It returns true when it reads the data successfully and false otherwise
*/
@Namespace("cv::face") public static native @Cast("bool") boolean loadTrainingData(@ByVal StringVector filename,@ByRef Point2fVectorVector trainlandmarks,@ByRef StringVector trainimages);

/** \brief A utility to load facial landmark information from a given file.
<p>
@param filename The filename of file contains the facial landmarks data.
@param points The loaded facial landmark points.
@param offset An offset value to adjust the loaded points.
<p>
<B>Example of usage</B>
<pre>{@code
std::vector<Point2f> points;
face::loadFacePoints("filename.txt", points, 0.0f);
}</pre>
<p>
The annotation file should follow the default format which is
<pre>{@code
version: 1
n_points:  68
{
212.716603 499.771793
230.232816 566.290071
...
}
}</pre>
where n_points is the number of points considered
and each point is represented as its position in x and y.
*/
@Namespace("cv::face") public static native @Cast("bool") boolean loadFacePoints( @Str String filename, @ByRef Point2fVectorVector points,
                                  float offset/*=0.0f*/);

/** \brief Utility to draw the detected facial landmark points
<p>
@param image The input image to be processed.
@param points Contains the data of points which will be drawn.
@param color The color of points in BGR format represented by cv::Scalar.
<p>
<B>Example of usage</B>
<pre>{@code
std::vector<Rect> faces;
std::vector<std::vector<Point2f> > landmarks;
facemark->getFaces(img, faces);
facemark->fit(img, faces, landmarks);
for(int j=0;j<rects.size();j++){
    face::drawFacemarks(frame, landmarks[j], Scalar(0,0,255));
}
}</pre>
*/
@Namespace("cv::face") public static native void drawFacemarks( @ByVal Mat image, @ByRef Point2fVector points,
                                 @ByVal(nullValue = "cv::Scalar(255,0,0)") Scalar color);
// Targeting ../opencv_face/FacemarkTrain.java

 /* Facemark*/

/** \} */
 /* namespace face */
 /* namespace cv */
// #endif //__OPENCV_FACELANDMARKTRAIN_HPP__


// Parsed from <opencv2/face/facemarkLBF.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.
                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)
Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.
Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:
  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.
This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.

This file was part of GSoC Project: Facemark API for OpenCV
Final report: https://gist.github.com/kurnianggoro/74de9121e122ad0bd825176751d47ecc
Student: Laksono Kurnianggoro
Mentor: Delia Passalacqua
*/

// #ifndef __OPENCV_FACEMARK_LBF_HPP__
// #define __OPENCV_FACEMARK_LBF_HPP__

// #include "opencv2/face/facemark_train.hpp"
// Targeting ../opencv_face/FacemarkLBF.java

 /* LBF */

/** \} */

 /* namespace face */
/* namespace cv */

// #endif


// Parsed from <opencv2/face/facemarkAAM.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.
                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)
Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.
Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:
  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.
This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.

This file was part of GSoC Project: Facemark API for OpenCV
Final report: https://gist.github.com/kurnianggoro/74de9121e122ad0bd825176751d47ecc
Student: Laksono Kurnianggoro
Mentor: Delia Passalacqua
*/

// #ifndef __OPENCV_FACEMARK_AAM_HPP__
// #define __OPENCV_FACEMARK_AAM_HPP__

// #include "opencv2/face/facemark_train.hpp"
// Targeting ../opencv_face/FacemarkAAM.java

 /* AAM */

/** \} */

 /* namespace face */
 /* namespace cv */
// #endif


// Parsed from <opencv2/face/face_alignment.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.
// #ifndef __OPENCV_FACE_ALIGNMENT_HPP__
// #define __OPENCV_FACE_ALIGNMENT_HPP__

// #include "opencv2/face/facemark_train.hpp"
// Targeting ../opencv_face/FacemarkKazemi.java



 // namespace
// #endif


}
