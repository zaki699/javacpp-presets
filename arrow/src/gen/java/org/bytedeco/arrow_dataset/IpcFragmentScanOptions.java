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


/** \brief Per-scan options for IPC fragments */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class IpcFragmentScanOptions extends FragmentScanOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public IpcFragmentScanOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IpcFragmentScanOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IpcFragmentScanOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IpcFragmentScanOptions position(long position) {
        return (IpcFragmentScanOptions)super.position(position);
    }
    @Override public IpcFragmentScanOptions getPointer(long i) {
        return new IpcFragmentScanOptions((Pointer)this).offsetAddress(i);
    }

  public native @StdString String type_name();

  /** Options passed to the IPC file reader.
   *  included_fields, memory_pool, and use_threads are ignored. */
  public native @SharedPtr IpcReadOptions options(); public native IpcFragmentScanOptions options(IpcReadOptions setter);
  /** If present, the async scanner will enable I/O coalescing.
   *  This is ignored by the sync scanner. */
  public native @SharedPtr CacheOptions cache_options(); public native IpcFragmentScanOptions cache_options(CacheOptions setter);
}
