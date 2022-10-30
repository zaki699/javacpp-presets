// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// IOCTL_TAPE_SET_DRIVE_PARAMETERS definitions
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_SET_DRIVE_PARAMETERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_SET_DRIVE_PARAMETERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_SET_DRIVE_PARAMETERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_SET_DRIVE_PARAMETERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_SET_DRIVE_PARAMETERS position(long position) {
        return (TAPE_SET_DRIVE_PARAMETERS)super.position(position);
    }
    @Override public TAPE_SET_DRIVE_PARAMETERS getPointer(long i) {
        return new TAPE_SET_DRIVE_PARAMETERS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BOOLEAN") boolean ECC(); public native TAPE_SET_DRIVE_PARAMETERS ECC(boolean setter);
    public native @Cast("BOOLEAN") boolean Compression(); public native TAPE_SET_DRIVE_PARAMETERS Compression(boolean setter);
    public native @Cast("BOOLEAN") boolean DataPadding(); public native TAPE_SET_DRIVE_PARAMETERS DataPadding(boolean setter);
    public native @Cast("BOOLEAN") boolean ReportSetmarks(); public native TAPE_SET_DRIVE_PARAMETERS ReportSetmarks(boolean setter);
    public native @Cast("DWORD") int EOTWarningZoneSize(); public native TAPE_SET_DRIVE_PARAMETERS EOTWarningZoneSize(int setter);
}
