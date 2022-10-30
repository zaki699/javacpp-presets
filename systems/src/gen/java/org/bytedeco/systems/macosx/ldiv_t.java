// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class ldiv_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ldiv_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ldiv_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ldiv_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ldiv_t position(long position) {
        return (ldiv_t)super.position(position);
    }
    @Override public ldiv_t getPointer(long i) {
        return new ldiv_t((Pointer)this).offsetAddress(i);
    }

	public native long quot(); public native ldiv_t quot(long setter);		/* quotient */
	public native long rem(); public native ldiv_t rem(long setter);		/* remainder */
}
