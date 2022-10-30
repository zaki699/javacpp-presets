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


/** \brief A granular piece of a Dataset, such as an individual file.
 * 
 *  A Fragment can be read/scanned separately from other fragments. It yields a
 *  collection of RecordBatches when scanned, encapsulated in one or more
 *  ScanTasks.
 * 
 *  Note that Fragments have well defined physical schemas which are reconciled by
 *  the Datasets which contain them; these physical schemas may differ from a parent
 *  Dataset's schema and the physical schemas of sibling Fragments. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class Fragment extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fragment(Pointer p) { super(p); }

  /** \brief Return the physical schema of the Fragment.
   * 
   *  The physical schema is also called the writer schema.
   *  This method is blocking and may suffer from high latency filesystem.
   *  The schema is cached after being read once, or may be specified at construction. */
  
  ///
  ///
  public native @ByVal SchemaResult ReadPhysicalSchema();

  /** \brief Scan returns an iterator of ScanTasks, each of which yields
   *  RecordBatches from this Fragment.
   * 
   *  Note that batches yielded using this method will not be filtered and may not align
   *  with the Fragment's schema. In particular, note that columns referenced by the
   *  filter may be present in yielded batches even if they are not projected (so that
   *  they are available when a filter is applied). Additionally, explicitly projected
   *  columns may be absent if they were not present in this fragment.
   * 
   *  To receive a record batch stream which is fully filtered and projected, use Scanner. */
  public native @ByVal ScanTaskIteratorResult Scan(@SharedPtr ScanOptions options);

  /** An asynchronous version of Scan */
  
  ///
  public native @ByVal RecordBatchGeneratorResult ScanBatchesAsync(
        @SharedPtr ScanOptions options);

  /** \brief Count the number of rows in this fragment matching the filter using metadata
   *  only. That is, this method may perform I/O, but will not load data.
   * 
   *  If this is not possible, resolve with an empty optional. The fragment can perform
   *  I/O (e.g. to read metadata) before it deciding whether it can satisfy the request. */
  public native @ByVal LongOptionalFuture CountRows(
        @ByVal Expression predicate, @SharedPtr ScanOptions options);

  public native @StdString String type_name();
  public native @StdString String ToString();

  /** \brief An expression which evaluates to true for all data viewed by this
   *  Fragment. */
  public native @Const @ByRef Expression partition_expression();
}
