// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** DayTimeArray
 *  ---------------------
 *  \brief Array of Day and Millisecond values. */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DayTimeIntervalArray extends PrimitiveArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DayTimeIntervalArray(Pointer p) { super(p); }


  public DayTimeIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  public DayTimeIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                         @SharedPtr ArrowBuffer data,
                         @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                         @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, data, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                         @SharedPtr ArrowBuffer data,
                         @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                         @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public DayTimeIntervalArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                         @SharedPtr ArrowBuffer data) { super((Pointer)null); allocate(type, length, data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                         @SharedPtr ArrowBuffer data);

  public native @ByVal DayTimeIntervalType.DayMilliseconds GetValue(@Cast("int64_t") long i);
  public native @ByVal DayTimeIntervalType.DayMilliseconds Value(@Cast("int64_t") long i);

  // For compatibility with Take kernel.
  public native @ByVal DayTimeIntervalType.DayMilliseconds GetView(@Cast("int64_t") long i);

  public native int byte_width();

  public native @Cast("const uint8_t*") BytePointer raw_values();
}
