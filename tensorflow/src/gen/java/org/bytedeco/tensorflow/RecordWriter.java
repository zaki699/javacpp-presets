// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow::io") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecordWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordWriter(Pointer p) { super(p); }

  // Format of a single record:
  //  uint64    length
  //  uint32    masked crc of length
  //  byte      data[length]
  //  uint32    masked crc of data
  @MemberGetter public static native @Cast("const size_t") long kHeaderSize();
  public static final long kHeaderSize = kHeaderSize();
  @MemberGetter public static native @Cast("const size_t") long kFooterSize();
  public static final long kFooterSize = kFooterSize();

  // Create a writer that will append data to "*dest".
  // "*dest" must be initially empty.
  // "*dest" must remain live while this Writer is in use.
  public RecordWriter(WritableFile dest,
                 @Const @ByRef(nullValue = "tensorflow::io::RecordWriterOptions()") RecordWriterOptions options) { super((Pointer)null); allocate(dest, options); }
  private native void allocate(WritableFile dest,
                 @Const @ByRef(nullValue = "tensorflow::io::RecordWriterOptions()") RecordWriterOptions options);
  public RecordWriter(WritableFile dest) { super((Pointer)null); allocate(dest); }
  private native void allocate(WritableFile dest);

  // Calls Close() and logs if an error occurs.
  //
  // TODO(jhseu): Require that callers explicitly call Close() and remove the
  // implicit Close() call in the destructor.

  public native @ByVal Status WriteRecord(@StringPiece BytePointer slice);
  public native @ByVal Status WriteRecord(@StringPiece String slice);

// #if defined(PLATFORM_GOOGLE)
// #endif

  // Flushes any buffered data held by underlying containers of the
  // RecordWriter to the WritableFile. Does *not* flush the
  // WritableFile.
  public native @ByVal Status Flush();

  // Writes all output to the file. Does *not* close the WritableFile.
  //
  // After calling Close(), any further calls to `WriteRecord()` or `Flush()`
  // are invalid.
  public native @ByVal Status Close();

  // Utility method to populate TFRecord headers.  Populates record-header in
  // "header[0,kHeaderSize-1]".  The record-header is based on data[0, n-1].
  public static native void PopulateHeader(@Cast("char*") BytePointer header, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateHeader(@Cast("char*") ByteBuffer header, String data, @Cast("size_t") long n);
  public static native void PopulateHeader(@Cast("char*") byte[] header, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateHeader(@Cast("char*") BytePointer header, String data, @Cast("size_t") long n);
  public static native void PopulateHeader(@Cast("char*") ByteBuffer header, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateHeader(@Cast("char*") byte[] header, String data, @Cast("size_t") long n);

  // Utility method to populate TFRecord footers.  Populates record-footer in
  // "footer[0,kFooterSize-1]".  The record-footer is based on data[0, n-1].
  public static native void PopulateFooter(@Cast("char*") BytePointer footer, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateFooter(@Cast("char*") ByteBuffer footer, String data, @Cast("size_t") long n);
  public static native void PopulateFooter(@Cast("char*") byte[] footer, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateFooter(@Cast("char*") BytePointer footer, String data, @Cast("size_t") long n);
  public static native void PopulateFooter(@Cast("char*") ByteBuffer footer, @Cast("const char*") BytePointer data, @Cast("size_t") long n);
  public static native void PopulateFooter(@Cast("char*") byte[] footer, String data, @Cast("size_t") long n);
}
