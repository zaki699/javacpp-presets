// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace match

/** \brief An object used for type- and shape-checking arguments to be passed
 *  to a kernel and stored in a KernelSignature. Distinguishes between ARRAY
 *  and SCALAR arguments using ValueDescr::Shape. The type-checking rule can be
 *  supplied either with an exact DataType instance or a custom TypeMatcher. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class InputType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InputType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InputType position(long position) {
        return (InputType)super.position(position);
    }
    @Override public InputType getPointer(long i) {
        return new InputType(this).position(position + i);
    }

  /** \brief The kind of type-checking rule that the InputType contains. */
  public enum Kind {
    /** \brief Accept any value type. */
    ANY_TYPE(0),

    /** \brief A fixed arrow::DataType and will only exact match having this
     *  exact type (e.g. same TimestampType unit, same decimal scale and
     *  precision, or same nested child types). */
    EXACT_TYPE(1),

    /** \brief Uses a TypeMatcher implementation to check the type. */
    USE_TYPE_MATCHER(2);

      public final int value;
      private Kind(int v) { this.value = v; }
      private Kind(Kind e) { this.value = e.value; }
      public Kind intern() { for (Kind e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** \brief Accept any value type but with a specific shape (e.g. any Array or
   *  any Scalar). */
  public InputType(ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(shape); }
  private native void allocate(ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/);
  public InputType() { super((Pointer)null); allocate(); }
  private native void allocate();
  public InputType(@Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(shape); }
  private native void allocate(@Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/);

  /** \brief Accept an exact value type. */
  public InputType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
              ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type, shape); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
              ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/);
  public InputType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  public InputType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
              @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type, shape); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
              @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/);

  /** \brief Accept an exact value type and shape provided by a ValueDescr. */
  public InputType(@Const @ByRef ValueDescr descr) { super((Pointer)null); allocate(descr); }
  private native void allocate(@Const @ByRef ValueDescr descr);

  /** \brief Use the passed TypeMatcher to type check. */
  public InputType(@SharedPtr TypeMatcher type_matcher,
              ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type_matcher, shape); }
  private native void allocate(@SharedPtr TypeMatcher type_matcher,
              ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/);
  public InputType(@SharedPtr TypeMatcher type_matcher) { super((Pointer)null); allocate(type_matcher); }
  private native void allocate(@SharedPtr TypeMatcher type_matcher);
  public InputType(@SharedPtr TypeMatcher type_matcher,
              @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type_matcher, shape); }
  private native void allocate(@SharedPtr TypeMatcher type_matcher,
              @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/);

  /** \brief Match any type with the given Type::type. Uses a TypeMatcher for
   *  its implementation. */
  public InputType(@Cast("arrow::Type::type") int type_id, ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type_id, shape); }
  private native void allocate(@Cast("arrow::Type::type") int type_id, ValueDescr.Shape shape/*=arrow::ValueDescr::ANY*/);
  public InputType(@Cast("arrow::Type::type") int type_id, @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/) { super((Pointer)null); allocate(type_id, shape); }
  private native void allocate(@Cast("arrow::Type::type") int type_id, @Cast("arrow::ValueDescr::Shape") int shape/*=arrow::ValueDescr::ANY*/);

  public InputType(@Const @ByRef InputType other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef InputType other);

  public native @Name("operator =") void put(@Const @ByRef InputType other);

  // \brief Match an array with the given exact type. Convenience constructor.
  public static native @ByVal InputType Array(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  // \brief Match a scalar with the given exact type. Convenience constructor.
  public static native @ByVal InputType Scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  // \brief Match an array with the given Type::type id. Convenience
  // constructor.
  public static native @ByVal InputType Array(@Cast("arrow::Type::type") int id);

  // \brief Match a scalar with the given Type::type id. Convenience
  // constructor.
  public static native @ByVal InputType Scalar(@Cast("arrow::Type::type") int id);

  /** \brief Return true if this input type matches the same type cases as the
   *  other. */
  public native @Cast("bool") boolean Equals(@Const @ByRef InputType other);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef InputType other);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef InputType other);

  /** \brief Return hash code. */
  public native @Cast("size_t") long Hash();

  /** \brief Render a human-readable string representation. */
  public native @StdString String ToString();

  /** \brief Return true if the value matches this argument kind in type
   *  and shape. */
  public native @Cast("bool") boolean Matches(@Const @ByRef Datum value);

  /** \brief Return true if the value descriptor matches this argument kind in
   *  type and shape. */
  public native @Cast("bool") boolean Matches(@Const @ByRef ValueDescr value);

  /** \brief The type matching rule that this InputType uses. */
  public native Kind kind();

  /** \brief Indicates whether this InputType matches Array (ValueDescr::ARRAY),
   *  Scalar (ValueDescr::SCALAR) values, or both (ValueDescr::ANY). */
  public native ValueDescr.Shape shape();

  /** \brief For InputType::EXACT_TYPE kind, the exact type that this InputType
   *  must match. Otherwise this function should not be used and will assert in
   *  debug builds. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  /** \brief For InputType::USE_TYPE_MATCHER, the TypeMatcher to be used for
   *  checking the type of a value. Otherwise this function should not be used
   *  and will assert in debug builds. */
  public native @Const @ByRef TypeMatcher type_matcher();
}
