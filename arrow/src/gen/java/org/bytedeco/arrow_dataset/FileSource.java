// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \defgroup dataset-file-formats File formats for reading and writing datasets
 *  \defgroup dataset-filesystem File system datasets
 * 
 *  \{
 <p>
 *  \brief The path and filesystem where an actual file is located or a buffer which can
 *  be read like a file */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSource extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileSource(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FileSource position(long position) {
        return (FileSource)super.position(position);
    }
    @Override public FileSource getPointer(long i) {
        return new FileSource((Pointer)this).offsetAddress(i);
    }

  public FileSource(@StdString String path, @SharedPtr FileSystem filesystem,
               Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(path, filesystem, compression); }
  private native void allocate(@StdString String path, @SharedPtr FileSystem filesystem,
               Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@StdString String path, @SharedPtr FileSystem filesystem) { super((Pointer)null); allocate(path, filesystem); }
  private native void allocate(@StdString String path, @SharedPtr FileSystem filesystem);
  public FileSource(@StdString BytePointer path, @SharedPtr FileSystem filesystem,
               @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(path, filesystem, compression); }
  private native void allocate(@StdString BytePointer path, @SharedPtr FileSystem filesystem,
               @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@StdString BytePointer path, @SharedPtr FileSystem filesystem) { super((Pointer)null); allocate(path, filesystem); }
  private native void allocate(@StdString BytePointer path, @SharedPtr FileSystem filesystem);

  public FileSource(@ByVal FileInfo info, @SharedPtr FileSystem filesystem,
               Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(info, filesystem, compression); }
  private native void allocate(@ByVal FileInfo info, @SharedPtr FileSystem filesystem,
               Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@ByVal FileInfo info, @SharedPtr FileSystem filesystem) { super((Pointer)null); allocate(info, filesystem); }
  private native void allocate(@ByVal FileInfo info, @SharedPtr FileSystem filesystem);
  public FileSource(@ByVal FileInfo info, @SharedPtr FileSystem filesystem,
               @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(info, filesystem, compression); }
  private native void allocate(@ByVal FileInfo info, @SharedPtr FileSystem filesystem,
               @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);

  public FileSource(@SharedPtr ArrowBuffer buffer,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(buffer, compression); }
  private native void allocate(@SharedPtr ArrowBuffer buffer,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@SharedPtr ArrowBuffer buffer) { super((Pointer)null); allocate(buffer); }
  private native void allocate(@SharedPtr ArrowBuffer buffer);
  public FileSource(@SharedPtr ArrowBuffer buffer,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(buffer, compression); }
  private native void allocate(@SharedPtr ArrowBuffer buffer,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@ByVal @Cast("arrow::dataset::FileSource::CustomOpen*") CustomOpenWithCompression open) { super((Pointer)null); allocate(open); }
  private native void allocate(@ByVal @Cast("arrow::dataset::FileSource::CustomOpen*") CustomOpenWithCompression open);
  public FileSource(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(open_with_compression, compression); }
  private native void allocate(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression) { super((Pointer)null); allocate(open_with_compression); }
  private native void allocate(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression);
  public FileSource(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(open_with_compression, compression); }
  private native void allocate(@ByVal @Cast("arrow::dataset::FileSource::CustomOpenWithCompression*") Pointer open_with_compression,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);

  public FileSource(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(file, compression); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file,
                        Compression.type compression/*=arrow::Compression::UNCOMPRESSED*/);
  public FileSource(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file) { super((Pointer)null); allocate(file); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file);
  public FileSource(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/) { super((Pointer)null); allocate(file, compression); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file,
                        @Cast("arrow::Compression::type") int compression/*=arrow::Compression::UNCOMPRESSED*/);

  public FileSource() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @StdVector FileSource FromPaths(@SharedPtr FileSystem fs,
                                             @ByVal StringVector paths);

  /** \brief Return the type of raw compression on the file, if any. */
  public native Compression.type compression();

  /** \brief Return the file path, if any. Only valid when file source wraps a path. */
  public native @StdString String path();

  /** \brief Return the filesystem, if any. Otherwise returns nullptr */
  public native @SharedPtr FileSystem filesystem();

  /** \brief Return the buffer containing the file, if any. Otherwise returns nullptr */
  public native @SharedPtr ArrowBuffer buffer();

  /** \brief Get a RandomAccessFile which views this file source */
  public native @ByVal RandomAccessFileResult Open();

  /** \brief Get an InputStream which views this file source (and decompresses if needed)
   *  @param compression [in] If nullopt, guess the compression scheme from the
   *      filename, else decompress with the given codec */
  public native @ByVal InputStreamResult OpenCompressed(
        @ByVal(nullValue = "arrow::util::optional<arrow::Compression::type>(util::nullopt)") CompressionTypeOptional compression);
  public native @ByVal InputStreamResult OpenCompressed();
}
