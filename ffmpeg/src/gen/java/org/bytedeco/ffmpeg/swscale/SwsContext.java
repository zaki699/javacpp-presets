// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.swscale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;

import static org.bytedeco.ffmpeg.global.swscale.*;


@Opaque @Properties(inherit = org.bytedeco.ffmpeg.presets.swscale.class)
public class SwsContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public SwsContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SwsContext(Pointer p) { super(p); }
}
