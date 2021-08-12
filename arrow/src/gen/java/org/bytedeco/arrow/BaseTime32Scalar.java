// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TimeScalar<arrow::Time32Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseTime32Scalar extends BaseBaseTime32Scalar {
    static { Loader.load(); }

  
  
    public BaseTime32Scalar(@Cast("arrow::TemporalScalar<arrow::Time32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@Cast("arrow::TemporalScalar<arrow::Time32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseTime32Scalar(Pointer p) { super(p); }

}
