// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RuntimeInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RuntimeInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RuntimeInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RuntimeInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RuntimeInfo position(long position) {
        return (RuntimeInfo)super.position(position);
    }
    @Override public RuntimeInfo getPointer(long i) {
        return new RuntimeInfo((Pointer)this).offsetAddress(i);
    }

  /** The enabled SIMD level
   * 
   *  This can be less than {@code detected_simd_level} if the ARROW_USER_SIMD_LEVEL
   *  environment variable is set to another value. */
  public native @StdString String simd_level(); public native RuntimeInfo simd_level(String setter);

  /** The SIMD level available on the OS and CPU */
  public native @StdString String detected_simd_level(); public native RuntimeInfo detected_simd_level(String setter);
}
