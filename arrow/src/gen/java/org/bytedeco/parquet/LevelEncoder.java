// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class LevelEncoder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LevelEncoder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LevelEncoder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LevelEncoder position(long position) {
        return (LevelEncoder)super.position(position);
    }
    @Override public LevelEncoder getPointer(long i) {
        return new LevelEncoder((Pointer)this).offsetAddress(i);
    }

  public LevelEncoder() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native int MaxBufferSize(Encoding.type encoding, short max_level,
                             int num_buffered_values);
  public static native int MaxBufferSize(@Cast("parquet::Encoding::type") int encoding, short max_level,
                             int num_buffered_values);

  // Initialize the LevelEncoder.
  public native void Init(Encoding.type encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") BytePointer data, int data_size);
  public native void Init(@Cast("parquet::Encoding::type") int encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") ByteBuffer data, int data_size);
  public native void Init(Encoding.type encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") byte[] data, int data_size);
  public native void Init(@Cast("parquet::Encoding::type") int encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") BytePointer data, int data_size);
  public native void Init(Encoding.type encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") ByteBuffer data, int data_size);
  public native void Init(@Cast("parquet::Encoding::type") int encoding, short max_level, int num_buffered_values,
              @Cast("uint8_t*") byte[] data, int data_size);

  // Encodes a batch of levels from an array and returns the number of levels encoded
  public native int Encode(int batch_size, @Const ShortPointer levels);
  public native int Encode(int batch_size, @Const ShortBuffer levels);
  public native int Encode(int batch_size, @Const short[] levels);

  public native int len();
}
