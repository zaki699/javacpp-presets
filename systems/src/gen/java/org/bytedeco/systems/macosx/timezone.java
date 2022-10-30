// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Name("struct timezone") @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class timezone extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timezone() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timezone(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timezone(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timezone position(long position) {
        return (timezone)super.position(position);
    }
    @Override public timezone getPointer(long i) {
        return new timezone((Pointer)this).offsetAddress(i);
    }

	public native int tz_minuteswest(); public native timezone tz_minuteswest(int setter); /* minutes west of Greenwich */
	public native int tz_dsttime(); public native timezone tz_dsttime(int setter);     /* type of dst correction */
}
