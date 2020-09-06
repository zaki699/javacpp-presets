// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Buffer builder classes

/** \class BufferBuilder
 *  \brief A class for incrementally building a contiguous chunk of in-memory
 *  data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BufferBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BufferBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BufferBuilder position(long position) {
        return (BufferBuilder)super.position(position);
    }
    @Override public BufferBuilder getPointer(long i) {
        return new BufferBuilder(this).position(position + i);
    }

  public BufferBuilder(MemoryPool pool/*=default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool/*=default_memory_pool()*/);
  public BufferBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief Constructs new Builder that will start using
   *  the provided buffer until Finish/Reset are called.
   *  The buffer is not resized. */
  
  ///
  public BufferBuilder(@SharedPtr @ByVal ResizableBuffer buffer,
                           MemoryPool pool/*=default_memory_pool()*/) { super((Pointer)null); allocate(buffer, pool); }
  private native void allocate(@SharedPtr @ByVal ResizableBuffer buffer,
                           MemoryPool pool/*=default_memory_pool()*/);
  public BufferBuilder(@SharedPtr @ByVal ResizableBuffer buffer) { super((Pointer)null); allocate(buffer); }
  private native void allocate(@SharedPtr @ByVal ResizableBuffer buffer);

  /** \brief Resize the buffer to the nearest multiple of 64 bytes
   * 
   *  @param new_capacity the new capacity of the of the builder. Will be
   *  rounded up to a multiple of 64 bytes for padding @param shrink_to_fit if
   *  new capacity is smaller than the existing size, reallocate internal
   *  buffer. Set to false to avoid reallocations when shrinking the builder.
   *  @return Status */
  
  ///
  public native @ByVal Status Resize(@Cast("const int64_t") long new_capacity, @Cast("bool") boolean shrink_to_fit/*=true*/);
  public native @ByVal Status Resize(@Cast("const int64_t") long new_capacity);

  /** \brief Ensure that builder can accommodate the additional number of bytes
   *  without the need to perform allocations
   * 
   *  @param additional_bytes [in] number of additional bytes to make space for
   *  @return Status */
  public native @ByVal Status Reserve(@Cast("const int64_t") long additional_bytes);

  /** \brief Return a capacity expanded by the desired growth factor */
  
  ///
  public static native @Cast("int64_t") long GrowByFactor(@Cast("int64_t") long current_capacity, @Cast("int64_t") long new_capacity);

  /** \brief Append the given data to the buffer
   * 
   *  The buffer is automatically expanded if necessary. */
  
  ///
  public native @ByVal Status Append(@Const Pointer data, @Cast("const int64_t") long length);

  /** \brief Append copies of a value to the buffer
   * 
   *  The buffer is automatically expanded if necessary. */
  public native @ByVal Status Append(@Cast("const int64_t") long num_copies, @Cast("uint8_t") byte value);

  // Advance pointer and zero out memory
  public native @ByVal Status Advance(@Cast("const int64_t") long length);

  // Advance pointer, but don't allocate or zero memory
  public native void UnsafeAdvance(@Cast("const int64_t") long length);

  // Unsafe methods don't check existing size
  public native void UnsafeAppend(@Const Pointer data, @Cast("const int64_t") long length);

  
  ///
  ///
  public native void UnsafeAppend(@Cast("const int64_t") long num_copies, @Cast("uint8_t") byte value);

  /** \brief Return result of builder as a Buffer object.
   * 
   *  The builder is reset and can be reused afterwards.
   * 
   *  @param out [out] the finalized Buffer object
   *  @param shrink_to_fit if the buffer size is smaller than its capacity,
   *  reallocate to fit more tightly in memory. Set to false to avoid
   *  a reallocation, at the expense of potentially more memory consumption.
   *  @return Status */
  public native @ByVal Status Finish(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out, @Cast("bool") boolean shrink_to_fit/*=true*/);
  public native @ByVal Status Finish(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  public native void Reset();

  /** \brief Set size to a smaller value without modifying builder
   *  contents. For reusable BufferBuilder classes
   *  @param position [in] must be non-negative and less than or equal
   *  to the current length() */
  public native void Rewind(@Cast("int64_t") long _position);

  public native @Cast("int64_t") @Name("capacity") long _capacity();
  public native @Cast("int64_t") long length();
  public native @Cast("const uint8_t*") BytePointer data();
  public native @Cast("uint8_t*") BytePointer mutable_data();
}
