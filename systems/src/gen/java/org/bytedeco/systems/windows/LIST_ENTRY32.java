// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// end_ntoshvp
// begin_ntoshvp

//
// These are needed for portable debugger support.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LIST_ENTRY32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LIST_ENTRY32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LIST_ENTRY32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LIST_ENTRY32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LIST_ENTRY32 position(long position) {
        return (LIST_ENTRY32)super.position(position);
    }
    @Override public LIST_ENTRY32 getPointer(long i) {
        return new LIST_ENTRY32(this).position(position + i);
    }

    public native @Cast("DWORD") int Flink(); public native LIST_ENTRY32 Flink(int setter);
    public native @Cast("DWORD") int Blink(); public native LIST_ENTRY32 Blink(int setter);
}
