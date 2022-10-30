// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class BufferReader
 *  \brief Random access zero-copy reads on an arrow::Buffer */
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BufferReader extends BufferReaderRandomAccessFileConcurrencyWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferReader(Pointer p) { super(p); }

  public BufferReader(@SharedPtr ArrowBuffer buffer) { super((Pointer)null); allocate(buffer); }
  private native void allocate(@SharedPtr ArrowBuffer buffer);
  public BufferReader(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size);
  public BufferReader(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size);
  public BufferReader(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size);

  /** \brief Instantiate from std::string or arrow::util::string_view. Does not
   *  own data */

  public native @Cast("bool") boolean closed();

  public native @Cast("bool") boolean supports_zero_copy();

  public native @SharedPtr ArrowBuffer buffer();

  // Synchronous ReadAsync override
  
  public native @ByVal Status WillNeed(@StdVector ReadRange ranges);
}
