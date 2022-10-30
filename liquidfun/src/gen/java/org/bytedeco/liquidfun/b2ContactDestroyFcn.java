// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;

@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactDestroyFcn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    b2ContactDestroyFcn(Pointer p) { super(p); }
    protected b2ContactDestroyFcn() { allocate(); }
    private native void allocate();
    public native void call(b2Contact contact, b2BlockAllocator allocator);
}
