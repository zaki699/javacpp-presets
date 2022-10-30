// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NullOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NullOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NullOptions position(long position) {
        return (NullOptions)super.position(position);
    }
    @Override public NullOptions getPointer(long i) {
        return new NullOptions((Pointer)this).offsetAddress(i);
    }

  public NullOptions(@Cast("bool") boolean nan_is_null/*=false*/) { super((Pointer)null); allocate(nan_is_null); }
  private native void allocate(@Cast("bool") boolean nan_is_null/*=false*/);
  public NullOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal NullOptions Defaults();

  public native @Cast("bool") boolean nan_is_null(); public native NullOptions nan_is_null(boolean setter);
}
