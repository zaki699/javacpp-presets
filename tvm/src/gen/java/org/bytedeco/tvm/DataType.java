// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;

/**
 * \brief Runtime primitive data type.
 *
 *  This class is a thin wrapper of DLDataType.
 *  We also make use of DataType in compiler to store quick hint
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DataType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DataType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DataType position(long position) {
        return (DataType)super.position(position);
    }
    @Override public DataType getPointer(long i) {
        return new DataType((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Type code for the DataType.
   *
   * DLPack consistency:
   * 1) kInt is consistent with kDLInt
   * 2) kUInt is consistent with kDLUInt
   * 3) kFloat is consistent with kDLFloat
   */
  public enum TypeCode {
    kInt(kDLInt),
    kUInt(kDLUInt),
    kFloat(kDLFloat),
    kHandle(kTVMOpaqueHandle),
    kBFloat(kDLBfloat),
    kCustomBegin(129);

      public final long value;
      private TypeCode(long v) { this.value = v; }
      private TypeCode(TypeCode e) { this.value = e.value; }
      public TypeCode intern() { for (TypeCode e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  /** \brief default constructor */
  public DataType() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief Constructor
   * @param dtype The DLDataType
   */
  public DataType(@ByVal DLDataType dtype) { super((Pointer)null); allocate(dtype); }
  private native void allocate(@ByVal DLDataType dtype);
  /**
   * \brief Constructor
   * @param code The type code.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes.
   */
  public DataType(int code, int bits, int lanes) { super((Pointer)null); allocate(code, bits, lanes); }
  private native void allocate(int code, int bits, int lanes);
  /** @return The type code. */
  public native int code();
  /** @return number of bits in the data. */
  public native int bits();
  /** @return number of bytes to store each scalar. */
  public native int bytes();
  /** @return number of lanes in the data. */
  public native int lanes();
  /** @return whether type is a scalar type. */
  public native @Cast("bool") boolean is_scalar();
  /** @return whether type is a scalar type. */
  public native @Cast("bool") boolean is_bool();
  /** @return whether type is a float type. */
  public native @Cast("bool") boolean is_float();
  /** @return whether type is a float16 type. */
  public native @Cast("bool") boolean is_float16();
  /** @return whether type is a bfloat16 type. */
  public native @Cast("bool") boolean is_bfloat16();
  /** @return whether type is an int type. */
  public native @Cast("bool") boolean is_int();
  /** @return whether type is an uint type. */
  public native @Cast("bool") boolean is_uint();
  /** @return whether type is a handle type. */
  public native @Cast("bool") boolean is_handle();
  /** @return whether type is a vector type. */
  public native @Cast("bool") boolean is_vector();
  /** @return whether type is a bool vector type. */
  public native @Cast("bool") boolean is_vector_bool();
  /** @return whether type is a Void type. */
  public native @Cast("bool") boolean is_void();
  /**
   * \brief Create a new data type by change lanes to a specified value.
   * @param lanes The target number of lanes.
   * @return the result type.
   */
  public native @ByVal DataType with_lanes(int lanes);
  /**
   * \brief Create a new data type by change bits to a specified value.
   * @param bits The target number of bits.
   * @return the result type.
   */
  public native @ByVal DataType with_bits(int bits);
  /**
   * \brief Get the scalar version of the type.
   * @return the result type.
   */
  public native @ByVal DataType element_of();
  /**
   * \brief Equal comparator.
   * @param other The data type to compare against.
   * @return The comparison result.
   */
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef DataType other);
  /**
   * \brief NotEqual comparator.
   * @param other The data type to compare against.
   * @return The comparison result.
   */
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef DataType other);
  /**
   * \brief Converter to DLDataType
   * @return the result.
   */
  public native @ByVal @Name("operator DLDataType") DLDataType asDLDataType();

  /**
   * \brief Construct an int type.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes.
   * @return The constructed data type.
   */
  public static native @ByVal DataType Int(int bits, int lanes/*=1*/);
  public static native @ByVal DataType Int(int bits);
  /**
   * \brief Construct an uint type.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes
   * @return The constructed data type.
   */
  public static native @ByVal DataType UInt(int bits, int lanes/*=1*/);
  public static native @ByVal DataType UInt(int bits);
  /**
   * \brief Construct an float type.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes
   * @return The constructed data type.
   */
  public static native @ByVal DataType Float(int bits, int lanes/*=1*/);
  public static native @ByVal DataType Float(int bits);
  /**
   * \brief Construct an bfloat type.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes
   * @return The constructed data type.
   */
  public static native @ByVal DataType BFloat(int bits, int lanes/*=1*/);
  public static native @ByVal DataType BFloat(int bits);
  /**
   * \brief Construct a bool type.
   * @param lanes The number of lanes
   * @return The constructed data type.
   */
  public static native @ByVal DataType Bool(int lanes/*=1*/);
  public static native @ByVal DataType Bool();
  /**
   * \brief Construct a handle type.
   * @param bits The number of bits in the type.
   * @param lanes The number of lanes
   * @return The constructed data type.
   */
  public static native @ByVal DataType Handle(int bits/*=64*/, int lanes/*=1*/);
  public static native @ByVal DataType Handle();
  /**
   * \brief Construct a Void type.
   * @return The constructed data type.
   */
  public static native @ByVal DataType Void();
  /**
   * \brief Get the corresponding type of TVMShapeIndex.
   * @return The type of TVM shape index.
   */
  public static native @ByVal DataType ShapeIndex();
}
