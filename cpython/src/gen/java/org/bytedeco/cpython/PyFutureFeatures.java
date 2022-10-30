// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Future feature support */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyFutureFeatures extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyFutureFeatures() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyFutureFeatures(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyFutureFeatures(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyFutureFeatures position(long position) {
        return (PyFutureFeatures)super.position(position);
    }
    @Override public PyFutureFeatures getPointer(long i) {
        return new PyFutureFeatures((Pointer)this).offsetAddress(i);
    }

    public native int ff_features(); public native PyFutureFeatures ff_features(int setter);      /* flags set by future statements */
    public native int ff_lineno(); public native PyFutureFeatures ff_lineno(int setter);        /* line number of last future statement */
}
