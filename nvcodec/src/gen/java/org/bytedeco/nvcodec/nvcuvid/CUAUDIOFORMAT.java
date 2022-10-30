// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/****************************************************************/
/** \ingroup STRUCTS
/** \struct CUAUDIOFORMAT
/** Audio formats
/** Used in cuvidGetSourceAudioFormat API
/****************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUAUDIOFORMAT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUAUDIOFORMAT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUAUDIOFORMAT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUAUDIOFORMAT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUAUDIOFORMAT position(long position) {
        return (CUAUDIOFORMAT)super.position(position);
    }
    @Override public CUAUDIOFORMAT getPointer(long i) {
        return new CUAUDIOFORMAT((Pointer)this).offsetAddress(i);
    }

    /** OUT: Compression format                                              */
    public native @Cast("cudaAudioCodec") int codec(); public native CUAUDIOFORMAT codec(int setter);
    /** OUT: number of audio channels                                        */
    public native @Cast("unsigned int") int channels(); public native CUAUDIOFORMAT channels(int setter);
    /** OUT: sampling frequency                                              */
    public native @Cast("unsigned int") int samplespersec(); public native CUAUDIOFORMAT samplespersec(int setter);
    /** OUT: For uncompressed, can also be used to determine bits per sample */
    public native @Cast("unsigned int") int bitrate(); public native CUAUDIOFORMAT bitrate(int setter);
    /** Reserved for future use                                              */
    public native @Cast("unsigned int") int reserved1(); public native CUAUDIOFORMAT reserved1(int setter);
    /** Reserved for future use                                              */
    public native @Cast("unsigned int") int reserved2(); public native CUAUDIOFORMAT reserved2(int setter);
}
