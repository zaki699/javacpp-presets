// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::IntervalScalar<arrow::MonthIntervalType>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseMonthIntervalScalar extends BaseBaseMonthIntervalType {
    static { Loader.load(); }

  
  
    public BaseMonthIntervalScalar(@Cast("arrow::TemporalScalar<arrow::MonthIntervalType>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@Cast("arrow::TemporalScalar<arrow::MonthIntervalType>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseMonthIntervalScalar(Pointer p) { super(p); }


  public BaseMonthIntervalScalar(@Cast("arrow::IntervalScalar<arrow::MonthIntervalType>::ValueType") int value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("arrow::IntervalScalar<arrow::MonthIntervalType>::ValueType") int value);
  public BaseMonthIntervalScalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}
