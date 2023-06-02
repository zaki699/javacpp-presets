// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*  Workspace for Levin U Transform with error estimation,
 *   
 *   size        = number of terms the workspace can handle
 *   sum_plain   = simple sum of series
 *   q_num       = backward diagonal of numerator; length = size
 *   q_den       = backward diagonal of denominator; length = size
 *   dq_num      = table of numerator derivatives; length = size**2
 *   dq_den      = table of denominator derivatives; length = size**2
 *   dsum        = derivative of sum wrt term i; length = size
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_sum_levin_u_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_sum_levin_u_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_sum_levin_u_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_sum_levin_u_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_sum_levin_u_workspace position(long position) {
        return (gsl_sum_levin_u_workspace)super.position(position);
    }
    @Override public gsl_sum_levin_u_workspace getPointer(long i) {
        return new gsl_sum_levin_u_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_sum_levin_u_workspace size(long setter);
  public native @Cast("size_t") long i(); public native gsl_sum_levin_u_workspace i(long setter);                     /* position in array */
  public native @Cast("size_t") long terms_used(); public native gsl_sum_levin_u_workspace terms_used(long setter);            /* number of calls */
  public native double sum_plain(); public native gsl_sum_levin_u_workspace sum_plain(double setter);
  public native DoublePointer q_num(); public native gsl_sum_levin_u_workspace q_num(DoublePointer setter);
  public native DoublePointer q_den(); public native gsl_sum_levin_u_workspace q_den(DoublePointer setter);
  public native DoublePointer dq_num(); public native gsl_sum_levin_u_workspace dq_num(DoublePointer setter);
  public native DoublePointer dq_den(); public native gsl_sum_levin_u_workspace dq_den(DoublePointer setter);
  public native DoublePointer dsum(); public native gsl_sum_levin_u_workspace dsum(DoublePointer setter);
}
