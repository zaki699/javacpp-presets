// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;



/* This is the type of elements in `Dl_serinfo', below.
   The `dls_name' member points to space in the buffer passed to `dlinfo'.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class Dl_serpath extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Dl_serpath() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dl_serpath(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dl_serpath(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Dl_serpath position(long position) {
        return (Dl_serpath)super.position(position);
    }
    @Override public Dl_serpath getPointer(long i) {
        return new Dl_serpath((Pointer)this).offsetAddress(i);
    }

  public native @Cast("char*") BytePointer dls_name(); public native Dl_serpath dls_name(BytePointer setter);		/* Name of library search path directory.  */
  public native @Cast("unsigned int") int dls_flags(); public native Dl_serpath dls_flags(int setter);	/* Indicates where this directory came from. */
}
