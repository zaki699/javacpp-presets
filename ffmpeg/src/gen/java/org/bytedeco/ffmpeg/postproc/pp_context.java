// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.postproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;

import static org.bytedeco.ffmpeg.global.postproc.*;


@Opaque @Properties(inherit = org.bytedeco.ffmpeg.presets.postproc.class)
public class pp_context extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public pp_context() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public pp_context(Pointer p) { super(p); }
}
