// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class LargeListBuilder
 *  \brief Builder class for large variable-length list array value types
 * 
 *  Like ListBuilder, but to create large list arrays (with 64-bit offsets). */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeListBuilder extends BaseLargeListBuilder {
    static { Loader.load(); }

  
    public LargeListBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(pool, value_builder, type); }
    private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                      @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
    public LargeListBuilder(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder value_builder) { super((Pointer)null); allocate(pool, value_builder); }
    private native void allocate(MemoryPool pool, @Const @SharedPtr @ByRef ArrayBuilder value_builder);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeListBuilder(Pointer p) { super(p); }


  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr LargeListArray out);
}
