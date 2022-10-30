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
 * Creation parameters for output motion vector buffer for ME only mode.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CREATE_MV_BUFFER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CREATE_MV_BUFFER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CREATE_MV_BUFFER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CREATE_MV_BUFFER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CREATE_MV_BUFFER position(long position) {
        return (NV_ENC_CREATE_MV_BUFFER)super.position(position);
    }
    @Override public NV_ENC_CREATE_MV_BUFFER getPointer(long i) {
        return new NV_ENC_CREATE_MV_BUFFER((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to NV_ENC_CREATE_MV_BUFFER_VER */
    public native @Cast("uint32_t") int version(); public native NV_ENC_CREATE_MV_BUFFER version(int setter);
    /** [out]: Pointer to the output motion vector buffer */
    public native NV_ENC_OUTPUT_PTR mvBuffer(); public native NV_ENC_CREATE_MV_BUFFER mvBuffer(NV_ENC_OUTPUT_PTR setter);
    /** [in]: Reserved and should be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_CREATE_MV_BUFFER reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and should be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_CREATE_MV_BUFFER reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
