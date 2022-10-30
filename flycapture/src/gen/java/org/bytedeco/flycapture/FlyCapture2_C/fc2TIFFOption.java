// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Options for saving TIFF images. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2TIFFOption extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2TIFFOption() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2TIFFOption(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2TIFFOption(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2TIFFOption position(long position) {
            return (fc2TIFFOption)super.position(position);
        }
        @Override public fc2TIFFOption getPointer(long i) {
            return new fc2TIFFOption((Pointer)this).offsetAddress(i);
        }
    
        /** Compression method to use for encoding TIFF images. */
        public native @Cast("fc2TIFFCompressionMethod") int compression(); public native fc2TIFFOption compression(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2TIFFOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
