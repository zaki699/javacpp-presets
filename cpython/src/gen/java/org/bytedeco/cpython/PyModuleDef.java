// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

// #endif /* New in 3.5 */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyModuleDef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyModuleDef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyModuleDef(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyModuleDef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyModuleDef position(long position) {
        return (PyModuleDef)super.position(position);
    }
    @Override public PyModuleDef getPointer(long i) {
        return new PyModuleDef(this).position(position + i);
    }

  public native @ByRef PyModuleDef_Base m_base(); public native PyModuleDef m_base(PyModuleDef_Base setter);
  public native @Cast("const char*") BytePointer m_name(); public native PyModuleDef m_name(BytePointer setter);
  public native @Cast("const char*") BytePointer m_doc(); public native PyModuleDef m_doc(BytePointer setter);
  public native @Cast("Py_ssize_t") long m_size(); public native PyModuleDef m_size(long setter);
  public native PyMethodDef m_methods(); public native PyModuleDef m_methods(PyMethodDef setter);
  public native PyModuleDef_Slot m_slots(); public native PyModuleDef m_slots(PyModuleDef_Slot setter);
  public native traverseproc m_traverse(); public native PyModuleDef m_traverse(traverseproc setter);
  public native inquiry m_clear(); public native PyModuleDef m_clear(inquiry setter);
  public native freefunc m_free(); public native PyModuleDef m_free(freefunc setter);
}
