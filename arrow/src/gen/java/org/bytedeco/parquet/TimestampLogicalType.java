// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Allowed for physical type INT64. */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class TimestampLogicalType extends LogicalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TimestampLogicalType(Pointer p) { super(p); }

  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(@Cast("bool") boolean is_adjusted_to_utc,
                                                   LogicalType.TimeUnit.unit time_unit,
                                                   @Cast("bool") boolean is_from_converted_type/*=false*/,
                                                   @Cast("bool") boolean force_set_converted_type/*=false*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(@Cast("bool") boolean is_adjusted_to_utc,
                                                   LogicalType.TimeUnit.unit time_unit);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(@Cast("bool") boolean is_adjusted_to_utc,
                                                   @Cast("parquet::LogicalType::TimeUnit::unit") int time_unit,
                                                   @Cast("bool") boolean is_from_converted_type/*=false*/,
                                                   @Cast("bool") boolean force_set_converted_type/*=false*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(@Cast("bool") boolean is_adjusted_to_utc,
                                                   @Cast("parquet::LogicalType::TimeUnit::unit") int time_unit);
  public native @Cast("bool") boolean is_adjusted_to_utc();
  public native LogicalType.TimeUnit.unit time_unit();

  /** \brief If true, will not set LogicalType in Thrift metadata */
  public native @Cast("bool") boolean is_from_converted_type();

  /** \brief If true, will set ConvertedType for micros and millis
   *  resolution in legacy ConvertedType Thrift metadata */
  public native @Cast("bool") boolean force_set_converted_type();
}
