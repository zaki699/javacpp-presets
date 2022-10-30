// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::csv") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ReadOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReadOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ReadOptions position(long position) {
        return (ReadOptions)super.position(position);
    }
    @Override public ReadOptions getPointer(long i) {
        return new ReadOptions((Pointer)this).offsetAddress(i);
    }

  // Reader options

  /** Whether to use the global CPU thread pool */
  
  ///
  public native @Cast("bool") boolean use_threads(); public native ReadOptions use_threads(boolean setter);

  /** \brief Block size we request from the IO layer.
   * 
   *  This will determine multi-threading granularity as well as
   *  the size of individual record batches.
   *  Minimum valid value for block size is 1 */
  public native int block_size(); public native ReadOptions block_size(int setter);  // 1 MB

  /** Number of header rows to skip (not including the row of column names, if any) */
  public native int skip_rows(); public native ReadOptions skip_rows(int setter);

  /** Number of rows to skip after the column names are read, if any */
  public native int skip_rows_after_names(); public native ReadOptions skip_rows_after_names(int setter);

  /** Column names for the target table.
   *  If empty, fall back on autogenerate_column_names. */
  public native @ByRef StringVector column_names(); public native ReadOptions column_names(StringVector setter);

  /** Whether to autogenerate column names if {@code column_names} is empty.
   *  If true, column names will be of the form "f0", "f1"...
   *  If false, column names will be read from the first CSV row after {@code skip_rows}. */
  public native @Cast("bool") boolean autogenerate_column_names(); public native ReadOptions autogenerate_column_names(boolean setter);

  /** Create read options with default values */
  public static native @ByVal ReadOptions Defaults();

  /** \brief Test that all set options are valid */
  public native @ByVal Status Validate();
}
