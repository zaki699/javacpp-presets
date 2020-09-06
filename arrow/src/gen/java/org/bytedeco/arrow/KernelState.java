// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base class for opaque kernel-specific state. For example, if there
 *  is some kind of initialization required. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class KernelState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public KernelState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KernelState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public KernelState position(long position) {
        return (KernelState)super.position(position);
    }
    @Override public KernelState getPointer(long i) {
        return new KernelState(this).position(position + i);
    }

}
