// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Aggregate functions

/** \addtogroup compute-concrete-options
 *  \{
 <p>
 *  \brief Control general scalar aggregate kernel behavior
 * 
 *  By default, null values are ignored (skip_nulls = true). */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ScalarAggregateOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScalarAggregateOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScalarAggregateOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScalarAggregateOptions position(long position) {
        return (ScalarAggregateOptions)super.position(position);
    }
    @Override public ScalarAggregateOptions getPointer(long i) {
        return new ScalarAggregateOptions((Pointer)this).offsetAddress(i);
    }

  public ScalarAggregateOptions(@Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=1*/) { super((Pointer)null); allocate(skip_nulls, min_count); }
  private native void allocate(@Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=1*/);
  public ScalarAggregateOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal ScalarAggregateOptions Defaults();

  /** If true (the default), null values are ignored. Otherwise, if any value is null,
   *  emit null. */
  public native @Cast("bool") boolean skip_nulls(); public native ScalarAggregateOptions skip_nulls(boolean setter);
  /** If less than this many non-null values are observed, emit null. */
  public native @Cast("uint32_t") int min_count(); public native ScalarAggregateOptions min_count(int setter);
}
