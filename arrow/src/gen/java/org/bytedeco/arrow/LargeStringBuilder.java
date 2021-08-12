// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class LargeStringBuilder
 *  \brief Builder class for large UTF8 strings */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeStringBuilder extends LargeBinaryBuilder {
    static { Loader.load(); }

  
    
    
      public LargeStringBuilder(MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
      private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/);
      public LargeStringBuilder() { super((Pointer)null); allocate(); }
      private native void allocate();
    
      public LargeStringBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool) { super((Pointer)null); allocate(type, pool); }
      private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeStringBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LargeStringBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LargeStringBuilder position(long position) {
        return (LargeStringBuilder)super.position(position);
    }
    @Override public LargeStringBuilder getPointer(long i) {
        return new LargeStringBuilder((Pointer)this).offsetAddress(i);
    }


  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr LargeStringArray out);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
