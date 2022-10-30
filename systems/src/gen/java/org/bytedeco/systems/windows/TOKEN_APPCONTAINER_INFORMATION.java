// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_APPCONTAINER_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_APPCONTAINER_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_APPCONTAINER_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_APPCONTAINER_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_APPCONTAINER_INFORMATION position(long position) {
        return (TOKEN_APPCONTAINER_INFORMATION)super.position(position);
    }
    @Override public TOKEN_APPCONTAINER_INFORMATION getPointer(long i) {
        return new TOKEN_APPCONTAINER_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PSID") Pointer TokenAppContainer(); public native TOKEN_APPCONTAINER_INFORMATION TokenAppContainer(Pointer setter);
}
