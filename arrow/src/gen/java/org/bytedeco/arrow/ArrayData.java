// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Generic array data container

/** \class ArrayData
 *  \brief Mutable container for generic Arrow array data
 * 
 *  This data structure is a self-contained representation of the memory and
 *  metadata inside an Arrow array data structure (called vectors in Java). The
 *  classes arrow::Array and its subclasses provide strongly-typed accessors
 *  with support for the visitor pattern and other affordances.
 * 
 *  This class is designed for easy internal data manipulation, analytical data
 *  processing, and data transport to and from IPC messages. For example, we
 *  could cast from int64 to float64 like so:
 * 
 *  Int64Array arr = GetMyData();
 *  auto new_data = arr.data()->Copy();
 *  new_data->type = arrow::float64();
 *  DoubleArray double_arr(new_data);
 * 
 *  This object is also useful in an analytics setting where memory may be
 *  reused. For example, if we had a group of operations all returning doubles,
 *  say:
 * 
 *  Log(Sqrt(Expr(arr)))
 * 
 *  Then the low-level implementations of each of these functions could have
 *  the signatures
 * 
 *  void Log(const ArrayData& values, ArrayData* out);
 * 
 *  As another example a function may consume one or more memory buffers in an
 *  input array and replace them with newly-allocated data, changing the output
 *  data type as well. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArrayData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrayData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArrayData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ArrayData position(long position) {
        return (ArrayData)super.position(position);
    }
    @Override public ArrayData getPointer(long i) {
        return new ArrayData((Pointer)this).offsetAddress(i);
    }

  public ArrayData() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length) { super((Pointer)null); allocate(type, length); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length);

  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, buffers, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers) { super((Pointer)null); allocate(type, length, buffers); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers);

  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @ByVal ArrayDataVector child_data,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, buffers, child_data, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @ByVal ArrayDataVector child_data,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public ArrayData(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @ByVal ArrayDataVector child_data) { super((Pointer)null); allocate(type, length, buffers, child_data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @ByVal BufferVector buffers,
              @ByVal ArrayDataVector child_data);

  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                                           @ByVal BufferVector buffers,
                                           @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/,
                                           @Cast("int64_t") long offset/*=0*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                                           @ByVal BufferVector buffers);

  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
        @ByVal BufferVector buffers,
        @ByVal ArrayDataVector child_data,
        @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
        @ByVal BufferVector buffers,
        @ByVal ArrayDataVector child_data);

  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
        @ByVal BufferVector buffers,
        @ByVal ArrayDataVector child_data,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary, @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/,
        @Cast("int64_t") long offset/*=0*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
        @ByVal BufferVector buffers,
        @ByVal ArrayDataVector child_data,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary);

  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                                           @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/,
                                           @Cast("int64_t") long offset/*=0*/);
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length);

  // Move constructor
  public ArrayData(@ByRef(true) ArrayData other) { super((Pointer)null); allocate(other); }
  @NoException(true) private native void allocate(@ByRef(true) ArrayData other);

  // Copy constructor

  // Move assignment
  public native @ByRef @Name("operator =") ArrayData put(@ByRef(true) ArrayData other);

  // Copy assignment

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Copy();

  // Access a buffer's data as a typed C pointer
  public native @Const @Name("GetValues<jbyte>") BytePointer GetValuesByte(int i, @Cast("int64_t") long absolute_offset);
  public native @Const @Name("GetValues<jshort>") ShortPointer GetValuesShort(int i, @Cast("int64_t") long absolute_offset);
  public native @Const @Name("GetValues<jint>") IntPointer GetValuesInt(int i, @Cast("int64_t") long absolute_offset);
  public native @Const @Name("GetValues<jlong>") LongPointer GetValuesLong(int i, @Cast("int64_t") long absolute_offset);
  public native @Const @Name("GetValues<float>") FloatPointer GetValuesFloat(int i, @Cast("int64_t") long absolute_offset);
  public native @Const @Name("GetValues<double>") DoublePointer GetValuesDouble(int i, @Cast("int64_t") long absolute_offset);

  public native @Const @Name("GetValues<jbyte>") BytePointer GetValuesByte(int i);

  public native @Const @Name("GetValues<jshort>") ShortPointer GetValuesShort(int i);

  public native @Const @Name("GetValues<jint>") IntPointer GetValuesInt(int i);

  public native @Const @Name("GetValues<jlong>") LongPointer GetValuesLong(int i);

  public native @Const @Name("GetValues<float>") FloatPointer GetValuesFloat(int i);

  public native @Const @Name("GetValues<double>") DoublePointer GetValuesDouble(int i);

  // Like GetValues, but returns NULLPTR instead of aborting if the underlying
  // buffer is not a CPU buffer.

  // Access a buffer's data as a typed C pointer

  /** \brief Construct a zero-copy slice of the data with the given offset and length */
  
  ///
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData Slice(@Cast("int64_t") long offset, @Cast("int64_t") long length);

  /** \brief Input-checking variant of Slice
   * 
   *  An Invalid Status is returned if the requested slice falls out of bounds.
   *  Note that unlike Slice, {@code length} isn't clamped to the available buffer size. */
  public native @ByVal ArrayDataResult SliceSafe(@Cast("int64_t") long offset, @Cast("int64_t") long length);

  public native void SetNullCount(@Cast("int64_t") long v);

  /** \brief Return null count, or compute and set it if it's not known */
  public native @Cast("int64_t") long GetNullCount();

  public native @Cast("bool") boolean MayHaveNulls();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type(); public native ArrayData type(DataType setter);
  public native @Cast("int64_t") long length(); public native ArrayData length(long setter);
  // The logical start point into the physical buffers (in values, not bytes).
  // Note that, for child data, this must be *added* to the child data's own offset.
  public native @Cast("int64_t") long offset(); public native ArrayData offset(long setter);
  public native @ByRef BufferVector buffers(); public native ArrayData buffers(BufferVector setter);
  public native @ByRef ArrayDataVector child_data(); public native ArrayData child_data(ArrayDataVector setter);

  // The dictionary for this Array, if any. Only used for dictionary type
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData dictionary(); public native ArrayData dictionary(ArrayData setter);
}
