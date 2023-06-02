// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class _gsl_vector_uint_view extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _gsl_vector_uint_view() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _gsl_vector_uint_view(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _gsl_vector_uint_view(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _gsl_vector_uint_view position(long position) {
        return (_gsl_vector_uint_view)super.position(position);
    }
    @Override public _gsl_vector_uint_view getPointer(long i) {
        return new _gsl_vector_uint_view((Pointer)this).offsetAddress(i);
    }

  public native @ByRef gsl_vector_uint vector(); public native _gsl_vector_uint_view vector(gsl_vector_uint setter);
}
