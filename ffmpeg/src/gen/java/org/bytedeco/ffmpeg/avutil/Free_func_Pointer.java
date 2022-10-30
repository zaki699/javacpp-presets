// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Set the optional free message callback function which will be called if an
 * operation is removing messages from the queue.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Free_func_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_func_Pointer(Pointer p) { super(p); }
    protected Free_func_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer msg);
}
