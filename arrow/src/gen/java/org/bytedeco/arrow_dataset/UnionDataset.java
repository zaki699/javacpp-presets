// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \brief A Dataset wrapping child Datasets. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class UnionDataset extends Dataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionDataset(Pointer p) { super(p); }

  /** \brief Construct a UnionDataset wrapping child Datasets.
   * 
   *  @param schema [in] the schema of the resulting dataset.
   *  @param children [in] one or more child Datasets. Their schemas must be identical to
   *  schema. */
  public static native @ByVal UnionDatasetResult Make(@SharedPtr @ByVal Schema schema,
                                                      @SharedPtr @ByVal Dataset children);

  public native @Const @SharedPtr @ByRef Dataset children();

  public native @StdString String type_name();

  public native @ByVal DatasetResult ReplaceSchema(
        @SharedPtr @ByVal Schema schema);
}
