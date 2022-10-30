// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyModuleDef_Base extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyModuleDef_Base() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyModuleDef_Base(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyModuleDef_Base(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyModuleDef_Base position(long position) {
        return (PyModuleDef_Base)super.position(position);
    }
    @Override public PyModuleDef_Base getPointer(long i) {
        return new PyModuleDef_Base((Pointer)this).offsetAddress(i);
    }

  public native @ByRef PyObject ob_base(); public native PyModuleDef_Base ob_base(PyObject setter);
  public static class PyObject_M_init extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    PyObject_M_init(Pointer p) { super(p); }
      protected PyObject_M_init() { allocate(); }
      private native void allocate();
      public native PyObject call();
  }
  public native PyObject_M_init m_init(); public native PyModuleDef_Base m_init(PyObject_M_init setter);
  public native @Cast("Py_ssize_t") long m_index(); public native PyModuleDef_Base m_index(long setter);
  public native PyObject m_copy(); public native PyModuleDef_Base m_copy(PyObject setter);
}
