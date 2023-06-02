// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    /** \brief Video stream intrinsics */
    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class intrinsics extends rs_intrinsics {
        static { Loader.load(); }
        /** Default native constructor. */
        public intrinsics() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public intrinsics(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public intrinsics(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public intrinsics position(long position) {
            return (intrinsics)super.position(position);
        }
        @Override public intrinsics getPointer(long i) {
            return new intrinsics((Pointer)this).offsetAddress(i);
        }
    
        public native float hfov();
        public native float vfov();
        public native @Cast("rs::distortion") int model();

                    // Helpers for mapping between pixel coordinates and texture coordinates
        public native @ByVal float2 pixel_to_texcoord(@Const @ByRef float2 pixel);
        public native @ByVal float2 texcoord_to_pixel(@Const @ByRef float2 coord);

                    // Helpers for mapping from image coordinates into 3D space
        public native @ByVal float3 deproject(@Const @ByRef float2 pixel, float depth);
        public native @ByVal float3 deproject_from_texcoord(@Const @ByRef float2 coord, float depth);

                    // Helpers for mapping from 3D space into image coordinates
        public native @ByVal float2 project(@Const @ByRef float3 point);
        public native @ByVal float2 project_to_texcoord(@Const @ByRef float3 point);

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef intrinsics r);

    }
