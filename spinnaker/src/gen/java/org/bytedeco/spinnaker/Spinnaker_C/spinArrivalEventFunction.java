// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinArrivalEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    spinArrivalEventFunction(Pointer p) { super(p); }
    protected spinArrivalEventFunction() { allocate(); }
    private native void allocate();
    public native void call(@Cast("uint64_t") int deviceSerialNumber, Pointer pUserData);
}
