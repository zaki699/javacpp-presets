// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NullBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NullBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NullBuilder position(long position) {
        return (NullBuilder)super.position(position);
    }
    @Override public NullBuilder getPointer(long i) {
        return new NullBuilder((Pointer)this).offsetAddress(i);
    }

  public NullBuilder(MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/);
  public NullBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();
  public NullBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                         MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                         MemoryPool pool/*=arrow::default_memory_pool()*/);
  public NullBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** \brief Append the specified number of null elements */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  /** \brief Append a single null element */
  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  public native @ByVal Status AppendEmptyValue();

  

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  public native @ByVal Status Finish(@SharedPtr NullArray out);
}
