// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_vector_long extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_vector_long() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_vector_long(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_vector_long(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_vector_long position(long position) {
        return (gsl_vector_long)super.position(position);
    }
    @Override public gsl_vector_long getPointer(long i) {
        return new gsl_vector_long(this).position(position + i);
    }

  public native @Cast("size_t") long size(); public native gsl_vector_long size(long setter);
  public native @Cast("size_t") long stride(); public native gsl_vector_long stride(long setter);
  public native CLongPointer data(); public native gsl_vector_long data(CLongPointer setter);
  public native gsl_block_long block(); public native gsl_vector_long block(gsl_block_long setter);
  public native int owner(); public native gsl_vector_long owner(int setter);
}
