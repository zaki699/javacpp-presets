// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_sf_mathieu_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_sf_mathieu_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_sf_mathieu_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_sf_mathieu_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_sf_mathieu_workspace position(long position) {
        return (gsl_sf_mathieu_workspace)super.position(position);
    }
    @Override public gsl_sf_mathieu_workspace getPointer(long i) {
        return new gsl_sf_mathieu_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_sf_mathieu_workspace size(long setter);
  public native @Cast("size_t") long even_order(); public native gsl_sf_mathieu_workspace even_order(long setter);
  public native @Cast("size_t") long odd_order(); public native gsl_sf_mathieu_workspace odd_order(long setter);
  public native int extra_values(); public native gsl_sf_mathieu_workspace extra_values(int setter);
  public native double qa(); public native gsl_sf_mathieu_workspace qa(double setter);   /* allow for caching of results: not implemented yet */
  public native double qb(); public native gsl_sf_mathieu_workspace qb(double setter);   /* allow for caching of results: not implemented yet */
  public native DoublePointer aa(); public native gsl_sf_mathieu_workspace aa(DoublePointer setter);
  public native DoublePointer bb(); public native gsl_sf_mathieu_workspace bb(DoublePointer setter);
  public native DoublePointer dd(); public native gsl_sf_mathieu_workspace dd(DoublePointer setter);
  public native DoublePointer ee(); public native gsl_sf_mathieu_workspace ee(DoublePointer setter);
  public native DoublePointer tt(); public native gsl_sf_mathieu_workspace tt(DoublePointer setter);
  public native DoublePointer e2(); public native gsl_sf_mathieu_workspace e2(DoublePointer setter);
  public native DoublePointer zz(); public native gsl_sf_mathieu_workspace zz(DoublePointer setter);
  public native gsl_vector eval(); public native gsl_sf_mathieu_workspace eval(gsl_vector setter);
  public native gsl_matrix evec(); public native gsl_sf_mathieu_workspace evec(gsl_matrix setter);
  public native gsl_eigen_symmv_workspace wmat(); public native gsl_sf_mathieu_workspace wmat(gsl_eigen_symmv_workspace setter);
}
