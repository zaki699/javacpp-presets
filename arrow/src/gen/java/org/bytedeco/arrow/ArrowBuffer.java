// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Buffer classes

/** \class Buffer
 *  \brief Object containing a pointer to a piece of contiguous memory with a
 *  particular size.
 * 
 *  Buffers have two related notions of length: size and capacity. Size is
 *  the number of bytes that might have valid data. Capacity is the number
 *  of bytes that were allocated for the buffer in total.
 * 
 *  The Buffer base class does not own its memory, but subclasses often do.
 * 
 *  The following invariant is always true: Size <= Capacity */
@Name("arrow::Buffer") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArrowBuffer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrowBuffer(Pointer p) { super(p); }

  /** \brief Construct from buffer and size without copying memory
   * 
   *  @param data [in] a memory buffer
   *  @param size [in] buffer size
   * 
   *  \note The passed memory must be kept alive through some other means */
  public ArrowBuffer(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size);
  public ArrowBuffer(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size);
  public ArrowBuffer(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size);

  public ArrowBuffer(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/) { super((Pointer)null); allocate(data, size, mm, parent); }
  private native void allocate(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/);
  public ArrowBuffer(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm) { super((Pointer)null); allocate(data, size, mm); }
  private native void allocate(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm);
  public ArrowBuffer(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/) { super((Pointer)null); allocate(data, size, mm, parent); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/);
  public ArrowBuffer(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm) { super((Pointer)null); allocate(data, size, mm); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm);
  public ArrowBuffer(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/) { super((Pointer)null); allocate(data, size, mm, parent); }
  private native void allocate(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/);
  public ArrowBuffer(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm) { super((Pointer)null); allocate(data, size, mm); }
  private native void allocate(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size, @SharedPtr MemoryManager mm);

  
  ///
  ///
  public ArrowBuffer(@Cast("uintptr_t") long _address, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/) { super((Pointer)null); allocate(_address, size, mm, parent); }
  private native void allocate(@Cast("uintptr_t") long _address, @Cast("int64_t") long size, @SharedPtr MemoryManager mm,
           @SharedPtr ArrowBuffer parent/*=nullptr*/);
  public ArrowBuffer(@Cast("uintptr_t") long _address, @Cast("int64_t") long size, @SharedPtr MemoryManager mm) { super((Pointer)null); allocate(_address, size, mm); }
  private native void allocate(@Cast("uintptr_t") long _address, @Cast("int64_t") long size, @SharedPtr MemoryManager mm);

  /** \brief Construct from string_view without copying memory
   * 
   *  @param data [in] a string_view object
   * 
   *  \note The memory viewed by data must not be deallocated in the lifetime of the
   *  Buffer; temporary rvalue strings must be stored in an lvalue somewhere */

  /** An offset into data that is owned by another buffer, but we want to be
   *  able to retain a valid pointer to it even after other shared_ptr's to the
   *  parent buffer have been destroyed
   * 
   *  This method makes no assertions about alignment or padding of the buffer but
   *  in general we expected buffers to be aligned and padded to 64 bytes.  In the future
   *  we might add utility methods to help determine if a buffer satisfies this contract. */
  public ArrowBuffer(@SharedPtr ArrowBuffer parent, @Cast("const int64_t") long offset, @Cast("const int64_t") long size) { super((Pointer)null); allocate(parent, offset, size); }
  private native void allocate(@SharedPtr ArrowBuffer parent, @Cast("const int64_t") long offset, @Cast("const int64_t") long size);

  public native @Cast("uint8_t") @Name("operator []") byte get(@Cast("std::size_t") long i);

  /** \brief Construct a new std::string with a hexadecimal representation of the buffer.
   *  @return std::string */
  public native @StdString String ToHexString();

  /** Return true if both buffers are the same size and contain the same bytes
   *  up to the number of compared bytes */
  public native @Cast("bool") boolean Equals(@Const @ByRef ArrowBuffer other, @Cast("int64_t") long nbytes);

  /** Return true if both buffers are the same size and contain the same bytes */
  public native @Cast("bool") boolean Equals(@Const @ByRef ArrowBuffer other);

  /** Copy a section of the buffer into a new Buffer. */
  public native @ByVal BufferResult CopySlice(
        @Cast("const int64_t") long start, @Cast("const int64_t") long nbytes,
        MemoryPool pool/*=default_memory_pool()*/);
  public native @ByVal BufferResult CopySlice(
        @Cast("const int64_t") long start, @Cast("const int64_t") long nbytes);

  /** Zero bytes in padding, i.e. bytes between size_ and capacity_. */
  
  ///
  public native void ZeroPadding();

  /** \brief Construct an immutable buffer that takes ownership of the contents
   *  of an std::string (without copying it).
   * 
   *  @param data [in] a string to own
   *  @return a new Buffer instance */
  public static native @SharedPtr @ByVal ArrowBuffer FromString(@Cast({"", "std::string&&"}) @StdString BytePointer data);
  public static native @SharedPtr @ByVal ArrowBuffer FromString(@Cast({"", "std::string&&"}) @StdString String data);

  /** \brief Create buffer referencing typed memory with some length without
   *  copying
   *  @param data [in] the typed memory as C array
   *  @param length [in] the number of values in the array
   *  @return a new shared_ptr<Buffer> */

  /** \brief Create buffer referencing std::vector with some length without
   *  copying
   *  @param data [in] the vector to be referenced. If this vector is changed,
   *  the buffer may become invalid
   *  @return a new shared_ptr<Buffer> */

  /** \brief Copy buffer contents into a new std::string
   *  @return std::string
   *  \note Can throw std::bad_alloc if buffer is large */
  public native @StdString String ToString();

  /** \brief View buffer contents as a util::string_view
   *  @return util::string_view */

  /** \brief View buffer contents as a util::bytes_view
   *  @return util::bytes_view */

  /** \brief Return a pointer to the buffer's data
   * 
   *  The buffer has to be a CPU buffer ({@code is_cpu()} is true).
   *  Otherwise, an assertion may be thrown or a null pointer may be returned.
   * 
   *  To get the buffer's data address regardless of its device, call {@code address()}. */
  
  ///
  ///
  public native @Cast("const uint8_t*") BytePointer data();

  /** \brief Return a writable pointer to the buffer's data
   * 
   *  The buffer has to be a mutable CPU buffer ({@code is_cpu()} and {@code is_mutable()}
   *  are true).  Otherwise, an assertion may be thrown or a null pointer may
   *  be returned.
   * 
   *  To get the buffer's mutable data address regardless of its device, call
   *  {@code mutable_address()}. */
  public native @Cast("uint8_t*") BytePointer mutable_data();

  /** \brief Return the device address of the buffer's data */
  
  ///
  public native @Cast("uintptr_t") @Name("address") long _address();

  /** \brief Return a writable device address to the buffer's data
   * 
   *  The buffer has to be a mutable buffer ({@code is_mutable()} is true).
   *  Otherwise, an assertion may be thrown or 0 may be returned. */
  public native @Cast("uintptr_t") long mutable_address();

  /** \brief Return the buffer's size in bytes */
  public native @Cast("int64_t") long size();

  /** \brief Return the buffer's capacity (number of allocated bytes) */
  
  ///
  public native @Cast("int64_t") @Name("capacity") long _capacity();

  /** \brief Whether the buffer is directly CPU-accessible
   * 
   *  If this function returns true, you can read directly from the buffer's
   *  {@code data()} pointer.  Otherwise, you'll have to {@code View()} or {@code Copy()} it. */
  
  ///
  public native @Cast("bool") boolean is_cpu();

  /** \brief Whether the buffer is mutable
   * 
   *  If this function returns true, you are allowed to modify buffer contents
   *  using the pointer returned by {@code mutable_data()} or {@code mutable_address()}. */
  public native @Cast("bool") boolean is_mutable();

  public native @SharedPtr Device device();

  public native @SharedPtr MemoryManager memory_manager();

  
  ///
  public native @SharedPtr ArrowBuffer parent();

  /** \brief Get a RandomAccessFile for reading a buffer
   * 
   *  The returned file object reads from this buffer's underlying memory. */
  
  ///
  public static native @ByVal RandomAccessFileResult GetReader(@SharedPtr ArrowBuffer arg0);

  /** \brief Get a OutputStream for writing to a buffer
   * 
   *  The buffer must be mutable.  The returned stream object writes into the buffer's
   *  underlying memory (but it won't resize it). */
  
  ///
  public static native @ByVal OutputStreamResult GetWriter(@SharedPtr ArrowBuffer arg0);

  /** \brief Copy buffer
   * 
   *  The buffer contents will be copied into a new buffer allocated by the
   *  given MemoryManager.  This function supports cross-device copies. */
  
  ///
  ///
  public static native @ByVal BufferResult Copy(@SharedPtr ArrowBuffer source,
                                                @SharedPtr MemoryManager to);

  /** \brief View buffer
   * 
   *  Return a Buffer that reflects this buffer, seen potentially from another
   *  device, without making an explicit copy of the contents.  The underlying
   *  mechanism is typically implemented by the kernel or device driver, and may
   *  involve lazy caching of parts of the buffer contents on the destination
   *  device's memory.
   * 
   *  If a non-copy view is unsupported for the buffer on the given device,
   *  nullptr is returned.  An error can be returned if some low-level
   *  operation fails (such as an out-of-memory condition). */
  
  ///
  public static native @ByVal BufferResult View(@SharedPtr ArrowBuffer source,
                                                @SharedPtr MemoryManager to);

  /** \brief View or copy buffer
   * 
   *  Try to view buffer contents on the given MemoryManager's device, but
   *  fall back to copying if a no-copy view isn't supported. */
  public static native @ByVal BufferResult ViewOrCopy(
        @SharedPtr ArrowBuffer source, @SharedPtr MemoryManager to);
}
