// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class BufferedInputStream
 *  \brief An InputStream that performs buffered reads from an unbuffered
 *  InputStream, which can mitigate the overhead of many small reads in some
 *  cases */
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BufferedInputStream extends BufferedInputStreamConcurrencyWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferedInputStream(Pointer p) { super(p); }


  /** \brief Create a BufferedInputStream from a raw InputStream
   *  @param buffer_size [in] the size of the temporary read buffer
   *  @param pool [in] a MemoryPool to use for allocations
   *  @param raw [in] a raw InputStream
   *  @param raw_read_bound [in] a bound on the maximum number of bytes
   *  to read from the raw input stream. The default -1 indicates that
   *  it is unbounded
   *  @return the created BufferedInputStream */
  public static native @ByVal BufferedInputStreamResult Create(
        @Cast("int64_t") long buffer_size, MemoryPool pool, @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream raw,
        @Cast("int64_t") long raw_read_bound/*=-1*/);
  public static native @ByVal BufferedInputStreamResult Create(
        @Cast("int64_t") long buffer_size, MemoryPool pool, @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream raw);

  /** \brief Resize internal read buffer; calls to Read(...) will read at least
   *  @param new_buffer_size [in] the new read buffer size
   *  @return Status */
  public native @ByVal Status SetBufferSize(@Cast("int64_t") long new_buffer_size);

  /** \brief Return the number of remaining bytes in the read buffer */
  public native @Cast("int64_t") long bytes_buffered();

  /** \brief Return the current size of the internal buffer */
  public native @Cast("int64_t") long buffer_size();

  /** \brief Release the raw InputStream. Any data buffered will be
   *  discarded. Further operations on this object are invalid
   *  @return raw the underlying InputStream */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream Detach();

  /** \brief Return the unbuffered InputStream */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream raw();

  // InputStream APIs

  public native @Cast("bool") boolean closed();
  public native @ByVal KeyValueMetadataResult ReadMetadata();
  public native @ByVal KeyValueMetadataFuture ReadMetadataAsync(
        @Const @ByRef IOContext io_context);
}
