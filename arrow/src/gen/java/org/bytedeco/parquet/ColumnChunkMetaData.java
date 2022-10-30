// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief ColumnChunkMetaData is a proxy around format::ColumnChunkMetaData. */
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ColumnChunkMetaData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColumnChunkMetaData(Pointer p) { super(p); }

  // API convenience to get a MetaData accessor
  public static native @UniquePtr ColumnChunkMetaData Make(
        @Const Pointer metadata, @Const ColumnDescriptor descr,
        @Const ApplicationVersion writer_version/*=nullptr*/, short row_group_ordinal/*=-1*/,
        short column_ordinal/*=-1*/,
        @SharedPtr InternalFileDecryptor file_decryptor/*=nullptr*/);
  public static native @UniquePtr ColumnChunkMetaData Make(
        @Const Pointer metadata, @Const ColumnDescriptor descr);

  public native @Cast("bool") boolean Equals(@Const @ByRef ColumnChunkMetaData other);

  // column chunk
  public native @Cast("int64_t") long file_offset();

  // parameter is only used when a dataset is spread across multiple files
  public native @StdString String file_path();

  // column metadata
  public native @Cast("bool") boolean is_metadata_set();
  public native org.bytedeco.parquet.Type.type type();
  public native @Cast("int64_t") long num_values();
  public native @SharedPtr ColumnPath path_in_schema();
  public native @Cast("bool") boolean is_stats_set();
  public native @SharedPtr Statistics statistics();

  public native Compression.type compression();
  // Indicate if the ColumnChunk compression is supported by the current
  // compiled parquet library.
  public native @Cast("bool") boolean can_decompress();

  public native @StdVector IntPointer encodings();
  public native @StdVector PageEncodingStats encoding_stats();
  public native @Cast("bool") boolean has_dictionary_page();
  public native @Cast("int64_t") long dictionary_page_offset();
  public native @Cast("int64_t") long data_page_offset();
  public native @Cast("bool") boolean has_index_page();
  public native @Cast("int64_t") long index_page_offset();
  public native @Cast("int64_t") long total_compressed_size();
  public native @Cast("int64_t") long total_uncompressed_size();
  public native @UniquePtr ColumnCryptoMetaData crypto_metadata();
}
