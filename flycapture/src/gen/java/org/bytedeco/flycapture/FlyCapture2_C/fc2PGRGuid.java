// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * A GUID to the camera.  It is used to uniquely identify a camera.
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2PGRGuid extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2PGRGuid() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2PGRGuid(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2PGRGuid(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2PGRGuid position(long position) {
            return (fc2PGRGuid)super.position(position);
        }
        @Override public fc2PGRGuid getPointer(long i) {
            return new fc2PGRGuid((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("unsigned int") int value(int i); public native fc2PGRGuid value(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer value();

    }
