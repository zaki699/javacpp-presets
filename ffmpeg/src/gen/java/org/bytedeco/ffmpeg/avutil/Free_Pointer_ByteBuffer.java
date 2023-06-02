// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Free_Pointer_ByteBuffer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_Pointer_ByteBuffer(Pointer p) { super(p); }
    protected Free_Pointer_ByteBuffer() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque, @Cast("uint8_t*") ByteBuffer data);
}
