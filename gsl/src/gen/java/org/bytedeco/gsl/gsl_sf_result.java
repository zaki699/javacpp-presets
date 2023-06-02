// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Name("gsl_sf_result_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_sf_result extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_sf_result() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_sf_result(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_sf_result(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_sf_result position(long position) {
        return (gsl_sf_result)super.position(position);
    }
    @Override public gsl_sf_result getPointer(long i) {
        return new gsl_sf_result((Pointer)this).offsetAddress(i);
    }

  public native double val(); public native gsl_sf_result val(double setter);
  public native double err(); public native gsl_sf_result err(double setter);
}
