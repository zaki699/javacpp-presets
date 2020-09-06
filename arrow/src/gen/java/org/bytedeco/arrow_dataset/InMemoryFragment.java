// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

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


/** \brief A trivial Fragment that yields ScanTask out of a fixed set of
 *  RecordBatch. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class InMemoryFragment extends Fragment {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InMemoryFragment(Pointer p) { super(p); }

  public InMemoryFragment(@SharedPtr @ByVal Schema schema, @ByVal RecordBatchVector record_batches,
                     @SharedPtr @ByVal(nullValue = "std::shared_ptr<arrow::dataset::Expression>(scalar(true))") Expression arg2) { super((Pointer)null); allocate(schema, record_batches, arg2); }
  private native void allocate(@SharedPtr @ByVal Schema schema, @ByVal RecordBatchVector record_batches,
                     @SharedPtr @ByVal(nullValue = "std::shared_ptr<arrow::dataset::Expression>(scalar(true))") Expression arg2);
  public InMemoryFragment(@SharedPtr @ByVal Schema schema, @ByVal RecordBatchVector record_batches) { super((Pointer)null); allocate(schema, record_batches); }
  private native void allocate(@SharedPtr @ByVal Schema schema, @ByVal RecordBatchVector record_batches);
  public InMemoryFragment(@ByVal RecordBatchVector record_batches,
                              @SharedPtr @ByVal(nullValue = "std::shared_ptr<arrow::dataset::Expression>(scalar(true))") Expression arg1) { super((Pointer)null); allocate(record_batches, arg1); }
  private native void allocate(@ByVal RecordBatchVector record_batches,
                              @SharedPtr @ByVal(nullValue = "std::shared_ptr<arrow::dataset::Expression>(scalar(true))") Expression arg1);
  public InMemoryFragment(@ByVal RecordBatchVector record_batches) { super((Pointer)null); allocate(record_batches); }
  private native void allocate(@ByVal RecordBatchVector record_batches);

  public native @ByVal ScanTaskIteratorResult Scan(@SharedPtr ScanOptions options,
                                  @SharedPtr ScanContext context);

  public native @Cast("bool") boolean splittable();

  public native @StdString String type_name();
}
