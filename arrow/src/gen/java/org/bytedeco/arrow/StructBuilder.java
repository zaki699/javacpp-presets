// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Struct

// ---------------------------------------------------------------------------------
// StructArray builder
/** Append, Resize and Reserve methods are acting on StructBuilder.
 *  Please make sure all these methods of all child-builders' are consistently
 *  called to maintain data-structure consistency. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StructBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructBuilder(Pointer p) { super(p); }

  /** If any of field_builders has indeterminate type, this builder will also */
  public StructBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool,
                  @ByVal ArrayBuilderVector field_builders) { super((Pointer)null); allocate(type, pool, field_builders); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool,
                  @ByVal ArrayBuilderVector field_builders);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr StructArray out);

  /** Null bitmap is of equal length to every child field, and any zero byte
   *  will be considered as a null for that field, but users must using app-
   *  end methods or advance methods of the child builders' independently to
   *  insert data. */
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") BytePointer valid_bytes);
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") ByteBuffer valid_bytes);
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") byte[] valid_bytes);

  /** Append an element to the Struct. All child-builders' Append method must
   *  be called independently to maintain data-structure consistency. */
  public native @ByVal Status Append(@Cast("bool") boolean is_valid/*=true*/);
  public native @ByVal Status Append();

  /** \brief Append a null value. Automatically appends an empty value to each child
   *  builder. */
  public native @ByVal Status AppendNull();

  /** \brief Append multiple null values. Automatically appends empty values to each
   *  child builder. */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status AppendEmptyValue();

  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  public native void Reset();

  public native ArrayBuilder field_builder(int i);

  public native int num_fields();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
