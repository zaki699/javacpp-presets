// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STSloPenaltyControl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STSloPenaltyControl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STSloPenaltyControl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STSloPenaltyControl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STSloPenaltyControl position(long position) {
        return (STSloPenaltyControl)super.position(position);
    }
    @Override public STSloPenaltyControl getPointer(long i) {
        return new STSloPenaltyControl((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int sloK1Penalty(); public native STSloPenaltyControl sloK1Penalty(int setter);
    public native @Cast("uint32_t") int sloK2Penalty(); public native STSloPenaltyControl sloK2Penalty(int setter);
    public native @Cast("uint32_t") int sloK1PenaltyMod1(); public native STSloPenaltyControl sloK1PenaltyMod1(int setter);
    public native @Cast("uint32_t") int sloK2PenaltyMod1(); public native STSloPenaltyControl sloK2PenaltyMod1(int setter);
    public native @Cast("uint32_t") int sloK1PenaltyMod2(); public native STSloPenaltyControl sloK1PenaltyMod2(int setter);
    public native @Cast("uint32_t") int sloK2PenaltyMod2(); public native STSloPenaltyControl sloK2PenaltyMod2(int setter);
}
