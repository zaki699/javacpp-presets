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
 * Motion vector structure per macroblock for H264 motion estimation.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_H264_MV_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_H264_MV_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_H264_MV_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_H264_MV_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_H264_MV_DATA position(long position) {
        return (NV_ENC_H264_MV_DATA)super.position(position);
    }
    @Override public NV_ENC_H264_MV_DATA getPointer(long i) {
        return new NV_ENC_H264_MV_DATA((Pointer)this).offsetAddress(i);
    }

    /** up to 4 vectors for 8x8 partition */
    public native @ByRef NV_ENC_MVECTOR mv(int i); public native NV_ENC_H264_MV_DATA mv(int i, NV_ENC_MVECTOR setter);
    @MemberGetter public native NV_ENC_MVECTOR mv();
    /** 0 (I), 1 (P), 2 (IPCM), 3 (B) */
    public native @Cast("uint8_t") byte mbType(); public native NV_ENC_H264_MV_DATA mbType(byte setter);
    /** Specifies the block partition type. 0:16x16, 1:8x8, 2:16x8, 3:8x16 */
    public native @Cast("uint8_t") byte partitionType(); public native NV_ENC_H264_MV_DATA partitionType(byte setter);
    /** reserved padding for alignment */
    public native @Cast("uint16_t") short reserved(); public native NV_ENC_H264_MV_DATA reserved(short setter);
    public native @Cast("uint32_t") int mbCost(); public native NV_ENC_H264_MV_DATA mbCost(int setter);
}
