// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs all keys and values in the table.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * table_handle: Handle to the table.
 * 
 *  Returns:
 *  * {@code Output} keys: Vector of all keys present in the table.
 *  * {@code Output} values: Tensor of all values in the table. Indexed in parallel with {@code keys}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LookupTableExport extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LookupTableExport(Pointer p) { super(p); }

  public LookupTableExport(@Const @ByRef Scope scope, @ByVal Input table_handle, @Cast("tensorflow::DataType") int Tkeys, @Cast("tensorflow::DataType") int Tvalues) { super((Pointer)null); allocate(scope, table_handle, Tkeys, Tvalues); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input table_handle, @Cast("tensorflow::DataType") int Tkeys, @Cast("tensorflow::DataType") int Tvalues);

  public native @ByRef Operation operation(); public native LookupTableExport operation(Operation setter);
  public native @ByRef Output keys(); public native LookupTableExport keys(Output setter);
  public native @ByRef Output values(); public native LookupTableExport values(Output setter);
}
