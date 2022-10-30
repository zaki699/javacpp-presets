// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    /** \brief Motion data from gyroscope and accelerometer from the microcontroller */
    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class motion_data extends rs_motion_data {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public motion_data(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public motion_data(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public motion_data position(long position) {
            return (motion_data)super.position(position);
        }
        @Override public motion_data getPointer(long i) {
            return new motion_data((Pointer)this).offsetAddress(i);
        }
    
        public motion_data(@ByVal rs_motion_data orig) { super((Pointer)null); allocate(orig); }
        private native void allocate(@ByVal rs_motion_data orig);
        public motion_data() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
