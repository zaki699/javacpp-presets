// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvjpeg;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvjpeg.*;


///////////////////////////////////////////////////////////////////////////////////
// Decoder helper functions //
///////////////////////////////////////////////////////////////////////////////////

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvjpeg.class)
public class nvjpegJpegDecoder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvjpegJpegDecoder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvjpegJpegDecoder(Pointer p) { super(p); }
}
