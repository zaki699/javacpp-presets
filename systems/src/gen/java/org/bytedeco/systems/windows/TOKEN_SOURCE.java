// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_SOURCE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_SOURCE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_SOURCE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_SOURCE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_SOURCE position(long position) {
        return (TOKEN_SOURCE)super.position(position);
    }
    @Override public TOKEN_SOURCE getPointer(long i) {
        return new TOKEN_SOURCE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("CHAR") byte SourceName(int i); public native TOKEN_SOURCE SourceName(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer SourceName();
    public native @ByRef LUID SourceIdentifier(); public native TOKEN_SOURCE SourceIdentifier(LUID setter);
}
