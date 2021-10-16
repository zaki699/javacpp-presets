// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.veoffload;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.veoffload.global.veo.*;

@Properties(inherit = org.bytedeco.veoffload.presets.veo.class)
public class Arg1_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Arg1_Pointer(Pointer p) { super(p); }
    protected Arg1_Pointer() { allocate(); }
    private native void allocate();
    public native @Cast("uint64_t") long call(Pointer arg0);
}
