// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** Data from the tilt motor and accelerometer */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_raw_tilt_state extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_raw_tilt_state() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_raw_tilt_state(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_raw_tilt_state(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_raw_tilt_state position(long position) {
        return (freenect_raw_tilt_state)super.position(position);
    }
    @Override public freenect_raw_tilt_state getPointer(long i) {
        return new freenect_raw_tilt_state((Pointer)this).offsetAddress(i);
    }

	/** Raw accelerometer data for X-axis, see FREENECT_COUNTS_PER_G for conversion */
	public native short accelerometer_x(); public native freenect_raw_tilt_state accelerometer_x(short setter);
	/** Raw accelerometer data for Y-axis, see FREENECT_COUNTS_PER_G for conversion */
	public native short accelerometer_y(); public native freenect_raw_tilt_state accelerometer_y(short setter);
	/** Raw accelerometer data for Z-axis, see FREENECT_COUNTS_PER_G for conversion */
	public native short accelerometer_z(); public native freenect_raw_tilt_state accelerometer_z(short setter);
	/** Raw tilt motor angle encoder information */
	public native byte tilt_angle(); public native freenect_raw_tilt_state tilt_angle(byte setter);
	/** State of the tilt motor (stopped, moving, etc...) */
	public native @Cast("freenect_tilt_status_code") int tilt_status(); public native freenect_raw_tilt_state tilt_status(int setter);
}
