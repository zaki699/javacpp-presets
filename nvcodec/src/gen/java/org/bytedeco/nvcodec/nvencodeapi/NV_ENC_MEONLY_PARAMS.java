// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;



/**
 * \struct _NV_ENC_MEONLY_PARAMS
 * MEOnly parameters that need to be sent on a per motion estimation basis.
 * NV_ENC_MEONLY_PARAMS::meExternalHints is supported for H264 only.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_MEONLY_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_MEONLY_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_MEONLY_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_MEONLY_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_MEONLY_PARAMS position(long position) {
        return (NV_ENC_MEONLY_PARAMS)super.position(position);
    }
    @Override public NV_ENC_MEONLY_PARAMS getPointer(long i) {
        return new NV_ENC_MEONLY_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to NV_ENC_MEONLY_PARAMS_VER.*/
    public native @Cast("uint32_t") int version(); public native NV_ENC_MEONLY_PARAMS version(int setter);
    /** [in]: Specifies the input frame width */
    public native @Cast("uint32_t") int inputWidth(); public native NV_ENC_MEONLY_PARAMS inputWidth(int setter);
    /** [in]: Specifies the input frame height */
    public native @Cast("uint32_t") int inputHeight(); public native NV_ENC_MEONLY_PARAMS inputHeight(int setter);
    /** [in]: Specifies the input buffer pointer. Client must use a pointer obtained from NvEncCreateInputBuffer() or NvEncMapInputResource() APIs. */
    public native NV_ENC_INPUT_PTR inputBuffer(); public native NV_ENC_MEONLY_PARAMS inputBuffer(NV_ENC_INPUT_PTR setter);
    /** [in]: Specifies the reference frame pointer */
    public native NV_ENC_INPUT_PTR referenceFrame(); public native NV_ENC_MEONLY_PARAMS referenceFrame(NV_ENC_INPUT_PTR setter);
    /** [in]: Specifies the output buffer pointer.
                                                                               If NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is set to 0, specifies the pointer to motion vector data buffer allocated by NvEncCreateMVBuffer. 
                                                                               Client must lock mvBuffer using ::NvEncLockBitstream() API to get the motion vector data. 
                                                                               If NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is set to 1, client should allocate buffer in video memory for storing the motion vector data. The size of this buffer must 
                                                                               be equal to total number of macroblocks multiplied by size of NV_ENC_H264_MV_DATA struct. Client should use a pointer obtained from ::NvEncMapInputResource() API, when mapping this 
                                                                               output buffer and assign it to NV_ENC_MEONLY_PARAMS::mvBuffer. All CUDA operations on this buffer must use the default stream. */
    public native NV_ENC_OUTPUT_PTR mvBuffer(); public native NV_ENC_MEONLY_PARAMS mvBuffer(NV_ENC_OUTPUT_PTR setter);
    /** [in]: Specifies the input buffer format. */
    public native @Cast("NV_ENC_BUFFER_FORMAT") int bufferFmt(); public native NV_ENC_MEONLY_PARAMS bufferFmt(int setter);
    /** [in]: Specifies an event to be signaled on completion of motion estimation 
                                                                               of this Frame [only if operating in Asynchronous mode]. 
                                                                               Each output buffer should be associated with a distinct event pointer. */
    public native Pointer completionEvent(); public native NV_ENC_MEONLY_PARAMS completionEvent(Pointer setter);
    /** [in]: Specifies left or right viewID if NV_ENC_CONFIG_H264_MEONLY::bStereoEnable is set.
                                                                                viewID can be 0,1 if bStereoEnable is set, 0 otherwise. */
    public native @Cast("uint32_t") int viewID(); public native NV_ENC_MEONLY_PARAMS viewID(int setter);
    /** [in]: Specifies the number of hint candidates per block for the current frame. meHintCountsPerBlock[0] is for L0 predictors.
                                                                                The candidate count in NV_ENC_PIC_PARAMS::meHintCountsPerBlock[lx] must never exceed NV_ENC_INITIALIZE_PARAMS::maxMEHintCountsPerBlock[lx] provided during encoder initialization. */
    public native @ByRef NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE meHintCountsPerBlock(int i); public native NV_ENC_MEONLY_PARAMS meHintCountsPerBlock(int i, NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE setter);
    @MemberGetter public native NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE meHintCountsPerBlock();
    /** [in]: Specifies the pointer to ME external hints for the current frame. The size of ME hint buffer should be equal to number of macroblocks * the total number of candidates per macroblock.
                                                                                The total number of candidates per MB per direction = 1*meHintCountsPerBlock[Lx].numCandsPerBlk16x16 + 2*meHintCountsPerBlock[Lx].numCandsPerBlk16x8 + 2*meHintCountsPerBlock[Lx].numCandsPerBlk8x8  
                                                                                + 4*meHintCountsPerBlock[Lx].numCandsPerBlk8x8. For frames using bidirectional ME , the total number of candidates for single macroblock is sum of total number of candidates per MB for each direction (L0 and L1) */
    public native NVENC_EXTERNAL_ME_HINT meExternalHints(); public native NV_ENC_MEONLY_PARAMS meExternalHints(NVENC_EXTERNAL_ME_HINT setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_MEONLY_PARAMS reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_MEONLY_PARAMS reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
