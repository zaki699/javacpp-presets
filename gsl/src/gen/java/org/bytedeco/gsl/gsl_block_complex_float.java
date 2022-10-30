// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

@Name("gsl_block_complex_float_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_block_complex_float extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_block_complex_float() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_block_complex_float(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_block_complex_float(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_block_complex_float position(long position) {
        return (gsl_block_complex_float)super.position(position);
    }
    @Override public gsl_block_complex_float getPointer(long i) {
        return new gsl_block_complex_float((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_block_complex_float size(long setter);
  public native FloatPointer data(); public native gsl_block_complex_float data(FloatPointer setter);
}
