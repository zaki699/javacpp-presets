// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Control Index kernel behavior */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IndexOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IndexOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IndexOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public IndexOptions position(long position) {
        return (IndexOptions)super.position(position);
    }
    @Override public IndexOptions getPointer(long i) {
        return new IndexOptions((Pointer)this).offsetAddress(i);
    }

  public IndexOptions(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar value) { super((Pointer)null); allocate(value); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar value);
  // Default constructor for serialization
  public IndexOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar value(); public native IndexOptions value(Scalar setter);
}
