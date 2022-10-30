// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class ChunkedArray
 *  \brief A data structure managing a list of primitive Arrow arrays logically
 *  as one large array
 * 
 *  Data chunking is treated throughout this project largely as an
 *  implementation detail for performance and memory use optimization.
 *  ChunkedArray allows Array objects to be collected and interpreted
 *  as a single logical array without requiring an expensive concatenation
 *  step.
 * 
 *  In some cases, data produced by a function may exceed the capacity of an
 *  Array (like BinaryArray or StringArray) and so returning multiple Arrays is
 *  the only possibility. In these cases, we recommend returning a ChunkedArray
 *  instead of vector of Arrays or some alternative.
 * 
 *  When data is processed in parallel, it may not be practical or possible to
 *  create large contiguous memory allocations and write output into them. With
 *  some data types, like binary and string types, it is not possible at all to
 *  produce non-chunked array outputs without requiring a concatenation step at
 *  the end of processing.
 * 
 *  Application developers may tune chunk sizes based on analysis of
 *  performance profiles but many developer-users will not need to be
 *  especially concerned with the chunking details.
 * 
 *  Preserving the chunk layout/sizes in processing steps is generally not
 *  considered to be a contract in APIs. A function may decide to alter the
 *  chunking of its result. Similarly, APIs accepting multiple ChunkedArray
 *  inputs should not expect the chunk layout to be the same in each input. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ChunkedArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkedArray(Pointer p) { super(p); }

  /** \brief Construct a chunked array from a vector of arrays
   * 
   *  The vector must be non-empty and all its elements must have the same
   *  data type. */
  public ChunkedArray(@ByVal ArrayVector chunks) { super((Pointer)null); allocate(chunks); }
  private native void allocate(@ByVal ArrayVector chunks);

  public ChunkedArray(@ByRef(true) ChunkedArray arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) ChunkedArray arg0);
  

  /** \brief Construct a chunked array from a single Array */
  
  ///
  public ChunkedArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array chunk) { super((Pointer)null); allocate(chunk); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array chunk);

  /** \brief Construct a chunked array from a vector of arrays and a data type
   * 
   *  As the data type is passed explicitly, the vector may be empty. */
  public ChunkedArray(@ByVal ArrayVector chunks, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(chunks, type); }
  private native void allocate(@ByVal ArrayVector chunks, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  // \brief Constructor with basic input validation.
  public static native @ByVal ChunkedArrayResult Make(
        @ByVal ArrayVector chunks, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type/*=nullptr*/);
  public static native @ByVal ChunkedArrayResult Make(
        @ByVal ArrayVector chunks);

  /** @return the total length of the chunked array; computed on construction */
  public native @Cast("int64_t") long length();

  /** @return the total number of nulls among all chunks */
  public native @Cast("int64_t") long null_count();

  public native int num_chunks();

  /** @return chunk a particular chunk from the chunked array */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array chunk(int i);

  
  ///
  ///
  public native @Const @ByRef ArrayVector chunks();

  /** \brief Construct a zero-copy slice of the chunked array with the
   *  indicated offset and length
   * 
   *  @param offset [in] the position of the first element in the constructed
   *  slice
   *  @param length [in] the length of the slice. If there are not enough
   *  elements in the chunked array, the length will be adjusted accordingly
   * 
   *  @return a new object wrapped in std::shared_ptr<ChunkedArray> */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray Slice(@Cast("int64_t") long offset, @Cast("int64_t") long length);

  /** \brief Slice from offset until end of the chunked array */
  
  ///
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::ChunkedArray>"}) ChunkedArray Slice(@Cast("int64_t") long offset);

  /** \brief Flatten this chunked array as a vector of chunked arrays, one
   *  for each struct field
   * 
   *  @param pool [in] The pool for buffer allocations, if any */
  public native @ByVal ChunkedArrayVectorResult Flatten(
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public native @ByVal ChunkedArrayVectorResult Flatten();

  /** Construct a zero-copy view of this chunked array with the given
   *  type. Calls Array::View on each constituent chunk. Always succeeds if
   *  there are zero chunks */
  public native @ByVal ChunkedArrayResult View(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  /** \brief Return a Scalar containing the value of this array at index */
  
  ///
  public native @ByVal ScalarResult GetScalar(@Cast("int64_t") long index);

  /** \brief Determine if two chunked arrays are equal.
   * 
   *  Two chunked arrays can be equal only if they have equal datatypes.
   *  However, they may be equal even if they have different chunkings. */
  public native @Cast("bool") boolean Equals(@Const @ByRef ChunkedArray other);
  /** \brief Determine if two chunked arrays are equal. */
  /** \brief Determine if two chunked arrays approximately equal */
  public native @Cast("bool") boolean ApproxEquals(@Const @ByRef ChunkedArray other,
                      @Const @ByRef(nullValue = "arrow::EqualOptions::Defaults()") EqualOptions arg1);
  public native @Cast("bool") boolean ApproxEquals(@Const @ByRef ChunkedArray other);

  /** @return PrettyPrint representation suitable for debugging */
  
  ///
  ///
  public native @StdString String ToString();

  /** \brief Perform cheap validation checks to determine obvious inconsistencies
   *  within the chunk array's internal data.
   * 
   *  This is O(k*m) where k is the number of array descendents,
   *  and m is the number of chunks.
   * 
   *  @return Status */
  
  ///
  ///
  public native @ByVal Status Validate();

  /** \brief Perform extensive validation checks to determine inconsistencies
   *  within the chunk array's internal data.
   * 
   *  This is O(k*n) where k is the number of array descendents,
   *  and n is the length in elements.
   * 
   *  @return Status */
  public native @ByVal Status ValidateFull();
}
