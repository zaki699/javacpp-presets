// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Compute a stream of record batches from a (possibly chunked) Table
 * 
 *  The conversion is zero-copy: each record batch is a view over a slice
 *  of the table's columns. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TableBatchReader extends RecordBatchReader {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TableBatchReader(Pointer p) { super(p); }

  /** \brief Construct a TableBatchReader for the given table */
  public TableBatchReader(@Const @ByRef Table table) { super((Pointer)null); allocate(table); }
  private native void allocate(@Const @ByRef Table table);

  public native @SharedPtr @ByVal Schema schema();

  
  ///
  public native @ByVal Status ReadNext(@SharedPtr RecordBatch out);

  /** \brief Set the desired maximum chunk size of record batches
   * 
   *  The actual chunk size of each record batch may be smaller, depending
   *  on actual chunking characteristics of each table column. */
  public native void set_chunksize(@Cast("int64_t") long chunksize);
}
