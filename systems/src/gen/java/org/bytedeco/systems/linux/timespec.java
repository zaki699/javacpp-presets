// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;
	/* This defines __time_t for us.  */

/* POSIX.1b structure for a time value.  This is like a `struct timeval' but
   has nanoseconds instead of microseconds.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class timespec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timespec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timespec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timespec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timespec position(long position) {
        return (timespec)super.position(position);
    }
    @Override public timespec getPointer(long i) {
        return new timespec((Pointer)this).offsetAddress(i);
    }

    public native @Cast("__time_t") long tv_sec(); public native timespec tv_sec(long setter);		/* Seconds.  */
    public native @Cast("__syscall_slong_t") long tv_nsec(); public native timespec tv_nsec(long setter);	/* Nanoseconds.  */
  }
