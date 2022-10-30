// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.global;

import org.bytedeco.nvcodec.nvcuvid.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nvcuvid extends org.bytedeco.nvcodec.presets.nvcuvid {
    static { Loader.load(); }

// Parsed from cuviddec.h

/*
 * This copyright notice applies to this header file only:
 *
 * Copyright (c) 2010-2021 NVIDIA Corporation
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the software, and to permit persons to whom the
 * software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

/*****************************************************************************************************/
/** \file cuviddec.h
/** NVDECODE API provides video decoding interface to NVIDIA GPU devices.
/** This file contains constants, structure definitions and function prototypes used for decoding.
/*****************************************************************************************************/

// #if !defined(__CUDA_VIDEO_H__) */
// #define __CUDA_VIDEO_H__

// #ifndef __cuda_cuda_h__
// #include <cuda.h>
// #endif // __cuda_cuda_h__

// #if defined(_WIN64) || defined(__LP64__) || defined(__x86_64) || defined(AMD64) || defined(_M_AMD64)
// #if (CUDA_VERSION >= 3020) && (!defined(CUDA_FORCE_API_VERSION) || (CUDA_FORCE_API_VERSION >= 3020))
// #define __CUVID_DEVPTR64
// #endif
// #endif

// #if defined(__cplusplus)
// Targeting ../nvcuvid/CUvideodecoder.java


// Targeting ../nvcuvid/_CUcontextlock_st.java



/*********************************************************************************/
/** \enum cudaVideoCodec
/** Video codec enums
/** These enums are used in CUVIDDECODECREATEINFO and CUVIDDECODECAPS structures
/*********************************************************************************/
/** enum cudaVideoCodec */
public static final int
    /**  MPEG1             */
    cudaVideoCodec_MPEG1 = 0,
    /**  MPEG2             */
    cudaVideoCodec_MPEG2 = 1,
    /**  MPEG4             */
    cudaVideoCodec_MPEG4 = 2,
    /**  VC1               */
    cudaVideoCodec_VC1 = 3,
    /**  H264              */
    cudaVideoCodec_H264 = 4,
    /**  JPEG              */
    cudaVideoCodec_JPEG = 5,
    /**  H264-SVC          */
    cudaVideoCodec_H264_SVC = 6,
    /**  H264-MVC          */
    cudaVideoCodec_H264_MVC = 7,
    /**  HEVC              */
    cudaVideoCodec_HEVC = 8,
    /**  VP8               */
    cudaVideoCodec_VP8 = 9,
    /**  VP9               */
    cudaVideoCodec_VP9 = 10,
    /**  AV1               */
    cudaVideoCodec_AV1 = 11,
    /**  Max codecs        */
    cudaVideoCodec_NumCodecs = 12,
    // Uncompressed YUV
    /** Y,U,V (4:2:0)      */
    cudaVideoCodec_YUV420 = (('I'<<24)|('Y'<<16)|('U'<<8)|('V')),
    /** Y,V,U (4:2:0)      */
    cudaVideoCodec_YV12   = (('Y'<<24)|('V'<<16)|('1'<<8)|('2')),
    /** Y,UV  (4:2:0)      */
    cudaVideoCodec_NV12   = (('N'<<24)|('V'<<16)|('1'<<8)|('2')),
    /** YUYV/YUY2 (4:2:2)  */
    cudaVideoCodec_YUYV   = (('Y'<<24)|('U'<<16)|('Y'<<8)|('V')),
    /** UYVY (4:2:2)       */
    cudaVideoCodec_UYVY   = (('U'<<24)|('Y'<<16)|('V'<<8)|('Y'));

/*********************************************************************************/
/** \enum cudaVideoSurfaceFormat
/** Video surface format enums used for output format of decoded output
/** These enums are used in CUVIDDECODECREATEINFO structure
/*********************************************************************************/
/** enum cudaVideoSurfaceFormat */
public static final int
    /** Semi-Planar YUV [Y plane followed by interleaved UV plane]     */
    cudaVideoSurfaceFormat_NV12 = 0,
    /** 16 bit Semi-Planar YUV [Y plane followed by interleaved UV plane].
                                                 Can be used for 10 bit(6LSB bits 0), 12 bit (4LSB bits 0)      */
    cudaVideoSurfaceFormat_P016 = 1,
    /** Planar YUV [Y plane followed by U and V planes]                */
    cudaVideoSurfaceFormat_YUV444 = 2,
    /** 16 bit Planar YUV [Y plane followed by U and V planes]. 
                                                 Can be used for 10 bit(6LSB bits 0), 12 bit (4LSB bits 0)      */
    cudaVideoSurfaceFormat_YUV444_16Bit = 3;

/******************************************************************************************************************/
/** \enum cudaVideoDeinterlaceMode
/** Deinterlacing mode enums
/** These enums are used in CUVIDDECODECREATEINFO structure
/** Use cudaVideoDeinterlaceMode_Weave for progressive content and for content that doesn't need deinterlacing
/** cudaVideoDeinterlaceMode_Adaptive needs more video memory than other DImodes
/******************************************************************************************************************/
/** enum cudaVideoDeinterlaceMode */
public static final int
    /** Weave both fields (no deinterlacing) */
    cudaVideoDeinterlaceMode_Weave = 0,
    /** Drop one field                       */
    cudaVideoDeinterlaceMode_Bob = 1,
    /** Adaptive deinterlacing               */
    cudaVideoDeinterlaceMode_Adaptive = 2;

/**************************************************************************************************************/
/** \enum cudaVideoChromaFormat
/** Chroma format enums
/** These enums are used in CUVIDDECODECREATEINFO and CUVIDDECODECAPS structures
/**************************************************************************************************************/
/** enum cudaVideoChromaFormat */
public static final int
    /** MonoChrome */
    cudaVideoChromaFormat_Monochrome = 0,
    /** YUV 4:2:0  */
    cudaVideoChromaFormat_420 = 1,
    /** YUV 4:2:2  */
    cudaVideoChromaFormat_422 = 2,
    /** YUV 4:4:4  */
    cudaVideoChromaFormat_444 = 3;

/*************************************************************************************************************/
/** \enum cudaVideoCreateFlags
/** Decoder flag enums to select preferred decode path
/** cudaVideoCreate_Default and cudaVideoCreate_PreferCUVID are most optimized, use these whenever possible
/*************************************************************************************************************/
/** enum cudaVideoCreateFlags */
public static final int
    /** Default operation mode: use dedicated video engines                        */
    cudaVideoCreate_Default     = 0x00,
    /** Use CUDA-based decoder (requires valid vidLock object for multi-threading) */
    cudaVideoCreate_PreferCUDA  = 0x01,
    /** Go through DXVA internally if possible (requires D3D9 interop)             */
    cudaVideoCreate_PreferDXVA  = 0x02,
    /** Use dedicated video engines directly                                       */
    cudaVideoCreate_PreferCUVID = 0x04;


/*************************************************************************/
/** \enum cuvidDecodeStatus
/** Decode status enums
/** These enums are used in CUVIDGETDECODESTATUS structure
/*************************************************************************/
/** enum cuvidDecodeStatus */
public static final int
    cuvidDecodeStatus_Invalid         = 0,   // Decode status is not valid
    cuvidDecodeStatus_InProgress      = 1,   // Decode is in progress
    cuvidDecodeStatus_Success         = 2,   // Decode is completed without any errors
    // 3 to 7 enums are reserved for future use
    cuvidDecodeStatus_Error           = 8,   // Decode is completed with an error (error is not concealed)
    cuvidDecodeStatus_Error_Concealed = 9;   // Decode is completed with an error and error is concealed 
// Targeting ../nvcuvid/CUVIDDECODECAPS.java


// Targeting ../nvcuvid/CUVIDDECODECREATEINFO.java


// Targeting ../nvcuvid/CUVIDH264DPBENTRY.java


// Targeting ../nvcuvid/CUVIDH264MVCEXT.java


// Targeting ../nvcuvid/CUVIDH264SVCEXT.java


// Targeting ../nvcuvid/CUVIDH264PICPARAMS.java


// Targeting ../nvcuvid/CUVIDMPEG2PICPARAMS.java



// MPEG-4 has VOP types instead of Picture types
public static final int I_VOP = 0;
public static final int P_VOP = 1;
public static final int B_VOP = 2;
public static final int S_VOP = 3;
// Targeting ../nvcuvid/CUVIDMPEG4PICPARAMS.java


// Targeting ../nvcuvid/CUVIDVC1PICPARAMS.java


// Targeting ../nvcuvid/CUVIDJPEGPICPARAMS.java


// Targeting ../nvcuvid/CUVIDHEVCPICPARAMS.java


// Targeting ../nvcuvid/CUVIDVP8PICPARAMS.java


// Targeting ../nvcuvid/CUVIDVP9PICPARAMS.java


// Targeting ../nvcuvid/CUVIDAV1PICPARAMS.java


// Targeting ../nvcuvid/CUVIDPICPARAMS.java


// Targeting ../nvcuvid/CUVIDPROCPARAMS.java


// Targeting ../nvcuvid/CUVIDGETDECODESTATUS.java


// Targeting ../nvcuvid/CUVIDRECONFIGUREDECODERINFO.java

 


/***********************************************************************************************************/
/** VIDEO_DECODER
/**
/** In order to minimize decode latencies, there should be always at least 2 pictures in the decode
/** queue at any time, in order to make sure that all decode engines are always busy.
/**
/** Overall data flow:
/**  - cuvidGetDecoderCaps(...)
/**  - cuvidCreateDecoder(...)
/**  - For each picture:
/**    + cuvidDecodePicture(N)
/**    + cuvidMapVideoFrame(N-4)
/**    + do some processing in cuda
/**    + cuvidUnmapVideoFrame(N-4)
/**    + cuvidDecodePicture(N+1)
/**    + cuvidMapVideoFrame(N-3)
/**    + ...
/**  - cuvidDestroyDecoder(...)
/**
/** NOTE:
/** - When the cuda context is created from a D3D device, the D3D device must also be created
/**   with the D3DCREATE_MULTITHREADED flag.
/** - There is a limit to how many pictures can be mapped simultaneously (ulNumOutputSurfaces)
/** - cuvidDecodePicture may block the calling thread if there are too many pictures pending
/**   in the decode queue
/***********************************************************************************************************/


/**********************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidGetDecoderCaps(CUVIDDECODECAPS *pdc)
/** Queries decode capabilities of NVDEC-HW based on CodecType, ChromaFormat and BitDepthMinus8 parameters.
/** 1. Application fills IN parameters CodecType, ChromaFormat and BitDepthMinus8 of CUVIDDECODECAPS structure
/** 2. On calling cuvidGetDecoderCaps, driver fills OUT parameters if the IN parameters are supported
/**    If IN parameters passed to the driver are not supported by NVDEC-HW, then all OUT params are set to 0.
/** E.g. on Geforce GTX 960:
/**   App fills - eCodecType = cudaVideoCodec_H264; eChromaFormat = cudaVideoChromaFormat_420; nBitDepthMinus8 = 0;
/**   Given IN parameters are supported, hence driver fills: bIsSupported = 1; nMinWidth   = 48; nMinHeight  = 16; 
/**   nMaxWidth = 4096; nMaxHeight = 4096; nMaxMBCount = 65536;
/** CodedWidth*CodedHeight/256 must be less than or equal to nMaxMBCount
/**********************************************************************************************************************/
public static native @Cast("CUresult") int cuvidGetDecoderCaps(CUVIDDECODECAPS pdc);

/*****************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidCreateDecoder(CUvideodecoder *phDecoder, CUVIDDECODECREATEINFO *pdci)
/** Create the decoder object based on pdci. A handle to the created decoder is returned
/*****************************************************************************************************/
public static native @Cast("CUresult") int cuvidCreateDecoder(@ByPtrPtr CUvideodecoder phDecoder, CUVIDDECODECREATEINFO pdci);

/*****************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidDestroyDecoder(CUvideodecoder hDecoder)
/** Destroy the decoder object
/*****************************************************************************************************/
public static native @Cast("CUresult") int cuvidDestroyDecoder(CUvideodecoder hDecoder);

/*****************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidDecodePicture(CUvideodecoder hDecoder, CUVIDPICPARAMS *pPicParams)
/** Decode a single picture (field or frame)
/** Kicks off HW decoding 
/*****************************************************************************************************/
public static native @Cast("CUresult") int cuvidDecodePicture(CUvideodecoder hDecoder, CUVIDPICPARAMS pPicParams);

/************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidGetDecodeStatus(CUvideodecoder hDecoder, int nPicIdx);
/** Get the decode status for frame corresponding to nPicIdx
/** API is supported for Maxwell and above generation GPUs.
/** API is currently supported for HEVC, H264 and JPEG codecs.
/** API returns CUDA_ERROR_NOT_SUPPORTED error code for unsupported GPU or codec.
/************************************************************************************************************/
public static native @Cast("CUresult") int cuvidGetDecodeStatus(CUvideodecoder hDecoder, int nPicIdx, CUVIDGETDECODESTATUS pDecodeStatus);

/*********************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidReconfigureDecoder(CUvideodecoder hDecoder, CUVIDRECONFIGUREDECODERINFO *pDecReconfigParams)
/** Used to reuse single decoder for multiple clips. Currently supports resolution change, resize params, display area 
/** params, target area params change for same codec. Must be called during CUVIDPARSERPARAMS::pfnSequenceCallback 
/*********************************************************************************************************/
public static native @Cast("CUresult") int cuvidReconfigureDecoder(CUvideodecoder hDecoder, CUVIDRECONFIGUREDECODERINFO pDecReconfigParams);


// #if !defined(__CUVID_DEVPTR64) || defined(__CUVID_INTERNAL)
// #endif

// #if defined(_WIN64) || defined(__LP64__) || defined(__x86_64) || defined(AMD64) || defined(_M_AMD64)
/****************************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidMapVideoFrame64(CUvideodecoder hDecoder, int nPicIdx, unsigned long long *pDevPtr, 
/**                                           unsigned int * pPitch, CUVIDPROCPARAMS *pVPP);
/** Post-process and map video frame corresponding to nPicIdx for use in cuda. Returns cuda device pointer and associated
/** pitch of the video frame
/****************************************************************************************************************************/
public static native @Cast("CUresult") int cuvidMapVideoFrame64(CUvideodecoder hDecoder, int nPicIdx, @Cast("unsigned long long*") LongPointer pDevPtr,
                                             @Cast("unsigned int*") IntPointer pPitch, CUVIDPROCPARAMS pVPP);
public static native @Cast("CUresult") int cuvidMapVideoFrame64(CUvideodecoder hDecoder, int nPicIdx, @Cast("unsigned long long*") LongBuffer pDevPtr,
                                             @Cast("unsigned int*") IntBuffer pPitch, CUVIDPROCPARAMS pVPP);
public static native @Cast("CUresult") int cuvidMapVideoFrame64(CUvideodecoder hDecoder, int nPicIdx, @Cast("unsigned long long*") long[] pDevPtr,
                                             @Cast("unsigned int*") int[] pPitch, CUVIDPROCPARAMS pVPP);

/**************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidUnmapVideoFrame64(CUvideodecoder hDecoder, unsigned long long DevPtr);
/** Unmap a previously mapped video frame
/**************************************************************************************************/

//!
//!
public static native @Cast("CUresult") int cuvidUnmapVideoFrame64(CUvideodecoder hDecoder, @Cast("unsigned long long") long DevPtr);

// #if defined(__CUVID_DEVPTR64) && !defined(__CUVID_INTERNAL)
// #endif
// #endif



/********************************************************************************************************************/
/**
/** Context-locking: to facilitate multi-threaded implementations, the following 4 functions
/** provide a simple mutex-style host synchronization. If a non-NULL context is specified
/** in CUVIDDECODECREATEINFO, the codec library will acquire the mutex associated with the given
/** context before making any cuda calls.
/** A multi-threaded application could create a lock associated with a context handle so that
/** multiple threads can safely share the same cuda context:
/**  - use cuCtxPopCurrent immediately after context creation in order to create a 'floating' context
/**    that can be passed to cuvidCtxLockCreate.
/**  - When using a floating context, all cuda calls should only be made within a cuvidCtxLock/cuvidCtxUnlock section.
/**
/** NOTE: This is a safer alternative to cuCtxPushCurrent and cuCtxPopCurrent, and is not related to video
/** decoder in any way (implemented as a critical section associated with cuCtx{Push|Pop}Current calls).
/********************************************************************************************************************/

/********************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidCtxLockCreate(CUvideoctxlock *pLock, CUcontext ctx)
/** This API is used to create CtxLock object
/********************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCtxLockCreate(@ByPtrPtr _CUcontextlock_st pLock, CUctx_st ctx);

/********************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidCtxLockDestroy(CUvideoctxlock lck)
/** This API is used to free CtxLock object
/********************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCtxLockDestroy(_CUcontextlock_st lck);

/********************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidCtxLock(CUvideoctxlock lck, unsigned int reserved_flags)
/** This API is used to acquire ctxlock
/********************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCtxLock(_CUcontextlock_st lck, @Cast("unsigned int") int reserved_flags);

/********************************************************************************************************************/
/** \fn CUresult CUDAAPI cuvidCtxUnlock(CUvideoctxlock lck, unsigned int reserved_flags)
/** This API is used to release ctxlock
/********************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCtxUnlock(_CUcontextlock_st lck, @Cast("unsigned int") int reserved_flags);

/**********************************************************************************************/


// #if defined(__cplusplus)
// Targeting ../nvcuvid/CCtxAutoLock.java


// #endif /* __cplusplus */

// #endif // __CUDA_VIDEO_H__



// Parsed from nvcuvid.h

/*
 * This copyright notice applies to this header file only:
 *
 * Copyright (c) 2010-2021 NVIDIA Corporation
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the software, and to permit persons to whom the
 * software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

/********************************************************************************************************************/
/** \file nvcuvid.h
/**   NVDECODE API provides video decoding interface to NVIDIA GPU devices.
/** \date 2015-2020
/**  This file contains the interface constants, structure definitions and function prototypes.
/********************************************************************************************************************/

// #if !defined(__NVCUVID_H__) */
// #define __NVCUVID_H__

// #include "cuviddec.h"

// #if defined(__cplusplus)
// Targeting ../nvcuvid/CUvideosource.java


// Targeting ../nvcuvid/CUvideoparser.java




/************************************************************************/
/** \enum cudaVideoState
/** Video source state enums
/** Used in cuvidSetVideoSourceState and cuvidGetVideoSourceState APIs
/************************************************************************/
/** enum cudaVideoState */
public static final int
    /** Error state (invalid source)                  */
    cudaVideoState_Error   = -1,
    /** Source is stopped (or reached end-of-stream)  */
    cudaVideoState_Stopped = 0,
    /** Source is running and delivering data         */
    cudaVideoState_Started = 1;

/************************************************************************/
/** \enum cudaAudioCodec
/** Audio compression enums
/** Used in CUAUDIOFORMAT structure
/************************************************************************/
/** enum cudaAudioCodec */
public static final int
    /** MPEG-1 Audio               */
    cudaAudioCodec_MPEG1 = 0,
    /** MPEG-2 Audio               */
    cudaAudioCodec_MPEG2 = 1,
    /** MPEG-1 Layer III Audio     */
    cudaAudioCodec_MP3 = 2,
    /** Dolby Digital (AC3) Audio  */
    cudaAudioCodec_AC3 = 3,
    /** PCM Audio                  */
    cudaAudioCodec_LPCM = 4,
    /** AAC Audio                  */
    cudaAudioCodec_AAC = 5;
// Targeting ../nvcuvid/CUVIDEOFORMAT.java


// Targeting ../nvcuvid/CUVIDOPERATINGPOINTINFO.java


// Targeting ../nvcuvid/CUVIDAV1SEQHDR.java


// Targeting ../nvcuvid/CUVIDEOFORMATEX.java


// Targeting ../nvcuvid/CUAUDIOFORMAT.java




/***************************************************************/
/** \enum CUvideopacketflags
/** Data packet flags
/** Used in CUVIDSOURCEDATAPACKET structure
/***************************************************************/
/** enum CUvideopacketflags */
public static final int
    /** Set when this is the last packet for this stream                              */
    CUVID_PKT_ENDOFSTREAM   = 0x01,
    /** Timestamp is valid                                                            */
    CUVID_PKT_TIMESTAMP     = 0x02,
    /** Set when a discontinuity has to be signalled                                  */
    CUVID_PKT_DISCONTINUITY = 0x04,
    /** Set when the packet contains exactly one frame or one field                   */
    CUVID_PKT_ENDOFPICTURE  = 0x08,
    /** If this flag is set along with CUVID_PKT_ENDOFSTREAM, an additional (dummy)
                                           display callback will be invoked with null value of CUVIDPARSERDISPINFO which
                                           should be interpreted as end of the stream.                                   */
    CUVID_PKT_NOTIFY_EOS    = 0x10;
// Targeting ../nvcuvid/CUVIDSOURCEDATAPACKET.java


// Targeting ../nvcuvid/PFNVIDSOURCECALLBACK.java


// Targeting ../nvcuvid/CUVIDSOURCEPARAMS.java




/**********************************************/
/** \ingroup ENUMS
/** \enum CUvideosourceformat_flags
/** CUvideosourceformat_flags
/** Used in cuvidGetSourceVideoFormat API
/**********************************************/
/** enum CUvideosourceformat_flags */
public static final int
    /** Return extended format structure (CUVIDEOFORMATEX) */
    CUVID_FMT_EXTFORMATINFO = 0x100;

// #if !defined(__APPLE__)
/***************************************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidCreateVideoSource(CUvideosource *pObj, const char *pszFileName, CUVIDSOURCEPARAMS *pParams)
/** Create CUvideosource object. CUvideosource spawns demultiplexer thread that provides two callbacks: 
/** pfnVideoDataHandler() and pfnAudioDataHandler()
/** NVDECODE API is intended for HW accelerated video decoding so CUvideosource doesn't have audio demuxer for all supported 
/** containers. It's recommended to clients to use their own or third party demuxer if audio support is needed.
/***************************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCreateVideoSource(@ByPtrPtr CUvideosource pObj, String pszFileName, CUVIDSOURCEPARAMS pParams);
public static native @Cast("CUresult") int cuvidCreateVideoSource(@ByPtrPtr CUvideosource pObj, @Cast("const char*") BytePointer pszFileName, CUVIDSOURCEPARAMS pParams);

/***************************************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidCreateVideoSourceW(CUvideosource *pObj, const wchar_t *pwszFileName, CUVIDSOURCEPARAMS *pParams)
/** Create video source
/***************************************************************************************************************************/
public static native @Cast("CUresult") int cuvidCreateVideoSourceW(@ByPtrPtr CUvideosource pObj, @Cast("const wchar_t*") CharPointer pwszFileName, CUVIDSOURCEPARAMS pParams);
public static native @Cast("CUresult") int cuvidCreateVideoSourceW(@ByPtrPtr CUvideosource pObj, @Cast("const wchar_t*") IntPointer pwszFileName, CUVIDSOURCEPARAMS pParams);

/********************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidDestroyVideoSource(CUvideosource obj)
/** Destroy video source
/********************************************************************/
public static native @Cast("CUresult") int cuvidDestroyVideoSource(CUvideosource obj);

/******************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidSetVideoSourceState(CUvideosource obj, cudaVideoState state)
/** Set video source state to:
/** cudaVideoState_Started - to signal the source to run and deliver data
/** cudaVideoState_Stopped - to stop the source from delivering the data
/** cudaVideoState_Error   - invalid source
/******************************************************************************************/
public static native @Cast("CUresult") int cuvidSetVideoSourceState(CUvideosource obj, @Cast("cudaVideoState") int state);

/******************************************************************************************/
/** \ingroup FUNCTS
/** \fn cudaVideoState CUDAAPI cuvidGetVideoSourceState(CUvideosource obj)
/** Get video source state
/** Returns:
/** cudaVideoState_Started - if Source is running and delivering data
/** cudaVideoState_Stopped - if Source is stopped or reached end-of-stream
/** cudaVideoState_Error   - if Source is in error state
/******************************************************************************************/
public static native @Cast("cudaVideoState") int cuvidGetVideoSourceState(CUvideosource obj);

/******************************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidGetSourceVideoFormat(CUvideosource obj, CUVIDEOFORMAT *pvidfmt, unsigned int flags)
/** Gets video source format in pvidfmt, flags is set to combination of CUvideosourceformat_flags as per requirement
/******************************************************************************************************************/
public static native @Cast("CUresult") int cuvidGetSourceVideoFormat(CUvideosource obj, CUVIDEOFORMAT pvidfmt, @Cast("unsigned int") int flags);

/**************************************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidGetSourceAudioFormat(CUvideosource obj, CUAUDIOFORMAT *paudfmt, unsigned int flags)
/** Get audio source format
/** NVDECODE API is intended for HW accelerated video decoding so CUvideosource doesn't have audio demuxer for all supported 
/** containers. It's recommended to clients to use their own or third party demuxer if audio support is needed.
/**************************************************************************************************************************/
public static native @Cast("CUresult") int cuvidGetSourceAudioFormat(CUvideosource obj, CUAUDIOFORMAT paudfmt, @Cast("unsigned int") int flags);
// Targeting ../nvcuvid/CUVIDPARSERDISPINFO.java


// Targeting ../nvcuvid/PFNVIDSEQUENCECALLBACK.java


// Targeting ../nvcuvid/PFNVIDDECODECALLBACK.java


// Targeting ../nvcuvid/PFNVIDDISPLAYCALLBACK.java


// Targeting ../nvcuvid/PFNVIDOPPOINTCALLBACK.java


// Targeting ../nvcuvid/CUVIDPARSERPARAMS.java



/************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidCreateVideoParser(CUvideoparser *pObj, CUVIDPARSERPARAMS *pParams)
/** Create video parser object and initialize
/************************************************************************************************/
public static native @Cast("CUresult") int cuvidCreateVideoParser(@ByPtrPtr CUvideoparser pObj, CUVIDPARSERPARAMS pParams);

/************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidParseVideoData(CUvideoparser obj, CUVIDSOURCEDATAPACKET *pPacket)
/** Parse the video data from source data packet in pPacket 
/** Extracts parameter sets like SPS, PPS, bitstream etc. from pPacket and 
/** calls back pfnDecodePicture with CUVIDPICPARAMS data for kicking of HW decoding
/** calls back pfnSequenceCallback with CUVIDEOFORMAT data for initial sequence header or when
/** the decoder encounters a video format change
/** calls back pfnDisplayPicture with CUVIDPARSERDISPINFO data to display a video frame
/************************************************************************************************/
public static native @Cast("CUresult") int cuvidParseVideoData(CUvideoparser obj, CUVIDSOURCEDATAPACKET pPacket);

/************************************************************************************************/
/** \ingroup FUNCTS
/** \fn CUresult CUDAAPI cuvidDestroyVideoParser(CUvideoparser obj)
/** Destroy the video parser
/************************************************************************************************/
public static native @Cast("CUresult") int cuvidDestroyVideoParser(CUvideoparser obj);

/**********************************************************************************************/

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #endif // __NVCUVID_H__




}
