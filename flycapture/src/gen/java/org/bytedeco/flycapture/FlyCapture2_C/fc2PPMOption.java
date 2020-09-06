// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Options for saving PPM images. */
     @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2PPMOption extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2PPMOption() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2PPMOption(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2PPMOption(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2PPMOption position(long position) {
            return (fc2PPMOption)super.position(position);
        }
        @Override public fc2PPMOption getPointer(long i) {
            return new fc2PPMOption(this).position(position + i);
        }
    
        /** Whether to save the PPM as a binary file. */
        public native @Cast("BOOL") int binaryFile(); public native fc2PPMOption binaryFile(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2PPMOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    } 
