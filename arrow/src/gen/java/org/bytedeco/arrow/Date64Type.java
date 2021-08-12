// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Concrete type class for 64-bit date data (as number of milliseconds since UNIX epoch) */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Date64Type extends DateType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Date64Type(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Date64Type(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Date64Type position(long position) {
        return (Date64Type)super.position(position);
    }
    @Override public Date64Type getPointer(long i) {
        return new Date64Type((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();
  @MemberGetter public static native DateUnit UNIT();

  public static native String type_name();

  public Date64Type() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native int bit_width();

  public native @StdString String ToString();

  public native @StdString String name();
  public native DateUnit unit();
}
