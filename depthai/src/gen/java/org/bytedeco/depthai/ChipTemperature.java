// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Chip temperature information.
 *
 * Multiple temperature measurement points and their average
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ChipTemperature extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ChipTemperature() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ChipTemperature(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChipTemperature(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ChipTemperature position(long position) {
        return (ChipTemperature)super.position(position);
    }
    @Override public ChipTemperature getPointer(long i) {
        return new ChipTemperature((Pointer)this).offsetAddress(i);
    }

    /**
     *  CPU Subsystem
     */
    public native float css(); public native ChipTemperature css(float setter);
    /**
     *  Media Subsystem
     */
    public native float mss(); public native ChipTemperature mss(float setter);
    /**
     *  Shave Array
     */
    public native float upa(); public native ChipTemperature upa(float setter);
    /**
     *  DRAM Subsystem
     */
    public native float dss(); public native ChipTemperature dss(float setter);
    /**
     *  Average of measurements
     */
    public native float average(); public native ChipTemperature average(float setter);
}
