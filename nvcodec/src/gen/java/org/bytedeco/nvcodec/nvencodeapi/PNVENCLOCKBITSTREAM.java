// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;

@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class PNVENCLOCKBITSTREAM extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PNVENCLOCKBITSTREAM(Pointer p) { super(p); }
    protected PNVENCLOCKBITSTREAM() { allocate(); }
    private native void allocate();
    public native @Cast("NVENCSTATUS") int call(Pointer encoder, NV_ENC_LOCK_BITSTREAM lockBitstreamBufferParams);
}
