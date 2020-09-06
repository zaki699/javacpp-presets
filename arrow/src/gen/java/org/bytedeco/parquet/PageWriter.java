// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class PageWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PageWriter(Pointer p) { super(p); }


  public static native @UniquePtr PageWriter Open(
        @Cast("parquet::ArrowOutputStream*") @SharedPtr OutputStream sink, Compression.type codec,
        int compression_level, ColumnChunkMetaDataBuilder metadata);
  public static native @UniquePtr PageWriter Open(
        @Cast("parquet::ArrowOutputStream*") @SharedPtr OutputStream sink, @Cast("arrow::Compression::type") int codec,
        int compression_level, ColumnChunkMetaDataBuilder metadata);

  // The Column Writer decides if dictionary encoding is used if set and
  // if the dictionary encoding has fallen back to default encoding on reaching dictionary
  // page limit
  public native void Close(@Cast("bool") boolean has_dictionary, @Cast("bool") boolean fallback);

  public native @Cast("int64_t") long WriteDataPage(@Const @ByRef DataPage page);

  public native @Cast("int64_t") long WriteDictionaryPage(@Const @ByRef DictionaryPage page);

  public native @Cast("bool") boolean has_compressor();

  public native void Compress(@Cast("const parquet::Buffer*") @ByRef ArrowBuffer src_buffer, ResizableBuffer dest_buffer);
}
