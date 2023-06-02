// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SECURITY_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SECURITY_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SECURITY_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SECURITY_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SECURITY_DESCRIPTOR position(long position) {
        return (SECURITY_DESCRIPTOR)super.position(position);
    }
    @Override public SECURITY_DESCRIPTOR getPointer(long i) {
        return new SECURITY_DESCRIPTOR((Pointer)this).offsetAddress(i);
    }

   public native @Cast("BYTE") byte Revision(); public native SECURITY_DESCRIPTOR Revision(byte setter);
   public native @Cast("BYTE") byte Sbz1(); public native SECURITY_DESCRIPTOR Sbz1(byte setter);
   public native @Cast("SECURITY_DESCRIPTOR_CONTROL") short Control(); public native SECURITY_DESCRIPTOR Control(short setter);
   public native @Cast("PSID") Pointer Owner(); public native SECURITY_DESCRIPTOR Owner(Pointer setter);
   public native @Cast("PSID") Pointer Group(); public native SECURITY_DESCRIPTOR Group(Pointer setter);
   public native @Cast("PACL") ACL Sacl(); public native SECURITY_DESCRIPTOR Sacl(ACL setter);
   public native @Cast("PACL") ACL Dacl(); public native SECURITY_DESCRIPTOR Dacl(ACL setter);

   }
