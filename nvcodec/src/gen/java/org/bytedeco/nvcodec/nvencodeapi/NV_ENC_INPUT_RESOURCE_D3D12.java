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
  * \struct _NV_ENC_INPUT_RESOURCE_D3D12
  * NV_ENC_PIC_PARAMS::inputBuffer and NV_ENC_PIC_PARAMS::alphaBuffer must be a pointer to a struct of this type,
  * when D3D12 interface is used
  */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_INPUT_RESOURCE_D3D12 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_INPUT_RESOURCE_D3D12() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_INPUT_RESOURCE_D3D12(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_INPUT_RESOURCE_D3D12(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_INPUT_RESOURCE_D3D12 position(long position) {
        return (NV_ENC_INPUT_RESOURCE_D3D12)super.position(position);
    }
    @Override public NV_ENC_INPUT_RESOURCE_D3D12 getPointer(long i) {
        return new NV_ENC_INPUT_RESOURCE_D3D12((Pointer)this).offsetAddress(i);
    }

    /** [in]: Specifies the input surface pointer. Client must use a pointer obtained from NvEncRegisterResource() in NV_ENC_REGISTER_RESOURCE::registeredResource
                                                                      when registering input surface. */
    public native NV_ENC_REGISTERED_PTR pInputBuffer(); public native NV_ENC_INPUT_RESOURCE_D3D12 pInputBuffer(NV_ENC_REGISTERED_PTR setter);
    /** [in]: Specifies the input fence and corresponding fence value to do GPU wait. 
                                                                      This fence will be used to do GPU wait until the specified fence reaches or exceeds the specified value. */
    public native @ByRef NV_ENC_FENCE_POINT_D3D12 inputFencePoint(); public native NV_ENC_INPUT_RESOURCE_D3D12 inputFencePoint(NV_ENC_FENCE_POINT_D3D12 setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_INPUT_RESOURCE_D3D12 reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL. */
    public native Pointer reserved2(int i); public native NV_ENC_INPUT_RESOURCE_D3D12 reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
