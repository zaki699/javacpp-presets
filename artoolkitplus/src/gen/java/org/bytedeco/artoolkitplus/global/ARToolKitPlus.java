// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus.global;

import org.bytedeco.artoolkitplus.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

public class ARToolKitPlus extends org.bytedeco.artoolkitplus.presets.ARToolKitPlus {
    static { Loader.load(); }

// Parsed from ARToolKitPlus_plus.h

// #include <assert.h>
// #include <ARToolKitPlus/arBitFieldPattern.h>
// #include <ARToolKitPlus/TrackerMultiMarker.h>
// #include <ARToolKitPlus/TrackerSingleMarker.h>

@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") byte[] dataPtr);

@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") byte[] dataPtr);

@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") byte[] dataPtr);

public static final int MAX_PATTERNS = 256;
// Targeting ../SingleTracker.java


// Targeting ../MultiTracker.java







// Parsed from <ARToolKitPlus/ARToolKitPlus.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITPLUS_HEADERFILE__
// #define __ARTOOLKITPLUS_HEADERFILE__

// #include <vector>

public static final int ARTOOLKITPLUS_VERSION_MAJOR = 2;
public static final int ARTOOLKITPLUS_VERSION_MINOR = 2;

/** enum ARToolKitPlus::PIXEL_FORMAT */
public static final int
    PIXEL_FORMAT_ABGR = 1,
    PIXEL_FORMAT_BGRA = 2,
    PIXEL_FORMAT_BGR = 3,
    PIXEL_FORMAT_RGBA = 4,
    PIXEL_FORMAT_RGB = 5,
    PIXEL_FORMAT_RGB565 = 6,
    PIXEL_FORMAT_LUM = 7;

/** enum ARToolKitPlus::UNDIST_MODE */
public static final int
    UNDIST_NONE = 0, UNDIST_STD = 1, UNDIST_LUT = 2;

/** enum ARToolKitPlus::IMAGE_PROC_MODE */
public static final int
    IMAGE_HALF_RES = 0, IMAGE_FULL_RES = 1;

/** enum ARToolKitPlus::HULL_TRACKING_MODE */
public static final int
    HULL_OFF = 0, HULL_FOUR = 1, HULL_FULL = 2;

// ARToolKitPlus versioning
/** enum ARToolKitPlus::ARTKP_VERSION */
public static final int
    VERSION_MAJOR = ARTOOLKITPLUS_VERSION_MAJOR, VERSION_MINOR = ARTOOLKITPLUS_VERSION_MINOR;

/** enum ARToolKitPlus::MARKER_MODE */
public static final int
    MARKER_TEMPLATE = 0, MARKER_ID_SIMPLE = 1, MARKER_ID_BCH = 2;

/** enum ARToolKitPlus::POSE_ESTIMATOR */
public static final int
    POSE_ESTIMATOR_ORIGINAL = 0, // original "normal" pose estimator
    POSE_ESTIMATOR_ORIGINAL_CONT = 1, // original "cont" pose estimator
    POSE_ESTIMATOR_RPP = 2; // new "Robust Planar Pose" estimator
// Targeting ../CornerPoint.java



 // namespace ARToolKitPlus


// #endif //__ARTOOLKITPLUS_HEADERFILE__


// Parsed from <ARToolKitPlus/config.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */


/**
 * This file is a stripped down version of AR Toolkit original
 * config.h file. Only defines necessary for the core toolkit
 * routines have been left. I tried to comment all variables in a
 * meaningful way. Please extend the comments if you have any idea!
 */

// #ifndef AR_CONFIG_H
// #define AR_CONFIG_H

// may be changed to double, float is particularly useful for PDA's
// #ifdef _USE_DOUBLE_
// #else
// #endif


/*------------------------------------------------------------
 * see 
 * http://www.hitl.washington.edu/people/grof/SharedSpace/Download/Doc/art240.html 
 * for an explanation of the next two define blocks
 */

// constants for variable arImageProcMode
// half mode is faster and useful for interlaced images
public static final int AR_IMAGE_PROC_IN_FULL =        0;
public static final int AR_IMAGE_PROC_IN_HALF =        1;
public static final int DEFAULT_IMAGE_PROC_MODE =     AR_IMAGE_PROC_IN_HALF;

// constants for variable arFittingMode
public static final int AR_FITTING_TO_IDEAL =          0;
public static final int AR_FITTING_TO_INPUT =          1;
public static final int DEFAULT_FITTING_MODE =        AR_FITTING_TO_IDEAL;

// constants for variable arTemplateMatchingMode
public static final int AR_TEMPLATE_MATCHING_COLOR =   0;
public static final int AR_TEMPLATE_MATCHING_BW =      1;
public static final int DEFAULT_TEMPLATE_MATCHING_MODE =     AR_TEMPLATE_MATCHING_COLOR;

// constant for variable arMatchingPCAMode
public static final int AR_MATCHING_WITHOUT_PCA =      0;
public static final int AR_MATCHING_WITH_PCA =         1;
public static final int DEFAULT_MATCHING_PCA_MODE =          AR_MATCHING_WITHOUT_PCA;


// constants influencing accuracy of arGetTransMat(...)
public static final int AR_GET_TRANS_MAT_MAX_LOOP_COUNT =         5;
public static final double AR_GET_TRANS_MAT_MAX_FIT_ERROR =          1.0;
// criterium for arGetTransMatCont(...) to call 
// arGetTransMat(...) instead
public static final double AR_GET_TRANS_CONT_MAT_MAX_FIT_ERROR =     1.0;

// min/max area of fiducial interiors to be matched
// against templates, used in arDetectMarker.c
public static final int AR_AREA_MAX =      100000;
public static final int AR_AREA_MIN =          70;

// used in arDetectMarker2(...), this param controls the
// maximum number of potential markers evaluated further.
// Only the first AR_SQUARE_MAX patterns are examined.
//#define   AR_SQUARE_MAX        50
// plays some role in arDetectMarker2 I don't understand yet
public static final int AR_CHAIN_MAX =      10000;

public static final int EVEC_MAX =     10;
public static final int P_MAX =       500;

//#define SMALL_LUM8_TABLE

// #ifdef SMALL_LUM8_TABLE
//   #define getLUM8_from_RGB565(ptr)   RGB565_to_LUM8_LUT[ (*(unsigned short*)(ptr))>>6 ]
// #else
//   #define getLUM8_from_RGB565(ptr)   RGB565_to_LUM8_LUT[ (*(unsigned short*)(ptr))    ]
// #endif //SMALL_LUM8_TABLE

// disable VisualStudio warnings 
// #if defined(_MSC_VER) && !defined(AR_ENABLE_MSVC_WARNINGS)
//     #pragma warning( disable : 4244 )
//     #pragma warning( disable : 4251 )
//     #pragma warning( disable : 4275 )
//     #pragma warning( disable : 4512 )
//     #pragma warning( disable : 4267 )
//     #pragma warning( disable : 4702 )
//     #pragma warning( disable : 4511 )
// #endif

// Support for Visual Studio compilation
// #if defined(AR_STATIC)
// 	#define AR_EXPORT 
// #else
// 	#if defined(_MSC_VER) || defined(__CYGWIN__) || defined(__MINGW32__) || defined( __BCPLUSPLUS__)  || defined( __MWERKS__)
// 		#  if defined( AR_LIBRARY )
// 		#    define AR_EXPORT   __declspec(dllexport)
// 		#  else
// 		#    define AR_EXPORT   __declspec(dllimport)
// 		#  endif
// 	#else
// 		#  define AR_EXPORT
// 	#endif
// #endif

// #ifdef _MSC_VER
// # if (_MSC_VER >= 1300)
// #  define __STL_MEMBER_TEMPLATES
// # endif
// #endif

// #endif //  AR_CONFIG_H



// Parsed from <ARToolKitPlus/ar.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITAR_HEADERFILE__
// #define __ARTOOLKITAR_HEADERFILE__

// #include <stdlib.h>

// #include <ARToolKitPlus/config.h>
// #include <stdint.h>

// #define arMalloc(V,T,S)
// { if( ((V) = (T *)malloc( sizeof(T) * (S) )) == 0 )
// {printf("malloc error!!\n"); exit(1);} }
// Targeting ../ARMarkerInfo.java


// Targeting ../ARMarkerInfo2.java


// Targeting ../arPrevInfo.java



 // namespace ARToolKitPlus


// #endif  //__ARTOOLKITAR_HEADERFILE__


// Parsed from <ARToolKitPlus/arMulti.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */


// #ifndef __ARTOOLKITMULTI_HEADERFILE__
// #define __ARTOOLKITMULTI_HEADERFILE__

// #include <ARToolKitPlus/config.h>
// Targeting ../ARMultiEachMarkerInfoT.java


// Targeting ../ARMultiMarkerInfoT.java




 // namespace ARToolKitPlus


// #endif // __ARTOOLKITMULTI_HEADERFILE__


// Parsed from <ARToolKitPlus/matrix.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITMATRIX_HEADERFILE__
// #define __ARTOOLKITMATRIX_HEADERFILE__

// #include <ARToolKitPlus/config.h>
// Targeting ../ARMat.java



/* 0 origin */
// #define ARELEM0(mat,r,c) ((mat)->m[(r)*((mat)->clm)+(c)])
/* 1 origin */
// #define ARELEM1(mat,row,clm) ARELEM0(mat,row-1,clm-1)

@Namespace("ARToolKitPlus::Matrix") public static native ARMat alloc(int row, int clm);
@Namespace("ARToolKitPlus::Matrix") public static native @Name("free") int _free(ARMat m);

@Namespace("ARToolKitPlus::Matrix") public static native int dup(ARMat dest, ARMat source);
@Namespace("ARToolKitPlus::Matrix") public static native ARMat allocDup(ARMat source);

@Namespace("ARToolKitPlus::Matrix") public static native int mul(ARMat dest, ARMat a, ARMat b);
@Namespace("ARToolKitPlus::Matrix") public static native int selfInv(ARMat m);

 // namespace Matrix


 // namespace ARToolKitPlus


// #endif // __ARTOOLKITMATRIX_HEADERFILE__


// Parsed from <ARToolKitPlus/vector.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITVECTOR_HEADERFILE__
// #define __ARTOOLKITVECTOR_HEADERFILE__

// #include <ARToolKitPlus/config.h>
// Targeting ../ARVec.java


@Namespace("ARToolKitPlus::Vector") public static native ARVec alloc(int clm);
@Namespace("ARToolKitPlus::Vector") public static native @Name("free") int _free(ARVec v);
@Namespace("ARToolKitPlus::Vector") public static native @Cast("ARFloat") float household(ARVec x);
@Namespace("ARToolKitPlus::Vector") public static native @Cast("ARFloat") float innerproduct(ARVec x, ARVec y);
@Namespace("ARToolKitPlus::Vector") public static native int tridiagonalize(ARMat a, ARVec d, ARVec e);


 // namespace ARToolKitPlus


// #endif // __ARTOOLKITVECTOR_HEADERFILE__


// Parsed from <ARToolKitPlus/Camera.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 *  Pavel Rojtberg
 */

// #pragma once

// #include <string>
// #include <ARToolKitPlus/config.h>
// Targeting ../Camera.java



 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/extra/BCH.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 *  Pavel Rojtberg
 */

// #ifndef __BCH_CODE__H__
// #define __BCH_CODE__H__

// #include <ARToolKitPlus/config.h>

// #include <vector>

// --------------------------------------------------------
// WARNING: It is *NOT SAFE* to alter the values below!

public static final int BCH_DEFAULT_M =       6;
public static final int BCH_DEFAULT_LENGTH = 36;
public static final int BCH_DEFAULT_T =       4;
public static final int BCH_DEFAULT_K =      12;

public static final int BCH_MAX_M =    6;
public static final int BCH_MAX_P =    7;  // MAX_M+1
public static final int BCH_MAX_LUT = 64;  // 2^MAX_M
public static final int BCH_MAX_SQ =   8;  // SQRT(MAX_LUT) -- (?)
// -------------------------------------------------------

// we only use unsigned __int64 under windows.
// have to use unsigned long long othersie...
// #if defined(_MSC_VER) || defined(_WIN32_WCE)
// #else
// Targeting ../BCH.java



 // namespace ARToolKitPlus


// #endif // __BCH_CODE__H__


// Parsed from <ARToolKitPlus/extra/Hull.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #ifndef __ARTOOLKITPLUS_HULL_HEADERFILE__
// #define __ARTOOLKITPLUS_HULL_HEADERFILE__

// #include <ARToolKitPlus/config.h>

@Namespace("ARToolKitPlus") @MemberGetter public static native int MAX_HULL_POINTS();
// Targeting ../MarkerPoint.java



@Namespace("ARToolKitPlus") public static native int iabs(int nValue);

@Namespace("ARToolKitPlus") public static native int nearHull_2D(@Const MarkerPoint P, int n, int k, MarkerPoint H);

@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1);
@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1);
@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef int[] nIdx0, @ByRef int[] nIdx1);

@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef IntPointer nIdxFarthest);
@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef IntBuffer nIdxFarthest);
@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef int[] nIdxFarthest);

@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef IntPointer nIdxMax);
@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef IntBuffer nIdxMax);
@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef int[] nIdxMax);

@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1, @ByRef IntPointer nIdx2);
@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1, @ByRef IntBuffer nIdx2);
@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef int[] nIdx0, @ByRef int[] nIdx1, @ByRef int[] nIdx2);

@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1, @ByRef IntPointer nIdx2, @ByRef IntPointer nIdx3);
@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1, @ByRef IntBuffer nIdx2, @ByRef IntBuffer nIdx3);
@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef int[] nIdx0, @ByRef int[] nIdx1, @ByRef int[] nIdx2, @ByRef int[] nIdx3);

 // namespace ARToolKitPlus


// #endif //__ARTOOLKITPLUS_HULL_HEADERFILE__


// Parsed from <ARToolKitPlus/extra/rpp.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 */

// #ifndef __LINK_WITH_RPP__
// #define __LINK_WITH_RPP__

// #include <ARToolKitPlus/config.h>

public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef DoublePointer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoublePointer cc, @Cast("const rpp_float*") DoublePointer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef DoubleBuffer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoubleBuffer cc, @Cast("const rpp_float*") DoubleBuffer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef double[] err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") double[] cc, @Cast("const rpp_float*") double[] fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);

// #endif // __LINK_WITH_RPP__


// Parsed from <ARToolKitPlus/Tracker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #ifndef __ARTOOLKIT_TRACKERIMPL_HEADERFILE__
// #define __ARTOOLKIT_TRACKERIMPL_HEADERFILE__

// #include <ARToolKitPlus/ARToolKitPlus.h>
// #include <ARToolKitPlus/ar.h>
// #include <ARToolKitPlus/arMulti.h>
// #include <ARToolKitPlus/vector.h>
// #include <ARToolKitPlus/Camera.h>
// #include <ARToolKitPlus/extra/BCH.h>
// #include <ARToolKitPlus/extra/Hull.h>

// #include <algorithm>
// #include <vector>
// Targeting ../Tracker.java



 // namespace ARToolKitPlus

// #endif //__ARTOOLKIT_TRACKERIMPL_HEADERFILE__


// Parsed from <ARToolKitPlus/TrackerMultiMarker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #pragma once

// #include <ARToolKitPlus/Tracker.h>
// Targeting ../TrackerMultiMarker.java



 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/TrackerSingleMarker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #pragma once

// #include <ARToolKitPlus/Tracker.h>
// Targeting ../TrackerSingleMarker.java



 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/arBitFieldPattern.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARBITFIELDPATTERN_HEADERFILE__
// #define __ARBITFIELDPATTERN_HEADERFILE__

// #include <ARToolKitPlus/config.h>

/** enum ARToolKitPlus:: */
public static final int
    // size of the marker images
    idPattWidth = 6,
    idPattHeight = 6,

    // number of bits we can use for marker id
    idBits = 9,
    idMask = (1 << idBits) - 1,
    idMax = (1 << idBits) - 1,

    pattBits = 4 * idBits;

// we only use __int64 under windows.
// have to use unsigned long long othersie...
// #if defined(_MSC_VER) || defined(_WIN32_WCE)
// #else
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long bchMask();
// #endif

@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask0();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask1();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask2();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask3();

@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask0();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask1();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask2();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask3();

// full mask that is used to xor raw pattern image
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long fullMask();

@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const unsigned int") int bchBits();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const unsigned int") int idMaxBCH();

// array with indices for 90� CW rotated grid
@Namespace("ARToolKitPlus") @MemberGetter public static native int rotate90(int i);
@Namespace("ARToolKitPlus") @MemberGetter public static native @Const IntPointer rotate90();


// some internal methods. primarily needed for
// marker printing, etc.
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongPointer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongBuffer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef long[] nPattern);

@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongPointer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongBuffer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef long[] nPattern);

// static void setBit(IDPATTERN& pat, int which);

@Namespace("ARToolKitPlus") public static native @Cast("bool") boolean isBitSet(@Cast("ARToolKitPlus::IDPATTERN") long pat, int which);

 // namespace ARToolKitPlus


// #endif //__ARBITFIELDPATTERN_HEADERFILE__


// Parsed from <ARToolKitPlus/arGetInitRot2Sub.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__
// #define __ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__

// #include <ARToolKitPlus/extra/rpp.h>

@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef DoublePointer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoublePointer cc, @Cast("const rpp_float*") DoublePointer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef DoubleBuffer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoubleBuffer cc, @Cast("const rpp_float*") DoubleBuffer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef double[] err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") double[] cc, @Cast("const rpp_float*") double[] fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);

 // namespace rpp


// #endif //__ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__


}
