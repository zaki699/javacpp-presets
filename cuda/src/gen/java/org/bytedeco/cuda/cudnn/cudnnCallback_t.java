// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;

import static org.bytedeco.cuda.global.cudnn.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnCallback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cudnnCallback_t(Pointer p) { super(p); }
    protected cudnnCallback_t() { allocate(); }
    private native void allocate();
    public native void call(@Cast("cudnnSeverity_t") int sev, Pointer udata, @Const cudnnDebug_t dbg, @Cast("const char*") BytePointer msg);
}
