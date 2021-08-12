// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::ipc") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadStats extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ReadStats() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReadStats(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadStats(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ReadStats position(long position) {
        return (ReadStats)super.position(position);
    }
    @Override public ReadStats getPointer(long i) {
        return new ReadStats((Pointer)this).offsetAddress(i);
    }

  /** Number of IPC messages read. */
  public native @Cast("int64_t") long num_messages(); public native ReadStats num_messages(long setter);
  /** Number of record batches read. */
  
  ///
  public native @Cast("int64_t") long num_record_batches(); public native ReadStats num_record_batches(long setter);
  /** Number of dictionary batches read.
   * 
   *  Note: num_dictionary_batches >= num_dictionary_deltas + num_replaced_dictionaries */
  public native @Cast("int64_t") long num_dictionary_batches(); public native ReadStats num_dictionary_batches(long setter);

  /** Number of dictionary deltas read. */
  public native @Cast("int64_t") long num_dictionary_deltas(); public native ReadStats num_dictionary_deltas(long setter);
  /** Number of replaced dictionaries (i.e. where a dictionary batch replaces
   *  an existing dictionary with an unrelated new dictionary). */
  public native @Cast("int64_t") long num_replaced_dictionaries(); public native ReadStats num_replaced_dictionaries(long setter);
}
