// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base type class for union data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UnionType extends NestedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionType(Pointer p) { super(p); }

  @MemberGetter public static native byte kMaxTypeCode();
  public static final byte kMaxTypeCode = kMaxTypeCode();
  @MemberGetter public static native int kInvalidChildId();
  public static final int kInvalidChildId = kInvalidChildId();

  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector BytePointer type_codes, UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector BytePointer type_codes);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector ByteBuffer type_codes, @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector ByteBuffer type_codes);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector byte[] type_codes, UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector byte[] type_codes);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector BytePointer type_codes, @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector ByteBuffer type_codes, UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public static native @ByVal DataTypeResult Make(
        @Const @ByRef FieldVector fields,
        @StdVector byte[] type_codes, @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);

  public native @ByVal DataTypeLayout layout();

  
  ///
  public native @StdString String ToString();

  /** The array of logical type ids.
   * 
   *  For example, the first type in the union might be denoted by the id 5
   *  (instead of 0). */
  public native @StdVector BytePointer type_codes();

  /** An array mapping logical type ids to physical child ids. */
  public native @StdVector IntPointer child_ids();

  public native @Cast("uint8_t") byte max_type_code();

  public native UnionMode.type mode();
}
