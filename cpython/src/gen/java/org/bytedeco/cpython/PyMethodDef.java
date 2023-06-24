// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMethodDef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMethodDef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMethodDef(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMethodDef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMethodDef position(long position) {
        return (PyMethodDef)super.position(position);
    }
    @Override public PyMethodDef getPointer(long i) {
        return new PyMethodDef((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer ml_name(); public native PyMethodDef ml_name(BytePointer setter);   /* The name of the built-in function/method */
    public native PyCFunction ml_meth(); public native PyMethodDef ml_meth(PyCFunction setter);    /* The C function that implements it */
    public native int ml_flags(); public native PyMethodDef ml_flags(int setter);   /* Combination of METH_xxx flags, which mostly
                               describe the args expected by the C func */
    public native @Cast("const char*") BytePointer ml_doc(); public native PyMethodDef ml_doc(BytePointer setter);    /* The __doc__ attribute, or NULL */
}
