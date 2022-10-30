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


@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ParquetFileWriteOptions extends FileWriteOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParquetFileWriteOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetFileWriteOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFileWriteOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParquetFileWriteOptions position(long position) {
        return (ParquetFileWriteOptions)super.position(position);
    }
    @Override public ParquetFileWriteOptions getPointer(long i) {
        return new ParquetFileWriteOptions((Pointer)this).offsetAddress(i);
    }

  /** \brief Parquet writer properties. */
  public native @SharedPtr WriterProperties writer_properties(); public native ParquetFileWriteOptions writer_properties(WriterProperties setter);

  /** \brief Parquet Arrow writer properties. */
  public native @SharedPtr ArrowWriterProperties arrow_writer_properties(); public native ParquetFileWriteOptions arrow_writer_properties(ArrowWriterProperties setter);
}
