// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


// #endif
/**********************************************************************************/
/** \ingroup STRUCTS
/** \struct CUVIDPARSERDISPINFO
/** Used in cuvidParseVideoData API with PFNVIDDISPLAYCALLBACK pfnDisplayPicture
/**********************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDPARSERDISPINFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDPARSERDISPINFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDPARSERDISPINFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDPARSERDISPINFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDPARSERDISPINFO position(long position) {
        return (CUVIDPARSERDISPINFO)super.position(position);
    }
    @Override public CUVIDPARSERDISPINFO getPointer(long i) {
        return new CUVIDPARSERDISPINFO((Pointer)this).offsetAddress(i);
    }

    /** OUT: Index of the current picture                                                         */
    public native int picture_index(); public native CUVIDPARSERDISPINFO picture_index(int setter);
    /** OUT: 1 if progressive frame; 0 otherwise                                                  */
    public native int progressive_frame(); public native CUVIDPARSERDISPINFO progressive_frame(int setter);
    /** OUT: 1 if top field is displayed first; 0 otherwise                                       */
    public native int top_field_first(); public native CUVIDPARSERDISPINFO top_field_first(int setter);
    /** OUT: Number of additional fields (1=ivtc, 2=frame doubling, 4=frame tripling, 
                                         -1=unpaired field)                                                                        */
    public native int repeat_first_field(); public native CUVIDPARSERDISPINFO repeat_first_field(int setter);
    /** OUT: Presentation time stamp                                                              */
    public native @Cast("CUvideotimestamp") long timestamp(); public native CUVIDPARSERDISPINFO timestamp(long setter);
}
