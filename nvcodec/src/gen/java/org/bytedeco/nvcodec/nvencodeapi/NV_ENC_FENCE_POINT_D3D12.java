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


/** \struct NV_ENC_FENCE_POINT_D3D12
  * Fence and fence value for synchronization.
  */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_FENCE_POINT_D3D12 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_FENCE_POINT_D3D12() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_FENCE_POINT_D3D12(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_FENCE_POINT_D3D12(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_FENCE_POINT_D3D12 position(long position) {
        return (NV_ENC_FENCE_POINT_D3D12)super.position(position);
    }
    @Override public NV_ENC_FENCE_POINT_D3D12 getPointer(long i) {
        return new NV_ENC_FENCE_POINT_D3D12((Pointer)this).offsetAddress(i);
    }

    /** [in]: Pointer to ID3D12Fence. This fence object is used for synchronization. */
    public native Pointer pFence(); public native NV_ENC_FENCE_POINT_D3D12 pFence(Pointer setter);
    /** [in]: Fence value to reach or exceed before the GPU operation or
                                                                      fence value to set the fence to, after the GPU operation. */
    public native @Cast("uint64_t") int value(); public native NV_ENC_FENCE_POINT_D3D12 value(int setter);
}
