// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MonthDayNanoIntervalScalar extends BaseMonthDayNanoIntervalScalar {
    static { Loader.load(); }

  
    
    
      public MonthDayNanoIntervalScalar(@ByVal MonthDayNanoIntervalType.MonthDayNanos value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
      private native void allocate(@ByVal MonthDayNanoIntervalType.MonthDayNanos value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
  
    public MonthDayNanoIntervalScalar(@ByVal @Cast("arrow::IntervalScalar<arrow::MonthDayNanoIntervalType>::ValueType*") MonthDayNanoIntervalType.MonthDayNanos value) { super((Pointer)null); allocate(value); }
    private native void allocate(@ByVal @Cast("arrow::IntervalScalar<arrow::MonthDayNanoIntervalType>::ValueType*") MonthDayNanoIntervalType.MonthDayNanos value);
    public MonthDayNanoIntervalScalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MonthDayNanoIntervalScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MonthDayNanoIntervalScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MonthDayNanoIntervalScalar position(long position) {
        return (MonthDayNanoIntervalScalar)super.position(position);
    }
    @Override public MonthDayNanoIntervalScalar getPointer(long i) {
        return new MonthDayNanoIntervalScalar((Pointer)this).offsetAddress(i);
    }

}
