// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;

    @Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_dsm_params extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public rs2_dsm_params() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public rs2_dsm_params(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public rs2_dsm_params(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public rs2_dsm_params position(long position) {
            return (rs2_dsm_params)super.position(position);
        }
        @Override public rs2_dsm_params getPointer(long i) {
            return new rs2_dsm_params((Pointer)this).offsetAddress(i);
        }
    
        /** system_clock::time_point::time_since_epoch().count() */
        public native @Cast("unsigned long long") long timestamp(); public native rs2_dsm_params timestamp(long setter);
        /** MAJOR<<12 | MINOR<<4 | PATCH */
        public native @Cast("unsigned short") short version(); public native rs2_dsm_params version(short setter);
        /** rs2_dsm_correction_model */
        public native @Cast("unsigned char") byte model(); public native rs2_dsm_params model(byte setter);
        /** TBD, now 0s */
        public native @Cast("unsigned char") byte flags(int i); public native rs2_dsm_params flags(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer flags();
        /** the scale factor to horizontal DSM scale thermal results */
        public native float h_scale(); public native rs2_dsm_params h_scale(float setter);
        /** the scale factor to vertical DSM scale thermal results */
        public native float v_scale(); public native rs2_dsm_params v_scale(float setter);
        /** the offset to horizontal DSM offset thermal results */
        public native float h_offset(); public native rs2_dsm_params h_offset(float setter);
        /** the offset to vertical DSM offset thermal results */
        public native float v_offset(); public native rs2_dsm_params v_offset(float setter);
        /** the offset to the Round-Trip-Distance delay thermal results */
        public native float rtd_offset(); public native rs2_dsm_params rtd_offset(float setter);
        /** the temperature recorded times 2 (ldd for depth; hum for rgb) */
        public native @Cast("unsigned char") byte temp_x2(); public native rs2_dsm_params temp_x2(byte setter);
        /** the scale factor to horizontal LOS coefficients in MC */
        public native float mc_h_scale(); public native rs2_dsm_params mc_h_scale(float setter);
        /** the scale factor to vertical LOS coefficients in MC */
        public native float mc_v_scale(); public native rs2_dsm_params mc_v_scale(float setter);
        /** time (in weeks) since factory calibration */
        public native @Cast("unsigned char") byte weeks_since_calibration(); public native rs2_dsm_params weeks_since_calibration(byte setter);
        /** time (in weeks) between factory calibration and last AC event */
        public native @Cast("unsigned char") byte ac_weeks_since_calibaration(); public native rs2_dsm_params ac_weeks_since_calibaration(byte setter);
        public native @Cast("unsigned char") byte reserved(int i); public native rs2_dsm_params reserved(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer reserved();
    }
