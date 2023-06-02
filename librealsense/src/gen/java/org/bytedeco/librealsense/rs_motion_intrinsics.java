// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


/** \brief Motion module intrinsics: includes accelerometer and gyroscope intrinsics structs of type \c rs_motion_device_intrinsic. */
@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_motion_intrinsics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs_motion_intrinsics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs_motion_intrinsics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_motion_intrinsics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs_motion_intrinsics position(long position) {
        return (rs_motion_intrinsics)super.position(position);
    }
    @Override public rs_motion_intrinsics getPointer(long i) {
        return new rs_motion_intrinsics((Pointer)this).offsetAddress(i);
    }

    public native @ByRef rs_motion_device_intrinsic acc(); public native rs_motion_intrinsics acc(rs_motion_device_intrinsic setter);
    public native @ByRef rs_motion_device_intrinsic gyro(); public native rs_motion_intrinsics gyro(rs_motion_device_intrinsic setter);
}
