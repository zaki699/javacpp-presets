// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Options for saving PPM images. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class PPMOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PPMOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PPMOption(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PPMOption position(long position) {
            return (PPMOption)super.position(position);
        }
        @Override public PPMOption getPointer(long i) {
            return new PPMOption((Pointer)this).offsetAddress(i);
        }
    
        /** Whether to save the PPM as a binary file. */
        public native @Cast("bool") boolean binaryFile(); public native PPMOption binaryFile(boolean setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PPMOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PPMOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
